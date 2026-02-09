
import java.util.Scanner;


public class Ejercicio10_MostraryContar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        int pares = 0;
        int impares = 0;

        System.out.println("Valores ingresados:");
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);

            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares + ", Impares: " + impares);
    }
}
