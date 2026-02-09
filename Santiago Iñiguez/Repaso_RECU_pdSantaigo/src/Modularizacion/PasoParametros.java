import java.util.Scanner;
/**
 *15) MetodosSinRetorno.java– Menú modular (vacío)
Problema: Implementar un menú con opciones que llamen a métodos void :
Mostrar saludo
Mostrar tabla de un número (1..12)
Salir
 * @author Santaigo Iñiguez
 * @version 1.0
 */
public class PasoParametros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENU MODULAR ---");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar tabla de multiplicar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = tcl.nextInt();

            switch (opcion) {
                case 1:
                    mostrarSaludo();
                    break;
                case 2:
                    System.out.print("¿Que tabla desea ver? (1-12): ");
                    int num = tcl.nextInt();
                    mostrarTabla(num);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opcion != 3);  
        tcl.close();
    }
    public static void mostrarSaludo() {
        System.out.println("\n Hola Bienvenido.");
    }
    public static void mostrarTabla(int n) {
        System.out.println("\nTabla del " + n + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
/**
 * run:

--- MENU MODULAR ---
1. Mostrar saludo
2. Mostrar tabla de multiplicar
3. Salir
Seleccione una opcion: 1

 Hola Bienvenido.

--- MENU MODULAR ---
1. Mostrar saludo
2. Mostrar tabla de multiplicar
3. Salir
Seleccione una opcion: 2
�Que tabla desea ver? (1-12): 3

Tabla del 3:
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
3 x 11 = 33
3 x 12 = 36

--- MENU MODULAR ---
1. Mostrar saludo
2. Mostrar tabla de multiplicar
3. Salir
Seleccione una opcion: 3
Saliendo del programa...
BUILD SUCCESSFUL (total time: 14 seconds)
 */
