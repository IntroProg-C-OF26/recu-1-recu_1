
/**
 * Ejercicio14:
 * Problema: Con una matriz f x c:
Calcular suma total de elementos
Si la matriz es cuadrada (f==c), calcule la suma de la diagonal principal
Requisitos:
Si no es cuadrada, mostrar Diagonal no aplica.
 * @author julia
 */
import java.util.Scanner;
public class Ejercicio14_SumaTotal_y_Diagonal {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("deme el numero de filas (f) y columnas (c): ");
        int f = tcl.nextInt(), c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = tcl.nextInt();
            }
        }
        int sumaTotal = 0, sumaDiagonal = 0;  
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sumaTotal += matriz[i][j];
                if (f == c && i == j) 
                    sumaDiagonal += matriz[i][j];               
            }
        }
        System.out.println("Suma total: " + sumaTotal);
        if (f == c)
            System.out.println("Suma diagonal principal: " + sumaDiagonal);
        else 
            System.out.println("Diagonal no aplica");        
    }
}

/**
 * run:
deme el numero de filas (f) y columnas (c): 
3 3
9 6 0
4 6 2
1 8 5
Suma total: 41
Suma diagonal principal: 20
BUILD SUCCESSFUL (total time: 16 seconds)
 */ 

/**
 * run:
deme el numero de filas (f) y columnas (c): 
3 2
4 6 2
7 9 1
Suma total: 29
Diagonal no aplica
BUILD SUCCESSFUL (total time: 26 seconds)
 */