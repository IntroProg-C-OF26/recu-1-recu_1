
/**
 * En una plataforma virtual, si un estudiante entrega la tarea , el sistema muestra un mensaje de confirmación.
 * @author julian jaramillo
 */
import java.util.Scanner;
public class Ejercicio01_ifSimple {
    public static void main(String[] args) {        
        Scanner tcl = new Scanner(System.in);
        System.out.println("Si el estudiante entrego la tarea ponga TRUE caso contrario ponga FALSE: ");
        boolean est = tcl.nextBoolean();
        if (est)
            System.out.println("entrego la tarea");
        else
            System.out.println("no entrego la tarea");
    }
}
