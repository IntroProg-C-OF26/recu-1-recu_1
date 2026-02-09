
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
/**
 * run:

Men�:
1. Mostrar saludo
2. Mostrar tabla de un n�mero
0. Salir
Ingrese una opci�n: 1
Hola, bienvenido

Men�:
1. Mostrar saludo
2. Mostrar tabla de un n�mero
0. Salir
Ingrese una opci�n: 0
Saliendo del programa...
BUILD SUCCESSFUL (total time: 3 seconds)

* run:

Men�:
1. Mostrar saludo
2. Mostrar tabla de un n�mero
0. Salir
Ingrese una opci�n: 2
Ingrese un n�mero: 1
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
1 x 6 = 6
1 x 7 = 7
1 x 8 = 8
1 x 9 = 9
1 x 10 = 10
1 x 11 = 11
1 x 12 = 12

Men�:
1. Mostrar saludo
2. Mostrar tabla de un n�mero
0. Salir
Ingrese una opci�n: 0
Saliendo del programa...
BUILD SUCCESSFUL (total time: 6 seconds)

 */