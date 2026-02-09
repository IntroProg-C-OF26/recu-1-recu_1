
import java.util.Scanner;



/**
 *
 * @author Erick
 */


public class MatrizCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c;

        do {
            System.out.print("Ingrese numero de filas (1-10): ");
            f = tcl.nextInt();
        } while (f < 1 || f > 10);

        do {
            System.out.print("Ingrese numero de columnas (1-10): ");
            c = tcl.nextInt();
        } while (c < 1 || c > 10);

        int[][] matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }

        System.out.println("Matriz cargada.");
    }
}