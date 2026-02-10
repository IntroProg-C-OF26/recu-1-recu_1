/**
 * Ejercicio11:
 * Problema: Con un arreglo de Nenteros (cargado por teclado), calcular:
Alcalde
Menor
Promedio (doble)
Requisitos:
Validar N (1..50).
Mostrar resultados con 2 decimales en el promedio.
 * @author julian jaramillo
 */
import java.util.Scanner;
public class Ejercicio11_Esatadisticas_basicas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("digame un numero (1-50): ");
        int Nent = tcl.nextInt();
        if (Nent < 1 || Nent > 50) {
            System.out.println("Numero invalido");
            return;
        }
        int[] arreglo = new int[Nent];
        for (int i = 0; i < Nent; i++) {
            arreglo[i] = tcl.nextInt();
        }
        int Nmayor = arreglo[0], Nmenor = arreglo[0], suma = 0;
        for (int i = 0; i < Nent; i++) {
            if (arreglo[i] > Nmayor) Nmayor = arreglo[i];
            if (arreglo[i] < Nmenor) Nmenor = arreglo[i];
            suma += arreglo[i];
        }
        double promedio = (double) suma / Nent;
        System.out.println("Mayor: " + Nmayor);
        System.out.println("Menor: " + Nmenor);
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}
/**
 * run:
digame un numero (1-50): 
5
7
3
2
8
6
Mayor: 8
Menor: 2
Promedio: 5,20
BUILD SUCCESSFUL (total time: 23 seconds)
 */

/**
 * run:
digame un numero (1-50): 
55
Numero invalido
BUILD SUCCESSFUL (total time: 4 seconds)
 */