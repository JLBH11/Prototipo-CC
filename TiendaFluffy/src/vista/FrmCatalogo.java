package vista;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import modelo.Peluche;
import modelo.Usuario;
import modelo.Tienda;
import javax.swing.JLabel;
import java.util.List;
import java.util.ArrayList;

import java.awt.Image;
import java.io.IOException;

import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import modelo.PelucheDatos;
import modelo.TiendaDatos;
import modelo.UsuarioDatos;
import vista.FrmPedidos;

public class FrmCatalogo extends javax.swing.JFrame {
    private Tienda tienda;
    private Usuario usuarioActual;
    private ArrayList<Peluche> peluchesVisualizados;

   public FrmCatalogo(Tienda tienda, Usuario usuario) {
       System.out.println("Usuario recibido en FrmCatalogo: " + (usuario != null ? usuario.getUsername() : "null"));
       this.usuarioActual = usuario;
        this.tienda = tienda;
        this.peluchesVisualizados = new ArrayList<>();
    
    initComponents(); // primero los componentes gráficos
  panelCatalogo.setPreferredSize(new Dimension(1033, 6000));
        scrollCatalogo.setViewportView(panelCatalogo);
        panelCatalogo.revalidate();
        panelCatalogo.repaint();
        System.out.println("📦 Verificando rutas de imagen de peluches...");
for (Peluche p : tienda.getCatalogo()) {
    System.out.println("🧸 " + p.getNombre() + " | Ruta imagen: " + p.getImagenRuta());
}
jPanelSidebar.setVisible(false);
        jPanelSoporte.setVisible(false);

          cargarImagen(lblUser, "/Imagenes/User.png");
        cargarImagen(lblfacebook, "/Imagenes/Fc.png");
        cargarImagen(lblIg, "/Imagenes/IG2.jpg");
        cargarImagen(lblX, "/Imagenes/X.png");
lblNombreUsuario1.setText(usuario.getNombres() + " " + usuario.getApellidos());
    lblEmailUsuario1.setText(usuario.getEmail());
cargarImagenEnLabel(lblCategoriaOso, "src/imagenes/OSO.png");
cargarImagenEnLabel(lblCategoriaPerros, "src/imagenes/PERRO.png");
cargarImagenEnLabel(lblCategoriaGato, "src/imagenes/GATO.png");
cargarImagenEnLabel(lblCategoriaFantasia, "src/imagenes/UNICORNIO.png");



    // Cargar logo
    cargarImagen(jLabel57, "/Imagenes/Logo.png");

    
    JOptionPane.showMessageDialog(this, "Bienvenido, " + usuarioActual.getNombres());
cargarPeluches();
    btnFavorito1.addActionListener(e -> marcarComoFavorito(0));
        btnFavorito2.addActionListener(e -> marcarComoFavorito(1));
        btnFavorito3.addActionListener(e -> marcarComoFavorito(2));
        btnFavorito4.addActionListener(e -> marcarComoFavorito(3));
        btnFavorito5.addActionListener(e -> marcarComoFavorito(4));
        btnFavorito6.addActionListener(e -> marcarComoFavorito(5));
    btnFavorito7.addActionListener(e -> marcarComoFavorito(6));
    btnFavorito8.addActionListener(e -> marcarComoFavorito(7));
    btnFavorito9.addActionListener(e -> marcarComoFavorito(8));
    btnFavorito10.addActionListener(e -> marcarComoFavorito(9));
    
    btnAgregarCarrito1.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(0)));
