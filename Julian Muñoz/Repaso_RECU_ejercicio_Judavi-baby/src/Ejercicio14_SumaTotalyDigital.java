
import java.util.Scanner;

public class Ejercicio14_SumaTotalyDigital {
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

        int sumaTotal = 0;
        int sumaDiagonal = 0;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sumaTotal += matriz[i][j];

                if (f == c && i == j) {
                    sumaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Suma total: " + sumaTotal);

        if (f == c) {
            System.out.println("Suma diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }
}
