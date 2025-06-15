package modelo;

import java.io.*;
import java.util.ArrayList;

public class PelucheDatos {

    private static final String ARCHIVO = "peluches.dat";

    // Guarda la lista completa de peluches en un archivo
    public static void guardarPeluches(ArrayList<Peluche> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(lista);
            System.out.println("✅ Peluches guardados correctamente.");
        } catch (IOException e) {
            System.err.println("❌ Error al guardar peluches:");
            e.printStackTrace();
        }
    }

    // Carga la lista de peluches desde archivo
    @SuppressWarnings("unchecked")
    public static ArrayList<Peluche> cargarPeluches() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("ℹ️ No se encontró archivo de peluches. Se devolverá una lista vacía.");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Object obj = ois.readObject();
            if (obj instanceof ArrayList<?>) {
                return (ArrayList<Peluche>) obj;
            } else {
                System.err.println("❌ El archivo no contiene una lista válida de peluches.");
                return new ArrayList<>();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("❌ Error al cargar peluches:");
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
