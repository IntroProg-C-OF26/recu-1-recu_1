/**
 * Ejercicio01: Solicite al usuario su edad (entero).
Si la edad es mayor o igual a 18 , muestre: Acceso permitido.
Si no, no muestre nada adicional.
 * @author julian jaramillo
 */
import java.util.Scanner;
public class Ejercicio01_Control_de_acceso_por_edad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        int edad = tcl.nextInt();
        if (edad >= 18)
            System.out.println("Acceso permitido");
        if (edad < 0)
            System.out.println("Edad invalida");
    }
}
/**
 * run:
Ingrese la edad: 
20
Acceso permitido
BUILD SUCCESSFUL (total time: 3 seconds)
 */

/**
 * run:
Ingrese la edad: 
16
BUILD SUCCESSFUL (total time: 3 seconds)
 */

/**
 * run:
Ingrese la edad: 
-1
Edad invalida
BUILD SUCCESSFUL (total time: 3 seconds)
 */