package modelo;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;


public class Pedido implements Serializable{
    private List<Peluche> articulos;
    private double total;
    private String estado;
    private static int contador = 1;
private int id;
private Usuario cliente;


    public Pedido(int id, Usuario cliente, List<Peluche> productos, double total, String estado) {
    this.articulos = new ArrayList<>(productos); // ✅ corregido
    this.total = total;
    this.estado = estado; // también se había sobrescrito con "Pendiente", lo arreglamos
    this.cliente = cliente;
    this.id = id; // usamos el id que viene por parámetro
}


    public List<Peluche> getArticulos() {
        return articulos;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getId() {
    return id;
}

public Usuario getCliente() {
    return cliente;
}

}
