package modelo;

import java.io.*;
import java.util.ArrayList;

public class VentaDatos {
    private static final String ARCHIVO = "ventas.dat";

    // Guardar una nueva venta
    public static void guardarVenta(Venta venta) {
        ArrayList<Venta> lista = cargarVentas();
        lista.add(venta);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar todas las ventas desde el archivo
    public static ArrayList<Venta> cargarVentas() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Venta>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Obtener el total vendido (suma de todos los montos)
    public static double obtenerTotalVentas() {
        double total = 0;
        for (Venta v : cargarVentas()) {
            total += v.getTotal();
        }
        return total;
    }

    // Contar cuántas ventas están en estado "Pendiente"
    public static int contarPedidosPendientes() {
        int contador = 0;
        for (Venta v : cargarVentas()) {
            if ("Pendiente".equalsIgnoreCase(v.getEstado())) {
                contador++;
            }
        }
        return contador;
    }
}
