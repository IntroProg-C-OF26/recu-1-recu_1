/**
 * En una plataforma virtual, si un estudiante entregó la tarea, el sistema 
 * muestra un mensaje de confirmación.
 * @author Toto1
 */
import java.util.Scanner;

public class Ejercicio01_ifsimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("¿La tarea fue entregada? (true (SI) / false (NO) ): ");
        boolean entregada = sc.nextBoolean();

        
        if (entregada) {
            System.out.println("Tarea fue entregada");
        }

       
    }
}
/***
 * run:
 * �La tarea fue entregada? (true (SI) / false (NO) ): true
Tarea fue entregada
 */