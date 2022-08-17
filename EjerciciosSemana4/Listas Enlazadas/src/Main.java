import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();
        Scanner scn = new Scanner(System.in);

        for (int i=0; i<5; i++){
            lista.agregar(i);
        }

        lista.imprimir();
        //System.out.print("\nIngrese el elemento a buscar: ");
        System.out.print("\nIngrese el elemento a borrar: ");
        int obj = scn.nextInt();
        lista.borrar(obj);
        lista.imprimir();
    }
}
