
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
/**
 * run:
Ingrese el n�mero de filas: 2
Ingrese el n�mero de columnas: 2
Ingrese el valor [0][0]: 1
Ingrese el valor [0][1]: 1
Ingrese el valor [1][0]: 1
Ingrese el valor [1][1]: 1
Matriz cargada
BUILD SUCCESSFUL (total time: 6 seconds)

* run:
Ingrese el n�mero de filas: 3
Ingrese el n�mero de columnas: 3
Ingrese el valor [0][0]: 2
Ingrese el valor [0][1]: 3
Ingrese el valor [0][2]: 2
Ingrese el valor [1][0]: 3
Ingrese el valor [1][1]: 2
Ingrese el valor [1][2]: 3
Ingrese el valor [2][0]: 2
Ingrese el valor [2][1]: 3
Ingrese el valor [2][2]: 2
Matriz cargada
BUILD SUCCESSFUL (total time: 8 seconds)

 */