package modelo;

import java.util.ArrayList;

public class TiendaDatos {

    // Lista estática de usuarios
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    // Lista estática de peluches (para reportes, inventario, etc.)
    private static ArrayList<Peluche> listaPeluches = new ArrayList<>();

    // ========== MÉTODOS PARA USUARIOS ==========

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> usuarios) {
        listaUsuarios = usuarios;
    }

    public static void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        UsuarioDatos.guardarUsuarios(listaUsuarios); // Asegura persistencia
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

    // ========== MÉTODOS PARA PELUCHES ==========

    public static ArrayList<Peluche> getListaPeluches() {
        return listaPeluches;
    }

    public static void setListaPeluches(ArrayList<Peluche> peluches) {
        listaPeluches = peluches;
    }

    public static void agregarPeluche(Peluche peluche) {
        listaPeluches.add(peluche);
        PelucheDatos.guardarPeluches(listaPeluches); // ✅ Persistencia actualizada
    }

    public static Peluche buscarPeluchePorNombre(String nombre) {
        for (Peluche p : listaPeluches) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public static boolean existePeluche(String nombre) {
        return buscarPeluchePorNombre(nombre) != null;
    }

    // ========== MÉTODO NUEVO: Cargar peluches desde archivo ==========

    public static ArrayList<Peluche> cargarPeluches() {
        listaPeluches = PelucheDatos.cargarPeluches(); // Carga desde archivo
        return listaPeluches;
    }
}
