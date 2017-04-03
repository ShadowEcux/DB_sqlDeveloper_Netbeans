/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clasesPrincipales.clientes;
import clasesPrincipales.usuarios;
import conexionSQLDB.DataBaseConexion;
import conexionSQLDB.clienteDB;
import conexionSQLDB.usuarioDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CPU_SYS
 */
public class Usuarios extends javax.swing.JFrame {

    ArrayList<usuarios> usuario;
    usuarioDB db = new usuarioDB();

    /**
     * Creates new form Tabla_Clientes
     */
    public Usuarios() {
        initComponents();
        ListarDatos();
        LimpirTabla();
        this.setLocationRelativeTo(null);
        this.setTitle("CPU System Service S.A.S - USUARIOS");
        CargarCmbUsuarios();
        txtID.setEnabled(false);
        txtNombre.setEnabled(false);
        txtPassword.setEnabled(false);
        txtTipoUsuario.setEnabled(false);
    }

    // METODOS::::::::::::::::::::
    public void ListarDatos() {
        usuario = db.ListUsuarios();
        DefaultTableModel tb = (DefaultTableModel) tabla_usuarios.getModel();
        for (usuarios usu : usuario) {
            tb.addRow(new Object[]{usu.getId_usuario(), usu.getNombre(), usu.getPassword(), usu.getTipoUsuario()});
        }
    }

    public void LimpirTabla() {
        DefaultTableModel tb = (DefaultTableModel) tabla_usuarios.getModel();
        for (int i = tb.getRowCount() - 1; i >= 0; i--) {
            tb.removeRow(i);
        }
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/CPU_new_2.png"));
        return retValue;
    }

    public void CargarCmbUsuarios() {
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NOMBRE_USUARIO FROM USUARIOS ORDER BY NOMBRE_USUARIO ASC");
            while (rs.next()) {
                this.cmbUsuarios.addItem(rs.getString("NOMBRE_USUARIO"));
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir1 = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cmbUsuarios = new javax.swing.JComboBox();
        brnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JTextField();
        btnNuevoUsuario = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 10));

        btnSalir1.setBackground(new java.awt.Color(51, 153, 255));
        btnSalir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        btnVolver1.setBackground(new java.awt.Color(51, 153, 255));
        btnVolver1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 70, -1));

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PASSWORD", "TIPO"
            }
        ));
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_usuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 510, 190));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Nombre De Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(153, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 70, 20));

        cmbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 30));

        brnListar.setBackground(new java.awt.Color(153, 204, 255));
        brnListar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        brnListar.setText("Listar");
        brnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnListarActionPerformed(evt);
            }
        });
        getContentPane().add(brnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 80, 30));

        btnEliminar.setBackground(new java.awt.Color(153, 204, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 80, 30));

        btnEditar.setBackground(new java.awt.Color(153, 204, 255));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 60, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, -1));

        btnNuevoUsuario.setBackground(new java.awt.Color(153, 204, 255));
        btnNuevoUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo_peq.jpg"))); // NOI18N
        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.setBorder(null);
        btnNuevoUsuario.setBorderPainted(false);
        btnNuevoUsuario.setContentAreaFilled(false);
        btnNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoUsuario.setIconTextGap(-1);
        btnNuevoUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo_peq.jpg"))); // NOI18N
        btnNuevoUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo_usuario_1.jpg"))); // NOI18N
        btnNuevoUsuario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuevoUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 90, 70));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ima2.2_ampliada.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        System.exit(0);

// TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed

        Principal_Admin obj = new Principal_Admin();
        obj.setVisible(true);
        dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked

        int seleccion = tabla_usuarios.getSelectedRow();
        tabla_usuarios.getSelectedColumn();

        txtID.setText(String.valueOf(tabla_usuarios.getValueAt(seleccion, 0)));
        txtNombre.setText(String.valueOf(tabla_usuarios.getValueAt(seleccion, 1)));
        txtPassword.setText(String.valueOf(tabla_usuarios.getValueAt(seleccion, 2)));
        txtTipoUsuario.setText(String.valueOf(tabla_usuarios.getValueAt(seleccion, 3)));

