/**
 * Ejercicio09:
 * Problema: Solicite N(1..50). Cree un arreglo de Nenteros y cargue valores por teclado.
Requisitos:
Validar N en rango.
Al finalizar, mostrar Carga completada.
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio09_Cargar_N_Valores {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese un numero (N): ");
        int N = tcl.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("Numero invalido");
            return;
        }
        int[] arreglo = new int[N];
        for (int i = 0; i < N; i++) {
            arreglo[i] = tcl.nextInt();
        }
        System.out.println("Carga completada");
    }
}

/**
 * run:
Ingrese un numero (N): 
6
10
9
45
50
1
4
Carga completada
BUILD SUCCESSFUL (total time: 14 seconds)
 */

/**
 * run:
Ingrese un numero (N): 
51
Numero invalido
BUILD SUCCESSFUL (total time: 3 seconds)
 */