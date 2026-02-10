import java.util.Scanner;
/**
 *17) PasoParametros.java– Validación y reutilización
Problema: Solicite una nota (0–100). Utilice métodos para:
Leer y validar la nota
Determinar estado: Aprobado(>=70) oReprobado
 * @author Santiago Iñiguez
 */
public class MetodosConRetorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota = leerNotaValida(tcl);
        String estado = obtenerEstado(nota);
        System.out.println("\n------------------------------");
        System.out.println("Nota registrada: " + nota);
        System.out.println("Estado del estudiante: " + estado);
        System.out.println("------------------------------");
        tcl.close();
    }
    public static int leerNotaValida(Scanner tcl) {
        int n;
        do {
            System.out.print("Ingrese la nota (0-100): ");
            n = tcl.nextInt();        
            if (n < 0 || n > 100) {
                System.out.println("Error: La nota debe estar entre 0 y 100.");
            }
        } while (n < 0 || n > 100);       
        return n;
    }
    public static String obtenerEstado(int nota) {
        if (nota >= 70) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }
}
/**
 * run:
Ingrese la nota (0-100): 56

------------------------------
Nota registrada: 56
Estado del estudiante: REPROBADO
------------------------------
BUILD SUCCESSFUL (total time: 4 seconds)
 */