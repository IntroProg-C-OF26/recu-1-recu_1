/**
 * Ejercicio17:
 * Problema: Solicite una nota (0–100). Utilice métodos para:
Leer y validar la nota
Determinar estado: Aprobado(>=70) oReprobado
Requisitos:
Métodos sugeridos:
leerNotaValida(Scanner sc)→ respuesta int válida
obtenerEstado(int nota)→ Cadena de retorno
mainsolo orquesta y muestra.
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio17_Validacion_y_Reutilizacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("deme una nota entre (0-100): ");
        int nota = leerNotaValida(tcl);
        System.out.println(obtenerEstado(nota));
    }
    public static int leerNotaValida(Scanner tcl) {
        int nota;
        do {
            nota = tcl.nextInt();
        } while (nota < 0 || nota > 100);
        return nota;
    }
    public static String obtenerEstado(int nota) {
        return (nota >= 70) ? "Aprobado" : "Reprobado";
    }
}

/**
 * run:
deme una nota entre (0-100): 
57
Reprobado
BUILD SUCCESSFUL (total time: 4 seconds)
 */

/**
 * run:
deme una nota entre (0-100): 
89
Aprobado
BUILD SUCCESSFUL (total time: 3 seconds)
 */