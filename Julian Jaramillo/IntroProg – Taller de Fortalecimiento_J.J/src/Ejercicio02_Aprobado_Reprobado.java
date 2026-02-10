/**
 * Ejercicio02: Problema: Ingrese una nota final (0–100).
Si la nota es >= 70 , muestree Aprobado; caso contrario, Reprobado.

Requisitos:

Validar rango 0–100. Si no cumple, mostrar Nota inváliday terminar.
Usar if doble (if/else) .
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio02_Aprobado_Reprobado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese una nota final (0-100): ");
        int nota = tcl.nextInt();      
        if (nota >= 70 && nota <= 100)
            System.out.println("APROBADO");
        else if (nota <= 69 && nota >= 0)
            System.out.println("REPROBADO");
        else
            System.out.println("NOTA INVALIDA");
    }
}
/**
 * run:
Ingrese una nota final (0-100): 
85
APROBADO
BUILD SUCCESSFUL (total time: 2 seconds)
 */

/**
 * run:
Ingrese una nota final (0-100): 
45
REPROBADO
BUILD SUCCESSFUL (total time: 2 seconds)
 */

/**
 * run:
Ingrese una nota final (0-100): 
101
NOTA INVALIDA
BUILD SUCCESSFUL (total time: 7 seconds)
 */