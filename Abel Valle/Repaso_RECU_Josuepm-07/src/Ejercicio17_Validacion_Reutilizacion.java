import java.util.Scanner;
/**
 * Solicite una nota (0–100). Use métodos para:
 * - Leer y validar la nota
 * - Determinar estado: `Aprobado` (>=70) o `Reprobado`
 * @author ABEL
 */
public class Ejercicio17_Validacion_Reutilizacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota = leerNotaValida(tcl);
        String estado = obtenerEstado(nota);

        System.out.println("\nResultado:");
        System.out.println("Nota: " + nota);
        System.out.println("Estado: " + estado);
    }
    
    public static int leerNotaValida(Scanner tcl) {
        int nota;
        do {
            System.out.print("Ingrese una nota (0 a 100): ");
            nota = tcl.nextInt();

            if (nota < 0 || nota > 100) {
                System.out.println("Nota invalida, intente de nuevo: ");
            }
        } while (nota < 0 || nota > 100);
        return nota;
    }
    
    public static String obtenerEstado(int nota) {
        if (nota >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}

/**
 * run:
Ingrese una nota (0 a 100): 101
Nota invalida, intente de nuevo: 
Ingrese una nota (0 a 100): 69

Resultado:
Nota: 69
Estado: Reprobado
BUILD SUCCESSFUL (total time: 6 seconds)
 */