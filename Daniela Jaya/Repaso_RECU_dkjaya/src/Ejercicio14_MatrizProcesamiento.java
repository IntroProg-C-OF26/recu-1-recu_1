
import java.util.Scanner;

/**
 * MatrizProcesamiento.java – Suma total y diagonal (si aplica)
Problema: Con una matriz f x c:
Calcular suma total de elementos
Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal
Requisitos:
Si no es cuadrada, mostrar Diagonal no aplica.
 * @author Daniela
 */
public class Ejercicio14_MatrizProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c, sumaTotal = 0;
        System.out.print("Ingrese filas: ");
        f = tcl.nextInt();
        System.out.print("Ingrese columnas: ");
        c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("Suma total de los elementos: " + sumaTotal);
        if (f == c) {
            int sumaDiagonal = 0;
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }  
}

/*
run:
Ingrese filas: 3
Ingrese columnas: 3
Ingrese el valor [0][0]: 2
Ingrese el valor [0][1]: 3
Ingrese el valor [0][2]: 4
Ingrese el valor [1][0]: 3
Ingrese el valor [1][1]: 6
Ingrese el valor [1][2]: 9
Ingrese el valor [2][0]: 8
Ingrese el valor [2][1]: 4
Ingrese el valor [2][2]: 5
Suma total de los elementos: 44
Suma de la diagonal principal: 13
*/