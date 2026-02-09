
import java.util.Scanner;


public class Ejercicio13_MatrizySuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int f = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[f][c];

        // Carga de la matriz
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        // Recorrido y suma por fila
        for (int i = 0; i < f; i++) {
            int sumaFila = 0;

            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
            }

            System.out.println();
            System.out.println("Fila " + (i + 1) + " -> suma = " + sumaFila);
        }
    }
}
/**
 * run:
Ingrese el n�mero de filas: 2
Ingrese el n�mero de columnas: 2
Ingrese el valor [0][0]: 1
Ingrese el valor [0][1]: 2
Ingrese el valor [1][0]: 3
Ingrese el valor [1][1]: 4

Matriz:
1	2	
Fila 1 -> suma = 3
3	4	
Fila 2 -> suma = 7
BUILD SUCCESSFUL (total time: 6 seconds)

* run:
Ingrese el n�mero de filas: 1
Ingrese el n�mero de columnas: 1
Ingrese el valor [0][0]: 2

Matriz:
2	
Fila 1 -> suma = 2
BUILD SUCCESSFUL (total time: 3 seconds)

 */