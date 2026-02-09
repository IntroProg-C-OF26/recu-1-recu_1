
import java.util.Scanner;


public class Ejercicio17_ValitacionyReutilizacion {
     public static int leerNotaValida(Scanner sc) {
        int nota;

        do {
            System.out.print("Ingrese una nota (0-100): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida, intente nuevamente.");
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota = leerNotaValida(sc);
        String estado = obtenerEstado(nota);

        System.out.println("Estado: " + estado);
    }
}
