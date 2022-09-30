import java.util.Scanner;

public class MainCD {
    public static void main(String[] args) {

        ListaCD lista = new ListaCD();
        Scanner scn = new Scanner(System.in);
        int obj, rem;
        boolean continuar = true;

        System.out.println("\nVamos a llenar su lista con los numeros del 0 al 5");
        for (int i=0; i<6; i++){
            lista.agregar(i);
        }

        while (continuar){
            System.out.print("\nSu lista actualmente es: ");lista.imprimir();

            System.out.println("\nQue desea hacer? Escriba el numero correspondiente.");
            System.out.println("1. Insertar un nuevo elemento.");
            System.out.println("2. Borrar un elemento de la lista.");
            System.out.println("3. Buscar un elemento de la lista.");
            System.out.println("4. Reemplazar un elemento de la lista.");
            System.out.print("Respuesta: ");
            int elec1 = scn.nextInt();

            if (elec1==1) {
                System.out.print("\nIngrese el elemento a agregar: ");
                obj = scn.nextInt();
                lista.agregar(obj);
                lista.imprimir();
            } else if (elec1==2){
                System.out.print("\nIngrese el elemento a borrar: ");
                obj = scn.nextInt();
                lista.borrar(obj);
                lista.imprimir();
            } else if (elec1==3){
                System.out.print("\nIngrese el elemento a buscar: ");
                obj = scn.nextInt();
                lista.buscar(obj);
            } else if (elec1==4){
                System.out.print("\nIngrese el elemento que quiere reemplazar: ");
                obj = scn.nextInt();
                System.out.print("\nIngrese el elemento nuevo: ");
                rem = scn.nextInt();
                lista.reemplazar(obj,rem);
                lista.imprimir();
            }
            System.out.print("\nDesea continuar? false = NO // true = SI: ");
            continuar = scn.nextBoolean();
            System.out.println("\n-----------------------------------------------");
        }
    }
}
