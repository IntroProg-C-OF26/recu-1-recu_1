
import java.util.Scanner;

/**
 *Implementar un menú con opciones que llamen a métodos **void**:
1. Mostrar saludo
2. Mostrar tabla de un número (1..12)
0. Salir
 * @author carolina carvallo
 */
public class Ejercicio15_MenuModular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("\n---menu de opciones---");
            System.out.println("1. mostrar la salud");
            System.out.println("2. mostrar tabla de un numeero");
            System.out.println("0. salir del programa");
            System.out.print("seleccione una opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    mostrarSaludo();
                    break;
                case 2:
                    System.out.println("de que numero quieres la tabla");
                    int num = sc.nextInt();
                    if (num >= 1 && num <= 12){
                        mostrarTabla(num); 
                    }else {
                        System.out.println("numero fuera del rango");
                    }
                    break;
                case 0:
                    System.out.println("programa terminado");
                    break;    
                default:
                    System.out.println("opcion invalida");
                    break;
            }         
        }while (opcion != 0);
  }    
        
    public static void mostrarSaludo() {
            System.out.println("\n----------------");
            System.out.println("--    HOLAA   --");
            System.out.println("-- BIENVENID@S--");
            System.out.println("----------------");
        }
    public static void mostrarTabla(int n ){       
        System.out.println("\n tabla del " + n + "---");
        for (int i = 0; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
/*
run:

---menu de opciones---
1. mostrar la salud
2. mostrar tabla de un numeero
0. salir del programa
seleccione una opcion: 1

----------------
--    HOLAA   --
-- BIENVENID@S--
----------------

---menu de opciones---
1. mostrar la salud
2. mostrar tabla de un numeero
0. salir del programa
seleccione una opcion: 2
de que numero quieres la tabla
2

 tabla del 2---
2 x 0 = 0
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
2 x 11 = 22

---menu de opciones---
1. mostrar la salud
2. mostrar tabla de un numeero
0. salir del programa
seleccione una opcion: 0
programa terminado
BUILD SUCCESSFUL (total time: 12 seconds)
*/