import java.util.Scanner;
/**
 * Solicite filas `f` (1..10) y columnas `c` (1..10). Cree una matriz `f x c` de enteros y llénela por teclado.
 * @author ABEL
 */
public class Ejercicio12_MatrizCarga_ArregBidimensionales {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, m;        
        System.out.print("Ingrese el numero de filas: ");
        n = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        m = tcl.nextInt();
        if (n < 1 || n > 10 || m < 1 || m > 10) {
            System.out.println("Dimensiones fuera de rango");
        } else {
            int[][] matriz = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = tcl.nextInt();
                }
            }
            System.out.println("\nMatriz cargada");
        }
    }
}

/**
 * run:
Ingrese el numero de filas: 2
Ingrese el numero de columnas: 3
Ingrese el valor [0][0]: 12
Ingrese el valor [0][1]: 20
Ingrese el valor [0][2]: 34
Ingrese el valor [1][0]: 45
Ingrese el valor [1][1]: 56
Ingrese el valor [1][2]: 23

Matriz cargada
BUILD SUCCESSFUL (total time: 22 seconds)
 */