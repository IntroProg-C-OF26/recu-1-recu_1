import java.util.Scanner;
/**
 * Mostrar matriz y suma por fila
 * Con una matriz `f x c` (cargada por teclado):
 * Mostrar la matriz en formato de tabla
 * Calcular la suma de cada fila y mostrarla
 * **Requisitos:**
 * Formato sugerido:
 * Fila "1 -> suma = ..." "Fila 2 -> suma = ..." 
 * @author Esteban Rocano
 */
public class Ejercicio_02_MatrizRecorrido {
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
        System.out.println("\nMatriz:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < f; i++) {
            int sumaFila = 0;
            for (int j = 0; j < c; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + " -> suma = " + sumaFila);
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
Matriz:
2	2	
2	2	
Fila 1 -> suma = 4
Fila 2 -> suma = 4
BUILD SUCCESSFUL (total time: 8 seconds)
 */