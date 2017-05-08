/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQLDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author CPU_SYS
 */
public class DataBaseConexion {
    public static Connection getConnection(){
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //String DB = "jdbc:oracle:thin:@localhost:1521:XE";
            String DB = "jdbc:oracle:thin:@localhost:1521:XE";
            String usuario = "cpudb";
            String password = "1234";
            
            
            
            Connection cnx = DriverManager.getConnection(DB, usuario, password);
            
            return cnx;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
          //JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
