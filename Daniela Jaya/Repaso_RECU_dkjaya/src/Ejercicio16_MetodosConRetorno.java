
import java.util.Scanner;

/**
 * MetodosConRetorno.java – Cálculos con retorno
Problema: Solicite 2 números y calcule:
suma
resta
producto
mayor (retornar el mayor)
* Requisitos:
Implementar métodos con retorno:
sumar(double a, double b)
restar(double a, double b)
multiplicar(double a, double b)
mayor(double a, double b)
 * @author Daniela
 */
public class Ejercicio16_MetodosConRetorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double a, b;
        System.out.print("Ingresa el primer numero: ");
        a = tcl.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        b = tcl.nextInt();
        System.out.println("Suma: " + suma(a, b));
        System.out.println("Resta: " + resta(a , b));
        System.out.println("Multiplicacion: " + multiplicar(a , b));
        System.out.println("Numero mayor: " + mayor(a , b));
    }
    
    
    public static double suma(double a, double b) {
        double sum;
        sum = a + b;
        return sum;
    }
    
    public static double resta(double a, double b) {
        double rest;
        rest = a - b;
        return rest;
    }
    
    public static double multiplicar(double a, double b){
        double multi;
        multi = a * b;
        return multi;
    }
    
    public static double mayor(double a, double b) {
        if (a > b) {
            return a;
        } else
            return b;
    }
}

/*
run:
Ingresa el primer numero: 19
Ingresa el segundo numero: 7
Suma: 26.0
Resta: 12.0
Multiplicacion: 133.0
Numero mayor: 19.0
*/