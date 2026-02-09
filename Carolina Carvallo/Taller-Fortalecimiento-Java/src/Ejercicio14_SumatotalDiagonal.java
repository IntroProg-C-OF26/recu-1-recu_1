
import java.util.Scanner;

/**
 *Con una matriz `f x c`:
- Calcular suma total de elementos
- Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal
 * @author carolina carvallo
 */
public class Ejercicio14_SumatotalDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  f,c;
        do {
            System.out.print("INGRESE LA FILA: ");
            f = sc.nextInt();
        }while (f < 1 || f > 10);
        do {
            System.out.print("INGRESE LA COLUMNA: ");
            c = sc.nextInt();
        }while (c < 1 || c > 10);
        
        int [][] matriz = new int[f][c];
        int sumaTotal = 0;
        int sumaDiagonal = 0;
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("elemento de la matriz");
                matriz[i][j] = sc.nextInt();
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("----MATRIZ----");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");           
            } System.out.println();
        }
        
        System.out.println("Suma total de los elementos: " + sumaTotal);
        if (f == c){
            System.out.println("DIAGONAL CUADRADA");
        for (int i = 0; i < f; i++) {
            sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma diagonal pricipal: " + sumaDiagonal);
        }else{ 
            System.out.println("diagonal no aplica");} 
    
    }
}
/*
run:
INGRESE LA FILA: 2
INGRESE LA COLUMNA: 2
elemento de la matriz
1
elemento de la matriz
1
elemento de la matriz
1
elemento de la matriz
1
----MATRIZ----
1	1	
1	1	
Suma total de los elementos: 4
DIAGONAL CUADRADA
Suma diagonal pricipal: 2
BUILD SUCCESSFUL (total time: 5 seconds)
*/