
import java.io.Serializable;


public class Peluche implements Serializable {
    private String nombre;
    private String tipo;
    private double precio;
    private String rutaImagen;

    public Peluche(String nombre, String tipo, double precio, String rutaImagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    
}
