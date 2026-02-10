/**
 * Ejercicio12:
 * Problema: Solicite filas f(1..10) y columnas c(1..10). Cree una matriz f x c de enteros 
 * y llénela por teclado.
Requisitos:
Validar rangos.
Al finalizar, mostrar Matriz cargada.
 * @author julian jaramillo
 */
import java.util.Scanner;
public class Ejercicio12_MostrarMatriz_Y_Suma {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("deme el numero de filas (f) y columnas (c): ");
        int f = tcl.nextInt(), c = tcl.nextInt();
        if (f < 1 || f > 10 || c < 1 || c > 10) {
            System.out.println("Rango invalido");
            return;
        }
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("Matriz cargada");
    }
}
/**
 * run:
deme el numero de filas (f) y columnas (c): 
3 3
4 5 6
3 2 7
5 8 6
Matriz cargada
BUILD SUCCESSFUL (total time: 
 */

/**
 * run:
deme el numero de filas (f) y columnas (c): 
-1 3
Rango invalido
BUILD SUCCESSFUL (total time: 5 seconds)

 */