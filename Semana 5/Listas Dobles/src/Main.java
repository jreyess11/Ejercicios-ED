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
        lista.imprimir();
        lista.imprimirRev();
    }
}
