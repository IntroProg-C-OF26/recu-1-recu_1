
/**
 * Ejercicio15:
 * Problema: Implementar un menú con opciones que llamen a métodos void :
 * Mostrar saludo
 * Mostrar tabla de un número (1..12)
 * Salir
 * Requisitos:
 * Crear métodos:
 * mostrarSaludo()
 * mostrarTabla(int n)
 * maincontrola el menú y llama a métodos.
 *
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio15_Menu_Modular {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("ingrese un numero (0-2): ");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar tabla");
            System.out.println("0. Salir");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1 :
                    mostrarSaludo();
                case 2 : {
                    System.out.println("Ingrese un numero:");
                    int n = tcl.nextInt();
                    mostrarTabla(n);
                }
                case 0 :
                    System.out.println("Saliendo");
                default :
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }
    public static void mostrarSaludo() {
        System.out.println("Holaaa!!!!!");
    }
    public static void mostrarTabla(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
/**
 * run:
ingrese un numero (0-2): 
1. Saludar
2. Mostrar tabla
0. Salir
1
Holaaa!!!!!
ingrese un numero (0-2): 
1. Saludar
2. Mostrar tabla
0. Salir
2
Ingrese un numero:
4
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
4 x 4 = 16
4 x 5 = 20
4 x 6 = 24
4 x 7 = 28
4 x 8 = 32
4 x 9 = 36
4 x 10 = 40
4 x 11 = 44
4 x 12 = 48
ingrese un numero (0-2): 
1. Saludar
2. Mostrar tabla
0. Salir
0
Saliendo
BUILD SUCCESSFUL (total time: 21 seconds)
 */
