import java.util.*;
public class numero_entero {

    int num;

    public numero_entero(int n){
        this.num = n;
    }

    public void par_impar(){
        if (num==0){
            System.out.println("El numero "+ num + " no es par ni impar.");
        } else if (num%2==0){
            System.out.println("El numero "+ num + " es par.");
        } else {
            System.out.println("El numero "+ num + " es impar.");

        }
    }

    public void positivo_negativo(){
        if (num==0){
            System.out.println("El numero "+ num + " no es positivo ni negativo.");
        } else if (num > 0){
            System.out.println("El numero " + num +" es positivo.");
        } else {
            System.out.println("El numero " + num +" es negativo.");
        }
    }

    public void primo(){
        boolean p = true;

        for (int i=2; i<num; i++){
            if (num % i == 0) {
                p = false;
                break;
            }
        }

        if (num==0){
            System.out.println("El numero " + num + " no es ni primo ni compuesto.");
            return;
        } else if (num<0){
            System.out.println("El numero " + num + " NO ES primo (ningun negativo lo es).");
            return;
        }

        if(p){
            System.out.println("El numero " + num +" ES primo.");
        } else {
            System.out.println("El numero " + num +" NO ES primo, es compuesto.");
        }
    }
}
