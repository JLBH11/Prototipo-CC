package modelo;

import java.io.Serializable;

public class Peluche implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private double precio;
    private String imagenRuta;
    private String categoria;
    private double calificacion;

    public Peluche(String nombre, double precio, String imagenRuta, String categoria, double calificacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagenRuta = imagenRuta;
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagenRuta() {
        return imagenRuta;
    }

    public void setImagenRuta(String imagenRuta) {
        this.imagenRuta = imagenRuta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " - " + categoria + " - ★" + calificacion;
    }
}
