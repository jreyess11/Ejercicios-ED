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
        this.cabeza = nuevoNodo;
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
        this.cola = nuevoNodo;
        tamano++;
    }
    public void imprimir(){
        Nodo i = this.cabeza;
        System.out.print("\n[");
        while (i.siguiente!=null){
            System.out.print(i.info+", ");
            i = i.siguiente;
            if (i.siguiente==null){
                System.out.print(i.info);
            }
        } System.out.print("], Tamano " +tamano+"\n");
    }

    public void borrar(Object o){
        Nodo i = this.cabeza;
        if (i.info==o){
            this.cabeza = i.siguiente;
            tamano--;
            return;
        }
        while (i.siguiente!=null){
            if (i.siguiente.info==o){
                i.siguiente=i.siguiente.siguiente;
                tamano--;
                return;
            }
            i = i.siguiente;
        }
        System.out.println("Esta tratando de borrar el elemento "+o+", el cual no esta en la lista.");
    }

    public void buscar(Object o){
        Nodo i = this.cabeza;
        if (i.info==o){
            System.out.println("El elemento "+o+" SI esta en la lista");
            return;
        }
        while (i.siguiente!=null){
            if (i.siguiente.info==o){
                System.out.println("El elemento "+o+" SI esta en la lista");
                return;
            }
            i = i.siguiente;
        }
        System.out.println("El elemento "+o+" NO esta en la lista");
    }
}
