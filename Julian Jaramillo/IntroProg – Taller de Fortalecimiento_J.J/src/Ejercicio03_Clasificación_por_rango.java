/**
 * Ejercicio03: 
 * Problema: Ingrese un puntaje (0–100) y clasifique:

90–100:Excelente
70–89:Bueno
0–69:En proceso
Requisitos:

Validar rango 0–100.
Usar if anidado (mínimo 2 niveles).
No usar interruptor.
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio03_Clasificación_por_rango {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese un puntaje (0-100)");
        int puntaje = tcl.nextInt();
        if (puntaje < 0 || puntaje > 100) {
            System.out.println("Puntaje invalido");
        } else {
            if (puntaje >= 90) {
                System.out.println("Excelente");
            } else {
                if (puntaje >= 70) {
                    System.out.println("Bueno");
                } else {
                    System.out.println("En proceso");
                }
            }
        }
    }
}
/**
 * run:
Ingrese un puntaje (0-100)
50
En proceso
BUILD SUCCESSFUL (total time: 3 seconds)
 */

/**
 * run:
Ingrese un puntaje (0-100)
86
Bueno
BUILD SUCCESSFUL (total time: 3 seconds)
 */

/**
 * run:
Ingrese un puntaje (0-100)
99
Excelente
BUILD SUCCESSFUL (total time: 6 seconds)

 */