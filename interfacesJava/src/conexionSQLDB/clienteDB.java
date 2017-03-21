/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQLDB;

import clasesPrincipales.clientes;
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
public class clienteDB {

    //Codigo para el LISTAR en la base de datos..........................................
    public ArrayList<clientes> ListClientes() {
        ArrayList<clientes> cliente = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT IDCLIENTE, NITCLIENTE, NOMBRECLIENTE, TELEFONOCLIENTE, DIRECCIONCLIENTE, CIUDADCLIENTE, CORREOCLIENTE, NOMBRECONTACTO "
                    + " FROM CLIENTES ORDER BY 2");
            while (rs.next()) {
                clientes cl = new clientes();
                cl.setNit_cliente(rs.getString("NITCLIENTE"));
                cl.setNombre_cliente(rs.getString("NOMBRECLIENTE"));
                cl.setTelefono_cliente(rs.getString("TELEFONOCLIENTE"));
                cl.setDireccion_cliente(rs.getString("DIRECCIONCLIENTE"));
                cl.setCiudad_cliente(rs.getString("CIUDADCLIENTE"));
                cl.setCorreo_cliente(rs.getString("CORREOCLIENTE"));
                cl.setNombre_contacto(rs.getString("NOMBRECONTACTO"));
                cliente.add(cl);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en listado");
        }
        return cliente;
    }

    //Codigo para INSERTAR DATOS.........................................................
    public void insertarClientes(clientes cliente) {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO CLIENTES (NITCLIENTE, NOMBRECLIENTE, TELEFONOCLIENTE, DIRECCIONCLIENTE, CIUDADCLIENTE, CORREOCLIENTE, NOMBRECONTACTO) \n"
                    + " VALUES (?,?,?,?,?,?,?)");
            pst.setString(1, cliente.getNit_cliente());
            pst.setString(2, cliente.getNombre_cliente());
            pst.setString(3, cliente.getTelefono_cliente());
            pst.setString(4, cliente.getDireccion_cliente());
            pst.setString(5, cliente.getCiudad_cliente());
            pst.setString(6, cliente.getCorreo_cliente());
            pst.setString(7, cliente.getNombre_contacto());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar");
        }
    }

    //Codigo para MODIFICAR datos.........................................................
    public void Editar(clientes cli) {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("UPDATE CLIENTES SET NITCLIENTE = ?, NOMBRECLIENTE = ?, TELEFONOCLIENTE = ?, DIRECCIONCLIENTE = ?, CIUDADCLIENTE = ?, CORREOCLIENTE = ?, NOMBRECONTACTO = ?\n" +
"WHERE NOMBRECLIENTE = ?");
            pst.setString(1, cli.getNit_cliente());
            pst.setString(2, cli.getNombre_cliente());
            pst.setString(3, cli.getTelefono_cliente());
            pst.setString(4, cli.getDireccion_cliente());
            pst.setString(5, cli.getCiudad_cliente());
            pst.setString(6, cli.getCorreo_cliente());
            pst.setString(7, cli.getNombre_contacto());
            pst.setString(8, cli.getNombre_cliente());
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(clienteDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //Codigo para ELIMINAR datos.........................................................
    public void EliminarCliente(clientes cli) {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM CLIENTES "
                    + " WHERE NOMBRECLIENTE=?");
            pst.setString(1, cli.getNombre_cliente());
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(clienteDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public clientes Buscar(String buscar) {
        clientes c = null;
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM CLIENTES "
                    + " WHERE NOMBRE='"+buscar+"'");
            while (rs.next()) {
                c = new clientes();
                c.setNit_cliente(rs.getString(1));
                c.setNombre_cliente(rs.getString(2));
                c.setTelefono_cliente(rs.getString(3));
                c.setDireccion_cliente(rs.getString(4));
                c.setCiudad_cliente(rs.getString(5));
                c.setCorreo_cliente(rs.getString(6));
                c.setNombre_contacto(rs.getString(7));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }
    

}
