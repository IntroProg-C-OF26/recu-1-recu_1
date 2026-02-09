/*
 * MatrizProcesamiento.java – Suma total y diagonal (si aplica)
Problema: Con una matriz f x c:

Calcular suma total de elementos
Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal
Requisitos:

Si no es cuadrada, mostrar Diagonal no aplica.
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas: ");
        int f = sc.nextInt();
        System.out.print("Columnas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[f][c];
        int sumaTotal = 0;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Dato: ");
                matriz[i][j] = sc.nextInt();
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("Suma total: " + sumaTotal);

        if (f == c) {
            int sumaDiagonal = 0;
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica.");
        }
    }
}
/***
 * RUN:
 * Filas: 2
Columnas: 3
Dato: 12
Dato: 2
Dato: 2
Dato: 2
Dato: 2
2
Dato: Suma total: 22
Diagonal no aplica.
* 
* Filas: 2
Columnas: 2
Dato: 13
Dato: 14
Dato: 15
Dato: 16
Suma total: 58
Suma diagonal principal: 29
 */
