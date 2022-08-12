public class Lista {
    public int tamano;
    public Nodo cabeza;
    public Nodo cola;

    public Lista() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public Lista(Object o){
        this.tamano = 1;
        Nodo nuevoNodo = new Nodo(o);
        this.cabeza=nuevoNodo;
        this.cola = nuevoNodo;
    }

    public boolean estaVacio(){
        if (cabeza==null){
            return true;
        } else {
            return false;
        }
    }

    public void agregar(Object o){
        Nodo nuevoNodo = new Nodo(o);
        if(estaVacio()){
            this.cabeza = nuevoNodo;
        } else {
            this.cola.siguiente = nuevoNodo;
        }
    }
}
