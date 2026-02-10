
import java.util.Scanner;

/**
 * PasoParametros.java – Validación y reutilización
Problema: Solicite una nota (0–100). Use métodos para:
Leer y validar la nota
Determinar estado: Aprobado (>=70) o Reprobado
 * Requisitos:
Métodos sugeridos:
leerNotaValida(Scanner sc) → retorna int válido
obtenerEstado(int nota) → retorna String
main solo orquesta y muestra.
 * @author Daniela
 */
public class Ejercicio17_PasoParametros {
        public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota = leerNota(tcl);
        String estado = obtenerEstado(nota);
        System.out.println("Nota registrada: " + nota);
        System.out.println("Estado: " + estado);
    }

    public static int leerNota(Scanner tcl) {
        int notta;
        do {
            System.out.print("Ingrese una nota (0-100): ");
            notta = tcl.nextInt();
            if (notta < 0 || notta > 100) {
                System.out.println("Error, Nota no valida.");
            }
        } while (notta < 0 || notta > 100);
        return notta;
    }

    public static String obtenerEstado(int nota) {
        if (nota >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}

/*
run:
Ingrese una nota (0-100): 99
Nota registrada: 99
Estado: Aprobado
*/