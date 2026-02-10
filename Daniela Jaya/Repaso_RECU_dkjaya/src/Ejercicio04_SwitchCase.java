import java.util.Scanner;

/**
 * Problema: Construya un menú:
Sumar
Restar
Multiplicar
Dividir
Solicite al usuario una opción (1–4) y dos números (double). Ejecute la operación y muestre el resultado.
 * @author Daniela
 */
public class Ejercicio04_SwitchCase {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        double num1, num2;
        System.out.println("Menu de operaciones:");
        System.out.println("1:Suma" + " 2:Resta" + " 3:Multiplicar" + " 4:Dividir");
        System.out.print("Elija una opcion (1-4): ");
        opcion = tcl.nextInt();
        System.out.print("Ingrese el primer numero: ");
        num1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = tcl.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1*num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1/num2));
                } else {
                    System.out.println("No se puede dividir para cero");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}

/**
 * run:
Menu de operaciones:
1:Suma 2:Resta 3:Multiplicar 4:Dividir
Elija una opcion (1-4): 4
Ingrese el primer numero: 50
Ingrese el segundo numero: 10
Resultado: 5.0
 */
