package Clase_5;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner MinMaxNum = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = MinMaxNum.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = MinMaxNum.nextInt();

        System.out.println("Introduce el tercer número:");
       int numero3 = MinMaxNum.nextInt();

        int mayor = numero1;
        int menor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        } else if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        } else if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        MinMaxNum.close();
    }
}





