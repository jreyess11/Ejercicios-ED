public class ListaCS {
    public int tamano;
    public NodoCS cabeza;
    public NodoCS cola;

    public ListaCS() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public ListaCS(Object o){
        this.tamano = 1;
        NodoCS nuevoNodo = new NodoCS(o);
        this.cabeza = nuevoNodo;
        this.cola = nuevoNodo;
    }

    public boolean estaVacio(){return cabeza==null;}

    public void agregar(Object o){
        NodoCS nuevoNodo = new NodoCS(o);
        if(estaVacio()){
            this.cabeza = nuevoNodo;
        } else {
            this.cola.siguiente = nuevoNodo;
        }
        this.cola = nuevoNodo;
        this.cola.siguiente = this.cabeza;
        tamano++;
    }
    public void imprimir(){
        NodoCS i = this.cabeza;
        System.out.print("[");
        while (i.siguiente!=this.cabeza){
            System.out.print(i.info+", ");
            i = i.siguiente;
            if (i.siguiente==this.cabeza){
                System.out.print(i.info + ", y el primer elemento de nuevo es " + i.siguiente.info);
            }
        } System.out.print("], Tamano " +tamano+"\n");
    }

    public void borrar(Object o){
        NodoCS i = this.cabeza;
        int cont = 0;
        if (i.info==o){
            this.cabeza = i.siguiente;
            this.cola.siguiente = this.cabeza;
            tamano--;
            return;
        }
        while (cont<tamano){
            if (i.siguiente.info==o){
                i.siguiente=i.siguiente.siguiente;
                tamano--;
                return;
            }
            i = i.siguiente;
            cont++;
        }
        System.out.println("Esta tratando de borrar el elemento "+o+", el cual no esta en la lista.");
    }

    public void buscar(Object o){
        NodoCS i = this.cabeza;
        int cont = 0;
        if (i.info==o){
            System.out.println("El elemento "+o+" SI esta en la lista");
            return;
        }
        while (cont<tamano){
            if (i.siguiente.info==o){
                System.out.println("El elemento "+o+" SI esta en la lista");
                return;
            }
            i = i.siguiente;
            cont++;
        }
        System.out.println("El elemento "+o+" NO esta en la lista");
    }
}
