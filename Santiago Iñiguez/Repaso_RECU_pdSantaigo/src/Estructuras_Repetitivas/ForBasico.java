import java.util.Scanner;
/**
 *Problema: Solicite un número entero ny muestre su tabla del 1 al 12.
 * @author Santiago Iñiguez
 */
public class ForBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, resultado;
        System.out.print("Ingrese un numero entero positivo para ver su tabla: ");
        n = tcl.nextInt();
        if (n <= 0) {
            System.out.println("Error: El numero debe ser positivo.");
        } else {
            System.out.println("\n--- TABLA DEL " + n + " ---");
                for (int i = 1; i <= 12; i++) {
                resultado = n * i;
                System.out.println(n + " x " + i + " = " + resultado);
            }
        }
    }
}
/**
 * run:
Ingrese un numero entero positivo para ver su tabla: 3
--- TABLA DEL 3 ---
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
3 x 11 = 33
3 x 12 = 36
BUILD SUCCESSFUL (total time: 3 seconds)
 */