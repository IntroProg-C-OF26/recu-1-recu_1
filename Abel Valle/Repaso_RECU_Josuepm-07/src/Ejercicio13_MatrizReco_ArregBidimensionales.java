import java.util.Scanner;
/**
 * Con una matriz `f x c` (cargada por teclado):
 * - Mostrar la matriz en formato de tabla
 * - Calcular la suma de cada fila y mostrarla
 * @author ABEL
 */
public class Ejercicio13_MatrizReco_ArregBidimensionales {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, m;       
        System.out.print("Ingrese el numero de filas: ");
        n = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        m = tcl.nextInt();       
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("\nMatriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j <m; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) +": " + sumaFila);
        }
    }
}

/**
 * run:
Ingrese el numero de filas: 2
Ingrese el numero de columnas: 2
Ingrese el valor [0][0]: 1
Ingrese el valor [0][1]: 2
Ingrese el valor [1][0]: 3
Ingrese el valor [1][1]: 4

Matriz:
1	2	
3	4	
Fila 1: 3
Fila 2: 7
BUILD SUCCESSFUL (total time: 8 seconds)
 */