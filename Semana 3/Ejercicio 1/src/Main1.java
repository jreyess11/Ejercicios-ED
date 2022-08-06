import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1 {

    public static void main (String args []) {
        long documento;
        int tipo, N;
        double valventas, total=0;
        Scanner scn = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.print("Ingrese el documento del vendedor sin comas ni puntos): ");
        documento = Long.parseLong(scn.nextLine());
        System.out.print("Ingrese el tipo de vendedor (1 = puerta a puerta // 2 = telemarketing): ");
        tipo = Integer.parseInt(scn.nextLine());
        System.out.print("Ingrese el valor de las ventas del mes: $");
        valventas = Double.parseDouble(scn.nextLine());

        Vendedor1 vendedor = new Vendedor1(documento, tipo, valventas);
        System.out.println("La comision total del vendedor es: $" + df.format(vendedor.calcCom()));

    }
}
