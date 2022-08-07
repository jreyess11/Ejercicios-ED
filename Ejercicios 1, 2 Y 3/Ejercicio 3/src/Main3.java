import java.util.*;

public class Main3 {

    public static void main (String args []) {
        int num;
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el numero a evaluar: ");
        num = Integer.parseInt(scn.nextLine());

        numero_entero ne = new numero_entero(num);
        ne.par_impar();
        ne.positivo_negativo();
        ne.primo();
    }
}