/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQLDB;

import clasesPrincipales.Entradas;
import clasesPrincipales.clientes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author CPU_SYS
 */
public class entradaDB {
    
    public ArrayList<Entradas> ListEntradas() {
        ArrayList<Entradas> entrada = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_ENTRADA, FECHA, ELEMENTO, POTENCIA, MARCA, MODELO, SERIE, EMPRESA, NIT, PERSONA_REMITE, CIUDAD, DIRECCION, NOMBRE_CONTACTO, TELEFONO_CONTACTO, CORREO, MOTIVO, TARJETA_RED, PARRILLA, BASES_PLASTICAS, CONECTOR_ORIGI, GARANTIA, ESTADO_CARCASA, OBSERVACIONES FROM ENTRADAS ORDER BY 2");
            while (rs.next()) {
                Entradas en = new Entradas();
                en.setId_entrada(rs.getInt("ID_ENTRADA"));
                en.setFecha(rs.getString("FECHA"));
                en.setElemento(rs.getString("ELEMENTO"));
                en.setPotencia(rs.getString("POTENCIA"));
                en.setMarca(rs.getString("MARCA"));
                en.setModelo(rs.getString("MODELO"));
                en.setSerie(rs.getString("SERIE"));
                en.setEmpresa(rs.getString("EMPRESA"));
                en.setNit(rs.getString("NIT"));
                en.setPersona_remite(rs.getString("PERSONA_REMITE"));
                en.setCiudad(rs.getString("CIUDAD"));
                en.setDireccion(rs.getString("DIRECCION"));
                en.setNombre_contacto(rs.getString("NOMBRE_CONTACTO"));
                en.setTelefono_contacto(rs.getString("TELEFONO_CONTACTO"));
                en.setCorreo(rs.getString("CORREO"));
                en.setMotivo(rs.getString("MOTIVO"));
                en.setTarjeta_red(rs.getString("TARJETA_RED"));
                en.setParrilla(rs.getString("PARRILLA"));
                en.setBases_plasticas(rs.getString("BASES_PLASTICAS"));
                en.setConector_origi(rs.getString("CONECTOR_ORIGI"));
                en.setGarantia(rs.getString("GARANTIA"));
                en.setEstado_carcasa(rs.getString("ESTADO_CARCASA"));
                en.setObservaciones(rs.getString("OBSERVACIONES"));
                entrada.add(en);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en listado");
        }
        return entrada;
    }
    
}
