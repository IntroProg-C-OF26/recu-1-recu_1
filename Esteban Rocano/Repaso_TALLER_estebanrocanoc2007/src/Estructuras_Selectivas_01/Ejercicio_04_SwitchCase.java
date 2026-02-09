package Estructuras_Selectivas_01;
import java.util.Scanner;
/**
 * Menú de opciones (operación con 2 números)
 * Construya un menú:
 * 1. Sumar  2. Restar  3. Multiplicar  4. Dividir  
 * Solicite al usuario una opción (1–4) y dos números (double). 
 * Ejecute la operación y muestre el resultado.
 * **Requisitos:**
 * Usar **switch-case**.
 * En división, si el segundo número es 0, mostrar `No se puede dividir para cero`.
 * Si opción inválida, mostrar `Opción inválida`.
 * @author Esteban Rocano
 */
public class Ejercicio_04_SwitchCase {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("MENU DE OPERACIONES");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opcion (1-4): ");
        int opcion = tcl.nextInt();
        System.out.print("Ingrese el primer numero: ");
        double num1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = tcl.nextDouble();
        double resultado;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicacion: " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir para cero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado de la division: " + resultado);
                }
                break;
            default:
                System.out.println("Opción invalida");
        }
        sc.close();
    }
}
/**
 * run:
 * MENU DE OPERACIONES
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * Seleccione una opcion (1-4): 1
 * Ingrese el primer numero: 2
 * Ingrese el segundo numero: 2
 * Resultado de la suma: 4.0
 * BUILD SUCCESSFUL (total time: 12 seconds)
 */