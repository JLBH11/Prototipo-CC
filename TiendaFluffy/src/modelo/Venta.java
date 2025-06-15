package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Venta implements Serializable {
    private static final long serialVersionUID = 1L;

    private String usuario;
    private ArrayList<Peluche> productos;
    private double total;
    private String estado; // Nuevo campo: "Pendiente", "Entregado", etc.

    public Venta(String usuario, ArrayList<Peluche> productos, double total) {
        this.usuario = usuario;
        this.productos = productos;
        this.total = total;
        this.estado = "Pendiente"; // Por defecto al registrar la venta
    }

    // Getters
    public String getUsuario() {
        return usuario;
    }

    public ArrayList<Peluche> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    // Setter (opcional, útil para actualizar el estado)
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
