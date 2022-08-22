public class NodoLD {
    public Object info;
    public NodoLD anterior;
    public NodoLD siguiente;

    public NodoLD(Object info) {
        this.info = info;
        this.siguiente=null;
        this.anterior=null;
    }
}
