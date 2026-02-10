import java.util.Random;
import java.util.Scanner;
/**
 *Problema: Con una matriz f x c:
Calcular suma total de elementos
Si la matriz es cuadrada (f==c), calcule la suma de la diagonal principal
 * @author Santiago Iñiguez
 */
public class MatrizProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
                int f, c, sumaTotal = 0, sumaDiagonal = 0;
        System.out.print("Ingrese numero de filas: ");
        f = tcl.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        System.out.println("\n--- MATRIZ GENERADA ---");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = ale.nextInt(10) + 1; 
                System.out.print(matriz[i][j] + "\t");
                sumaTotal += matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma total de elementos: " + sumaTotal);
        if (f == c) {
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica (la matriz no es cuadrada).");
        }
    }
}
/**
 * run:
Ingrese numero de filas: 5
Ingrese numero de columnas: 4

--- MATRIZ GENERADA ---
2	10	10	4	
7	2	4	3	
2	10	2	2	
9	2	3	2	
2	8	4	9	

--- RESULTADOS ---
Suma total de elementos: 97
Diagonal no aplica (la matriz no es cuadrada).
BUILD SUCCESSFUL (total time: 4 seconds)
 */