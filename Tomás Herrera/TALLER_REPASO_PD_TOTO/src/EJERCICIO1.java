

/**
 *1) IfSimple.java – Control de acceso por edad
Problema: Solicite al usuario su edad (entero).
Si la edad es mayor o igual a 18, muestre: Acceso permitido.
Si no, no muestre nada adicional.

Requisitos:

Validar que la edad sea >= 0. Si no lo es, mostrar Edad inválida.
Usar if simple (sin else para el caso “menor a 18”).
Ejemplo (entrada → salida):

18 → Acceso permitido
-2 → Edad inválida
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
        System.out.println("Ingrese la edad: ");
        Scanner sc = new Scanner(System.in);

        int edad = sc.nextInt();
        boolean esMayor = edad >= 18;

        if (edad < 0) {
            System.out.println("Edad inválida");
        }
        
       
    }
}
/***
 * RUN:
 * Ingrese su edad: 
19
Acceso permitido
BUILD SUCCESSFUL (total time: 2 seconds)
* 
* Ingrese su edad: 
0
Edad inv�lida
BUILD SUCCESSFUL (total time: 1 second)
 */