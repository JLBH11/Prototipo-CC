package modelo;

import java.io.*;
import java.util.ArrayList;

public class UsuarioDatos {
    private static final String ARCHIVO = "usuarios.dat";

    public static void guardarUsuarios(ArrayList<Usuario> usuarios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(usuarios);
            System.out.println("Usuarios guardados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Usuario> cargarUsuarios() {
        File archivo = new File(ARCHIVO);

        if (!archivo.exists()) {
            System.out.println("ℹ️ No se encontró archivo de usuarios. Se devolverá lista vacía.");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Usuario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("❌ Error al cargar usuarios:");
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static ArrayList<Usuario> obtenerUsuarios() {
        return cargarUsuarios(); // solución directa
    }

    public static void guardarFavoritosDe(Usuario usuarioActual) {
        ArrayList<Usuario> lista = cargarUsuarios();
        for (Usuario u : lista) {
            if (u.getUsername().equals(usuarioActual.getUsername())) {
                u.setFavoritos(usuarioActual.getFavoritos());
                break;
            }
        }}}