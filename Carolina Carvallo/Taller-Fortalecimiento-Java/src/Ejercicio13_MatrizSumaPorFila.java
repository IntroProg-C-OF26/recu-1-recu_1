
import java.util.Scanner;

/**
 *Con una matriz `f x c` (cargada por teclado):
- Mostrar la matriz en formato de tabla
- Calcular la suma de cada fila y mostrarla

 * @author carolina carvallo
 */
public class Ejercicio13_MatrizSumaPorFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f,c;
        
        do {
            System.out.print("INGRESE LA FILA: ");
            f = sc.nextInt();
        }while (f < 1 || f > 10);
        do {
            System.out.print("INGRESE LA COLUMNA: ");
            c = sc.nextInt();
        }while (c < 1 || c > 10);
        
        int[][] matriz = new int[f][c];
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();                
            }
        }
        System.out.println("----MATRIZ----");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");           
            } System.out.println();
        }      
        
        for (int i = 0; i < f; i++) {           
            int sumaFila = 0;
            for (int j = 0; j < c; j++) {                
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + " -> suma = " + sumaFila);
        }
        
        
    }
}
/**
 * run:
INGRESE LA FILA: 4
INGRESE LA COLUMNA: 4
Matriz[0][0]: 1
Matriz[0][1]: 1
Matriz[0][2]: 1
Matriz[0][3]: 1
Matriz[1][0]: 1
Matriz[1][1]: 1
Matriz[1][2]: 1
Matriz[1][3]: 1
Matriz[2][0]: 1
Matriz[2][1]: 1
Matriz[2][2]: 1
Matriz[2][3]: 1
Matriz[3][0]: 1
Matriz[3][1]: 1
Matriz[3][2]: 1
Matriz[3][3]: 1
1	1	1	1	
1	1	1	1	
1	1	1	1	
1	1	1	1	
Fila 1 -> suma = 4
Fila 2 -> suma = 4
Fila 3 -> suma = 4
Fila 4 -> suma = 4
 */