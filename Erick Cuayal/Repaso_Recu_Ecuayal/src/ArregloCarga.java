
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class ArregloCarga {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Ingrese el limite de numeros");
        int lim = tcl.nextInt();
        int N[] = new int[lim];
        for (int i = 0; i < lim; i++) {
            System.out.println("Ingrese un numero");
            N[i] = tcl.nextInt();
        }
        System.out.println("Carga completa");

    }
}
