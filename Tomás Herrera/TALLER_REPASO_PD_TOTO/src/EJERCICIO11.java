/*
 *ArregloProcesamiento.java – Estadísticas básicas
Problema: Con un arreglo de N enteros (cargado por teclado), calcular:

Mayor
Menor
Promedio (double)
Requisitos:

Validar N (1..50).
Mostrar resultados con 2 decimales en el promedio.
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("N (1-50): ");
            N = sc.nextInt();
        } while (N < 1 || N > 50);

        int[] numeros = new int[N];
        double suma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < N; i++) {
            if (numeros[i] > mayor) mayor = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.printf("Promedio: %.2f\n", (suma / N));
    }
}
/***
 * RUN:
 * N (1-50): 5
Valor 1: 13
Valor 2: 35
Valor 3: 64
Valor 4: 78
Valor 5: 42
Mayor: 78
Menor: 13
Promedio: 46,40
* 
* N (1-50): 5
Valor 1: 49
Valor 2: 1
Valor 3: 2
Valor 4: 3
Valor 5: 4
Mayor: 49
Menor: 1
Promedio: 11,80
 */
