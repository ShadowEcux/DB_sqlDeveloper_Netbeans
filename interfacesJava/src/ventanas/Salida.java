/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clasesPrincipales.Salidas;
import conexionSQLDB.DataBaseConexion;
import conexionSQLDB.salidaDB;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; //New imports to read XLSX format
import org.apache.poi.xssf.usermodel.XSSFSheet; //New imports to read XLSX format
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator; //New imports to formula evaluator in XLSX
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;

/**
 *
 * @author CPU_SYS
 */
public class Salida extends javax.swing.JFrame {

    ArrayList<Salidas> salida;
    salidaDB db = new salidaDB();
    /**
     * Creates new form Entrada
     */
    public Salida() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CPU System Service S.A.S - SALIDA");
        CargarCmbCliente();
    }

    public void CargarCmbCliente(){
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NOMBRECLIENTE FROM CLIENTES ORDER BY NOMBRECLIENTE ASC");
            while (rs.next()) {
                this.cmbClientes.addItem(rs.getString("nombrecliente"));
            }
        } catch (Exception e) {
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtCiudad = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        txtEquipo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComentario = new javax.swing.JTextArea();
        jSeparator9 = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();
        txtModelo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        btnBusca = new javax.swing.JButton();
        btnGuarda = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        btnDescartar1 = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir1.setBackground(new java.awt.Color(51, 153, 255));
        btnSalir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Formato De Salida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 210, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("CLIENTES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 20));

        getContentPane().add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 130, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empresa");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ciudad");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 255, 153));
        jLabel16.setText("DATOS DEL CONTACTO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 150, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 660, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 10));
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, -1));
        getContentPane().add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Dirección");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));
        getContentPane().add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 140, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 110, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Correo");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 40, 20));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 180, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Telefono");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 50, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 250, 10));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 255, 153));
        jLabel22.setText("DATOS DEL EQUIPO");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));
        getContentPane().add(txtEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 130, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 255, 153));
        jLabel25.setText("FECHA");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 40, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Equipo");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 40, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Comentario");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 10));

        areaComentario.setColumns(20);
        areaComentario.setRows(5);
        jScrollPane1.setViewportView(areaComentario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 420, 90));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 220, 10));

        btnVolver.setBackground(new java.awt.Color(51, 153, 255));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 150, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Modelo");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 50, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Serie");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 40, 20));
        getContentPane().add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 130, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 170, 20));

        btnBusca.setBackground(new java.awt.Color(255, 255, 255));
        btnBusca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa2.png"))); // NOI18N
        btnBusca.setBorder(null);
        btnBusca.setBorderPainted(false);
        btnBusca.setContentAreaFilled(false);
        btnBusca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBusca.setIconTextGap(-1);
        btnBusca.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBusca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 40, -1));

        btnGuarda.setBackground(new java.awt.Color(255, 255, 255));
        btnGuarda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuarda.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar_1.png"))); // NOI18N
        btnGuarda.setText("Guardar");
        btnGuarda.setBorder(null);
        btnGuarda.setBorderPainted(false);
        btnGuarda.setContentAreaFilled(false);
        btnGuarda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuarda.setIconTextGap(-1);
        btnGuarda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuarda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 50, -1));

        btnPdf.setBackground(new java.awt.Color(255, 255, 255));
        btnPdf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf3.png"))); // NOI18N
        btnPdf.setText("PDF");
        btnPdf.setBorder(null);
        btnPdf.setBorderPainted(false);
        btnPdf.setContentAreaFilled(false);
        btnPdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPdf.setIconTextGap(-1);
        btnPdf.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnPdf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 50, -1));

        btnDescartar1.setBackground(new java.awt.Color(255, 255, 255));
        btnDescartar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDescartar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar2.png"))); // NOI18N
        btnDescartar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescartar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 40, 40));

        btnFacturas.setBackground(new java.awt.Color(153, 255, 153));
        btnFacturas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFacturas.setText("FACTURAS");
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 250, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ima2.2_ampliada.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        Formatos_Admin obj = new Formatos_Admin();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

        try {

            String guardar = cmbClientes.getSelectedItem().toString();
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            PreparedStatement pst = cnx.prepareStatement("Select * from Clientes where NOMBRECLIENTE = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                txtEmpresa.setText(rs.getString("nombrecliente").trim());
                txtTelefono.setText(rs.getString("telefonocliente").trim());
                txtDireccion.setText(rs.getString("direccioncliente").trim());
                txtCiudad.setText(rs.getString("ciudadcliente").trim());
                txtCorreo.setText(rs.getString("correocliente").trim());
                txtContacto.setText(rs.getString("nombrecontacto").trim());

                //pst.setString(1, CMBID.getName());
                //String guardar = txtBuscar.getText();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaActionPerformed
      
        
        if (txtEmpresa.getText().equals("") || txtCiudad.getText().equals("") || txtDireccion.getText().equals("") || txtContacto.getText().equals("") || txtTelefono.getText().equals("") || txtCorreo.getText().equals("") || txtEquipo.getText().equals("") || txtModelo.getText().equals("") || txtSerie.getText().equals("") || areaComentario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "", JOptionPane.INFORMATION_MESSAGE);
        } else {

            Salidas sal = new Salidas();

            String formato = txtFecha.getDateFormatString();
            Date date = txtFecha.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String dato = String.valueOf(sdf.format(date));

            sal.setFecha(dato);
            sal.setEmpresa(txtEmpresa.getText().toUpperCase());
            sal.setEmpresa(txtEmpresa.getText().toUpperCase());
            sal.setCiudad(txtCiudad.getText().toUpperCase());
            sal.setDireccion(txtDireccion.getText().toUpperCase());
            sal.setContacto(txtContacto.getText().toUpperCase());
            sal.setTelefono(txtTelefono.getText().toUpperCase());
            sal.setCorreo(txtCorreo.getText().toUpperCase());
            sal.setEquipo(txtEquipo.getText().toUpperCase());
            sal.setModelo(txtModelo.getText().toUpperCase());
            sal.setSerie(txtSerie.getText().toUpperCase());
            sal.setComentario(areaComentario.getText().toUpperCase());
            
            try {
                db.insertarSalida(sal);
                JOptionPane.showMessageDialog(this, "Factura guardada exitosamente", "", JOptionPane.INFORMATION_MESSAGE);

                txtFecha.setDateFormatString("");
                txtEmpresa.setText("");
                txtCiudad.setText("");
                txtDireccion.setText("");
                txtContacto.setText("");
                txtTelefono.setText("");
                txtCorreo.setText("");
                txtEquipo.setText("");
                txtModelo.setText("");
                txtSerie.setText("");
                areaComentario.setText("");
                
                this.cmbClientes.removeAllItems();
                //this.cmbFacturas.removeAllItems();
                CargarCmbCliente();
                //CargarCmbFacturas();
                txtEmpresa.requestFocus();
            } catch (Exception e) {
                System.err.println("error" + e);
            }

        }
        
         /*

        Formatos_Oper obj = new Formatos_Oper();

        if (seleccion) {
            FileInputStream entrada = null;
            try {
                //Leer el archivo de Excel XLS
                entrada = new FileInputStream(new File(directorio));
                //Acceso al libro de trabajo
                HSSFWorkbook xls = new HSSFWorkbook(entrada);
                //Acceso a la hoja de trabajo
                HSSFSheet hoja = xls.getSheetAt(0);
                //Declaracion de fila y celda
                Row fila = null;
                Cell celda = null;
                try {
                    //Asignando a valores a celdas con valores
                    fila = hoja.getRow(13);
                    celda = fila.getCell(6);
                    HSSFRichTextString fecha = new HSSFRichTextString(txtFecha.getDateFormatString());
                    celda.setCellValue(fecha);

                    fila = hoja.getRow(4);
                    celda = fila.getCell(1);
                    HSSFRichTextString elemento = new HSSFRichTextString(txtElemento.getText());
                    celda.setCellValue(elemento);

                    fila = hoja.getRow(4);
                    celda = fila.getCell(4);
                    HSSFRichTextString potencia = new HSSFRichTextString(txtPotencia.getText());
                    celda.setCellValue(potencia);

                    fila = hoja.getRow(1);

                    celda = fila.getCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor4);

                } catch (NullPointerException NPE) {
                    //En caso de que las celdas esten vacias hay que crearlas

                    fila = hoja.createRow(13);
                    celda = fila.createCell(6);
                    HSSFRichTextString fecha = new HSSFRichTextString(txtFecha.getDateFormatString());
                    celda.setCellValue(fecha);

                    fila = hoja.createRow(4);
                    celda = fila.createCell(1);
                    HSSFRichTextString elemento = new HSSFRichTextString(txtElemento.getText());
                    celda.setCellValue(elemento);

                    fila = hoja.createRow(4);
                    celda = fila.createCell(4);
                    HSSFRichTextString potencia = new HSSFRichTextString(txtPotencia.getText());
                    celda.setCellValue(potencia);

                }       //Evaluando formulas de todo el libro de excel
                HSSFFormulaEvaluator.evaluateAllFormulaCells(xls);
                //Cerrando archivo
                entrada.close();
                //Abriendo archivo para escritura
                FileOutputStream salida = new FileOutputStream(new File(directorio));
                //write changes
                xls.write(salida);
                //close the stream
                salida.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    entrada.close();
                } catch (IOException ex) {
                    Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
                }
            }       //Evaluando formulas de todo el libro de excel
        }

        */

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardaActionPerformed

    private void btnDescartar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartar1ActionPerformed

        txtEmpresa.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCiudad.setText("");
        txtCorreo.setText("");
        txtContacto.setText("");
        txtEquipo.setText("");
        areaComentario.setText("");
        txtModelo.setText("");
        txtSerie.setText("");
        txtEmpresa.requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescartar1ActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed

        Facturas_Salida obj = new Facturas_Salida();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaComentario;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnDescartar1;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnGuarda;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cmbClientes;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEquipo;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