btnAgregarCarrito2.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(1)));
btnAgregarCarrito3.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(2)));
btnAgregarCarrito4.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(3)));
btnAgregarCarrito5.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(4)));
btnAgregarCarrito6.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(5)));
btnAgregarCarrito7.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(6)));
btnAgregarCarrito8.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(7)));
btnAgregarCarrito9.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(8)));
btnAgregarCarrito10.addActionListener(e -> agregarAlCarrito(tienda.getCatalogo().get(9)));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        scrollCatalogo = new javax.swing.JScrollPane();
        panelCatalogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnVerFavoritos = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblCategoriaPerros = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblCategoriaGato = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblCategoriaFantasia = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblCategoriaOso = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarCarrito1 = new javax.swing.JButton();
        lvlCalificacion1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lvlNombre1 = new javax.swing.JLabel();
        lvlPrecio1 = new javax.swing.JLabel();
        lvlCategoria1 = new javax.swing.JLabel();
        lblcd1 = new javax.swing.JLabel();
        btnFavorito1 = new javax.swing.JButton();
        lvlStock1 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnAgregarCarrito2 = new javax.swing.JButton();
        lvlCalificacion2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lvlNombre2 = new javax.swing.JLabel();
        lvlPrecio2 = new javax.swing.JLabel();
        lvlCategoria2 = new javax.swing.JLabel();
        lblcd2 = new javax.swing.JLabel();
        btnFavorito2 = new javax.swing.JButton();
        lvlStock2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAgregarCarrito3 = new javax.swing.JButton();
        lvlCalificacion3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lvlNombre3 = new javax.swing.JLabel();
        lvlPrecio3 = new javax.swing.JLabel();
        lvlCategoria3 = new javax.swing.JLabel();
        lblcd3 = new javax.swing.JLabel();
        btnFavorito3 = new javax.swing.JButton();
        lvlStock3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnAgregarCarrito4 = new javax.swing.JButton();
        lvlCalificacion4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lvlNombre4 = new javax.swing.JLabel();
        lvlPrecio4 = new javax.swing.JLabel();
        lvlCategoria4 = new javax.swing.JLabel();
        lblcd4 = new javax.swing.JLabel();
        btnFavorito4 = new javax.swing.JButton();
        lvlStock4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        btnAgregarCarrito5 = new javax.swing.JButton();
        lvlCalificacion5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lvlNombre5 = new javax.swing.JLabel();
        lvlPrecio5 = new javax.swing.JLabel();
        lvlCategoria5 = new javax.swing.JLabel();
        lblcd5 = new javax.swing.JLabel();
        btnFavorito5 = new javax.swing.JButton();
        lvlStock5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btnAgregarCarrito6 = new javax.swing.JButton();
        lvlCalificacion6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lvlNombre6 = new javax.swing.JLabel();
        lvlPrecio6 = new javax.swing.JLabel();
        lvlCategoria6 = new javax.swing.JLabel();
        lblcd6 = new javax.swing.JLabel();
        btnFavorito6 = new javax.swing.JButton();
        lvlStock6 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        btnAgregarCarrito7 = new javax.swing.JButton();
        lvlCalificacion7 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lvlNombre7 = new javax.swing.JLabel();
        lvlPrecio7 = new javax.swing.JLabel();
        lvlCategoria7 = new javax.swing.JLabel();
        lblcd7 = new javax.swing.JLabel();
        btnFavorito7 = new javax.swing.JButton();
        lvlStock7 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        btnAgregarCarrito8 = new javax.swing.JButton();
        lvlCalificacion8 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lvlNombre8 = new javax.swing.JLabel();
        lvlPrecio8 = new javax.swing.JLabel();
        lvlCategoria8 = new javax.swing.JLabel();
        lblcd8 = new javax.swing.JLabel();
        btnFavorito8 = new javax.swing.JButton();
        lvlStock8 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        btnAgregarCarrito9 = new javax.swing.JButton();
        lvlCalificacion9 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lvlNombre9 = new javax.swing.JLabel();
        lvlPrecio9 = new javax.swing.JLabel();
        lvlCategoria9 = new javax.swing.JLabel();
        lblcd9 = new javax.swing.JLabel();
        btnFavorito9 = new javax.swing.JButton();
        lvlStock9 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        btnAgregarCarrito10 = new javax.swing.JButton();
        lvlCalificacion10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lvlNombre10 = new javax.swing.JLabel();
        lvlPrecio10 = new javax.swing.JLabel();
        lvlCategoria10 = new javax.swing.JLabel();
        lblcd10 = new javax.swing.JLabel();
        btnFavorito10 = new javax.swing.JButton();
        lvlStock10 = new javax.swing.JLabel();
        jPanelSidebar = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        lblNombreUsuario1 = new javax.swing.JLabel();
        lblEmailUsuario1 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        jPanelSoporte = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lblfacebook = new javax.swing.JLabel();
        lblIg = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scrollCatalogo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollCatalogo.setPreferredSize(new java.awt.Dimension(1033, 1750));

        panelCatalogo.setBackground(new java.awt.Color(255, 204, 204));
        panelCatalogo.setPreferredSize(new java.awt.Dimension(1000, 1750));

        jLabel1.setText("FLUFFY CENTER");

        jLabel2.setBackground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("🔎 ");

        jButton2.setText("👨");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("🛒");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("❌");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("CARRITO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnVerFavoritos.setText("LISTA DE DESEOS");
        btnVerFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFavoritosActionPerformed(evt);
            }
        });

        jButton9.setText("PEDIDOS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("LOS PELUCHES MAS BACANOS");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("ENCUENTRA EL COMPAÑERO PERFECTO PARA CADA MOMENTO ESPECIAL");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXPLORAR COLECCION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        lblCategoriaPerros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PERRO.png"))); // NOI18N
        lblCategoriaPerros.setText("jLabel5");

        jLabel10.setText("PERROS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoriaPerros, javax.swing.GroupLayout.PREFERRED_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCategoriaPerros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        lblCategoriaGato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GATO.png"))); // NOI18N
        lblCategoriaGato.setText("jLabel5");

        jLabel11.setText("GATOS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoriaGato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblCategoriaGato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));

        lblCategoriaFantasia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UNICORNIO.png"))); // NOI18N
        lblCategoriaFantasia.setText("jLabel5");

        jLabel12.setText("FANTASIA");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoriaFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoriaFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));

        lblCategoriaOso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OSO.png"))); // NOI18N
        lblCategoriaOso.setText("jLabel5");

        jLabel13.setText("OSO");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoriaOso, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblCategoriaOso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito1.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito1.setText("AGREGAR AL CARRITO");
        btnAgregarCarrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito1ActionPerformed(evt);
            }
        });

        lvlCalificacion1.setText("⭐⭐⭐⭐⭐");

        jLabel7.setBackground(new java.awt.Color(255, 0, 51));
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("OFERTA");

        lvlNombre1.setText("OSO TEDDY CLASICO");

        lvlPrecio1.setText("75000");

        lvlCategoria1.setText("Osos");

        btnFavorito1.setForeground(new java.awt.Color(255, 0, 0));
        btnFavorito1.setText("❤");
        btnFavorito1.setBorder(null);
        btnFavorito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito1ActionPerformed(evt);
            }
        });

        lvlStock1.setText("STOCK:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion1))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito1)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblcd1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lvlCategoria1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lvlPrecio1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnFavorito1)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(lblcd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre1)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion1)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio1)
                    .addComponent(lvlStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel57.setText("jLabel57");

        jButton14.setText("BUSCAR");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito2.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito2.setText("AGREGAR AL CARRITO");

        lvlCalificacion2.setText("⭐⭐⭐⭐⭐");

        jLabel22.setBackground(new java.awt.Color(255, 0, 51));
        jLabel22.setForeground(new java.awt.Color(255, 0, 51));
        jLabel22.setText("OFERTA");

        lvlNombre2.setText("OSO TEDDY CLASICO");

        lvlPrecio2.setText("75000");

        lvlCategoria2.setText("Osos");

        btnFavorito2.setForeground(new java.awt.Color(255, 51, 0));
        btnFavorito2.setText("❤");
        btnFavorito2.setBorder(null);
        btnFavorito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito2ActionPerformed(evt);
            }
        });

        lvlStock2.setText("STOCK:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion2)
                                    .addComponent(lvlCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito2)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblcd2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lvlPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnFavorito2)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(lblcd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre2)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion2)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio2)
                    .addComponent(lvlStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito3.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito3.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito3.setText("AGREGAR AL CARRITO");

        lvlCalificacion3.setText("⭐⭐⭐⭐⭐");

        jLabel24.setBackground(new java.awt.Color(255, 0, 51));
        jLabel24.setForeground(new java.awt.Color(255, 0, 51));
        jLabel24.setText("OFERTA");

        lvlNombre3.setText("OSO TEDDY CLASICO");

        lvlPrecio3.setText("75000");

        lvlCategoria3.setText("Osos");

        btnFavorito3.setForeground(new java.awt.Color(255, 0, 0));
        btnFavorito3.setText("❤");
        btnFavorito3.setBorder(null);
        btnFavorito3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito3ActionPerformed(evt);
            }
        });

        lvlStock3.setText("STOCK:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion3)
                                    .addComponent(lvlCategoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito3)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(lblcd3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lvlPrecio3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnFavorito3)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(lblcd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre3)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion3)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio3)
                    .addComponent(lvlStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito4.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito4.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito4.setText("AGREGAR AL CARRITO");

        lvlCalificacion4.setText("⭐⭐⭐⭐⭐");

        jLabel26.setBackground(new java.awt.Color(255, 0, 51));
        jLabel26.setForeground(new java.awt.Color(255, 0, 51));
        jLabel26.setText("OFERTA");

        lvlNombre4.setText("OSO TEDDY CLASICO");

        lvlPrecio4.setText("75000");

        lvlCategoria4.setText("Osos");

        btnFavorito4.setForeground(new java.awt.Color(255, 0, 0));
        btnFavorito4.setText("❤");
        btnFavorito4.setBorder(null);
        btnFavorito4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito4ActionPerformed(evt);
            }
        });

        lvlStock4.setText("STOCK:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion4)
                                    .addComponent(lvlCategoria4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito4)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(lblcd4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(lvlPrecio4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnFavorito4)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(lblcd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre4)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion4)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio4)
                    .addComponent(lvlStock4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito5.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito5.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito5.setText("AGREGAR AL CARRITO");

        lvlCalificacion5.setText("⭐⭐⭐⭐⭐");

        jLabel28.setBackground(new java.awt.Color(255, 0, 51));
        jLabel28.setForeground(new java.awt.Color(255, 0, 51));
        jLabel28.setText("OFERTA");

        lvlNombre5.setText("OSO TEDDY CLASICO");

        lvlPrecio5.setText("75000");

        lvlCategoria5.setText("Osos");

        btnFavorito5.setForeground(new java.awt.Color(255, 0, 0));
        btnFavorito5.setText("❤");
        btnFavorito5.setBorder(null);
        btnFavorito5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito5ActionPerformed(evt);
            }
        });

        lvlStock5.setText("STOCK:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion5)
                                    .addComponent(lvlCategoria5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito5)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(lblcd5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(lvlPrecio5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(btnFavorito5)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(lblcd5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre5)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion5)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio5)
                    .addComponent(lvlStock5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito6.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito6.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito6.setText("AGREGAR AL CARRITO");

        lvlCalificacion6.setText("⭐⭐⭐⭐⭐");

        jLabel30.setBackground(new java.awt.Color(255, 0, 51));
        jLabel30.setForeground(new java.awt.Color(255, 0, 51));
        jLabel30.setText("OFERTA");

        lvlNombre6.setText("OSO TEDDY CLASICO");

        lvlPrecio6.setText("75000");

        lvlCategoria6.setText("Osos");

        btnFavorito6.setForeground(new java.awt.Color(255, 0, 0));
        btnFavorito6.setText("❤");
        btnFavorito6.setBorder(null);
        btnFavorito6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito6ActionPerformed(evt);
            }
        });

        lvlStock6.setText("STOCK:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion6)
                                    .addComponent(lvlCategoria6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito6)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(lblcd6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(lvlPrecio6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnFavorito6)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(lblcd6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre6)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion6)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio6)
                    .addComponent(lvlStock6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito7.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito7.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito7.setText("AGREGAR AL CARRITO");

        lvlCalificacion7.setText("⭐⭐⭐⭐⭐");

        jLabel32.setBackground(new java.awt.Color(255, 0, 51));
        jLabel32.setForeground(new java.awt.Color(255, 0, 51));
        jLabel32.setText("OFERTA");

        lvlNombre7.setText("OSO TEDDY CLASICO");

        lvlPrecio7.setText("75000");

        lvlCategoria7.setText("Osos");

        btnFavorito7.setForeground(new java.awt.Color(255, 0, 0));
        btnFavorito7.setText("❤");
        btnFavorito7.setBorder(null);
        btnFavorito7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito7ActionPerformed(evt);
            }
        });

        lvlStock7.setText("STOCK:");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion7)
                                    .addComponent(lvlCategoria7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito7)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addComponent(lblcd7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(lvlPrecio7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(btnFavorito7)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(lblcd7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre7)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion7)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio7)
                    .addComponent(lvlStock7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito8.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito8.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito8.setText("AGREGAR AL CARRITO");

        lvlCalificacion8.setText("⭐⭐⭐⭐⭐");

        jLabel34.setBackground(new java.awt.Color(255, 0, 51));
        jLabel34.setForeground(new java.awt.Color(255, 0, 51));
        jLabel34.setText("OFERTA");

        lvlNombre8.setText("OSO TEDDY CLASICO");

        lvlPrecio8.setText("75000");

        lvlCategoria8.setText("Osos");

        btnFavorito8.setForeground(new java.awt.Color(255, 0, 0));
        btnFavorito8.setText("❤");
        btnFavorito8.setBorder(null);
        btnFavorito8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito8ActionPerformed(evt);
            }
        });

        lvlStock8.setText("STOCK:");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion8))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito8)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addComponent(lblcd8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lvlCategoria8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lvlPrecio8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(btnFavorito8)
                        .addGap(0, 164, Short.MAX_VALUE))
                    .addComponent(lblcd8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre8)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion8)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio8)
                    .addComponent(lvlStock8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito9.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito9.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito9.setText("AGREGAR AL CARRITO");

        lvlCalificacion9.setText("⭐⭐⭐⭐⭐");

        jLabel36.setBackground(new java.awt.Color(255, 0, 51));
        jLabel36.setForeground(new java.awt.Color(255, 0, 51));
        jLabel36.setText("OFERTA");

        lvlNombre9.setText("OSO TEDDY CLASICO");

        lvlPrecio9.setText("75000");

        lvlCategoria9.setText("Osos");

        btnFavorito9.setForeground(new java.awt.Color(255, 0, 0));
        btnFavorito9.setText("❤");
        btnFavorito9.setBorder(null);
        btnFavorito9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito9ActionPerformed(evt);
            }
        });

        lvlStock9.setText("STOCK:");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion9)
                                    .addComponent(lvlCategoria9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito9)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                .addComponent(lblcd9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(lvlPrecio9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(btnFavorito9)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addComponent(lblcd9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre9)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion9)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio9)
                    .addComponent(lvlStock9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarCarrito10.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCarrito10.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito10.setText("AGREGAR AL CARRITO");

        lvlCalificacion10.setText("⭐⭐⭐⭐⭐");

        jLabel38.setBackground(new java.awt.Color(255, 0, 51));
        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setText("OFERTA");

        lvlNombre10.setText("OSO TEDDY CLASICO");

        lvlPrecio10.setText("75000");

        lvlCategoria10.setText("Osos");

        btnFavorito10.setForeground(new java.awt.Color(255, 51, 0));
        btnFavorito10.setText("❤");
        btnFavorito10.setBorder(null);
        btnFavorito10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavorito10ActionPerformed(evt);
            }
        });

        lvlStock10.setText("STOCK:");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCarrito10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNombre10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCalificacion10)
                                    .addComponent(lvlCategoria10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(262, 262, 262)
                                .addComponent(btnFavorito10)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                .addComponent(lblcd10, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(lvlPrecio10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lvlStock10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(btnFavorito10)
                        .addGap(0, 152, Short.MAX_VALUE))
                    .addComponent(lblcd10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lvlNombre10)
                .addGap(11, 11, 11)
                .addComponent(lvlCalificacion10)
                .addGap(2, 2, 2)
                .addComponent(lvlCategoria10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlPrecio10)
                    .addComponent(lvlStock10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCarrito10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCatalogoLayout = new javax.swing.GroupLayout(panelCatalogo);
        panelCatalogo.setLayout(panelCatalogoLayout);
        panelCatalogoLayout.setHorizontalGroup(
            panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCatalogoLayout.createSequentialGroup()
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCatalogoLayout.createSequentialGroup()
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(252, 252, 252)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(31, 31, 31))
                            .addGroup(panelCatalogoLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                                        .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(72, 530, Short.MAX_VALUE))
                                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnVerFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCatalogoLayout.createSequentialGroup()
                .addGap(0, 575, Short.MAX_VALUE)
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
            .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCatalogoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCatalogoLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel1)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCatalogoLayout.createSequentialGroup()
                            .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelCatalogoLayout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelCatalogoLayout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(311, 311, 311)))
                    .addContainerGap()))
        );
        panelCatalogoLayout.setVerticalGroup(
            panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCatalogoLayout.createSequentialGroup()
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4)
                                .addComponent(jButton3)
                                .addComponent(jButton2)
                                .addComponent(jButton14)))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCatalogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(btnVerFavoritos)
                    .addComponent(jButton6))
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCatalogoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelCatalogoLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(116, 116, 116)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(188, 188, 188))
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(64, 64, 64)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1620, Short.MAX_VALUE)))
        );

        scrollCatalogo.setViewportView(panelCatalogo);

        jPanelSidebar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSidebar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText("Opciones de Usuario");

        jButton28.setBackground(new java.awt.Color(255, 0, 0));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("X");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        lblNombreUsuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreUsuario1.setText("Juan Perez");

        lblEmailUsuario1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmailUsuario1.setForeground(new java.awt.Color(102, 102, 102));
        lblEmailUsuario1.setText("juanperez@gmail.com");

        jButton29.setText("Mis pedidos");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("Lista de deseos");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("Mi carrito");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("Configuracion");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText("Soporte");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setForeground(new java.awt.Color(255, 0, 0));
        jButton34.setText("Cerrar Sesion");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        lblUser.setText("jLabel49");
        lblUser.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout jPanelSidebarLayout = new javax.swing.GroupLayout(jPanelSidebar);
        jPanelSidebar.setLayout(jPanelSidebarLayout);
        jPanelSidebarLayout.setHorizontalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSidebarLayout.createSequentialGroup()
                        .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton30)
                            .addComponent(jButton31)
                            .addComponent(jButton32)
                            .addComponent(jButton33)
                            .addComponent(jButton34))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSidebarLayout.createSequentialGroup()
                        .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailUsuario1)
                            .addComponent(jButton29))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelSidebarLayout.createSequentialGroup()
                        .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreUsuario1)
                                .addGap(12, 12, 12))
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jButton28))))
        );
        jPanelSidebarLayout.setVerticalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28)
                    .addComponent(jLabel61))
                .addGap(14, 14, 14)
                .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario1)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton29)
                .addGap(10, 10, 10)
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton34)
                .addGap(0, 154, Short.MAX_VALUE))
        );

        jPanelSoporte.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Soporte");

        jButton35.setBackground(new java.awt.Color(255, 0, 0));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("X");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Informacion de Contacto");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("+ (57) 321-78658890");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Telefono");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Facebook - FluffyCenter");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("soporte@fufflycenter.com");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Siguenos");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Email");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Instagram - @fluffy_center");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("X - @FluffyCenter");

        javax.swing.GroupLayout jPanelSoporteLayout = new javax.swing.GroupLayout(jPanelSoporte);
        jPanelSoporte.setLayout(jPanelSoporteLayout);
        jPanelSoporteLayout.setHorizontalGroup(
            jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSoporteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSoporteLayout.createSequentialGroup()
                        .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSoporteLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton35))
                            .addGroup(jPanelSoporteLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel45)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSoporteLayout.createSequentialGroup()
                                .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelSoporteLayout.createSequentialGroup()
                                        .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanelSoporteLayout.createSequentialGroup()
                                                .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel40)
                                                    .addComponent(jLabel46))
                                                .addGap(50, 50, 50))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSoporteLayout.createSequentialGroup()
                                                .addComponent(jLabel44)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addComponent(lblIg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel48))
                                .addGap(14, 14, 14)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSoporteLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblfacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43)
                        .addGap(41, 41, 41))))
        );
        jPanelSoporteLayout.setVerticalGroup(
            jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSoporteLayout.createSequentialGroup()
                .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSoporteLayout.createSequentialGroup()
                        .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jButton35))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel42))
                    .addGroup(jPanelSoporteLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel43)
                        .addComponent(lblfacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSoporteLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSoporteLayout.createSequentialGroup()
                        .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47)
                            .addComponent(lblIg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 2573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanelSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
 String texto = txtBuscar.getText().trim().toLowerCase();

    // Oculta todos los labels por defecto
    lblcd1.setVisible(false);
    lblcd2.setVisible(false);
    lblcd3.setVisible(false);
    lblcd4.setVisible(false);
    lblcd5.setVisible(false);
    lblcd6.setVisible(false);

    // Opcional: Mostrar mensaje si está vacío
    if (texto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa un nombre para buscar");
        return;
    }
    // Ahora mostramos solo el que coincide
    if ("teddy".contains(texto)) {
        lblcd1.setVisible(true);
    } else if ("gorila".contains(texto)) {
        lblcd2.setVisible(true);
    } else if ("siames".contains(texto)) {
        lblcd3.setVisible(true);
    } else if ("golden".contains(texto)) {
        lblcd4.setVisible(true);
    } else if ("stich".contains(texto)) {
        lblcd5.setVisible(true);
    } else if ("perronegro".contains(texto)) {
        lblcd6.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró ningún peluche con ese nombre");}
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btnFavorito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito1ActionPerformed
btnFavorito1.addActionListener(e -> {
    int indice = 0;
    if (indice < tienda.getCatalogo().size()) {
        Peluche peluche = tienda.getCatalogo().get(indice);
        usuarioActual.agregarFavorito(peluche);
        JOptionPane.showMessageDialog(this, peluche.getNombre() + " fue agregado a tus favoritos.");
    } else {
        JOptionPane.showMessageDialog(this, "No hay peluche en la posición 1.");
    }
});
    }//GEN-LAST:event_btnFavorito1ActionPerformed

    private void btnVerFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFavoritosActionPerformed
    btnVerFavoritos.addActionListener(e -> abrirFavoritos());
    System.out.println("Instancia Tienda: " + tienda);
    }//GEN-LAST:event_btnVerFavoritosActionPerformed

    private void btnFavorito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito2ActionPerformed

    private void btnFavorito3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito3ActionPerformed

    private void btnFavorito4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito4ActionPerformed

    private void btnFavorito5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito5ActionPerformed

    private void btnFavorito6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito6ActionPerformed

    private void btnFavorito7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito7ActionPerformed

    private void btnFavorito8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito8ActionPerformed

    private void btnFavorito9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito9ActionPerformed

    private void btnFavorito10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavorito10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavorito10ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jPanelSidebar.setVisible(false);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jPanelSoporte.setVisible(true);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        dispose(); // Cierra el catálogo
        new jFrmLogin().setVisible(true);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        jPanelSoporte.setVisible(false);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   jFrmCarrito carrito = new jFrmCarrito(tienda, usuarioActual, this);
