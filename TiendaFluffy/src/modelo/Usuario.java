package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {
    private String username;
    private String contraseña;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private ArrayList<Peluche> favoritos = new ArrayList<>();

    public Usuario(String username, String contraseña, String nombres, String apellidos, String telefono, String email) {
        this.username = username;
        this.contraseña = contraseña;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Favoritos
    public void agregarFavorito(Peluche p) {
        if (!favoritos.contains(p)) {
            favoritos.add(p);
        }
    }

    public ArrayList<Peluche> getFavoritos() {
        return favoritos;
    }
}
