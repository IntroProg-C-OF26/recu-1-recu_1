import java.util.Scanner;
/**
 * Paso de parámetros: validación y reutilización
 * @author Esteban Rocano
 */
public class Ejercicio_03_PasoParametros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = leerNotaValida(sc);
        String estado = obtenerEstado(nota);
        System.out.println("Nota: " + nota);
        System.out.println("Estado: " + estado);

        sc.close();
    }
    public static int leerNotaValida(Scanner sc) {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-100): ");
            nota = sc.nextInt();
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
Ingrese una nota (0-100): 90
Nota: 90
Estado: Aprobado
BUILD SUCCESSFUL (total time: 8 seconds)
 */