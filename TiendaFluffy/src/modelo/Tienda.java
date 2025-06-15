package modelo;

import java.io.*;
import java.util.*;

public class Tienda {
    private ArrayList<Peluche> catalogo;
    private Stack<Peluche> historial;
    private Queue<Peluche> pedidos;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Peluche> carrito;

    public Tienda() {
        catalogo = new ArrayList<>();
        historial = new Stack<>();
        pedidos = new LinkedList<>();
        carrito = new ArrayList<>();

        // Cargar usuarios desde archivo
        usuarios = UsuarioDatos.cargarUsuarios();

        // Si no hay usuarios, crear uno por defecto
        if (usuarios == null || usuarios.isEmpty()) {
            usuarios = new ArrayList<>();
            Usuario admin = new Usuario("admin", "admin", "admin", "admin", "admin", "admin@email.com");
            usuarios.add(admin);
            UsuarioDatos.guardarUsuarios(usuarios);
        }

        // Intentar cargar catálogo al iniciar
        try {
            cargarCatalogo();
        } catch (Exception e) {
            catalogo = new ArrayList<>();
        }
    }

    // ============ LOGIN ============
    public boolean validarUsuario(String user, String pass) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(user) && u.getContraseña().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuarioPorCredenciales(String username, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username) && u.getContraseña().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
        UsuarioDatos.guardarUsuarios(usuarios); // Guardar al modificar
    }

    public void agregarUsuario(Usuario u) {
        if (usuarios == null) {
            usuarios = new ArrayList<>();
        }
        usuarios.add(u);
        UsuarioDatos.guardarUsuarios(usuarios);
    }

    // ============ CATÁLOGO ============
    public void agregarPeluche(Peluche p) {
        catalogo.add(p);
    }

    public ArrayList<Peluche> getCatalogo() {
        return catalogo;
    }

    public Peluche buscarPeluchePorNombre(String nombre) {
        for (Peluche p : catalogo) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    // ============ HISTORIAL ============
    public void verProducto(Peluche p) {
        historial.push(p);
    }

    public Stack<Peluche> getHistorial() {
        return historial;
    }

    // ============ PEDIDOS ============
    public void agregarPedido(Peluche p) {
        pedidos.add(p);
    }

    public Queue<Peluche> getPedidos() {
        return pedidos;
    }

    // ============ CARRITO ============
    public void agregarAlCarrito(Peluche p) {
        carrito.add(p);
    }

    public ArrayList<Peluche> getCarrito() {
        return carrito;
    }

    public void limpiarCarrito() {
        carrito.clear();
    }

    // ============ ARCHIVOS ============
    public void guardarCatalogo() throws IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("catalogo.dat"));
    out.writeObject(catalogo);
    out.close();

    // 🔍 DEBUG: Mostrar lo que se está guardando
    System.out.println("✅ Catálogo guardado:");
    for (Peluche p : catalogo) {
        System.out.println(" - " + p.getNombre() + ", stock: " + p.getStock());
    }
}


    public void cargarCatalogo() throws IOException, ClassNotFoundException {
        File archivo = new File("catalogo.dat");
        if (archivo.exists()) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo));
            catalogo = (ArrayList<Peluche>) in.readObject();
            in.close();
        }
    }
}
