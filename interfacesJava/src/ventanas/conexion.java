package ventanas;



import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    
    public String usuario = "sys";
    public String password = "1234";
    public String url = "jdbc:sqlserver://localhost:1433;databaseName=ventas";
    
    public Connection cn = null; 
    public Statement st = null;
    
    public Statement Conectar(){
        
        try {
            Connection cn =  DriverManager.getConnection(url, usuario, password);
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException i) {
            JOptionPane.showMessageDialog(null, i);
        }
        return st;
    }
    
    
    
}
