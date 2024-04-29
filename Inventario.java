public class Inventario {
    private List<Producto> productos;

    public Inventario(List<Producto> productos) {
        this.productos = productos;
    }

    public Iterator<Producto> getIteradorPreorden() {
        return new IteradorPreorden(productos);
    }

    public Iterator<Producto> getIteradorPreordenInverso() {
        return new IteradorPreordenInverso(productos);
    }

    public Iterator<Producto> getIteradorPostorden() {
        return new IteradorPostorden(productos);
    }

    public Iterator<Producto> getIteradorEnOrden() {
        return new IteradorEnOrden(productos);
    }
}