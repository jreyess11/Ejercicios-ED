import java.util.Scanner;

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
        nuevoNodo.siguiente.anterior = nuevoNodo;
        this.cabeza = nuevoNodo;
        tamano++;
    }

    public void agregarPos(Object o, Object x){
        Scanner scn = new Scanner(System.in);
        Nodo nuevoNodo = new Nodo(o);
        Nodo i = this.cabeza;
        System.out.print("Seleccione su opcion \n" +
                "1. Agregar antes del "+x+ "\n2. Agregar despues del "+x+"" +
                "\nRespuesta: ");
        int elec = scn.nextInt();
        switch (elec){
            case 1:
                if (i.info==x){
                    agregarInicio(o);
                    return;
                }
                while (i.info!=x){
                    i = i.siguiente;
                }
                nuevoNodo.siguiente = i;
                nuevoNodo.anterior=i.anterior;
                i.anterior.siguiente=nuevoNodo;
                i.anterior=nuevoNodo;
                tamano++;
                break;

            case 2:
                if(i.info==x){
                    nuevoNodo.siguiente=i.siguiente;
                    nuevoNodo.siguiente.anterior=nuevoNodo;
                    i.siguiente=nuevoNodo;
                    nuevoNodo.anterior=i;
                    return;
                }
                while (i.info!=x){
                    i = i.siguiente;
                }
                nuevoNodo.siguiente = i.siguiente;
                nuevoNodo.siguiente.anterior=nuevoNodo;
                nuevoNodo.anterior=i;
                i.siguiente=nuevoNodo;
                tamano++;
                break;
            default:
                System.out.println("La opcion no es valida.");
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

    public void borrarInicio(){
        Nodo i = this.cabeza;
        this.cabeza = i.siguiente;
        this.cabeza.anterior = null;
        tamano--;
    }
    public void borrar(Object o){
        Nodo i = this.cabeza;
        if (i.info==o){
            borrarInicio();
            return;
        }
        while (i.siguiente!=null){
            if (i.siguiente.info==o){
                i.siguiente=i.siguiente.siguiente;
                if (i.siguiente==null){
                    this.cola=i;
                    tamano--;
                    return;
                }
                i.siguiente.anterior=i;
                tamano--;
                return;
            }
            i = i.siguiente;
        }
        System.out.println("Esta tratando de borrar el elemento "+o+", el cual no esta en la lista.");
    }

    public void borrarPos(Object x){
        Scanner scn = new Scanner(System.in);
        Nodo i = this.cabeza;
        System.out.print("Seleccione su opcion...\n" +
                "1. Borrar antes del "+x+ "\n2. Borrar despues del "+x+"" +
                "\nRespuesta: ");
        int elec = scn.nextInt();
        switch (elec){
            case 1:
                if (i.info==x){
                    System.out.println("No puede borrar el elemento antes del primero de la lista");
                    return;
                } else if (i.siguiente.info==x){
                    borrarInicio();
                    return;
                }
                while (i.siguiente.info!=x){
                    i = i.siguiente;
                }
                i.anterior.siguiente = i.siguiente;
                i.siguiente.anterior=i.anterior;
                tamano--;
                break;

            case 2:
                if (i.info==x){
                    borrar(i.siguiente.info);
                    tamano--;
                    return;
                }
                while (i.info!=x){
                    i = i.siguiente;
                }
                i.anterior.siguiente=i.siguiente;
                if(i.siguiente==null){
                    this.cola=i.anterior;
                    tamano--;
                    return;
                }
                i.siguiente.anterior = i.anterior;
                tamano--;
                break;
            default:
                System.out.println("La opcion no es valida.");
        }
    }

    public void borrarFin(){
        Nodo i = this.cola;
        this.cola = i.anterior;
        this.cola.siguiente = null;
        tamano--;
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
