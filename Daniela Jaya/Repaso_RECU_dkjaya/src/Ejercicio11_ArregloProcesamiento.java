
import java.util.Scanner;

/**
 * Problema: Con un arreglo de N enteros (cargado por teclado), calcular:
Mayor
Menor
Promedio (double)
Requisitos:
Validar N (1..50).
Mostrar resultados con 2 decimales en el promedio.
 * @author Daniela
 */
public class Ejercicio11_ArregloProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n = 0;
        double promedio;
        while (n < 1 || n > 50) {
            System.out.print("Ingrese el tamanio del arreglo (1..50): ");
            n = tcl.nextInt();
        }
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
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

        promedio = (double) suma / n;
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}

/*
run:
Ingrese el tamanio del arreglo (1..50): 8
Valor 1: 23
Valor 2: 12
Valor 3: 11
Valor 4: 6
Valor 5: 8
Valor 6: 19
Valor 7: 9
Valor 8: 5
Mayor: 23
Menor: 5
Promedio: 11,63
*/