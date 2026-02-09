
import java.util.Scanner;


public class Ejercicio12_Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int f = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int c = sc.nextInt();

        if (f < 1 || f > 10 || c < 1 || c > 10) {
            System.out.println("Valor inválido");
        } else {
            int[][] matriz = new int[f][c];

            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matriz cargada");
        }
    }
}
