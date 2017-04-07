/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQLDB;


import clasesPrincipales.Envios;
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
public class envioDB {
    
    public ArrayList<Envios> ListEnvios() {
        ArrayList<Envios> envio = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_ENVIO, FECHA, DESTINATARIO, ATN, DIRECCION, TELEFONO, CIUDAD, COMENTARIO FROM ENVIOS ORDER BY 2");
            while (rs.next()) {
                Envios env = new Envios();
                env.setId_envio(rs.getInt("ID_ENVIO"));
                env.setFecha(rs.getString("FECHA"));
                env.setDestinatario(rs.getString("DESTINATARIO"));
                env.setATN(rs.getString("ATN"));
                env.setDireccion(rs.getString("DIRECCION"));
                env.setTelefono(rs.getString("TELEFONO"));
                env.setCiudad(rs.getString("CIUDAD"));
                env.setComentario(rs.getString("COMENTARIO"));
                
                envio.add(env);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en listado");
        }
        return envio;
    }
    
    public void insertarSalida(Envios envio) {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO ENVIOS (FECHA, DESTINATARIO, ATN, DIRECCION, TELEFONO, CIUDAD, COMENTARIO) \n"
                    + " VALUES (?,?,?,?,?,?,?)");
            pst.setString(1, envio.getFecha());
            pst.setString(2, envio.getDestinatario());
            pst.setString(3, envio.getATN());
            pst.setString(4, envio.getDireccion());
            pst.setString(5, envio.getTelefono());
            pst.setString(6, envio.getCiudad());
            pst.setString(7, envio.getComentario());
   
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar");
        }
    }
    
}
