
import java.util.Scanner;


/**
 *
 * @author Erick
 */

public class MetodosSinRetorno {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU MODULAR");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar tabla");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            opcion = tcl.nextInt();

            switch (opcion) {
                case 1:
                    mostrarSaludo();
                    break;
                case 2:
                    System.out.print("Ingrese el numero para la tabla: ");
                    int num = tcl.nextInt();
                    mostrarTabla(num);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 0);
    }

    public static void mostrarSaludo() {
        System.out.println(" Bienvenido al sistema modular.");
    }

    public static void mostrarTabla(int n) {
        System.out.println("Tabla del " + n + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}