carrito.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose(); // Cierra el catálogo
        new jFrmLogin().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     jPanelSidebar.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAgregarCarrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarrito1ActionPerformed
    
    }//GEN-LAST:event_btnAgregarCarrito1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    System.out.println("UsuarioActual: " + usuarioActual);
System.out.println("Pedidos del usuarioActual: " + (usuarioActual != null ? usuarioActual.getHistorialPedidos() : "null"));
   jFrmHistorial historial = new jFrmHistorial(tienda, usuarioActual);
    historial.setLocationRelativeTo(this); // Centrar respecto a la ventana actual
    historial.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
jFrmConfig config = new jFrmConfig(tienda, usuarioActual);
    config.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
         btnVerFavoritos.addActionListener(e -> abrirFavoritos());
    System.out.println("Instancia Tienda: " + tienda);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
System.out.println("UsuarioActual: " + usuarioActual);
System.out.println("Pedidos del usuarioActual: " + (usuarioActual != null ? usuarioActual.getHistorialPedidos() : "null"));
   jFrmHistorial historial = new jFrmHistorial(tienda, usuarioActual);
    historial.setLocationRelativeTo(this); // Centrar respecto a la ventana actual
    historial.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
jFrmCarrito carrito = new jFrmCarrito(tienda, usuarioActual, this);
carrito.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void agregarAlCarrito(Peluche peluche) {
    if (peluche != null && usuarioActual != null) {
        usuarioActual.agregarArticulo(peluche);
        JOptionPane.showMessageDialog(this, peluche.getNombre() + " fue agregado al carrito.");
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo agregar el peluche al carrito.");
        System.out.println("🛑 Error: peluche o usuarioActual es null.");
    }
}
  private void cargarImagen(javax.swing.JLabel etiqueta, String ruta) {
    java.net.URL imgURL = getClass().getResource(ruta);
    if (imgURL == null) {
        System.err.println("No se encontró la imagen en: " + ruta);
        return;
    }
    
    ImageIcon icono = new ImageIcon(imgURL);
    Image imagen = icono.getImage().getScaledInstance(
        etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_SMOOTH);
    etiqueta.setIcon(new ImageIcon(imagen));
}