// TODO add your handling code here:
    }//GEN-LAST:event_tabla_usuariosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {

            String guardar = cmbUsuarios.getSelectedItem().toString();
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            PreparedStatement pst = cnx.prepareStatement("Select * from USUARIOS where NOMBRE_USUARIO = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                txtID.setText(rs.getString("id_usuario").trim());
                txtNombre.setText(rs.getString("nombre_usuario").trim());
                txtPassword.setText(rs.getString("password_usuario").trim());
                txtTipoUsuario.setText(rs.getString("tipo_usuario").trim());

                //pst.setString(1, CMBID.getName());
                //String guardar = txtBuscar.getText();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsuariosActionPerformed

    private void brnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnListarActionPerformed

        txtNombre.setEnabled(true);
        txtPassword.setEnabled(true);
        txtTipoUsuario.setEnabled(true);
        LimpirTabla();
        ListarDatos();

        // TODO add your handling code here:
    }//GEN-LAST:event_brnListarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        usuarios usu = new usuarios();
        usu.setId_usuario(Integer.parseInt(txtID.getText()));
        usu.setNombre(txtNombre.getText());
        usu.setPassword(txtPassword.getText());
        usu.setTipoUsuario(Integer.parseInt(txtTipoUsuario.getText()));

        if (txtNombre.getText().equals("") || txtPassword.getText().equals("") || txtTipoUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Selecciones un registro de la tabla", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Object[] opciones = {"Aceptar", "Cancelar"};
            int eleccion = JOptionPane.showOptionDialog(rootPane, "¿En realidad desea ELIMINAR este registro?", "Mensaje de Confirmacion",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
            if (eleccion == JOptionPane.YES_OPTION) {
                db.EliminarUsuario(usu);;
                JOptionPane.showMessageDialog(this, "Datos ELIMINADOS exitosamente", "", JOptionPane.INFORMATION_MESSAGE);
                LimpirTabla();
                ListarDatos();
                this.cmbUsuarios.removeAllItems();
                CargarCmbUsuarios();
                txtID.setText("");
                txtNombre.setText("");
                txtPassword.setText("");
                txtTipoUsuario.setText("");
                txtNombre.requestFocus();

            } else {
                LimpirTabla();
                ListarDatos();
                this.cmbUsuarios.removeAllItems();
                CargarCmbUsuarios();
                txtID.setText("");
                txtNombre.setText("");
                txtPassword.setText("");
                txtTipoUsuario.setText("");
                txtNombre.requestFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        usuarios usu = new usuarios();
        usu.setId_usuario(Integer.parseInt(txtID.getText()));
        usu.setNombre(txtNombre.getText());
        usu.setPassword(txtPassword.getText());
        usu.setTipoUsuario(Integer.parseInt(txtTipoUsuario.getText()));
        if (txtNombre.getText().equals("") || txtPassword.getText().equals("") || txtTipoUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Selecciones un registro de la tabla", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Object[] opciones = {"Aceptar", "Cancelar"};
            int eleccion = JOptionPane.showOptionDialog(this, "¿En realidad desea EDITAR este registro?", "Mensaje de Confirmacion",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
            if (eleccion == JOptionPane.YES_OPTION) {
                db.EditarUsuario(usu);
                JOptionPane.showMessageDialog(this, "Datos EDITAR exitosamente", "", JOptionPane.INFORMATION_MESSAGE);
                LimpirTabla();
                ListarDatos();
                this.cmbUsuarios.removeAllItems();
                CargarCmbUsuarios();
                txtID.setText("");
                txtNombre.setText("");
                txtPassword.setText("");
                txtTipoUsuario.setText("");
                txtNombre.requestFocus();

            } else {
                LimpirTabla();
                ListarDatos();
                this.cmbUsuarios.removeAllItems();
                CargarCmbUsuarios();
                txtID.setText("");
                txtNombre.setText("");
                txtPassword.setText("");
                txtTipoUsuario.setText("");
                txtNombre.requestFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed

        Nuevo_Usuario obj = new Nuevo_Usuario();
        obj.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void txtTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnListar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox cmbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTipoUsuario;
    // End of variables declaration//GEN-END:variables
}
