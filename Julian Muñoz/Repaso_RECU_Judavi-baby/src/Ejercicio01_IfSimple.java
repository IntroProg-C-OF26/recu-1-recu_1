
import java.util.Scanner;

/**
 * En una plataforma virtual, si un estudiante entregó la tarea, el sistema 
 * muestra un mensaje de confirmación.
 * @author julian muñoz
 */
public class Ejercicio01_IfSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("La tarea fue entregada? (true/false): ");
        boolean entregada = sc.nextBoolean();
        
        if (entregada){
            System.out.println("Tarea receptada");
        }
    }
}
/**
 * run:
La tarea fue entregada? (true/false): 
true
Tarea receptada
BUILD SUCCESSFUL (total time: 3 seconds)

 */