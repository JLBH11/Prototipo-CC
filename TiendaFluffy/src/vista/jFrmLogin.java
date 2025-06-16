package vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import modelo.Tienda;
import modelo.Usuario;
import modelo.UsuarioDatos;
import java.util.ArrayList;
import vista.FrmAdmin;
import vista.FrmCatalogo;
import vista.jFrmRegistrarU;
import controlador.ControladorLogin;

public class jFrmLogin extends javax.swing.JFrame {
    private Tienda tienda;
ControladorLogin controlador = new ControladorLogin();

    public jFrmLogin() {
        initComponents();
        setLocationRelativeTo(null);
        cargarLogo();
        
        getContentPane().setBackground(new Color(250, 218, 221));  // Rosado claro

        ImageIcon logoOriginal = new ImageIcon(getClass().getResource("/Imagenes/LogoP.png"));
    
    Image imagenEscalada = logoOriginal.getImage().getScaledInstance(
        lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);

lblLogo.setIcon(new ImageIcon(imagenEscalada));
 
    

        tienda = new Tienda();

        // Cargar usuarios desde archivo
        ArrayList<Usuario> usuariosCargados = UsuarioDatos.cargarUsuarios();
        tienda.setUsuarios(usuariosCargados);
    }

    public Tienda getTienda() {
        return tienda;
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jCheckBoxRecordar = new javax.swing.JCheckBox();
        jButtonIsu = new javax.swing.JButton();
        jButtonIsa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setForeground(new java.awt.Color(255, 153, 153));

        lblLogo.setBackground(new java.awt.Color(255, 102, 102));
        lblLogo.setForeground(new java.awt.Color(204, 102, 255));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoP.png"))); // NOI18N
        lblLogo.setText("Logo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Bienvenido a Fluffy Center");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Inicia sesion para continuar");

        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setText("Email");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jCheckBoxRecordar.setText("Recordarme");
        jCheckBoxRecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRecordarActionPerformed(evt);
            }
        });

        jButtonIsu.setBackground(new java.awt.Color(0, 0, 0));
        jButtonIsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIsu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIsu.setText("Iniciar Sesion Como Usuario");
        jButtonIsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIsuActionPerformed(evt);
            }
        });

        jButtonIsa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIsa.setText("Acceso Administrador");
        jButtonIsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIsaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("¿Olvidaste tu contraseña?");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("¿No tienes una cuenta?");

        txtClave.setText("0000");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Soporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxRecordar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonIsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(jButtonIsa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxRecordar)
                .addGap(18, 18, 18)
                .addComponent(jButtonIsu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonIsa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarLogo() {
    ImageIcon logoOriginal = new ImageIcon(getClass().getResource("/Imagenes/LogoP.png"));
    Image imagenEscalada = logoOriginal.getImage().getScaledInstance(
            lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
    lblLogo.setIcon(new ImageIcon(imagenEscalada));
}

    
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jCheckBoxRecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRecordarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRecordarActionPerformed

    private void jButtonIsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIsuActionPerformed
String username = txtUsuario.getText().trim();
String password = txtClave.getText().trim();

System.out.println("Intentando login con: " + username + " / " + password);

// Paso 1: Cargar usuarios actualizados desde archivo y actualizar la tienda
ArrayList<Usuario> usuariosActualizados = UsuarioDatos.cargarUsuarios();
tienda.setUsuarios(usuariosActualizados);

// Paso 2: Imprimir usuarios del archivo para debug
for (Usuario u : usuariosActualizados) {
    System.out.println("Usuario en archivo: " + u.getUsername() + " / " + u.getContraseña());
}

// Paso 3: Validar credenciales
Usuario usuarioLogueado = tienda.getUsuarioPorCredenciales(username, password);
System.out.println("Resultado de búsqueda: " + (usuarioLogueado != null ? "Encontrado" : "No encontrado"));

if (usuarioLogueado != null) {
    if (username.equals("admin")) {
        new FrmAdmin(tienda).setVisible(true);
    } else {
        new FrmCatalogo(tienda, usuarioLogueado).setVisible(true);
    }
    this.dispose();
} else {
    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
}
System.out.println("Instancia Tienda: " + tienda);

controlador.controlIniciarSesion();
    }//GEN-LAST:event_jButtonIsuActionPerformed

    private void jButtonIsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIsaActionPerformed
 String usuario = txtUsuario.getText().trim();
String clave = txtClave.getText().trim();

if (usuario.equals("admin") && clave.equals("1234")) {
    FrmAdmin admin = new FrmAdmin(tienda);
    admin.setVisible(true);
    this.dispose(); // Cierra el login
} else {
    JOptionPane.showMessageDialog(this, "Credenciales de administrador incorrectas.");
}
controlador.controlAdmin();
    }//GEN-LAST:event_jButtonIsaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   jFrmRegistrarU frm = new jFrmRegistrarU(tienda);
frm.setVisible(true);

 controlador.controlAbrirRegistro();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String mensaje = "📞 Soporte de Fluffy Center\n\n"
                   + "Teléfono: +57 312 8507201\n"
                   + "Correo: soporte@fluffycenter.com\n\n"
                   + "Horario de atención: Lunes a Viernes, 9:00 a 18:00";

    JOptionPane.showMessageDialog(this, mensaje, "Soporte Técnico", JOptionPane.INFORMATION_MESSAGE);
  controlador.controlSoporte();
   // aqui quiero que al presionar este boton de soporte, muestre un mensaje por dialogo con la informacion de soporte, el telefono y email
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmLogin().setVisible(true);
            }
        });
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonIsa;
    private javax.swing.JButton jButtonIsu;
    private javax.swing.JCheckBox jCheckBoxRecordar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
