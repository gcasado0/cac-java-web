package database;

import java.sql.Connection;
import config.DBconn;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Orador;

/**
 *
 * @author gcasado0
 */
public class OradorDAO {
    private Connection connection;
    
    public OradorDAO(){
        DBconn conn = new DBconn();
        String DB = "tpfinal";
        String userDB = "gustavo";
        String passDB = "ppp123";
        this.connection = conn.getConnection(DB, userDB, passDB);
    }
 
    public int createOrador(Orador o) throws SQLException {
        PreparedStatement ps;
        int lineasAfectadas;
        
        String pQuery = "INSERT INTO orador (nombre, apellido, titulo, resumen, inicio)"
                + " VALUES(?, ?, ?, ?, ?);";
        ps = connection.prepareStatement(pQuery);
        
        ps.setString(1, o.getNombre());
        ps.setString(2, o.getApellido());
        ps.setString(3, o.getTitulo());
        ps.setString(4, o.getResumen());
        ps.setString(5, o.getInicio());
         
        lineasAfectadas = ps.executeUpdate();
        return lineasAfectadas;
    }
    
}
