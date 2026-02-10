import java.util.Scanner;
/**
 * Mostrar un menú:
 * 1. Saludar  
 * 2. Mostrar fecha (solo texto: `Funcionalidad no implementada`)  
 * 0. Salir  
 * El menú debe repetirse hasta que el usuario elija 0.
 * @author ABEL
 */
public class Ejercicio06_MenuRept_DoWhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opc;
        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar Fecha");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = tcl.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Buenos Dias");
                    break;
                case 2:
                    System.out.println("Funcion No Implementada");
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opc != 0);
    }
}

/**
 * run:
==== MENU ====
1. Saludar
2. Mostrar Fecha
0. Salir
Seleccione una opcion: 1
Buenos Dias
==== MENU ====
1. Saludar
2. Mostrar Fecha
0. Salir
Seleccione una opcion: 2
Funcion No Implementada
==== MENU ====
1. Saludar
2. Mostrar Fecha
0. Salir
Seleccione una opcion: 0
Saliendo del programa
BUILD SUCCESSFUL (total time: 9 seconds)

 */