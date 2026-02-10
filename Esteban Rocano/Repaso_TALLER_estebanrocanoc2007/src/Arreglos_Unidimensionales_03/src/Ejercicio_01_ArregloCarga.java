import java.util.Scanner;
/**
 * Solicite `N` (1..50). Cree un arreglo de `N` enteros y cargue valores por
 * teclado.
 * Requisitos:**
 * Validar N en rango.
 * Al finalizar, mostrar `Carga completada`.
 * @author Esteban Rocano
 */
public class Ejercicio_01_ArregloCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor de N (1-50): ");
        int n = tcl.nextInt();
        if (n >= 1 && n <= 50) {
            int[] carga = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                carga[i] = tcl.nextInt();
            }
            System.out.println("Carga completada");
        } else {
            System.out.println("N fuera de rango");
        }
    }
}
/**
 * RUN: 
 * Ingrese el valor de N (1-50): 4
 * Ingrese el valor 1: 2
 * Ingrese el valor 2: 2
 * Ingrese el valor 3: 2
 * Ingrese el valor 4: 2
 * Carga completada
 * BUILD SUCCESSFUL (total time: 10 seconds)
 */