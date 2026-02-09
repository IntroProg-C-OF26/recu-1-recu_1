
import java.util.Scanner;

/**
 * Solicite un número entero `n` y muestre su tabla del 1 al 12.
 *
 * @author carolina carvallo
 */
public class Ejercicio07_TablaDeMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el numero que desea: ");
        n = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = n * i ;
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
/**
 * run:
Ingrese el numero que desea: 4
4 x 0 = 0
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
4 x 4 = 16
4 x 5 = 20
4 x 6 = 24
4 x 7 = 28
4 x 8 = 32
4 x 9 = 36
4 x 10 = 40
 */