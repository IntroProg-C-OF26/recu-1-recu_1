
import java.util.Scanner;


/**
 *
 * @author Erick
 */
public class IfDoble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese una nota final (0/100)");
        int nota = tcl.nextInt(); 
        
        if (nota < 0 || nota > 100){
            System.out.println("Nota invalida");            
        } else if (nota >= 70) { 
            System.out.println("Aprobado");
            
        } else {
            System.out.println("Reprobado");
        }
    }
    
            
}
