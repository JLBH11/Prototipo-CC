package modelo;


import java.io.*;
import java.util.*;

public class Tienda {
    private ArrayList<Peluche> catalogo;
    private Stack<Peluche> historial;
    private Queue<Peluche> pedidos;
    private Map<String, String> usuarios;

    public Tienda() {
        catalogo = new ArrayList<>();
        historial = new Stack<>();
        pedidos = new LinkedList<>();
        usuarios = new HashMap<>();

        // Usuario de ejemplo
        usuarios.put("admin", "1234");
    }

    //LOGIN
    public boolean validarUsuario(String user, String pass) {
        return usuarios.containsKey(user) && usuarios.get(user).equals(pass);
    }

    //CATALOGO
    public void agregarPeluche(Peluche p) {
        catalogo.add(p);
    }

    public ArrayList<Peluche> getCatalogo() {
        return catalogo;
    }

    //HISTORIAL (PILA)
    public void verProducto(Peluche p) {
        historial.push(p);
    }

    public Stack<Peluche> getHistorial() {
        return historial;
    }

    //PEDIDOS (COLA)
    public void agregarPedido(Peluche p) {
        pedidos.add(p);
    }

    public Queue<Peluche> getPedidos() {
        return pedidos;
    }

    //ARCHIVOS
    public void guardarCatalogo() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("catalogo.dat"));
        out.writeObject(catalogo);
        out.close();
    }

    public void cargarCatalogo() throws IOException, ClassNotFoundException {
        File archivo = new File("catalogo.dat");
        if (archivo.exists()) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo));
            catalogo = (ArrayList<Peluche>) in.readObject();
            in.close();
        }
    }
    private ArrayList<Peluche> carrito = new ArrayList<>();

public void agregarAlCarrito(Peluche p) {
    carrito.add(p);
}

public ArrayList<Peluche> getCarrito() {
    return carrito;
}

public void limpiarCarrito() {
    carrito.clear();
}

}
