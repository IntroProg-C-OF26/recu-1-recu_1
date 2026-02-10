import java.util.Scanner;
/**
 * Crear y llenar una matriz
 * Solicite filas `f` (1..10) y columnas `c` (1..10). Cree una matriz `f x c` de
 * enteros y llénela por teclado.
 * Validar rangos.
 * Al finalizar, mostrar `Matriz cargada`.
 * @author Esteban Rocano
 */
public class Ejercicio_01_MatrizCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas (1-10): ");
        int f = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas (1-10): ");
        int c = tcl.nextInt();
        if (f >= 1 && f <= 10 && c >= 1 && c <= 10) {
            int[][] matriz = new int[f][c];
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = tcl.nextInt();
                }
            }
            System.out.println("Matriz cargada");
        } else {
            System.out.println("Filas o columnas fuera de rango");
        }
    }
}
/**
 * RUN: run:
 * Ingrese el numero de filas (1-10): 2
 * Ingrese el numero de columnas (1-10): 2
 * Ingrese el valor [0][0]: 2
 * Ingrese el valor [0][1]: 2
 * Ingrese el valor [1][0]: 2
 * Ingrese el valor [1][1]: 2
 * Matriz cargada
 * BUILD SUCCESSFUL (total time: 18 seconds)
 */