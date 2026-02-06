/**
 * En una plataforma virtual, si un estudiante entregó la tarea, el sistema 
 * muestra un mensaje de confirmación.
 * @author Esteban Rocano
 */
import java.util.Scanner;

public class Ejercicio01_IfSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA (para completar en vivo)
        System.out.print("¿La tarea fue entregada? (true (Si) /false (No)): ");
        boolean entregada = sc.nextBoolean();
       if (entregada) {
            System.out.println("Tarea receptada");
        }
        // SALIDA
        // (No hay else: si no se cumple la condición, no se muestra nada)
    }
}