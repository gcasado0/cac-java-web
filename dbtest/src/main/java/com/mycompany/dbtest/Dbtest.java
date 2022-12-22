package com.mycompany.dbtest;

/**
 *
 * @author gcasado0
 */
import java.sql.Connection;

public class Dbtest {
   
    public static void main(String[] args) {
        Connection connection;
        System.out.println("Hello World!");
        DBConn conn = new DBConn();
        String DB = "tpfinal";
        String userDB = "gustavo";
        String passDB = "Taburi.2010";
        //connection = conn.getConnection("homebanking", "root", "1234");
        connection = conn.getConnection(DB, userDB, passDB);
        if (connection !=null){
            System.out.println("Exito");
        }else{
            System.out.println("Fracaso");
        }
       
        
    }
}
