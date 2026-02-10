/**
 * Ejercicio16:
 * Problema: Solicita 2 números y calcula:
suma
resto
producto
mayor (retornar el mayor)
Requisitos:
Implementar métodos con retorno:
sumar(double a, double b)
restar(double a, double b)
multiplicar(double a, double b)
mayor(double a, double b)
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio16_Calculos_con_retorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("ingrese dos numeros para que sean calculados: ");
        double num1 = tcl.nextDouble(), num2 = tcl.nextDouble();
        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Producto: " + multiplicar(num1, num2));
        System.out.println("Mayor: " + mayor(num1, num2));
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
        return (a > b) ? a : b; 
    }
}

/**
 * run:
ingrese dos numeros para que sean calculados: 
56
49
Suma: 105.0
Resta: 7.0
Producto: 2744.0
Mayor: 56.0
BUILD SUCCESSFUL (total time: 9 seconds)
 */