import java.util.Scanner;
/**
 * Menú modular con métodos sin retorno (void)
 * @author Esteban Rocano
 */
public class Ejercicio_01_MetodosSinRetorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar tabla de un numero");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = tcl.nextInt();

            if (opcion == 1) {
                mostrarSaludo();

            } else if (opcion == 2) {
                System.out.print("Ingrese un numero para la tabla: ");
                int n = tcl.nextInt();
                mostrarTabla(n);

            } else if (opcion == 0) {
                System.out.println("Saliendo del programa...");

            } else {
                System.out.println("Opción invalida");
            }

        } while (opcion != 0);

        tcl.close();
    }
    public static void mostrarSaludo() {
        System.out.println("Hola, bienvenido al programa");
    }
    public static void mostrarTabla(int n) {
        System.out.println("Tabla del " + n);
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
/**
 * RUN:
MENU
1. Mostrar saludo
2. Mostrar tabla de un numero
0. Salir
Seleccione una opcion: 0
Saliendo del programa...
BUILD SUCCESSFUL (total time: 13 seconds)
 */