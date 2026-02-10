/*
 *ArregloRecorrido.java – Mostrar y contar
Problema: Con un arreglo de N enteros (cargado por teclado):

Mostrar todos los valores
Contar cuántos son pares y cuántos impares
Requisitos:

Mostrar al final: Pares: X, Impares: Y.
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int N = sc.nextInt();
        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int pares = 0, impares = 0;
        System.out.print("Valores en el arreglo: ");
        for (int i = 0; i < N; i++) {
            System.out.print(numeros[i] + " ");
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("\nPares: " + pares + ", Impares: " + impares);
    }
}
/***
 * RUN:
 * Ingrese N: 5
Valor 1: 12
Valor 2: 24
Valor 3: 36
Valor 4: 48
Valor 5: 62
Valores en el arreglo: 12 24 36 48 62 
Pares: 5, Impares: 0
* 
* Ingrese N: 5
Valor 1: 15
Valor 2: 30
Valor 3: 45
Valor 4: 22
Valor 5: 37
Valores en el arreglo: 15 30 45 22 37 
Pares: 2, Impares: 3
 */