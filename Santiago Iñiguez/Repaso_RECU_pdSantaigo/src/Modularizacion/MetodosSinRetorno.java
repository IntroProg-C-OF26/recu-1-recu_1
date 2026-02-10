import java.util.Scanner;
/**
 *16) MetodosConRetorno.java– Cálculos con retorno
Problema: Solicita 2 números y calcula:
suma
resto
producto
mayor (retornar el mayor)
 * @author Santiago Iñiguez
 */
public class MetodosSinRetorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double n1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = tcl.nextDouble();
        double suma = sumar(n1, n2);
        double resta = restar(n1, n2);
        double prod = multiplicar(n1, n2);
        double numMayor = mayor(n1, n2);
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resto (Resta): " + resta);
        System.out.println("Producto: " + prod);
        System.out.println("El numero mayor es: " + numMayor);
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
Ingrese el primer numero: 1
Ingrese el segundo numero: 3

--- RESULTADOS ---
Suma: 4.0
Resto (Resta): -2.0
Producto: 3.0
El numero mayor es: 3.0
BUILD SUCCESSFUL (total time: 16 seconds)
 */