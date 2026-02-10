/**
 * Ejercicio07:
 * Problema: Solicite un número entero ny muestre su tabla del 1 al 12.
Requisitos:
Usar para .
Validar que nsea positivo.
 * @author julian jaramillo
 */
import java.util.Scanner;
public class Ejercicio07_Tabla_Multiplicar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("ingrese un numero entero: ");
        int n = tcl.nextInt();
        if (n <= 0) {
            System.out.println("Numero invalido");
            return;
        }
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

/**
 * run:
ingrese un numero entero: 
59
59 x 1 = 59
59 x 2 = 118
59 x 3 = 177
59 x 4 = 236
59 x 5 = 295
59 x 6 = 354
59 x 7 = 413
59 x 8 = 472
59 x 9 = 531
59 x 10 = 590
59 x 11 = 649
59 x 12 = 708
BUILD SUCCESSFUL (total time: 2 seconds)
 */

/**
 * run:
ingrese un numero entero: 
-10
Numero invalido
BUILD SUCCESSFUL (total time: 2 seconds)

 */