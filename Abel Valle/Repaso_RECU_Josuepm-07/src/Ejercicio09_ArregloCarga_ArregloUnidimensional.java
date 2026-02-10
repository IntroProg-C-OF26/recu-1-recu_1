import java.util.Scanner;
/**
 * Solicite `N` (1..50). Cree un arreglo de `N` enteros y cargue valores por teclado.
 * @author ABEL
 */
public class Ejercicio09_ArregloCarga_ArregloUnidimensional {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de elementos (1-50): ");
        n = tcl.nextInt();
        
        if (n < 1 || n > 50) {
            System.out.println("Cantidad fuera de rango");
        } else {

            int[] arreglo = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = tcl.nextInt();
            }
            System.out.println("Carga completada");
        }
    }
}
/**
 * run:
Ingrese la cantidad de elementos (1-50): 3
Ingrese el valor 1: 23
Ingrese el valor 2: 32
Ingrese el valor 3: 12
Carga completada
BUILD SUCCESSFUL (total time: 7 seconds)
 */