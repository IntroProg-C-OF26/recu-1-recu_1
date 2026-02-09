
/**
 *4) SwitchCase.java – Menú de opciones (operación con 2 números)
 * Problema: Construya un menú:
 *
 * Sumar
 * Restar
 * Multiplicar
 * Dividir
 * Solicite al usuario una opción (1–4) y dos números (double). Ejecute la operación y muestre el resultado.
 *
 * Requisitos:
 *
 * Usar switch-case.
 * En división, si el segundo número es 0, mostrar No se puede dividir para cero.
 * Si opción inválida, mostrar Opción inválida.
 * Ejemplo:
 *
 * Opción 1, números 5 y 3 → Resultado: 8
 *
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2;
        double resultado;
        System.out.println("Elija la opcion: ");
        opcion = sc.nextInt();
        System.out.println("Ingrese el numero1:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el numero2:");
        num2 = sc.nextDouble();
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir para cero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Opción inválida");
        }
    }
}
/***
 * RUN:
 * Elija la opcion: 
4
Ingrese el numero1:
10
Ingrese el numero2:
0
No se puede dividir para cero
* 
* Elija la opcion: 
3
Ingrese el numero1:
10
Ingrese el numero2:
9
Resultado: 90.0
 */