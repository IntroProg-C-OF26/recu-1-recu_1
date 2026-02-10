
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class ComparacionCiclos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int sumaWhile = 0, sumaDoWhile = 0, sumaFor = 0;
        System.out.println("Ingrese un numero: ");
        int n = tcl.nextInt();
        if (n < 1) {
            System.out.println("Ingrese nuevamente un numero");
        } else {

            int a = 1;
            while (sumaWhile <= n) {
                sumaWhile += a;
            }

            int b = 1;
            do {
                sumaDoWhile += b;
                b++;
            } while (b <= n);

            for (int i = 1; i <= n; i++) {
                sumaFor += i;

            }
            System.out.println("\nResultados:");
            System.out.println("Suma con while: " + sumaWhile);
            System.out.println("Suma con do-while: " + sumaDoWhile);
            System.out.println("Suma con for: " + sumaFor);

            if (sumaWhile == sumaDoWhile && sumaDoWhile == sumaFor) {
                System.out.println("Los tres resultados coinciden");
            } else {
                System.out.println("Algo esta mal");
            }
        }

    }
}
