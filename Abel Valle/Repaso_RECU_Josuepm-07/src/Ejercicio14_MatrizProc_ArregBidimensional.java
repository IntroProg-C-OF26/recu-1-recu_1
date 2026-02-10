import java.util.Scanner;
/**
 * Con una matriz `f x c`:
 * - Calcular suma total de elementos
 * - Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal
 * @author ABEL
 */
public class Ejercicio14_MatrizProc_ArregBidimensional {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, m;
        int sumaTotal, sumaDiagonal;
        System.out.print("Ingrese el numero de filas: ");
        n = tcl.nextInt();
        System.out.print("Ingrese el numero d columnas: ");
        m = tcl.nextInt();
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        sumaTotal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("Suma total de elementos: " + sumaTotal);
        if (n == m) {
            sumaDiagonal = 0;
            for (int i = 0; i < n; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }   
}

/**
 * run:
Ingrese el numero de filas: 3
Ingrese el numero d columnas: 3
Ingrese el valor [0][0]: 1
Ingrese el valor [0][1]: 2
Ingrese el valor [0][2]: 3
Ingrese el valor [1][0]: 4
Ingrese el valor [1][1]: 5
Ingrese el valor [1][2]: 6
Ingrese el valor [2][0]: 7
Ingrese el valor [2][1]: 7
Ingrese el valor [2][2]: 8
Suma total de elementos: 43
Suma de la diagonal principal: 14
BUILD SUCCESSFUL (total time: 13 seconds)
 */