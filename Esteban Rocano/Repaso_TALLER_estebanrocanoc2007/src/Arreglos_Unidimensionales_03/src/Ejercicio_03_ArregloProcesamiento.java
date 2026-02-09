import java.util.Scanner;
/**
 * Con un arreglo de `N` enteros (cargado por teclado), calcular:
 * Mayor
 * Menor
 * Promedio (double)
 * **Requisitos:**
 * Validar N (1..50).
 * Mostrar resultados con 2 decimales en el promedio.
 * @author Esteban Rocano
 */
public class Ejercicio_03_ArregloProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
                System.out.print("Ingrese el valor de N (1-50): ");
        int n = tcl.nextInt();
        if (n >= 1 && n <= 50) {
            int[] arreglo = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = tcl.nextInt();
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
        } else {
            System.out.println("N fuera de rango");
        }
    }
}
/**
 * RUN:
 * Ingrese el valor de N (1-50): 4
 * Ingrese el valor 1: 3
 * Ingrese el valor 2: 3
 * Ingrese el valor 3: 3
 * Ingrese el valor 4: 3
 * Mayor: 3
 * Menor: 3
 * Promedio: 3,00
 * BUILD SUCCESSFUL (total time: 15 seconds)
 */