public List<Peluche> buscarPeluches(String texto) {
    List<Peluche> resultado = new ArrayList<>();
    for (Peluche p : tienda.getCatalogo()) {
        if (p.getNombre().toLowerCase().contains(texto.toLowerCase())) {
            resultado.add(p);
        }
    }
    return resultado;
}

public void setTienda(Tienda tienda) {
    this.tienda = tienda;
}
ArrayList<Peluche> listaPeluches = new ArrayList<>();

// Este método se llama UNA VEZ (en el constructor)

public void cargarPeluches() {
    peluchesVisualizados.clear(); // Limpiar lista antes de recargar

    ArrayList<Peluche> catalogo = tienda.getCatalogo();
    int maxPeluches = Math.min(10, catalogo.size());

    JLabel[] imagenes = {lblcd1, lblcd2, lblcd3, lblcd4, lblcd5, lblcd6, lblcd7, lblcd8, lblcd9, lblcd10};

    for (int i = 0; i < maxPeluches; i++) {
        Peluche p = catalogo.get(i);
        peluchesVisualizados.add(p);

        String nombre = p.getNombre();
        String precio = String.valueOf(p.getPrecio());
        String categoria = p.getCategoria();
        String calificacion = String.valueOf(p.getCalificacion());
        String stock = String.valueOf(p.getStock());

        // Cargar imagen
        imagenes[i].setIcon(cargarImagenDesdeArchivo(p.getImagenRuta(), imagenes[i].getWidth(), imagenes[i].getHeight()));

        // Asignar valores a los labels correspondientes
        switch (i) {
            case 0:
                lvlNombre1.setText(nombre);
                lvlPrecio1.setText(precio);
                lvlCategoria1.setText(categoria);
                lvlCalificacion1.setText(calificacion);
                lvlStock1.setText("Stock: " + stock);
                break;
            case 1:
                lvlNombre2.setText(nombre);
                lvlPrecio2.setText(precio);
                lvlCategoria2.setText(categoria);
                lvlCalificacion2.setText(calificacion);
                lvlStock2.setText("Stock: " + stock);
                break;
            case 2:
                lvlNombre3.setText(nombre);
                lvlPrecio3.setText(precio);
                lvlCategoria3.setText(categoria);
                lvlCalificacion3.setText(calificacion);
                lvlStock3.setText("Stock: " + stock);
                break;
            case 3:
                lvlNombre4.setText(nombre);
                lvlPrecio4.setText(precio);
                lvlCategoria4.setText(categoria);
                lvlCalificacion4.setText(calificacion);
                lvlStock4.setText("Stock: " + stock);
                break;
            case 4:
                lvlNombre5.setText(nombre);
                lvlPrecio5.setText(precio);
                lvlCategoria5.setText(categoria);
                lvlCalificacion5.setText(calificacion);
                lvlStock5.setText("Stock: " + stock);
                break;
            case 5:
                lvlNombre6.setText(nombre);
                lvlPrecio6.setText(precio);
                lvlCategoria6.setText(categoria);
                lvlCalificacion6.setText(calificacion);
                lvlStock6.setText("Stock: " + stock);
                break;
            case 6:
                lvlNombre7.setText(nombre);
                lvlPrecio7.setText(precio);
                lvlCategoria7.setText(categoria);
                lvlCalificacion7.setText(calificacion);
                lvlStock7.setText("Stock: " + stock);
                break;
            case 7:
                lvlNombre8.setText(nombre);
                lvlPrecio8.setText(precio);
                lvlCategoria8.setText(categoria);
                lvlCalificacion8.setText(calificacion);
                lvlStock8.setText("Stock: " + stock);
                break;
            case 8:
                lvlNombre9.setText(nombre);
                lvlPrecio9.setText(precio);
                lvlCategoria9.setText(categoria);
                lvlCalificacion9.setText(calificacion);
                lvlStock9.setText("Stock: " + stock);
                break;
            case 9:
                lvlNombre10.setText(nombre);
                lvlPrecio10.setText(precio);
                lvlCategoria10.setText(categoria);
                lvlCalificacion10.setText(calificacion);
                lvlStock10.setText("Stock: " + stock);
                break;
        }
    }
}
    private void actualizarPanel(Peluche p, JLabel lblImagen, JLabel lblNombre, JLabel lblPrecio, JLabel lblCategoria, JLabel lblCalificacion) {
    // Cargar imagen de forma segura
    if (p.getImagenRuta() != null && !p.getImagenRuta().isEmpty()) {
        java.net.URL imgURL = getClass().getResource(p.getImagenRuta()); // Busca en resources
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
            lblImagen.setIcon(new ImageIcon(img)); 
        } else {
            lblImagen.setIcon(null);
        }
    } else {
        lblImagen.setIcon(null);
    }
  
    lblNombre.setText(p.getNombre()); 
    lblPrecio.setText(String.format("$ %.2f", p.getPrecio()));
    lblCategoria.setText(p.getCategoria()); 
    lblCalificacion.setText(String.format("⭐ %.1f", p.getCalificacion()));
}


    private void limpiarPanel(JLabel lblImagen, JLabel lblNombre, JLabel lblPrecio, JLabel lblCategoria, JLabel lblCalificacion) {
        lblImagen.setIcon(null);
        lblNombre.setText("");
        lblPrecio.setText("");
        lblCategoria.setText("");
        lblCalificacion.setText("");
    }

