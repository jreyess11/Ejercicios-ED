public class Lista {
    public int tamano;
    public NodoLD cabeza;
    public NodoLD cola;

    public Lista() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public Lista(Object o){
        this.tamano = 1;
        NodoLD nuevoNodo = new NodoLD(o);
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

    public void agregarInicio(Object o){
        NodoLD nuevoNodo = new NodoLD(o);
        nuevoNodo.siguiente = this.cabeza;
        this.cabeza = nuevoNodo;
        tamano++;
    }

    public void agregarPos(Object o, int ind){
        NodoLD nuevoNodo = new NodoLD(o);
        NodoLD i = this.cabeza;
        if (ind==0){
            agregarInicio(o);
        } else if (ind==tamano) {
            agregarFin(o);
        } else if (ind>tamano){
            System.out.println("Esta tratando de agregar a una posicion que excede las fronteras.");
        } else {
            for (int j=0; j<ind-1; j++){
                i = i.siguiente;
            }
            nuevoNodo.siguiente = i.siguiente;
            i.siguiente=nuevoNodo;
            tamano++;
        }
    }

    public void agregarFin(Object o){
        NodoLD nuevoNodo = new NodoLD(o);
        if(estaVacio()){
            this.cabeza = nuevoNodo;
        } else {
            this.cola.siguiente = nuevoNodo;
        }
        this.cola = nuevoNodo;
        tamano++;
    }
    public void imprimir(){
        NodoLD i = this.cabeza;
        System.out.print("[");
        while (i.siguiente!=null){
            System.out.print(i.info+", ");
            i = i.siguiente;
            if (i.siguiente==null){
                System.out.print(i.info);
            }
        } System.out.print("], Tamano " +tamano+"\n");
    }

    public void borrar(Object o){
        NodoLD i = this.cabeza;
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
        NodoLD i = this.cabeza;
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
