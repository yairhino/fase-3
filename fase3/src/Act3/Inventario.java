package Act3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Inventario {
    private List<Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Métodos para gestionar el inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarInventario(String nombre, int nuevaCantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.setCantidad(nuevaCantidad);
                System.out.println("Inventario actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado en el inventario.");
    }

    public void mostrarInventario() {
        System.out.println("==== Inventario Actual ====");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
