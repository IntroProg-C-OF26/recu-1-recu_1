import java.util.Scanner;

/**
 *
 * @author ABEL
 */
public class Ejercicio01_IfSimple {
     public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("ingrese su edad: ");
        int edad = tcl.nextInt();
        
        if (edad >= 18) {
            System.out.println("edad permitida ");       
        }      
        if (edad < 0) {
            System.out.println("Edad invalida ");
        }
    }
}
   
