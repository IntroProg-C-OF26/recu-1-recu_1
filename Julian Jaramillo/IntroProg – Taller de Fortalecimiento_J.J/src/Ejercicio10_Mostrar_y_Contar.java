/**
 * Ejercicio10:
 * Problema: Con un arreglo de Nenteros (cargado por teclado):
Mostrar todos los valores
Contar cuantos son pares y cuantos impares
Requisitos:
Mostrar al final: Pares: X, Impares: Y.
 * @author julian jaramillo
 */
import java.util.Scanner;
public class Ejercicio10_Mostrar_y_Contar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int pares = 0, impares = 0;
        System.out.print("ingrese los numeros: ");
        int N = tcl.nextInt();
        if (N < 1) {
            System.out.println("Numero invalido");
            return;
        }
        int[] arreglo = new int[N];
        for (int i = 0; i < N; i++) {
            arreglo[i] = tcl.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arreglo[i] + ", ");
            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("\n Pares: " + pares + ", Impares: " + impares);
    }
}
/**
 * run:
ingrese los numeros: 6
20
57
60
89
4
10
20, 57, 60, 89, 4, 10, 
 Pares: 4, Impares: 2
BUILD SUCCESSFUL (total time: 12 seconds)
 */