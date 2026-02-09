/*
 * MatrizRecorrido.java – Mostrar matriz y suma por fila
Problema: Con una matriz f x c (cargada por teclado):

Mostrar la matriz en formato de tabla
Calcular la suma de cada fila y mostrarla
Requisitos:

Formato sugerido:
Fila 1 -> suma = ...
Fila 2 -> suma = ...
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas: ");
        int f = sc.nextInt();
        System.out.print("Columnas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Fila " + i + " Col " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < f; i++) {
            int sumaFila = 0;
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
            }
            System.out.println("-> Fila " + (i + 1) + " suma = " + sumaFila);
        }
    }
}
/***
 * RUN:
 * Filas: 2
Columnas: 2
Fila 0 Col 0: 2
Fila 0 Col 1: 3
Fila 1 Col 0: 1
Fila 1 Col 1: 2
2	3	-> Fila 1 suma = 5
1	2	-> Fila 2 suma = 3
* 
* Filas: 5
Columnas: 5
Fila 0 Col 0: 12
Fila 0 Col 1: 24
Fila 0 Col 2: 36
Fila 0 Col 3: 48
Fila 0 Col 4: 62
Fila 1 Col 0: 74
Fila 1 Col 1: 86
Fila 1 Col 2: 98
Fila 1 Col 3: 102
Fila 1 Col 4: 114
Fila 2 Col 0: 126
Fila 2 Col 1: 138
Fila 2 Col 2: 152
Fila 2 Col 3: 164
Fila 2 Col 4: 176
Fila 3 Col 0: 188
Fila 3 Col 1: 200
Fila 3 Col 2: 212
Fila 3 Col 3: 224
Fila 3 Col 4: 236
Fila 4 Col 0: 248
Fila 4 Col 1: 260
Fila 4 Col 2: 272
Fila 4 Col 3: 284
Fila 4 Col 4: 296
12	24	36	48	62	-> Fila 1 suma = 182
74	86	98	102	114	-> Fila 2 suma = 474
126	138	152	164	176	-> Fila 3 suma = 756
188	200	212	224	236	-> Fila 4 suma = 1060
248	260	272	284	296	-> Fila 5 suma = 1360
 */