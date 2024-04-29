public class IteradorPostorden implements Iterator<Producto> {
    private Stack<NodoArbolProducto> pila;
    private List<Producto> productos;

    public IteradorPostorden(List<Producto> productos) {
        this.productos = productos;
        this.pila = new Stack<>();
        if (!productos.isEmpty()) {
            pila.push(new NodoArbolProducto(productos.get(0)));
        }
    }

    @Override
    public boolean hasNext() {
        return !pila.isEmpty
