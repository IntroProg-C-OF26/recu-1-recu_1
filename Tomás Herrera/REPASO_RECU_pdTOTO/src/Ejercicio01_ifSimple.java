/**
 * En una plataforma virtual, si un estudiante entregó la tarea, el sistema 
 * muestra un mensaje de confirmación.
 * @author Tomás Herrera
 */
import java.util.Scanner;

public class Ejercicio01_ifSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA (para completar en vivo)
        System.out.print("¿La tarea fue entregada? (true/false): ");
        boolean entregada = sc.nextBoolean();

        // PROCESO (IF SIMPLE)
        if (entregada) {
            System.out.println("Tarea fue entregada");
            
            // TODO: mostrar mensaje de confirmación
        }
        
        // SALIDA
        // (No hay else: si no se cumple la condición, no se muestra nada)
    }
}
/***
 * run: run:
�La tarea fue entregada? (true/false): true
Tarea fue entregada
BUILD SUCCESSFUL (total time: 3 seconds)

 */