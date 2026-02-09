
import java.util.Scanner;


public class Ejercicio11_EstadisticasBasica {
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

            int mayor = arreglo[0];
            int menor = arreglo[0];
            int suma = 0;

            for (int i = 0; i < n; i++) {
                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];
                }
                if (arreglo[i] < menor) {
                    menor = arreglo[i];
                }
                suma += arreglo[i];
            }

            double promedio = (double) suma / n;

            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.printf("Promedio: %.2f%n", promedio);
        }
    }
}
/**
 * run:
Ingrese la cantidad de valores: 2
Ingrese el valor 1: 1
Ingrese el valor 2: 1
Mayor: 1
Menor: 1
Promedio: 1,00
BUILD SUCCESSFUL (total time: 1 minute 14 seconds)

* run:
Ingrese la cantidad de valores: 5
Ingrese el valor 1: 2
Ingrese el valor 2: 2
Ingrese el valor 3: 2
Ingrese el valor 4: 2
Ingrese el valor 5: 2
Mayor: 2
Menor: 2
Promedio: 2,00
BUILD SUCCESSFUL (total time: 6 seconds)

 */