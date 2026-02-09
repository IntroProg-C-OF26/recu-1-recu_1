/*
 * MatrizCarga.java – Crear y llenar una matriz
Problema: Solicite filas f (1..10) y columnas c (1..10). Cree una matriz f x c de enteros y llénela por teclado.

Requisitos:

Validar rangos.
Al finalizar, mostrar Matriz cargada.
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, c;

        do {
            System.out.print("Ingrese filas (1-10): ");
            f = sc.nextInt();
            System.out.print("Ingrese columnas (1-10): ");
            c = sc.nextInt();
        } while (f < 1 || f > 10 || c < 1 || c > 10);

        int[][] matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ ");
        int sumaTotal = 0;
        
        for (int i = 0; i < f; i++) {
            int sumaFila = 0;
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
            }
            sumaTotal += sumaFila;
            System.out.println(" -> Suma Fila " + (i+1) + ": " + sumaFila);
        }

        System.out.println("Suma Total: " + sumaTotal);
        
        if (f == c) {
            int sumaDiagonal = 0;
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma Diagonal Principal: " + sumaDiagonal);
        
        }
    }
}
/***
 * RUN:
 * Ingrese filas (1-10): 2
Ingrese columnas (1-10): 2
Matriz[0][0]: 23
Matriz[0][1]: 34
Matriz[1][0]: 12
Matriz[1][1]: 45
MATRIZ 
23	34	 -> Suma Fila 1: 57
12	45	 -> Suma Fila 2: 57
Suma Total: 114
* 
* Ingrese filas (1-10): 3
Ingrese columnas (1-10): 4
Matriz[0][0]: 12
Matriz[0][1]: 12
Matriz[0][2]: 12
Matriz[0][3]: 12
Matriz[1][0]: 3
Matriz[1][1]: 4
Matriz[1][2]: 4
Matriz[1][3]: 5
Matriz[2][0]: 6
Matriz[2][1]: 6
Matriz[2][2]: 7
Matriz[2][3]: 8
MATRIZ 
12	12	12	12	 -> Suma Fila 1: 48
3	4	4	5	 -> Suma Fila 2: 16
6	6	7	8	 -> Suma Fila 3: 27
Suma Total: 91
 */