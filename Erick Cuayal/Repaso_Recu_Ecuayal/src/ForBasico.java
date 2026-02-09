
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class ForBasico {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        int tabla, resultado, max = 10;
        System.out.println("Ingrese un numero entero: ");
        tabla = tcl.nextInt();
        if (tabla > 0) {
            System.out.println("Su tabla es del numero " + tabla + ":");
            for (int i = 0; i < max; i++) {
                resultado = tabla * i;
                System.out.println(tabla + " x " + i + " = " + resultado);
            }

        }else {
                System.out.println("Ingrese un numero mayor a 0");
                }
    }
}
