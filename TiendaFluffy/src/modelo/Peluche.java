package modelo;

public class Peluche {
    private String nombre;
    private double precio;
    private String imagenRuta;  // Ruta del archivo de imagen
    private String categoria;   // Ej: "Perro", "Oso", "Fantasía", etc.
    private double calificacion; // De 1.0 a 5.0

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
}
