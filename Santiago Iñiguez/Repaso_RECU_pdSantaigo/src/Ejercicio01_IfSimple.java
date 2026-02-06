/**
 * En una plataforma virtual, si un estudiante entregó la tarea, el sistema 
 * muestra un mensaje de confirmación.
 * @author Daniel Irene
 */
import java.util.Scanner;

public class Ejercicio01_IfSimple {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("La tarea fue entregada? (true/false): ");
        boolean entregada = tcl.nextBoolean();
        if (entregada) {
            System.out.println("Tarea entregada");
        }
    }
}