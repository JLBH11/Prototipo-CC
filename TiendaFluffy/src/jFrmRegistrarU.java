
import java.awt.Color;
import javax.swing.JOptionPane;

public class jFrmRegistrarU extends javax.swing.JFrame {

    public jFrmRegistrarU() {
        initComponents();
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(250, 218, 221));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jTextFieldT = new javax.swing.JTextField();
        jTextFieldE = new javax.swing.JTextField();
        jButtonReg = new javax.swing.JButton();
        jButtonLimp = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldUs = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombres:");

        jTextFieldN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Telefono:");

        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Registrar Informacion De Usuario");

        jTextFieldA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAActionPerformed(evt);
            }
        });

        jTextFieldT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTActionPerformed(evt);
            }
        });

        jTextFieldE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEActionPerformed(evt);
            }
        });

        jButtonReg.setText("Registar");
        jButtonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegActionPerformed(evt);
            }
        });

        jButtonLimp.setText("Limpiar");
        jButtonLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel6.setText("Contraseña:");

        jTextFieldC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCActionPerformed(evt);
            }
        });

        jLabel7.setText("Usuario:");

        jTextFieldUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jButtonReg)
                            .addGap(47, 47, 47)
                            .addComponent(jButtonLimp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salir))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 13, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldUs, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54))))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReg)
                    .addComponent(jButtonLimp)
                    .addComponent(salir))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNActionPerformed

    private void jTextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAActionPerformed

    private void jTextFieldTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTActionPerformed

    private void jTextFieldEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEActionPerformed

    private void jButtonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegActionPerformed
    
    String username = jTextFieldUs.getText().trim(); // nuevo campo
    String nombres = jTextFieldN.getText().trim();
    String apellidos = jTextFieldA.getText().trim();
    String telefono = jTextFieldT.getText().trim();
    String email = jTextFieldE.getText().trim();
    String contraseña = jTextFieldC.getText().trim();

    // Validación básica
    if (username.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() ||
        telefono.isEmpty() || email.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

    // Verificar si el username ya existe (opcional)
    for (Usuario u : TiendaDatos.listaUsuarios) {
        if (u.getUsername().equalsIgnoreCase(username)) {
            JOptionPane.showMessageDialog(this, "Este nombre de usuario ya está en uso.");
            return;
        }
    }

    // Crear y guardar usuario
    Usuario nuevoUsuario = new Usuario(
        username,
        contraseña,
        "cliente",  // rol predeterminado
        nombres,
        apellidos,
        telefono,
        email
    );

    TiendaDatos.listaUsuarios.add(nuevoUsuario);

    JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.");
    }//GEN-LAST:event_jButtonRegActionPerformed

    private void jButtonLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpActionPerformed

    jTextFieldN.setText("");
    jTextFieldA.setText("");
    jTextFieldT.setText("");
    jTextFieldE.setText("");
    jTextFieldC.setText("");
    }//GEN-LAST:event_jButtonLimpActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jTextFieldCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCActionPerformed

    private void jTextFieldUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmRegistrarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmRegistrarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmRegistrarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmRegistrarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmRegistrarU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimp;
    private javax.swing.JButton jButtonReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldC;
    private javax.swing.JTextField jTextFieldE;
    private javax.swing.JTextField jTextFieldN;
    private javax.swing.JTextField jTextFieldT;
    private javax.swing.JTextField jTextFieldUs;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
