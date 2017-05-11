/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conMySql;

import conexionSQLDB.*;
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
public class usuarioMySQLDB {
    
    public ArrayList<usuarios> ListUsuarios() {
        ArrayList<usuarios> usuario = new ArrayList();
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_usu, nombre_usu, password_usu, id_tipo_usu FROM usuarios ORDER BY 2");
            while (rs.next()) {
                usuarios usu = new usuarios();
                usu.setId_usuario(rs.getInt("id_usu"));
                usu.setNombre(rs.getString("nombre_usu"));
                usu.setPassword(rs.getString("password_usu"));
                usu.setTipoUsuario(rs.getInt("id_tipo_usu"));
                usuario.add(usu);
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en listado");
        }
        return usuario;
    }
    
    
    public void insertarUsuario(usuarios usuario) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            PreparedStatement pst = cn.prepareStatement("INSERT INTO usuarios (nombre_usu, password_usu, id_tipo_usu) VALUES (?,?,?)");
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getPassword());
            pst.setInt(3, usuario.getTipoUsuario());
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar");
        }
    }
    
    /*
    public void EliminarUsuario(usuarios usu) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("DELETE FROM usuarios "
                    + " WHERE nombre_usu=?");
            pst.setString(1, usu.getNombre());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(usuarioMySQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    public void EliminarUsuarios(usuarios usu) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("DELETE FROM usuarios WHERE nombre_usu=?");
            pst.setString(1, usu.getNombre());
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(clienteMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EditarUsuario(usuarios usu) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("UPDATE usuarios SET nombre_usu = ?, password_usu = ?, id_tipo_usu = ? WHERE id_usu = ?");
            pst.setString(1, usu.getNombre());
            pst.setString(2, usu.getPassword());
            pst.setInt(3, usu.getTipoUsuario());
            pst.setInt(4, usu.getId_usuario());
            pst.executeUpdate();
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(usuarioMySQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public clientes Buscar(String buscar) {
        clientes c = null;
        try {
            Connection cn = DataBaseConexion.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM USUARIOS "
                    + " WHERE NOMBRE='"+buscar+"'");
            while (rs.next()) {
                usuarios usu = new usuarios();
                usu.setId_usuario(rs.getInt(1));
                usu.setNombre(rs.getString(2));
                usu.setPassword(rs.getString(3));
                usu.setTipoUsuario(rs.getInt(4));
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }
    
    
}