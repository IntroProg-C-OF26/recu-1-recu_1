import java.util.Scanner;
/**
 * Suma total y diagonal (si aplica)
 * Con una matriz `f x c`:
 * Calcular suma total de elementos
 * Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal
 * Si no es cuadrada, mostrar `Diagonal no aplica`.
 * @author Esteban Rocano
 */
public class Ejercicio_03_MatrizProcesamiento {
   public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        int f = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        int sumaTotal = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("Suma total de elementos: " + sumaTotal);
        if (f == c) {
            int sumaDiagonal = 0;
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }
}
/**
 * run:
Ingrese el numero de filas: 2
Ingrese el numero de columnas: 2
Ingrese el valor [0][0]: 2
Ingrese el valor [0][1]: 2
Ingrese el valor [1][0]: 2
Ingrese el valor [1][1]: 2
Suma total de elementos: 8
Suma diagonal principal: 4
BUILD SUCCESSFUL (total time: 6 seconds)
 */