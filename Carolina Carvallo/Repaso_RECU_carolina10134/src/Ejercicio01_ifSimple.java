
import java.util.Scanner;


/**
 *En una plataforma virtual, si un estudiante entregó la tarea, el sistema 
 * muestra un mensaje de confirmación.
 * @author carolina carvallo 
 */
public class Ejercicio01_ifSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA (para completar en vivo)
        System.out.print("¿La tarea fue entregada? (true(si)/false(no)): ");
        boolean entregada = sc.nextBoolean();

        // PROCESO (IF SIMPLE)]
      // if (etregada==true){
        if (entregada) {
            System.out.println("Tarea aceptada");
            // TODO: mostrar mensaje de confirmación
        }

        // SALIDA
        // (No hay else: si no se cumple la condición, no se muestra nada)
    }
}

/**
 * run:
¿La tarea fue entregada? (true(si)/false(no)): true
Tarea entregada correctamente
BUILD SUCCESSFUL (total time: 4 seconds)
 */
