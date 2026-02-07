
import java.util.Scanner;


/**
 * Problema: Solicite al usuario su edad (entero).
Si la edad es mayor o igual a 18, muestre: Acceso permitido.
Si no, no muestre nada adicional.

Requisitos:

Validar que la edad sea >= 0. Si no lo es, mostrar Edad inválida.
Usar if simple (sin else para el caso “menor a 18”).
Ejemplo (entrada → salida):

18 → Acceso permitido
-2 → Edad inválida
 * @author Erick
 */
public class IfSimpleT {
    public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = tcl.nextInt(); 
        
        if (edad == 0) {
            System.out.println("Edad invalida");
        } else if ( edad >= 18) {
            System.out.println("Acceso Permitido");
                
        }  else 
            System.out.println("Menor a 18, Acceso Denegado");
    }
   
            
}
