
import java.util.Scanner;


/**
 *
 * @author Erick 
 */

public class PasoParametros {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        int nota = leerNotaValida(tcl);
        String estado = obtenerEstado(nota);

        System.out.println("Nota registrada: " + nota);
        System.out.println("Resultado: " + estado);
    }

    public static int leerNotaValida(Scanner sc) {
        int n;
        do {
            System.out.print("Ingrese una nota (0-100): ");
            n = sc.nextInt();
            if (n < 0 || n > 100) {
                System.out.println("Error: La nota debe estar entre 0 y 100.");
            }
        } while (n < 0 || n > 100);
        return n;
    }

    public static String obtenerEstado(int nota) {
        if (nota >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}