import java.util.Scanner;
/**
 * Con un arreglo de `N` enteros (cargado por teclado):
 * Mostrar todos los valores
 * Contar cuántos son **pares** y cuántos **impares**
 * **Requisitos:**
 * Mostrar al final: `Pares: X`, `Impares: Y`.
 * @author Esteban Rocano
 */
public class Ejercicio_02_ArregloRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int n = tcl.nextInt();
        int[] matrizPar_Impar = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            matrizPar_Impar[i] = tcl.nextInt();
        }
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < n; i++) {
            if (matrizPar_Impar[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + ", Impares: " + impares);
    }
}
/**
 * RUN:
 * Ingrese el valor de N: 4
 * Ingrese el valor 1: 6
 * Ingrese el valor 2: 7
 * Ingrese el valor 3: 8
 * Ingrese el valor 4: 9
 * Pares: 2, Impares: 2
 * BUILD SUCCESSFUL (total time: 10 seconds)
 */