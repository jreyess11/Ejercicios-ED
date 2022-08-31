public class ListaCD {
    public int tamano;
    public NodoCD cabeza;
    public NodoCD act;
    public NodoCD cola;

    public ListaCD() {
        this.cabeza = null;
        this.cola = null;
        this.act =null;
        this.tamano = 0;
    }

    public ListaCD(Object o){
        this.tamano = 1;
        NodoCD nuevoNodo = new NodoCD(o);
        this.cabeza = nuevoNodo;
        this.cola = nuevoNodo;
    }

    public boolean estaVacio(){return cabeza==null;}

    public void agregar(Object o){
        NodoCD nuevoNodo = new NodoCD(o);
        if(estaVacio()){
            this.cabeza = nuevoNodo;
            this.act =this.cabeza;
        } else {
            nuevoNodo.anterior = this.act;
            this.act = nuevoNodo;
            this.cola.siguiente = nuevoNodo;
        }
        this.cola = nuevoNodo;
        this.cola.siguiente = this.cabeza;
        this.cabeza.anterior = this.cola;
        tamano++;
    }
    public void imprimir(){
        NodoCD i = this.cabeza;
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
        NodoCD i = this.cabeza;
        int cont = 0;
        if (i.info==o){
            this.cabeza = i.siguiente;
            this.cabeza.anterior = this.cola;
            this.cola.siguiente = this.cabeza;
            tamano--;
            return;
        }
        while (cont<tamano){
            if (i.siguiente.info==o){
                i.siguiente=i.siguiente.siguiente;
                if (i.siguiente==this.cabeza){
                    this.cola = i;
                    this.cabeza.anterior = this.cola;
                    tamano--;
                    return;
                }
                i.siguiente.anterior=i;
                tamano--;
                return;
            }
            i = i.siguiente;
            cont++;
        }
        System.out.println("Esta tratando de borrar el elemento "+o+", el cual no esta en la lista.");
    }

    public void buscar(Object o){
        NodoCD i = this.cabeza;
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

    public void reemplazar(Object o, Object a){
        NodoCD i = this.cabeza;
        NodoCD nuevoNodo = new NodoCD(a);
        int cont = 0;
        if (i.info==o){
            System.out.println("El elemento "+o+" SI esta en la lista, reemplazando por "+ a+ ": ");
            i.info = a;
            return;
        }
        while (cont<tamano){
            if (i.siguiente.info==o){
                System.out.println("El elemento "+o+" SI esta en la lista");
                i.siguiente.info = a;
                return;
            }
            i = i.siguiente;
            cont++;
        }
        System.out.println("El elemento "+o+" NO esta en la lista, no se puede reemplazar");
    }
}
