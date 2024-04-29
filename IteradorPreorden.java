public class IteradorPreorden implements Iterator<Producto> {
    private Stack<NodoArbolProducto> pila;
    private List<Producto> productos;

    public IteradorPreorden(List<Producto> productos) {
        this.productos = productos;
        this.pila = new Stack<>();
        if (!productos.isEmpty()) {
            pila.push(new NodoArbolProducto(productos.get(0)));
        }
    }

    @Override
    public boolean hasNext() {
        return !pila.isEmpty();
    }

    @Override
    public Producto next() {
        if (!hasNext()) {
            return null;
        }

        NodoArbolProducto nodo = pila.pop();
        Producto producto = nodo.getProducto();

        if (nodo.getHijoIzquierdo() != null) {
            pila.push(nodo.getHijoIzquierdo());
        }

        if (nodo.getHijoDerecho() != null) {
            pila.push(nodo.getHijoDerecho());
        }

        return producto;
    }
}