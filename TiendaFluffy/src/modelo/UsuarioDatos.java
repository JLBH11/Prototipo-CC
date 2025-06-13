package modelo;

import java.io.*;
import java.util.ArrayList;

public class UsuarioDatos {
    private static final String ARCHIVO = "usuarios.dat";

    public static void guardarUsuarios(ArrayList<Usuario> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Usuario> cargarUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                lista = (ArrayList<Usuario>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    public static Usuario buscarUsuario(String username, String contraseña) {
        ArrayList<Usuario> lista = cargarUsuarios();
        for (Usuario u : lista) {
            if (u.getUsername().equals(username) && u.getContraseña().equals(contraseña)) {
                return u;
            }
        }
        return null;
    }
}
