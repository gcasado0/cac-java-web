package database;

import java.sql.Connection;
import config.DBconn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Orador;

/**
 *
 * @author gcasado0
 */
public class OradorDAO {
    private Connection conexion;
    public String mensaje=""; 
    
    public OradorDAO(){
        DBconn conn = new DBconn();
        String DB = "tpfinal";
        String userDB = "gustavo";
        String passDB = "Taburi.2010";
        try {
            conexion = conn.getConnection(DB, userDB, passDB);
            if (conexion!=null) 
                mensaje = "Exito"; 
            else 
                mensaje = "Fallo";
        }catch (Exception ex){ 
            Logger.getLogger(OradorDAO.class.getName()).log(Level.INFO, ex.getMessage(), ex);
            mensaje = ex.getMessage();
        }                
    }
 
    public int createOrador(Orador o) throws SQLException {
        PreparedStatement ps;
        int lineasAfectadas;
        
        String pQuery = "INSERT INTO orador (nombre, apellido, titulo, resumen, inicio)"
                        + " VALUES(?, ?, ?, ?, ?);";
        ps = conexion.prepareStatement(pQuery);
        
        ps.setString(1, o.getNombre());
        ps.setString(2, o.getApellido());
        ps.setString(3, o.getTitulo());
        ps.setString(4, o.getResumen());
        ps.setString(5, o.getInicio());
         
        lineasAfectadas = ps.executeUpdate();
        return lineasAfectadas;
    }
    
    public List<Orador> getAll() throws SQLException {
        
        List<Orador> oradores = new ArrayList<>(); 
        Long id;
        String nombre;
        String apellido;
        String titulo;
        String resumen;
        String inicio;
        
        Statement mysql = conexion.createStatement();
        
        String qTraerTodo = "SELECT * FROM orador";
            ResultSet resultado = mysql.executeQuery(qTraerTodo);

            // Mostramos el resultado de la consulta
            while(resultado.next()) {                
                id = resultado.getLong("id");
                nombre = resultado.getString("nombre");
                apellido = resultado.getString("apellido");
                titulo = resultado.getString("titulo");
                resumen = resultado.getString("resumen");
                inicio = resultado.getString("inicio");
                Orador orador = new Orador(id,nombre, apellido, titulo, resumen, inicio);                
                oradores.add(orador);
            }
        
        return oradores;
    }
    
}
