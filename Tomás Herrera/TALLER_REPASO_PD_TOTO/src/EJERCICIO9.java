/*
 * ArregloCarga.java – Cargar N valores
Problema: Solicite N (1..50). Cree un arreglo de N enteros y cargue valores por teclado.

Requisitos:

Validar N en rango.
Al finalizar, mostrar Carga completada.
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Ingrese cantidad de elementos (1-50): ");
            N = sc.nextInt();
        } while (N < 1 || N > 50);

        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Carga completada.");

        int pares = 0, impares = 0;
        System.out.print("Valores: ");
        for (int i = 0; i < N; i++) {
            System.out.print(numeros[i] + " ");
            
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("\nPares: " + pares + ", Impares: " + impares);

        int mayor = numeros[0];
        int menor = numeros[0];
        double suma = 0;

        for (int i = 0; i < N; i++) {
            if (numeros[i] > mayor) mayor = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
            suma += numeros[i];
        }

        double promedio = suma / N;
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Promedio: " + promedio);
    }
}
/***
 * RUN:
 * Ingrese cantidad de elementos (1-50): 13
Ingrese valor 1: 1
Ingrese valor 2: 2
Ingrese valor 3: 3
Ingrese valor 4: 4
Ingrese valor 5: 5
Ingrese valor 6: 6
Ingrese valor 7: 7
Ingrese valor 8: 8
Ingrese valor 9: 9
Ingrese valor 10: 10
Ingrese valor 11: 11
Ingrese valor 12: 12
Ingrese valor 13: 13
Carga completada.
Valores: 1 2 3 4 5 6 7 8 9 10 11 12 13 
Pares: 6, Impares: 7
Mayor: 13
Menor: 1
Promedio: 7.0
* 
* Ingrese cantidad de elementos (1-50): 3
Ingrese valor 1: 15
Ingrese valor 2: 25
Ingrese valor 3: 35
Carga completada.
Valores: 15 25 35 
Pares: 0, Impares: 3
Mayor: 35
Menor: 15
Promedio: 25.0
 */
