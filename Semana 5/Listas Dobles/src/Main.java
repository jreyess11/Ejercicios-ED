import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();
        Scanner scn = new Scanner(System.in);
        int obj, pos;
        boolean continuar = true;

        System.out.println("\nVamos a llenar su lista con los numeros del 0 al 9");
        for (int i=0; i<10; i++){
            lista.agregarFin(i);
        }
        System.out.print("La lista original es: ");
        lista.imprimir();
        System.out.print("La lista al reves es (demostracion que se conecta en ambos sentidos): ");
        lista.imprimirRev();
        System.out.print("\nVamos a insertar el numero 66 al inicio: ");
        lista.agregarInicio(66);
        lista.imprimir();
        System.out.print("Al reves: ");
        lista.imprimirRev();
        System.out.print("\nVamos a insertar el numero 99 al final: ");
        lista.agregarFin(99);
        lista.imprimir();
        System.out.print("Al reves: ");
        lista.imprimirRev();
        System.out.print("\nVamos a insertar el numero 75 al lado del numero 4, por favor elija.\n");
        lista.agregarPos(75,4);
        lista.imprimir();
        System.out.print("Al reves: ");
        lista.imprimirRev();
        System.out.print("\nVamos a buscar el elemento que quiera. Ingrese el elemento: ");
        int elec = scn.nextInt();
        lista.buscar(elec);
        System.out.print("\nVamos a eliminar el primer elemento de la lista: ");
        lista.borrarInicio();
        lista.imprimir();
        System.out.print("Al reves: ");
        lista.imprimirRev();
        System.out.print("\nVamos a eliminar el ultimo elemento de la lista: ");
        lista.borrarFin();
        lista.imprimir();
        System.out.print("Al reves: ");
        lista.imprimirRev();
        System.out.print("\nVamos a eliminar el elemento que quiera. Ingrese el elemento: ");
        int elec2 = scn.nextInt();
        lista.borrar(elec2);
        lista.imprimir();
        System.out.print("Al reves: ");
        lista.imprimirRev();
        System.out.print("\nVamos a eliminar el elemento que quiera que este al lado del numero 6. Por favor seleccione\n ");
        lista.borrarPos(6);
        lista.imprimir();
        System.out.print("Al reves: ");
        lista.imprimirRev();
    }
}
