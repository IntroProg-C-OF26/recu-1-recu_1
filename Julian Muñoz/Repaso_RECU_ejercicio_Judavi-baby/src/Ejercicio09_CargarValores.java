
import java.util.Scanner;


public class Ejercicio09_CargarValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores: ");
        int n = sc.nextInt();

        if (n < 1 || n > 50) {
            System.out.println("Valor inválido");
        } else {
            int[] arreglo = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = sc.nextInt();
            }

            System.out.println("Carga completada");
        }
    }
}
/**
 * run:
Ingrese la cantidad de valores: 2
Ingrese el valor 1: 1
Ingrese el valor 2: 1
Carga completada
BUILD SUCCESSFUL (total time: 4 seconds)
 * run:
Ingrese la cantidad de valores: 3
Ingrese el valor 1: 2
2
Ingrese el valor 2: Ingrese el valor 3: 2
Carga completada
BUILD SUCCESSFUL (total time: 6 seconds)

 */