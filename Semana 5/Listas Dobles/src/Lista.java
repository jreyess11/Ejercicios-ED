public class Lista {
    public int tamano;
    public Nodo cabeza;
    public Nodo act;
    public Nodo cola;

    public Lista() {
        this.cabeza = null;
        this.cola = null;
        this.act =null;
        this.tamano = 0;
    }

    public Lista(Object o){
        this.tamano = 1;
        Nodo nuevoNodo = new Nodo(o);
        this.cabeza = nuevoNodo;
        this.cola = nuevoNodo;
    }

    public boolean estaVacio(){return cabeza==null;}

    public void agregarInicio(Object o){
        Nodo nuevoNodo = new Nodo(o);
        nuevoNodo.siguiente = this.cabeza;
        this.cabeza = nuevoNodo;
        tamano++;
    }

    public void agregarPos(Object o, int ind){
        Nodo nuevoNodo = new Nodo(o);
        Nodo i = this.cabeza;
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
        Nodo nuevoNodo = new Nodo(o);
        if(estaVacio()){
            this.cabeza = nuevoNodo;
            this.act =this.cabeza;
        } else {
            nuevoNodo.anterior = this.act;
            this.act =nuevoNodo;
            this.cola.siguiente = nuevoNodo;
        }
        this.cola = nuevoNodo;
        tamano++;
    }
    public void imprimir(){
        Nodo i = this.cabeza;
        System.out.print("[");
        while (i.siguiente!=null){
            System.out.print(i.info+", ");
            i = i.siguiente;
            if (i.siguiente==null){
                System.out.print(i.info);
            }
        } System.out.print("], Tamano " +tamano+"\n");
    }

    public void imprimirRev(){
        Nodo i = this.cola;
        System.out.print("[");
        while (i.anterior!=null){
            System.out.print(i.info+", ");
            i = i.anterior;
            if (i.anterior==null){
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
