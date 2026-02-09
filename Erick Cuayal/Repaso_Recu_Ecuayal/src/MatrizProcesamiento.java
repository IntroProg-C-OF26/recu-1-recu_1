
import java.util.Scanner;


/**
 *
 * @author Erick
 */

public class MatrizProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Filas: ");
        int f = tcl.nextInt();
        System.out.print("Columnas: ");
        int c = tcl.nextInt();

        int[][] matriz = new int[f][c];
        int sumaTotal = 0;
        int sumaDiagonal = 0;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("\nSuma total de elementos: " + sumaTotal);

        if (f == c) {
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica.");
        }
   
    }
}