/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import conexionSQLDB.DataBaseConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CPU_SYS
 */
public class Envios extends javax.swing.JFrame {

    /**
     * Creates new form Entrada
     */
    public Envios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CPU System Service S.A.S - ENVIOS");
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
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtATN = new javax.swing.JTextField();
        txtDestinatario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComentario = new javax.swing.JTextArea();
        jSeparator9 = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();
        btnDescartar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnBusca = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        btnGuarda = new javax.swing.JButton();
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
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Formato De Envios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 200, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("Clientes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 20));

        getContentPane().add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DESTINATARIO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ATN");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DIRECCION");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 255, 153));
        jLabel16.setText("DATOS DE ENVIO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 10));
        getContentPane().add(txtATN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, -1));
        getContentPane().add(txtDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 170, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CIUDAD");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 60, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 10));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 255, 153));
        jLabel22.setText("DATOS DEL EQUIPO");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Comentario");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 10));

        areaComentario.setColumns(20);
        areaComentario.setRows(5);
        jScrollPane1.setViewportView(areaComentario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 380, 70));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 190, 10));

        btnVolver.setBackground(new java.awt.Color(51, 153, 255));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        btnDescartar.setBackground(new java.awt.Color(255, 255, 255));
        btnDescartar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDescartar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar2.png"))); // NOI18N
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 40, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TELEFONO");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 60, 20));

        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 170, -1));

        txtFecha.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 180, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 255, 153));
        jLabel25.setText("FECHA");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 40, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 140, 10));

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
        getContentPane().add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 40, -1));

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
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });
        getContentPane().add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 60, 70));

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
        getContentPane().add(btnGuarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 60, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ima2.2_ampliada.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        Bienvenida obj = new Bienvenida();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        Formatos_Admin obj = new Formatos_Admin();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed

      
        txtDestinatario.setText("");
        txtTelefono.setText("");
        txtATN.setText("");
        txtDireccion.setText("");
        areaComentario.setText("");
        txtDestinatario.requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

       try {

            String guardar = cmbClientes.getSelectedItem().toString();
            Connection cn = DataBaseConexion.getConnection();
            Statement st = cn.createStatement();
            PreparedStatement pst = cn.prepareStatement("Select * from Clientes where NOMBRECLIENTE = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                txtDestinatario.setText(rs.getString("nombrecliente").trim());
                txtTelefono.setText(rs.getString("telefonocliente").trim());
                txtDireccion.setText(rs.getString("direccioncliente").trim());
                txtATN.setText(rs.getString("ciudadcliente").trim());
                txtCiudad.setText(rs.getString("ciudadcliente").trim());
               

                //pst.setString(1, CMBID.getName());
                //String guardar = txtBuscar.getText();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardaActionPerformed

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
            java.util.logging.Logger.getLogger(Envios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Envios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Envios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Envios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Envios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaComentario;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnGuarda;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cmbClientes;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtATN;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtDireccion;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
