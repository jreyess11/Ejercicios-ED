import java.util.*;

public class Main {

    public static void main (String args []) {
        long documento;
        int tipo, ventas;
        double comision;
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el documento del vendedor (sin comas ni puntos): ");
        documento = scn.nextLong();
        System.out.print("Ingrese el tipo de vendedor (1 para puerta a puerta // 2 para telemarketing): ");
        tipo = scn.nextInt();
        System.out.print("Ingrese las ventas del mes: ");
        ventas = scn.nextInt();

        Vendedor vendedor1 = new Vendedor(documento, tipo, ventas);
        System.out.println("La comisión total del vendedor es: " + vendedor1.calcCom());
    }
}
