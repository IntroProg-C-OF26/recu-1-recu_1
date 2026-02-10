/**
 * En una plataforma virtual, si un estudiante entregó la tarea, el sistema 
 * muestra un mensaje de confirmación.
 * @author Abel Josue
 */
import java.util.Scanner;

public class Ejercicio_01_IFSIMPLE {

    public static void main(String[] args) {
        boolean entregada;
        Scanner sc = new Scanner(System.in);

        // ENTRADA (para completar en vivo)
        System.out.print("¿La tarea fue entregada? (true (SI) /false (NO) ): ");
        entregada = sc.nextBoolean();

        // PROCESO (IF SIMPLE)
        if (entregada) {
            System.out.println("Tarea receptada ");
        }

        // SALIDA
        // (No hay else: si no se cumple la condición, no se muestra nada)
    }
}

/**
 * run:
�La tarea fue entregada? (true (SI) /false (NO) ): true
Tarea receptada 
BUILD SUCCESSFUL (total time: 3 seconds)
 */