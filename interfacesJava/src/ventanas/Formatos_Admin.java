/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author CPU_SYS
 */
public class Formatos_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Formatos
     */
    public Formatos_Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("FORMATOS");
        
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/CPU_new_2.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnSalir2 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        btnEnvios = new javax.swing.JButton();
        btnCotizacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Formatos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        btnSalir2.setBackground(new java.awt.Color(51, 153, 255));
        btnSalir2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir2.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        btnVolver.setBackground(new java.awt.Color(51, 153, 255));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 283, 70, 20));

        btnEntrada.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrad.png"))); // NOI18N
        btnEntrada.setText("ENTRADA");
        btnEntrada.setBorder(null);
        btnEntrada.setBorderPainted(false);
        btnEntrada.setContentAreaFilled(false);
        btnEntrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrada.setIconTextGap(-1);
        btnEntrada.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEntrada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 90));

        btnSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnSalida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salid.png"))); // NOI18N
        btnSalida.setText("SALIDA");
        btnSalida.setBorder(null);
        btnSalida.setBorderPainted(false);
        btnSalida.setContentAreaFilled(false);
        btnSalida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalida.setIconTextGap(-1);
        btnSalida.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 90, 90));

        btnEnvios.setBackground(new java.awt.Color(255, 255, 255));
        btnEnvios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnvios.setForeground(new java.awt.Color(255, 255, 255));
        btnEnvios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/envi.png"))); // NOI18N
        btnEnvios.setText("ENVIOS");
        btnEnvios.setBorder(null);
        btnEnvios.setBorderPainted(false);
        btnEnvios.setContentAreaFilled(false);
        btnEnvios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnvios.setIconTextGap(-1);
        btnEnvios.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEnvios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnvios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnvios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 90, 90));

        btnCotizacion.setBackground(new java.awt.Color(255, 255, 255));
        btnCotizacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCotizacion.setForeground(new java.awt.Color(255, 255, 255));
        btnCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coti.png"))); // NOI18N
        btnCotizacion.setText("COTIZACION");
        btnCotizacion.setBorder(null);
        btnCotizacion.setBorderPainted(false);
        btnCotizacion.setContentAreaFilled(false);
        btnCotizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCotizacion.setIconTextGap(-1);
        btnCotizacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCotizacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ima2.2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed

        System.exit(0);
       
// TODO add your handling code here:
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        Principal_Admin obj = new Principal_Admin();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
 
        Entrada obj = new Entrada();
        obj.setVisible(true);
        dispose(); 

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed

        Salidass obj = new Salidass();
        obj.setVisible(true);
        dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnEnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviosActionPerformed

        Envios obj = new Envios();
        obj.setVisible(true);
        dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnEnviosActionPerformed

    private void btnCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCotizacionActionPerformed

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
            java.util.logging.Logger.getLogger(Formatos_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formatos_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formatos_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formatos_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formatos_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCotizacion;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnEnvios;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
