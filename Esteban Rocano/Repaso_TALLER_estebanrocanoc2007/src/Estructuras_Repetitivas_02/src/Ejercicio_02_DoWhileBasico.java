import java.util.Scanner;
/**
 * Menú que se repite
 * Mostrar un menú:
 * 1. Saludar  
 * 2. Mostrar fecha (solo texto: `Funcionalidad no implementada`)  
 * 0. Salir  
 * El menú debe repetirse hasta que el usuario elija 0.
 * **Requisitos:**
 * Usar **do-while**.
 * Si opción inválida, mostrar `Opción inválida`.
 * @author Esteban Rocano
 */
public class Ejercicio_02_DoWhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = tcl.nextInt();
            if (opcion == 1) {
                System.out.println("Hola");
            } else if (opcion == 2) {
                System.out.println("Funcionalidad no implementada");
            } else if (opcion == 0) {
                System.out.println("Saliendo del programa");
            } else {
                System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }
}
