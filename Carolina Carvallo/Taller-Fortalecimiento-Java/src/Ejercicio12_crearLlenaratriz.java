
import java.util.Scanner;

/**
 *Solicite filas `f` (1..10) y columnas `c` (1..10). Cree una matriz `f x c` de enteros y llénela por teclado.
 * @author carolina carvallo
 */
public class Ejercicio12_crearLlenaratriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f,c ;
        
        do {
            System.out.print("ingrese el numero de filas: ");
            f = sc.nextInt();
        }while (f < 1 || f > 10 );    
        
        do {
            System.out.print("ingrese el numero de columnas: ");
            c = sc.nextInt();
        }while (c < 1 || c > 10 );
        
        int[][] matriz = new int[f][c];
        System.out.println("\n--ingrese los elementos--");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMATRIZ CARGADA");
    }
}
/**
 * run:
ingrese el numero de filas: 4
ingrese el numero de columnas: 4

--ingrese los elementos--
Matriz[0][0]: 
1
Matriz[0][1]: 
1
Matriz[0][2]: 
1
Matriz[0][3]: 
1
Matriz[1][0]: 
1
Matriz[1][1]: 
1
Matriz[1][2]: 
1
Matriz[1][3]: 
1
Matriz[2][0]: 
1
Matriz[2][1]: 
1
Matriz[2][2]: 
1
Matriz[2][3]: 
1
Matriz[3][0]: 
1
Matriz[3][1]: 
1
Matriz[3][2]: 
1
Matriz[3][3]: 
1

MATRIZ CARGADA
 */