public void mostrarPeluches() {
    ArrayList<Peluche> lista = tienda.getCatalogo();
    JButton[] botones = {btnFavorito1, btnFavorito2, btnFavorito3, btnFavorito4, btnFavorito5,
                         btnFavorito6, btnFavorito7, btnFavorito8, btnFavorito9, btnFavorito10};
    
    JButton[] botonesAgregar = {btnAgregarCarrito1, btnAgregarCarrito2, btnAgregarCarrito3, btnAgregarCarrito4, btnAgregarCarrito5,
                                btnAgregarCarrito6, btnAgregarCarrito7, btnAgregarCarrito8, btnAgregarCarrito9, btnAgregarCarrito10
};
    JLabel[] nombres = {lvlNombre1, lvlNombre2, lvlNombre3, lvlNombre4, lvlNombre5,
                        lvlNombre6, lvlNombre7, lvlNombre8, lvlNombre9, lvlNombre10};

    JLabel[] precios = {lvlPrecio1, lvlPrecio2, lvlPrecio3, lvlPrecio4, lvlPrecio5,
                        lvlPrecio6, lvlPrecio7, lvlPrecio8, lvlPrecio9, lvlPrecio10};

    JLabel[] categorias = {lvlCategoria1, lvlCategoria2, lvlCategoria3, lvlCategoria4, lvlCategoria5,
                           lvlCategoria6, lvlCategoria7, lvlCategoria8, lvlCategoria9, lvlCategoria10};

    JLabel[] calificaciones = {lvlCalificacion1, lvlCalificacion2, lvlCalificacion3, lvlCalificacion4, lvlCalificacion5,
                               lvlCalificacion6, lvlCalificacion7, lvlCalificacion8, lvlCalificacion9, lvlCalificacion10};

    for (int i = 0; i < Math.min(10, lista.size()); i++) {
        Peluche p = lista.get(i);
        nombres[i].setText(p.getNombre());
        precios[i].setText("$" + p.getPrecio());
        categorias[i].setText(p.getCategoria());
        calificaciones[i].setText(p.getCalificacion() + "★");

        final int index = i;
        botones[i].addActionListener(e -> {
            usuarioActual.agregarFavorito(p);
            UsuarioDatos.guardarFavoritosDe(usuarioActual);
            JOptionPane.showMessageDialog(this, p.getNombre() + " fue añadido a tus favoritos.");
        });
        botonesAgregar[i].addActionListener(e -> {
        usuarioActual.agregarArticulo(p);
        JOptionPane.showMessageDialog(this, p.getNombre() + " fue añadido al carrito.");
});

    }
}

