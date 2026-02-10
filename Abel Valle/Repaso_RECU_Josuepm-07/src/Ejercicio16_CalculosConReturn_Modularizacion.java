
import java.util.Scanner;

/**
 * Solicite 2 números y calcule:
 * - suma
 * - resta
 * - producto
 * - mayor (retornar el mayor)
 * @author ABEL
 */
public class Ejercicio16_CalculosConReturn_Modularizacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = tcl.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = tcl.nextDouble();

        double suma = sumar(num1, num2);
        double resta = restar(num1, num2);
        double producto = multiplicar(num1, num2);
        double NumMayor = RetornarElmayor(num1, num2);

        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Mayor: " + NumMayor);
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
    
    public static double RetornarElmayor(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

/**
 * run:
Ingrese el primer numero: 5,5
Ingrese el segundo numero: 4,2

Resultados:
Suma: 9.7
Resta: 1.2999999999999998
Producto: 23.1
Mayor: 5.5
BUILD SUCCESSFUL (total time: 7 seconds)
 */