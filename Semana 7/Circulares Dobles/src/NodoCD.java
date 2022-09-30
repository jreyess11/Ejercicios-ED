public class NodoCD {
    public Object info;
    public NodoCD anterior;
    public NodoCD siguiente;

    public NodoCD(Object info) {
        this.info = info;
        this.siguiente=null;
        this.anterior=null;
    }
}