private void marcarComoFavorito(int index) {
    Peluche peluche = tienda.getCatalogo().get(index);
    if (!usuarioActual.getFavoritos().contains(peluche)) {
        usuarioActual.getFavoritos().add(peluche);
        UsuarioDatos.guardarFavoritosDe(usuarioActual); // ← Aquí guardas el cambio
        JOptionPane.showMessageDialog(this, "Añadido a favoritos");
    } else {
        JOptionPane.showMessageDialog(this, "Ese peluche ya está en favoritos.");
    }
}
private void abrirFavoritos() {
    JFrame ventanaFavoritos = new JFrame("Mis Peluches Favoritos");
    ventanaFavoritos.setSize(800, 600);
    ventanaFavoritos.setLocationRelativeTo(this);
    ventanaFavoritos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setPreferredSize(new Dimension(800, 1000)); // Ajusta según cantidad

    JScrollPane scroll = new JScrollPane(panel);
    scroll.setBounds(0, 0, 800, 600);
    ventanaFavoritos.add(scroll);

    ArrayList<Peluche> favoritos = usuarioActual.getFavoritos();

    int x = 30, y = 30;
    int ancho = 150, alto = 180;
    int columnas = 3;
    int contador = 0;

    for (Peluche p : favoritos) {
        JPanel tarjeta = new JPanel(null);
        tarjeta.setBounds(x, y, ancho, alto);
        tarjeta.setBorder(BorderFactory.createTitledBorder(p.getNombre()));

        JLabel lblImg = new JLabel();
        lblImg.setBounds(10, 20, 130, 80);
        lblImg.setIcon(cargarImagenDesdeArchivo(p.getImagenRuta(), 130, 80));
        tarjeta.add(lblImg);

        JLabel lblPrecio = new JLabel("Precio: $" + p.getPrecio());
        lblPrecio.setBounds(10, 105, 130, 20);
        tarjeta.add(lblPrecio);

        JLabel lblCategoria = new JLabel("Categoría: " + p.getCategoria());
        lblCategoria.setBounds(10, 125, 130, 20);
        tarjeta.add(lblCategoria);

        JLabel lblCalif = new JLabel("★ " + p.getCalificacion());
        lblCalif.setBounds(10, 145, 130, 20);
        tarjeta.add(lblCalif);

        panel.add(tarjeta);

        contador++;
        x += ancho + 20;
        if (contador % columnas == 0) {
            x = 30;
            y += alto + 20;
        }
    }

    ventanaFavoritos.setVisible(true);
}
public ImageIcon cargarImagenDesdeArchivo(String ruta, int ancho, int alto) {
    try {
        Image img = new ImageIcon(ruta).getImage();
        Image imgRedimensionada = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(imgRedimensionada);
    } catch (Exception e) {
        System.err.println("No se pudo cargar imagen desde: " + ruta);
        return null;
    }
}

