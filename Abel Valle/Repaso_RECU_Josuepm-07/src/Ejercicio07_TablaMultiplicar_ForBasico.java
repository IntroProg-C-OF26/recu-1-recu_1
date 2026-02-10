import java.util.Scanner;
/**
 * Solicite un número entero `n` y muestre su tabla del 1 al 12.
 * @author ABEL
 */
public class Ejercicio07_TablaMultiplicar_ForBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese un numero entero: ");
        n = tcl.nextInt();
        
        if (n <= 0) {
            System.out.println("El número debe ser positivo");
        } else {
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}

/**
 * Ingrese un numero entero: 9
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
9 x 10 = 90
9 x 11 = 99
9 x 12 = 108
BUILD SUCCESSFUL (total time: 3 seconds)

 */