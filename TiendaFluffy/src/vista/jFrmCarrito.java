
package vista;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;
import modelo.Peluche;
import modelo.Tienda;
import modelo.Usuario;
import modelo.UsuarioDatos;
import vista.FrmCatalogo;


public class jFrmCarrito extends javax.swing.JFrame {
    private Tienda tienda;
    private Usuario usuario;
    private FrmCatalogo frmCatalogo;


    public jFrmCarrito(Tienda tienda, Usuario usuario, FrmCatalogo frmCatalogo) {
        System.out.println("Usuario recibido en jFrmCarrito: " + (usuario != null ? usuario.getUsername() : "null"));
        this.tienda = tienda;
        this.usuario = usuario;
        this.frmCatalogo = frmCatalogo;

        initComponents();
        
        // Verificación de null antes de actualizar carrito
        if (this.usuario != null && this.usuario.getArticulos() != null) {
            actualizarCarrito(); // ✅ Solo si la lista no es null
        } else {
            System.out.println("⚠️ No se puede actualizar el carrito porque el usuario o la lista de artículos es null.");
        }

        getContentPane().setBackground(new Color(255, 255, 255));  // Rosado claro
        cargarImagen(lblLogo, "/Imagenes/LogoP.png");
        cargarImagen(lblCarro, "/Imagenes/carro.png");
        jTextField1.setEditable(false);
        jTableCarrito.setDefaultEditor(Object.class, null); // Desactiva edición
        jTableCarrito.getColumnModel().getColumn(0).setPreferredWidth(150); 
    }// Ajusta ancho



    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblContador = new javax.swing.JLabel();
        lblCarro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarrito = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setBackground(new java.awt.Color(255, 102, 102));
        lblLogo.setForeground(new java.awt.Color(204, 102, 255));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoP.png"))); // NOI18N
        lblLogo.setText("Logo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FLUFFY CENTER");

        jButton4.setText("❌");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblContador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblContador.setText("Mi carrito (0 Articulos)");

        lblCarro.setBackground(new java.awt.Color(255, 102, 102));
        lblCarro.setForeground(new java.awt.Color(204, 102, 255));
        lblCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro.png"))); // NOI18N
        lblCarro.setText("Logo");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar Comprando");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Peluche", "Precio", "Cantidad", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jTableCarrito);

        jLabel4.setText("Total:");

        jTextField1.setText("$00.00");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Borrar Articulo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Finalizar Compra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblContador)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblContador)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarCarrito() {
        
    DefaultTableModel model = (DefaultTableModel) jTableCarrito.getModel();
        model.setRowCount(0); // Limpiar tabla
        
        double total = 0;
        for (Peluche p : usuario.getArticulos()) {
            model.addRow(new Object[]{
                p.getNombre(), 
                String.format("$%,.2f", p.getPrecio()), 
                1, // Cantidad inicial
                p.getCategoria()
            });
            total += p.getPrecio();
        }
        jTextField1.setText(String.format("$%,.2f", total));
        lblContador.setText("Mi carrito (" + usuario.getArticulos().size() + " Artículos)");
    }
    private void cargarImagen(javax.swing.JLabel etiqueta, String ruta) {
    java.net.URL imgURL = getClass().getResource(ruta);
    if (imgURL == null) {
        System.err.println("No se encontró la imagen en: " + ruta);
        return;
    }
    ImageIcon icono = new ImageIcon(getClass().getResource(ruta));
    Image imagen = icono.getImage().getScaledInstance(
        etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_SMOOTH);
    etiqueta.setIcon(new ImageIcon(imagen));
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose(); // Cierra el catálogo
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int fila = jTableCarrito.getSelectedRow();
        if (fila >= 0) {
            usuario.getArticulos().remove(fila);
            actualizarCarrito();
            JOptionPane.showMessageDialog(this, "Artículo eliminado del carrito");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un artículo para borrar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    if (usuario.getArticulos().isEmpty()) {
        JOptionPane.showMessageDialog(this, "El carrito está vacío.");
        return;
    }
    try {
        double total = 0.0;
        for (Peluche p : usuario.getArticulos()) {
            total += p.getPrecio();
        }
        
        int id = generarIdUnico();
        Usuario cliente = usuario;
        List<Peluche> productos = new ArrayList<>(usuario.getArticulos()); 
        String estado = "Pendiente";

        Pedido nuevoPedido = new Pedido(id, cliente, productos, total, estado);

        // Agregar a la tienda
        tienda.agregarPedido(nuevoPedido);
        usuario.getHistorialPedidos().add(nuevoPedido);
UsuarioDatos.guardarUsuarios(tienda.getUsuarios()); // Esto sobrescribe el .dat con el nuevo pedido incluido en el usuario.

        
        // Descontar stock de cada peluche comprado
        for (Peluche p : productos) {
            p.setStock(Math.max(0, p.getStock() - 1)); 
        }
        tienda.guardarCatalogo();

        // Limpiar carrito
        usuario.getArticulos().clear();
        actualizarCarrito();

        // Finalmente guardar pedidos
        tienda.guardarPedidos();

        JOptionPane.showMessageDialog(this, "¡Compra finalizada con éxito!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage()); 
    }
    if (frmCatalogo != null) {
    frmCatalogo.cargarPeluches();
    frmCatalogo.revalidate();
    frmCatalogo.repaint();
}



    }//GEN-LAST:event_jButton3ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarrito;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
private int generarIdUnico() {
    List<Pedido> pedidos = tienda.getListaPedidos();
    int maxId = 0;
    for (Pedido p : pedidos) {
        if (p.getId() > maxId) {
            maxId = p.getId();
        }
    }
    return maxId + 1;
}

}
