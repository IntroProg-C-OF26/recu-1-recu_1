/**
 * Ejercicio04: 
 * Problema: Construya un menú:
Sumar
Reiniciar
Multiplicador
Dividir
Solicite al usuario una opción (1–4) y dos números (doble). Ejecute la operación y muestre el resultado.
Requisitos:
Usar switch-case .
En división, si el segundo número es 0, mostrar No se puede dividir para cero.
Si opción inválida, mostrar Opción inválida.
 * @author julian jaramillo
 */
import java.util.Scanner;
public class Ejercicio04_Menú_de_opciones {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese una opcion (1-4): ");
        int opcion = tcl.nextInt();
        System.out.println("Digame dos numeros para la operacion: ");
        double num1 = tcl.nextDouble(), num2 = tcl.nextDouble();
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2: 
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3: 
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4: 
                if (num2 == 0) {
                    System.out.println("No se puede dividir para cero");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
/**
 * run:
Ingrese una opcion (1-3): 
2
Digame dos numeros para la operacion: 
23 4
Resultado: 19.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */

/**
 * run:
Ingrese una opcion (1-3): 
1
Digame dos numeros para la operacion: 
500 78
Resultado: 578.0
BUILD SUCCESSFUL (total time: 5 seconds)
 */

/**
 * run:
Ingrese una opcion (1-3): 
3
Digame dos numeros para la operacion: 
46 58
Resultado: 2668.0
BUILD SUCCESSFUL (total time: 7 seconds)
 */

/**
 * run:
Ingrese una opcion (1-4): 
4
Digame dos numeros para la operacion: 
59 0
No se puede dividir para cero
 */

/**
 * run:
Ingrese una opcion (1-4): 
4
Digame dos numeros para la operacion: 
28 4
Resultado: 7.0
BUILD SUCCESSFUL (total time: 5 seconds)
 */