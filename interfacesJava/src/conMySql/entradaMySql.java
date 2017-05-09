/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conMySql;

import conexionSQLDB.*;
import clasesPrincipales.Entradas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CPU_SYS
 */
public class entradaMySql {

    public ArrayList<Entradas> ListEntradas() {
        ArrayList<Entradas> entrada = new ArrayList();
        try {
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_entra, fecha, no_rem, elemento, potencia, marca, modelo, serie, empresa, nit, persona_remite, ciudad, direccion, contacto, telefono, correo, motivo, terjeta_red, parrilla, bases_plas, conector_ori, garantia, estado_car, observaciones FROM entradas ORDER BY 2");
            while (rs.next()) {
                Entradas en = new Entradas();
                en.setId_entrada(rs.getInt("id_entra"));
                en.setFecha(rs.getString("fecha"));
                en.setElemento(rs.getString("elemento"));
                en.setPotencia(rs.getString("potencia"));
                en.setMarca(rs.getString("marca"));
                en.setModelo(rs.getString("modelo"));
                en.setSerie(rs.getString("serie"));
                en.setEmpresa(rs.getString("empresa"));
                en.setNit(rs.getString("nit"));
                en.setPersona_remite(rs.getString("persona_remite"));
                en.setCiudad(rs.getString("ciudad"));
                en.setDireccion(rs.getString("direccion"));
                en.setNombre_contacto(rs.getString("contacto"));
                en.setTelefono_contacto(rs.getString("telefono"));
                en.setCorreo(rs.getString("correo"));
                en.setMotivo(rs.getString("motivo"));
                en.setTarjeta_red(rs.getString("tarjeta_red"));
                en.setParrilla(rs.getString("parrilla"));
                en.setBases_plasticas(rs.getString("bases_plas"));
                en.setConector_origi(rs.getString("conector_ori"));
                en.setGarantia(rs.getString("garantia"));
                en.setEstado_carcasa(rs.getString("estado_car"));
                en.setObservaciones(rs.getString("observaciones"));
                entrada.add(en);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en listado");
        }
        return entrada;
    }

    //Codigo para INSERTAR DATOS.........................................................
    public void insertarEntrada(Entradas entrada) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");
            PreparedStatement pst =  cn.prepareStatement("INSERT INTO entradas(fecha, elemento, potencia, marca, modelo, serie, empresa, nit, persona_remite, ciudad, direccion, contacto, telefono, correo, motivo, terjeta_red, parrilla, bases_plas, conector_ori, garantia, estado_car, observaciones, numero) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, entrada.getFecha());
            pst.setString(2, entrada.getElemento());
            pst.setString(3, entrada.getPotencia());
            pst.setString(4, entrada.getMarca());
            pst.setString(5, entrada.getModelo());
            pst.setString(6, entrada.getSerie());
            pst.setString(7, entrada.getEmpresa());
            pst.setString(8, entrada.getNit());
            pst.setString(9, entrada.getPersona_remite());
            pst.setString(10, entrada.getCiudad());
            pst.setString(11, entrada.getDireccion());
            pst.setString(12, entrada.getNombre_contacto());
            pst.setString(13, entrada.getTelefono_contacto());
            pst.setString(14, entrada.getCorreo());
            pst.setString(15, entrada.getMotivo());
            pst.setString(16, entrada.getTarjeta_red());
            pst.setString(17, entrada.getParrilla());
            pst.setString(18, entrada.getBases_plasticas());
            pst.setString(19, entrada.getConector_origi());
            pst.setString(20, entrada.getGarantia());
            pst.setString(21, entrada.getEstado_carcasa());
            pst.setString(22, entrada.getObservaciones());
            pst.setString(23, entrada.getNumero());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar");
        }
    }
    
    public void EditarEntrada(Entradas entrada) {
        try {
            //(FECHA, ELEMENTO, POTENCIA, MARCA, MODELO, SERIE, EMPRESA, NIT, PERSONA_REMITE, CIUDAD, DIRECCION, NOMBRE_CONTACTO, TELEFONO_CONTACTO, CORREO, MOTIVO, TARJETA_RED, PARRILLA, BASES_PLASTICAS, CONECTOR_ORIGI, GARANTIA, ESTADO_CARCASA, OBSERVACIONES)
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("UPDATE ENTRADAS SET FECHA = ?, ELEMENTO = ?, POTENCIA = ?, MARCA = ?, MODELO = ?, SERIE = ?, EMPRESA = ?, NIT = ?, PERSONA_REMITE = ?, CIUDAD = ?, DIRECCION = ?, NOMBRE_CONTACTO = ?, TELEFONO_CONTACTO = ?, CORREO = ?, MOTIVO = ?, TARJETA_RED = ?, PARRILLA = ?, BASES_PLASTICAS = ?, CONECTOR_ORIGI = ?, GARANTIA = ?, ESTADO_CARCASA = ?, OBSERVACIONES = ?\n" +
"WHERE ID_ENTRADA = ?");
            pst.setString(1, entrada.getFecha());
            pst.setString(2, entrada.getElemento());
            pst.setString(3, entrada.getPotencia());
            pst.setString(4, entrada.getMarca());
            pst.setString(5, entrada.getModelo());
            pst.setString(6, entrada.getSerie());
            pst.setString(7, entrada.getEmpresa());
            pst.setString(8, entrada.getNit());
            pst.setString(9, entrada.getPersona_remite());
            pst.setString(10, entrada.getCiudad());
            pst.setString(11, entrada.getDireccion());
            pst.setString(12, entrada.getNombre_contacto());
            pst.setString(13, entrada.getTelefono_contacto());
            pst.setString(14, entrada.getCorreo());
            pst.setString(15, entrada.getMotivo());
            pst.setString(16, entrada.getTarjeta_red());
            pst.setString(17, entrada.getParrilla());
            pst.setString(18, entrada.getBases_plasticas());
            pst.setString(19, entrada.getConector_origi());
            pst.setString(20, entrada.getGarantia());
            pst.setString(21, entrada.getEstado_carcasa());
            pst.setString(22, entrada.getObservaciones());
            pst.setInt(23, entrada.getId_entrada());
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(entradaMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EliminarEntrada(Entradas en) {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM ENTRADAS "
                    + " WHERE ID_ENTRADA=?");
            pst.setInt(1, en.getId_entrada());
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(entradaMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
