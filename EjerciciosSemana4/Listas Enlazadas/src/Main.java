import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();
        Scanner scn = new Scanner(System.in);

        for (int i=0; i<5; i++){
            lista.agregarFin(i);
        }

        lista.imprimir();
        //System.out.print("\nIngrese el elemento a buscar: ");
        //System.out.print("\nIngrese el elemento a borrar: ");
        System.out.print("\nIngrese el elemento a ingresar: ");
        int obj1 = scn.nextInt();
        System.out.print("Ingrese la posicion: ");
        int obj2 = scn.nextInt();
        lista.agregarPos(obj1, obj2);
        lista.imprimir();
    }
}
