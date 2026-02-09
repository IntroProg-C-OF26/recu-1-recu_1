/*
 * MetodosConRetorno.java – Cálculos con retorno
Problema: Solicite 2 números y calcule:

suma
resta
producto
mayor (retornar el mayor)
Requisitos:

Implementar métodos con retorno:
sumar(double a, double b)
restar(double a, double b)
multiplicar(double a, double b)
mayor(double a, double b)
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese Num A: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese Num B: ");
        double b = sc.nextDouble();

        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Producto: " + multiplicar(a, b));
        System.out.println("Mayor: " + mayor(a, b));
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
        if (a > b) return a;
        else return b;
    }
}
/***
 * RUN:
 * Ingrese Num A: 12
Ingrese Num B: 24
Suma: 36.0
Resta: -12.0
Producto: 288.0
Mayor: 24.0
* 
* Ingrese Num A: -23
Ingrese Num B: 32,8
Suma: 9.799999999999997
Resta: -55.8
Producto: -754.4
Mayor: 32.8
 */