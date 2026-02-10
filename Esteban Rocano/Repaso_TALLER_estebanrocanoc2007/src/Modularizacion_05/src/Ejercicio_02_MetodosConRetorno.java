import java.util.Scanner;
/**
 * Métodos con retorno: operaciones básicas
 * @author Esteban Rocano
 */
public class Ejercicio_02_MetodosConRetorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double a = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double b = tcl.nextDouble();
        double suma = sumar(a, b);
        double resta = restar(a, b);
        double producto = multiplicar(a, b);
        double mayor = mayor(a, b);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Mayor: " + mayor);

        tcl.close();
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
    public static double mayor(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
/**
 * run:
Ingrese el primer numero: 5
Ingrese el segundo numero: 5
Suma: 10.0
Resta: 0.0
Producto: 25.0
Mayor: 5.0
BUILD SUCCESSFUL (total time: 6 seconds)
 */