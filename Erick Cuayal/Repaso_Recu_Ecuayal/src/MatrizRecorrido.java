
import java.util.Scanner;



/**
 *
 * @author Erick
 */

public class MatrizRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Filas: ");
        int f = tcl.nextInt();
        System.out.print("Columnas: ");
        int c = tcl.nextInt();

        int[][] matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }

        System.out.println("\n Matriz Completa ");
        for (int i = 0; i < f; i++) {
            int sumaFila = 0;
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
            }
            System.out.println("-> Fila " + (i + 1) + " suma = " + sumaFila);
        }
    }
}
