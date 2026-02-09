import java.util.Random;
/**
 *Problema: Solicite al usuario su edad (entero).
Si la edad es mayor o igual a 18 , muestre: Acceso permitido.
Si no, no muestre nada adicional.
 * @author Santiago Iñiguez
 */
public class IfSimple {
    public static void main(String[] args) {
        Random ale = new Random();
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = ale.nextInt();
        if (edad < 0) {
            System.out.println("Edad invalida");
        }
        if (edad >= 18) {
            System.out.println("Acceso permitido");
        }
    }
}
/**
 * run:
Ingrese su edad: Acceso permitidoBUILD 
SUCCESSFUL (total time: 0 seconds)
* run:
Ingrese su edad: Edad invalida
BUILD SUCCESSFUL (total time: 0 seconds)
 */

