/**
 * En una plataforma virtual, si un estudiante entregó la tarea, el sistema 
 * muestra un mensaje de confirmación.
 * @author Daniela Jaya
 */
import java.util.Scanner;
public class ZEjercicio01_IfSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA (para completar en vivo)
        System.out.print("¿La tarea fue entregada? (true/false): ");
        boolean entregada = sc.nextBoolean();

        // PROCESO (IF SIMPLE)
        if (entregada) {
            System.out.println("La tarea fue entregada");
        }

        // SALIDA
        // (No hay else: si no se cumple la condición, no se muestra nada)
    }
    
}

/*
run:
�La tarea fue entregada? (true/false): true
La tarea fue entregada
*/