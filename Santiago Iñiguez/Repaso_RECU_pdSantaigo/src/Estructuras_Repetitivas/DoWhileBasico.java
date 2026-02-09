import java.util.Scanner;
/**
* Problema: Mostrar un menú:
Saludar
Mostrar fecha (solo texto: Funcionalidad no implementada)
Salir
El menú debe repetirse hasta que el usuario elija 0.
 * @author Santiago Iñiguez
 */
public class DoWhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al sistema.");
                    break;
                case 2:
                    System.out.println("Funcionalidad no implementada.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion inválida.");
                    break;
            }
        } while (opcion != 0); 
    }
}
/**
 * --- MENU DE OPCIONES ---
1. Saludar
2. Mostrar fecha
0. Salir
Seleccione una opcion: 1
Bienvenido al sistema.

--- MENU DE OPCIONES ---
1. Saludar
2. Mostrar fecha
0. Salir
Seleccione una opcion: 2
Funcionalidad no implementada.

--- MENU DE OPCIONES ---
1. Saludar
2. Mostrar fecha
0. Salir
Seleccione una opcion: 0
Saliendo del programa...
BUILD SUCCESSFUL (total time: 9 seconds)
 */