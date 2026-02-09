
import java.util.Scanner;

/**
 *Mostrar un menú:
1. Saludar  
2. Mostrar fecha (solo texto: `Funcionalidad no implementada`)  
0. Salir  

El menú debe repetirse hasta que el usuario elija 0.
 * @author carolina carvallo
 */
public class Ejercicio06_MenúQueRepite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones;
        
        do {
            System.out.println("-----MANU-----");
            System.out.println("1. saludar");
            System.out.println("2. mostrar fecha");
            System.out.println("0. salir");
            System.out.println("Elige una opcion: ");
            opciones = sc.nextInt();
                   
        
            switch (opciones) {
                case 1:
                    System.out.println("Hola te mando un saludo");
                    break;
                case 2:
                    System.out.println("fecha actual");
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                                    
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        } while (opciones != 0);
    }
}
/**
 * run:
-----MANU-----
1. saludar
2. mostrar fecha
0. salir
Elige una opcion: 
1
Hola te mando un saludo
-----MANU-----
1. saludar
2. mostrar fecha
0. salir
Elige una opcion: 
2
fecha actual
-----MANU-----
1. saludar
2. mostrar fecha
0. salir
Elige una opcion: 
6
OPCION INVALIDA
-----MANU-----
1. saludar
2. mostrar fecha
0. salir
Elige una opcion: 
0
Programa finalizado
 */