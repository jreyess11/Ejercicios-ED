public class Nodo {
    public Object info;
    public Nodo anterior;
    public Nodo siguiente;

    public Nodo(Object info) {
        this.info = info;
        this.siguiente=null;
        this.anterior=null;
    }
}
