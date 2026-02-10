
/**
 *DoWhileBasico.java – Menú que se repite
Problema: Mostrar un menú:

Saludar
Mostrar fecha (solo texto: Funcionalidad no implementada)
Salir
El menú debe repetirse hasta que el usuario elija 0.

Requisitos:

Usar do-while.
Si opción inválida, mostrar Opción inválida.
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU DE OPCIONES" );
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Espero que tengas un gran dia.");
                    break;
                case 2:
                    System.out.println("Funcionalidad no implementada");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 0);

       
    }
}
    /***
     * RUN:
     * MENU DE OPCIONES
1. Saludar
2. Mostrar fecha
0. Salir
Elija una opcion: 2
Funcionalidad no implementada
MENU DE OPCIONES
1. Saludar
2. Mostrar fecha
0. Salir
Elija una opcion: 1
�Hola! Espero que tengas un gran dia.
MENU DE OPCIONES
1. Saludar
2. Mostrar fecha
0. Salir
Elija una opcion: 0
Saliendo del programa...
     */