
/**
 * Ejercicio13:
 * Problema: Con una matriz f x c(cargada por teclado):
Mostrar la matriz en formato de tabla
Calcular la suma de cada fila y mostrarla
Requisitos:
Formato sugerido:
Fila 1 -> suma = ...
Fila 2 -> suma = ...
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio13_mostrar_matriz_sumafilas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("deme el numero de filas (f) y columnas (c): ");
        int f = tcl.nextInt(), c= tcl.nextInt(); 
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = tcl.nextInt();
            }
        }
        for (int i = 0; i < f; i++) {
            int sumaFila = 0;
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
            }
            System.out.println(" -> suma = " + sumaFila);
        }
    }
}

/**
 * run:
deme el numero de filas (f) y columnas (c): 
3 3
4 5 7
9 6 4
2 3 4
4	5	7	 -> suma = 16
9	6	4	 -> suma = 19
2	3	4	 -> suma = 9
BUILD SUCCESSFUL (total time: 17 seconds)

 */