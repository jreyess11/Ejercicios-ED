import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main (String args []) {
        long documento;
        int tipo, N;
        double valventas, total=0;
        Scanner scn = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.print("Ingrese la cantidad de vendedores: ");
        N = Integer.parseInt(scn.nextLine());

        for (int i=0; i<N; i++){
            System.out.print("Ingrese el documento del vendedor " +(i+1) +" sin comas ni puntos): ");
            documento = Long.parseLong(scn.nextLine());
            System.out.print("VENDEDOR " + (i+1) + ": Ingrese el tipo de vendedor (1 = puerta a puerta // 2 = telemarketing): ");
            tipo = Integer.parseInt(scn.nextLine());
            System.out.print("VENDEDOR " + (i+1) + ": Ingrese el valor de las ventas del mes: $");
            valventas = Double.parseDouble(scn.nextLine());

            Vendedor vendedor = new Vendedor(documento, tipo, valventas);
            System.out.println("La comision total del vendedor " +(i+1)+" es: $" + df.format(vendedor.calcCom()));
            System.out.println("------------------------------------------------");
            total = total + vendedor.calcCom();
        }

        System.out.println("La comision total de todos los vendedores es: $" + df.format(total));
    }
}
