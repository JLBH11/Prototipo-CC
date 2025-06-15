package modelo;

import java.util.ArrayList;

public class TiendaDatos {

    // Lista estática de usuarios, útil para compartir entre formularios
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    // Si en un futuro decides usar más listas globales:
    // private static ArrayList<Peluche> listaPeluches = new ArrayList<>();
    // private static ArrayList<Peluche> carritoTemporal = new ArrayList<>();

    // ========== Métodos de Acceso ==========

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> usuarios) {
        listaUsuarios = usuarios;
    }

    public static void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static Usuario buscarPorUsername(String username) {
        for (Usuario u : listaUsuarios) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    public static boolean existeUsuario(String username) {
        return buscarPorUsername(username) != null;
    }

    // Puedes agregar más métodos útiles aquí si deseas
}
