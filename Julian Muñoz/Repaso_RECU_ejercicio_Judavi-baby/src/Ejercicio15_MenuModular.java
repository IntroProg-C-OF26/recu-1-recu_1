
import java.util.Scanner;


public class Ejercicio15_MenuModular {
    public static void mostrarSaludo() {
        System.out.println("Hola, bienvenido");
    }

    public static void mostrarTabla(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar tabla de un número");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarSaludo();
                    break;

                case 2:
                    System.out.print("Ingrese un número: ");
                    int n = sc.nextInt();
                    mostrarTabla(n);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }
}
