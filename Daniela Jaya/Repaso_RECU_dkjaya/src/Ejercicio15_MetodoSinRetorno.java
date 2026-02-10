
import java.util.Scanner;


/**
 * MetodosSinRetorno.java – Menú modular (void)
Problema: Implementar un menú con opciones que llamen a métodos void:
Mostrar saludo
Mostrar tabla de un número (1..12)
Salir
 * Requisitos:
Crear métodos:
mostrarSaludo()
mostrarTabla(int n)
main controla el menú y llama a métodos.
 * @author Daniela
 */
public class Ejercicio15_MetodoSinRetorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU MODULAR");
            System.out.println("1 -> Mostrar saludo");
            System.out.println("2 -> Mostrar tabla");
            System.out.println("0 -> Salir");
            System.out.print("Elija una opcion: ");
            opcion = tcl.nextInt();

            switch (opcion) {
                case 1:
                    saludo();
                    break;
                case 2:
                    System.out.print("Ingrese el numero de la tabla que desea ");
                    int num = tcl.nextInt();
                    tabla(num);
                    break;
                case 0:
                    System.out.println("Salio del menu");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 0);
    }
    
    public static void saludo() {
        System.out.println("BIENVENIDO AL MENU MODULAR");
    }
    
    public static void tabla(int num) {
        System.out.println("Tabla del " + num);
        for (int i = 1; i <= 12; i++) {
            System.out.println(num +" * " + i +" = " + (num*i));
        }
    }
}

/*
run:
MENU MODULAR
1 -> Mostrar saludo
2 -> Mostrar tabla
0 -> Salir
Elija una opcion: 1
BIENVENIDO AL MENU MODULAR

MENU MODULAR
1 -> Mostrar saludo
2 -> Mostrar tabla
0 -> Salir
Elija una opcion: 2
Ingrese el numero de la tabla que desea 5
Tabla del 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
5 * 11 = 55
5 * 12 = 60

MENU MODULAR
1 -> Mostrar saludo
2 -> Mostrar tabla
0 -> Salir
Elija una opcion: 0
Salio del menu

*/