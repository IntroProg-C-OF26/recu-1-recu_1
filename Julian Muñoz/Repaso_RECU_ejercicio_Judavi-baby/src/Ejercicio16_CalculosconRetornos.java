
import java.util.Scanner;


public class Ejercicio16_CalculosconRetornos {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Producto: " + multiplicar(num1, num2));
        System.out.println("Mayor: " + mayor(num1, num2));
    }
}
/**
 * run:
Ingrese el primer n�mero: 2
Ingrese el segundo n�mero: 3
Suma: 5.0
Resta: -1.0
Producto: 6.0
Mayor: 3.0
BUILD SUCCESSFUL (total time: 4 seconds)

* run:
Ingrese el primer n�mero: 3
Ingrese el segundo n�mero: 85
Suma: 88.0
Resta: -82.0
Producto: 255.0
Mayor: 85.0
BUILD SUCCESSFUL (total time: 1 second)

 */