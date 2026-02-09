import java.util.Scanner;
import java.util.Random; 
/**
 * Problema: Construya un menú:
Sumar
Reiniciar
Multiplicador
Dividir
Solicite al usuario una opción (1–4) y dos números (doble). Ejecute la operación 
y muestre el resultado.
 * @author Santiago Iñiguez
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random aleatorio = new Random();        
        int opcion;
        double n1, n2;
        System.out.println("- MENU DE OPERACIONES -");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        opcion = aleatorio.nextInt(4) + 1; 
        System.out.println("Opcion seleccionada : " + opcion);
        n1 = aleatorio.nextDouble() * 100;
        n2 = aleatorio.nextDouble() * 100;
        System.out.printf("Primer numero: %.2f \n", n1);
        System.out.printf("Segundo numero: %.2f \n", n2);
        double resultado;
        switch (opcion) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado Suma: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado Resta: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado Multiplicacion: " + resultado);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("No se puede dividir para cero");
                } else {
                    resultado = n1 / n2;
                    System.out.println("Resultado Division: " + resultado);
                }
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }
    }
}
/**
 * - MENU DE OPERACIONES -
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
Opcion seleccionada : 1
Primer numero: 68,49 
Segundo numero: 55,21 
Resultado Suma: 123.70219509399729
BUILD SUCCESSFUL (total time: 0 seconds)
 */