
import java.util.Scanner;


/**
 *
 * @author Erick
 */
public class IFAnidado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
         System.out.println("Ingrese el puntaje (0/100): ");
         int puntaje = tcl.nextInt();
         
         if (puntaje < 0 || puntaje > 100){
             System.out.println("Puntaje invalido");
         } else if (puntaje >=90){
             System.out.println("Excelente");
         } else if ( puntaje >= 70 ){
             System.out.println("Bueno");
         } else 
             System.out.println("En proceso");
    }
}
