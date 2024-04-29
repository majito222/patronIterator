import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear una lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new ProductoElectronico("Laptop", 800.0, "Computadoras"));
        productos.add(new ProductoElectronico("Smartphone", 600.0, "Celulares"));
        productos.add(new ProductoElectronico("Televisor", 1200.0, "Televisores"));
        productos.add(new ProductoElectrodomestico("Lavadora", 500.0, "Lavadoras"));
        productos.add(new ProductoElectrodomestico("Refrigerador", 700.0, "Refrigeradores"));

        // Crear un inventario
        Inventario inventario = new Inventario(productos);

        // Recorrer los productos en preorden
        System.out.println("Recorrido en preorden:");
        Iterator<Producto> iteradorPreorden = inventario.getIteradorPreorden();
        while (iteradorPreorden.hasNext()) {
            Producto producto = iteradorPreorden.next();
            System.out.println(producto.getNombre() + " (" + producto.getCategoria() + ")");
        }

        // Recorrer los productos en preorden inverso
        System.out.println("\nRecorrido en preorden inverso:");
        iteradorPreorden = inventario.getIteradorPreordenInverso();
        while (iteradorPreorden.hasNext()) {
            Producto producto = iteradorPreorden.next();
            System.out.println(producto.getNombre() + " (" + producto.getCategoria() + ")");
        }

        // Recorrer los productos en postorden
        System.out.println("\nRecorrido en postorden:");
        Iterator<Producto> iteradorPostorden = inventario.getIteradorPostorden();
        while (iteradorPostorden.hasNext()) {
            Producto producto = iteradorPostorden.next();
            System.out.println(producto.getNombre() + " (" + producto.getCategoria() + ")");
        }

        // Recorrer los productos en orden
        System.out.println("\nRecorrido en orden:");
        Iterator<Producto> iteradorEnOrden = inventario.getIteradorEnOrden();
        while (iteradorEnOrden.hasNext()) {
            Producto producto = iteradorEnOrden.next();
            System.out.println(producto.getNombre() + " (" + producto.getCategoria() + ")");
        }
    }
}
