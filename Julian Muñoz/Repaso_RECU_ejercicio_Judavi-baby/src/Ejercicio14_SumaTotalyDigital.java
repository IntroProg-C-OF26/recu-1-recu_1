
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
/**
 * run:
Ingrese el n�mero de filas: 2
Ingrese el n�mero de columnas: 3
Ingrese el valor [0][0]: 1
Ingrese el valor [0][1]: 5
Ingrese el valor [0][2]: 6
Ingrese el valor [1][0]: 7
Ingrese el valor [1][1]: 4
Ingrese el valor [1][2]: 2
Suma total: 25
Diagonal no aplica
BUILD SUCCESSFUL (total time: 8 seconds)

* run:
Ingrese el n�mero de filas: 2
Ingrese el n�mero de columnas: 2
Ingrese el valor [0][0]: 1
Ingrese el valor [0][1]: 3
Ingrese el valor [1][0]: 5
Ingrese el valor [1][1]: 4
Suma total: 13
Suma diagonal principal: 5
BUILD SUCCESSFUL (total time: 4 seconds)

 */