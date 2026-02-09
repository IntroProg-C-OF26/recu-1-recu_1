import java.util.Random;
import java.util.Scanner;
/**
 *Problema: Solicite filas f(1..10) y columnas c(1..10). Cree una matriz f x cde
 *enteros y llénela por teclado.
 * @author Santiago Iñiguez
 */
public class MatrizCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();        
        int f, c;
        do {
            System.out.print("Ingrese nuemro Filas (1-10): ");
            f = tcl.nextInt();
        } while (f < 1 || f > 10);
        do {
            System.out.print("Ingrese numero Columnas (1-10): ");
            c = tcl.nextInt();
        } while (c < 1 || c > 10);
        int[][] matriz = new int[f][c];
        System.out.println("\n--- GENERANDO MATRIZ ---");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) { 
                matriz[i][j] = ale.nextInt(100) + 1; 
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println(); 
        }
        System.out.println("\nMatriz cargada con exito.");
    }
}
/**
 * run:
Ingrese nuemro Filas (1-10): 6
Ingrese numero Columnas (1-10): 7

--- GENERANDO MATRIZ ---
24	30	9	57	47	24	98	
37	75	25	34	43	55	15	
36	56	41	17	70	67	6	
43	43	24	18	73	53	52	
89	88	63	35	18	65	25	
71	24	75	57	1	47	80	

Matriz cargada con exito.
BUILD SUCCESSFUL (total time: 6 seconds)
 */