public void cargarImagenEnLabel(JLabel label, String ruta) {
    ImageIcon icono = new ImageIcon(ruta);
    Image imagen = icono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
    label.setIcon(new ImageIcon(imagen));
}


private void actualizarCatalogo(){
    panelCatalogo.removeAll();
    cargarPeluches();
    panelCatalogo.revalidate();
    panelCatalogo.repaint();
}









    


    
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
            java.util.logging.Logger.getLogger(FrmCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCarrito1;
    private javax.swing.JButton btnAgregarCarrito10;
    private javax.swing.JButton btnAgregarCarrito2;
    private javax.swing.JButton btnAgregarCarrito3;
    private javax.swing.JButton btnAgregarCarrito4;
    private javax.swing.JButton btnAgregarCarrito5;
    private javax.swing.JButton btnAgregarCarrito6;
    private javax.swing.JButton btnAgregarCarrito7;
    private javax.swing.JButton btnAgregarCarrito8;
    private javax.swing.JButton btnAgregarCarrito9;
    private javax.swing.JButton btnFavorito1;
    private javax.swing.JButton btnFavorito10;
    private javax.swing.JButton btnFavorito2;
    private javax.swing.JButton btnFavorito3;
    private javax.swing.JButton btnFavorito4;
    private javax.swing.JButton btnFavorito5;
    private javax.swing.JButton btnFavorito6;
    private javax.swing.JButton btnFavorito7;
    private javax.swing.JButton btnFavorito8;
    private javax.swing.JButton btnFavorito9;
    private javax.swing.JButton btnVerFavoritos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelSidebar;
    private javax.swing.JPanel jPanelSoporte;
    private javax.swing.JLabel lblCategoriaFantasia;
    private javax.swing.JLabel lblCategoriaGato;
    private javax.swing.JLabel lblCategoriaOso;
    private javax.swing.JLabel lblCategoriaPerros;
    private javax.swing.JLabel lblEmailUsuario1;
    private javax.swing.JLabel lblIg;
    private javax.swing.JLabel lblNombreUsuario1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblcd1;
    private javax.swing.JLabel lblcd10;
    private javax.swing.JLabel lblcd2;
    private javax.swing.JLabel lblcd3;
    private javax.swing.JLabel lblcd4;
    private javax.swing.JLabel lblcd5;
    private javax.swing.JLabel lblcd6;
    private javax.swing.JLabel lblcd7;
    private javax.swing.JLabel lblcd8;
    private javax.swing.JLabel lblcd9;
    private javax.swing.JLabel lblfacebook;
    private javax.swing.JLabel lvlCalificacion1;
    private javax.swing.JLabel lvlCalificacion10;
    private javax.swing.JLabel lvlCalificacion2;
    private javax.swing.JLabel lvlCalificacion3;
    private javax.swing.JLabel lvlCalificacion4;
    private javax.swing.JLabel lvlCalificacion5;
    private javax.swing.JLabel lvlCalificacion6;
    private javax.swing.JLabel lvlCalificacion7;
    private javax.swing.JLabel lvlCalificacion8;
    private javax.swing.JLabel lvlCalificacion9;
    private javax.swing.JLabel lvlCategoria1;
    private javax.swing.JLabel lvlCategoria10;
    private javax.swing.JLabel lvlCategoria2;
    private javax.swing.JLabel lvlCategoria3;
    private javax.swing.JLabel lvlCategoria4;
    private javax.swing.JLabel lvlCategoria5;
    private javax.swing.JLabel lvlCategoria6;
    private javax.swing.JLabel lvlCategoria7;
    private javax.swing.JLabel lvlCategoria8;
    private javax.swing.JLabel lvlCategoria9;
    private javax.swing.JLabel lvlNombre1;
    private javax.swing.JLabel lvlNombre10;
    private javax.swing.JLabel lvlNombre2;
    private javax.swing.JLabel lvlNombre3;
    private javax.swing.JLabel lvlNombre4;
    private javax.swing.JLabel lvlNombre5;
    private javax.swing.JLabel lvlNombre6;
    private javax.swing.JLabel lvlNombre7;
    private javax.swing.JLabel lvlNombre8;
    private javax.swing.JLabel lvlNombre9;
    private javax.swing.JLabel lvlPrecio1;
    private javax.swing.JLabel lvlPrecio10;
    private javax.swing.JLabel lvlPrecio2;
    private javax.swing.JLabel lvlPrecio3;
    private javax.swing.JLabel lvlPrecio4;
    private javax.swing.JLabel lvlPrecio5;
    private javax.swing.JLabel lvlPrecio6;
    private javax.swing.JLabel lvlPrecio7;
    private javax.swing.JLabel lvlPrecio8;
    private javax.swing.JLabel lvlPrecio9;
    private javax.swing.JLabel lvlStock1;
    private javax.swing.JLabel lvlStock10;
    private javax.swing.JLabel lvlStock2;
    private javax.swing.JLabel lvlStock3;
    private javax.swing.JLabel lvlStock4;
    private javax.swing.JLabel lvlStock5;
    private javax.swing.JLabel lvlStock6;
    private javax.swing.JLabel lvlStock7;
    private javax.swing.JLabel lvlStock8;
    private javax.swing.JLabel lvlStock9;
    private javax.swing.JPanel panelCatalogo;
    private javax.swing.JScrollPane scrollCatalogo;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
