
/**
 * Ejercicio06:
 * Problema: Mostrar un menú:
Saludar
Mostrar fecha (solo texto: Funcionalidad no implementada)
Salir
El menú debe repetirse hasta que el usuario elija 0.
Requisitos:
Usar do-while .
Si opción inválida, mostrar Opción inválida.
 * @author julian jaramillo 
 */

import java.util.Scanner;
public class Ejercicio06_Menu_que_se_repite {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {            
            System.out.println("MENU:");
            System.out.println("1. Saludar");
            System.out.println("2. mostrar fecha");
            System.out.println("0. salir");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("HOLA, SALUDOS!!");
                    break;
                case 2:
                    System.out.println("FUNCIONALIDAD NO IMPLEMENTADA");
                    break;
                case 0:
                    System.out.println("SALIENDO DEL PROGRAMA");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (opcion != 0);
    }
}
/**
 * run:
MENU:
1. Saludar
2. mostrar fecha
0. salir
1
HOLA, SALUDOS!!
MENU:
1. Saludar
2. mostrar fecha
0. salir
2
FUNCIONALIDAD NO IMPLEMENTADA
MENU:
1. Saludar
2. mostrar fecha
0. salir
3
opcion no valida
MENU:
1. Saludar
2. mostrar fecha
0. salir
0
SALIENDO DEL PROGRAMA
BUILD SUCCESSFUL (total time: 16 seconds)
 */