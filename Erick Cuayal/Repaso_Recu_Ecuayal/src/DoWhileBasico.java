import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class DoWhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Saludar\n2. Mostrar fecha\n0. Salir");
            System.out.println ("Ingrese el número del menú: ");
            opcion = tcl.nextInt();

            if (opcion == 1) {
                System.out.println("Hola");
            } else if (opcion == 2) {
                System.out.println("Funcionalidad no implementada");
            } else if (opcion == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }
            
            System.out.println(); 

        } while (opcion != 0); 
    }
}