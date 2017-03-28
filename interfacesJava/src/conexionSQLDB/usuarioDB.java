/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQLDB;

import clasesPrincipales.clientes;
import clasesPrincipales.usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ventanas.Tabla_Clientes_Admin;

/**
 *
 * @author CPU_SYS
 */
public class usuarioDB {
    
    public ArrayList<usuarios> ListUsuarios() {
        ArrayList<usuarios> usuario = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_USUARIO, NOMBRE_USUARIO, PASSWORD_USUARIO, TIPO_USUARIOS_ID_TIPO_USUARIO FROM USUARIOS ORDER BY 2");
            while (rs.next()) {
                usuarios usu = new usuarios();
                usu.setNombre(rs.getString("nombre_usuario"));
                usu.setPassword(rs.getString("password_usuario"));
                usu.setTipoUsuario(rs.getInt("TIPO_USUARIOS_ID_TIPO_USUARIO"));
                
                usuario.add(usu);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en listado");
        }
        return usuario;
    }
    
    
    public void insertarUsuario(usuarios usuario) {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("insert into USUARIOS (NOMBRE_USUARIO, PASSWORD_USUARIO, TIPO_USUARIOS_ID_TIPO_USUARIO) VALUES (?,?,?)");
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getPassword());
            pst.setInt(3, usuario.getTipoUsuario());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar");
        }
    }
    
    
    
}
