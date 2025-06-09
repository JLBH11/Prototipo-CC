
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class jFrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form jFrmLogin
     */
    public jFrmLogin() {
        initComponents();
        cargarLogo();
        
        getContentPane().setBackground(new Color(250, 218, 221));  // Rosado claro

        ImageIcon logoOriginal = new ImageIcon(getClass().getResource("/Imagenes/logo.jpg"));
    
    Image imagenEscalada = logoOriginal.getImage().getScaledInstance(
        lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);

lblLogo.setIcon(new ImageIcon(imagenEscalada));
 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jCheckBoxRecordar = new javax.swing.JCheckBox();
        jButtonIsu = new javax.swing.JButton();
        jButtonIsa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldContra = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setForeground(new java.awt.Color(255, 153, 153));

        lblLogo.setBackground(new java.awt.Color(255, 102, 102));
        lblLogo.setForeground(new java.awt.Color(204, 102, 255));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.jpg"))); // NOI18N
        lblLogo.setText("Logo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Bienvenido a Fluffy Center");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Inicia sesion para continuar");

        jTextFieldEmail.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldEmail.setText("Email");
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jCheckBoxRecordar.setText("Recordarme");
        jCheckBoxRecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRecordarActionPerformed(evt);
            }
        });

        jButtonIsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        jPasswordFieldContra.setText("000000000");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Registrate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(119, 119, 119))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxRecordar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordFieldContra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonIsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail)
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
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxRecordar)
                .addGap(18, 18, 18)
                .addComponent(jButtonIsu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonIsa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarLogo() {
    ImageIcon logoOriginal = new ImageIcon(getClass().getResource("/Imagenes/logo.jpg"));
    Image imagenEscalada = logoOriginal.getImage().getScaledInstance(
            lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
    lblLogo.setIcon(new ImageIcon(imagenEscalada));
}

    
    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jCheckBoxRecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRecordarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRecordarActionPerformed

    private void jButtonIsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIsuActionPerformed
    String usuario = jTextFieldEmail.getText();
    String contraseña = String.valueOf(jPasswordFieldContra.getPassword());


    // Validación simple (puedes mejorarlo después)
    if (usuario.equals("cliente") && contraseña.equals("1234")) {
        JOptionPane.showMessageDialog(this, "Bienvenido a Fluffy Center");

        // Abrir la ventana del catálogo
        jFrmCatalogo catalogo = new jFrmCatalogo();
        catalogo.setVisible(true);

        // Cerrar la ventana actual
        this.dispose(); 
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
    }
    }//GEN-LAST:event_jButtonIsuActionPerformed

    private void jButtonIsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIsaActionPerformed
    String usuario = jTextFieldEmail.getText();
    String contraseña = String.valueOf(jPasswordFieldContra.getPassword());


    // Validación simple (puedes mejorarlo después)
    if (usuario.equals("admin") && contraseña.equals("1234")) {
        JOptionPane.showMessageDialog(this, "Has ingresado al panel de administracion de Fluffy Center");

        // Abrir la ventana del catálogo
        jFrmAdmin admin = new jFrmAdmin();
        admin.setVisible(true);

        // Cerrar la ventana actual
        this.dispose(); 
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
    }
    }//GEN-LAST:event_jButtonIsaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jFrmRegistrarU registrar = new jFrmRegistrarU();
        registrar.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButtonIsa;
    private javax.swing.JButton jButtonIsu;
    private javax.swing.JCheckBox jCheckBoxRecordar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldContra;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
