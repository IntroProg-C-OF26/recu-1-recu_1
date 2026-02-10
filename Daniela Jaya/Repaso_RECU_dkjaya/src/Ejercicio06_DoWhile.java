
import java.util.Scanner;

/**
 * DoWhileBasico.java – Menú que se repite
Problema: Mostrar un menú:
Saludar
Mostrar fecha (solo texto: Funcionalidad no implementada)
Salir
El menú debe repetirse hasta que el usuario elija 0.
Requisitos:
Usar do-while.
Si opción inválida, mostrar Opción inválida.
 * @author Daniela
 */
public class Ejercicio06_DoWhile {
        public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String mensaje = "";
        int opcion;
        do {
            System.out.println("1 -> Saludar");
            System.out.println("2 -> Mostrar fecha");
            System.out.println("0 -> Salir");
            System.out.print("Elija una opcion: ");
            opcion = tcl.nextInt();
            if (opcion == 1) {
                mensaje = "Saludar";
            } else if (opcion == 2) {
                mensaje = "Funcionalidad implementada";
            } else if (opcion == 0) {
                mensaje = "Salir";
            } else {
                mensaje = "Opcion invalida";
            }
            System.out.println(mensaje);
        } while (opcion != 0);
    }
}

/*
run:
1 -> Saludar
2 -> Mostrar fecha
0 -> Salir
Elija una opcion: 1
Saludar
1 -> Saludar
2 -> Mostrar fecha
0 -> Salir
Elija una opcion: 2
Funcionalidad implementada
1 -> Saludar
2 -> Mostrar fecha
0 -> Salir
Elija una opcion: 0
Salir
*/