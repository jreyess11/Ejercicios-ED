import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();
        Scanner scn = new Scanner(System.in);
        int obj, pos;
        boolean continuar = true;

        System.out.println("\nVamos a llenar su lista con los numeros del 0 al 5");
        for (int i=0; i<5; i++){
            lista.agregarFin(i);
        }

        while (continuar){

            System.out.print("\nSu lista actualmente es: ");lista.imprimir();

            System.out.println("\nQue desea hacer? Escriba el numero correspondiente.");
            System.out.println("1. Insertar un nuevo elemento.");
            System.out.println("2. Borrar un elemento de la lista.");
            System.out.println("3. Buscar un elemento de la lista.");
            System.out.print("Respuesta: ");
            int elec1 = scn.nextInt();

            if (elec1==1) {
                System.out.println("\nSeleccione la opcion que quiere:");
                System.out.println("1. Ingresar un elemento al inicio de la lista.");
                System.out.println("2. Ingresar un elemento a una posicion dada.");
                System.out.println("3. Ingresar un elemento al final de la lista.");
                System.out.print("Respuesta: ");
                int elec2 = scn.nextInt();
                if (elec2==1){
                    System.out.print("\nIngrese el elemento a agregar al inicio: ");
                    obj = scn.nextInt();
                    lista.agregarInicio(obj);
                    lista.imprimir();
                } else if (elec2==2){
                    System.out.print("\nIngrese el elemento a agregar: ");
                    obj = scn.nextInt();
                    System.out.print("Ingrese la posicion: ");
                    pos = scn.nextInt();
                    lista.agregarPos(obj, pos);
                    lista.imprimir();
                } else if (elec2==3){
                    System.out.print("\nIngrese el elemento a agregar al final: ");
                    obj = scn.nextInt();
                    lista.agregarFin(obj);
                    lista.imprimir();
                }
            } else if (elec1==2){
                System.out.print("\nIngrese el elemento a borrar: ");
                obj = scn.nextInt();
                lista.borrar(obj);
                lista.imprimir();
            } else if (elec1==3){
                System.out.print("\nIngrese el elemento a buscar: ");
                obj = scn.nextInt();
                lista.buscar(obj);
            }
            System.out.print("\nDesea continuar? false = NO // true = SI: ");
            continuar = scn.nextBoolean();
            System.out.println("\n-----------------------------------------------");
        }
    }
}
