import java.util.Random;
import java.util.Scanner;
/**
 *Problema: Con una matriz f x c(cargada por teclado):
Mostrar la matriz en formato de tabla
Calcular la suma de cada fila y mostrarla
 * @author Santiago Iñiguez
 */
public class MatrizRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
        int f, c;
        System.out.print("Ingrese numero de filas: ");
        f = tcl.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        System.out.println("\n--- MATRIZ ---");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = ale.nextInt(10) + 1; 
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); 
        }
        System.out.println("\n--- SUMATORIA POR FILAS ---");
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
Ingrese numero de filas: 4
Ingrese numero de columnas: 5

--- MATRIZ ---
5	10	1	10	2	
2	3	5	4	6	
10	4	7	3	10	
2	8	10	6	7	

--- SUMATORIA POR FILAS ---
Fila 1 -> suma = 28
Fila 2 -> suma = 20
Fila 3 -> suma = 34
Fila 4 -> suma = 33
 */