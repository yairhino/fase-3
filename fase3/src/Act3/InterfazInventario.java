package Act3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Clase principal para probar el sistema
public class InterfazInventario {
    private static Inventario inventario = new Inventario();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n==== Menú ====");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Actualizar Inventario");
            System.out.println("3. Mostrar Inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    actualizarInventario();
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 4);
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el nombre del nuevo producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese la cantidad inicial: ");
        int cantidadInicial = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Producto nuevoProducto = new Producto(nombreProducto, cantidadInicial);
        inventario.agregarProducto(nuevoProducto);

        System.out.println("Producto agregado exitosamente al inventario.");
    }

    private static void actualizarInventario() {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese la nueva cantidad: ");
        int nuevaCantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        inventario.actualizarInventario(nombreProducto, nuevaCantidad);

        System.out.println("Inventario actualizado exitosamente.");
    }

    private static void mostrarInventario() {
        inventario.mostrarInventario();
    }
}