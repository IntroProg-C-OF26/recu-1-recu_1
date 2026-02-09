
import java.util.Scanner;


public class Ejercicio06_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola, bienvenido");
                    break;

                case 2:
                    System.out.println("Funcionalidad no implementada");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

            System.out.println(); // línea en blanco para ordenar
        } while (opcion != 0);
    }
}
