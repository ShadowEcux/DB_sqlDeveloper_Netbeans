/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQLDB;

import clasesPrincipales.Entradas;
import clasesPrincipales.Salidas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author CPU_SYS
 */
public class salidaDB {
    
    public ArrayList<Salidas> ListEntradas() {
        ArrayList<Salidas> salida = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_SALIDA, FECHA, EMPRESA, CIUDAD, DIRECCION, CONTACTO, TELEFONO, CORREO, EQUIPO, MODELO, SERIE, COMENTARIO FROM SALIDAS ORDER BY 2");
            while (rs.next()) {
                Salidas sal = new Salidas();
                sal.setId_salida(rs.getInt("ID_SALIDA"));
                sal.setFecha(rs.getString("FECHA"));
                sal.setEmpresa(rs.getString("EMPRESA"));
                sal.setCiudad(rs.getString("CIUDAD"));
                sal.setDireccion(rs.getString("DIRECCION"));
                sal.setContacto(rs.getString("CONTACTO"));
                sal.setTelefono(rs.getString("TELEFONO"));
                sal.setCorreo(rs.getString("CORREO"));
                sal.setEquipo(rs.getString("EQUIPO"));
                sal.setModelo(rs.getString("MODELO"));
                sal.setSerie(rs.getString("SERIE"));
                sal.setComentario(rs.getString("COMENTARIO"));
                
                salida.add(sal);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en listado");
        }
        return salida;
    }
    
    public void insertarSalida(Salidas salida) {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO SALIDAS (FECHA, EMPRESA, CIUDAD, DIRECCION, CONTACTO, TELEFONO, CORREO, EQUIPO, MODELO, SERIE, COMENTARIO) \n"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, salida.getFecha());
            pst.setString(2, salida.getEmpresa());
            pst.setString(3, salida.getCiudad());
            pst.setString(4, salida.getDireccion());
            pst.setString(5, salida.getContacto());
            pst.setString(6, salida.getTelefono());
            pst.setString(7, salida.getCorreo());
            pst.setString(8, salida.getEquipo());
            pst.setString(9, salida.getModelo());
            pst.setString(10, salida.getSerie());
            pst.setString(11, salida.getComentario());
          
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar");
        }
    }
    
    
    
}
