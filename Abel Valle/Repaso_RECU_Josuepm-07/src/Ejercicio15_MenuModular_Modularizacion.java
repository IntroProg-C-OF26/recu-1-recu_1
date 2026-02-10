import java.util.Scanner;
/**
 * Implementar un menú con opciones que llamen a métodos **void**:
 * 1. Mostrar saludo
 * 2. Mostrar tabla de un número (1..12)
 * 0. Salir
 * @author ABEL
 */
public class Ejercicio15_MenuModular_Modularizacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\t==== MENU ====");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar tabla de un numero");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = tcl.nextInt();

            switch (opcion) {
                case 1:
                    mostrarSaludo();
                    break;

                case 2:
                    System.out.print("Ingrese un numero: ");
                    int n = tcl.nextInt();
                    mostrarTabla(n);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }
    
    public static void mostrarSaludo() {
        System.out.println(" Bienvenido al programa ");
    }
    
    public static void mostrarTabla(int n) {
        System.out.println("Tabla del " + n + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

/**
 * run:
	==== MENU ====
1. Mostrar saludo
2. Mostrar tabla de un numero
0. Salir
Seleccione una opcion: 1
 Bienvenido al programa 
	==== MENU ====
1. Mostrar saludo
2. Mostrar tabla de un numero
0. Salir
Seleccione una opcion: 2
Ingrese un numero: 9
Tabla del 9:
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
9 x 10 = 90
9 x 11 = 99
9 x 12 = 108
	==== MENU ====
1. Mostrar saludo
2. Mostrar tabla de un numero
0. Salir
Seleccione una opcion: 0
Saliendo del programa...
BUILD SUCCESSFUL (total time: 12 seconds)
 */