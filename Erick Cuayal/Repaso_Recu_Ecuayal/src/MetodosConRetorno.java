
import java.util.Scanner;


/**
 *
 * @author Erick
 */


public class MetodosConRetorno {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double n1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = tcl.nextDouble();

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + sumar(n1, n2));
        System.out.println("Resta: " + restar(n1, n2));
        System.out.println("Producto: " + multiplicar(n1, n2));
        System.out.println("El mayor es: " + obtenerMayor(n1, n2));
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double obtenerMayor(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
