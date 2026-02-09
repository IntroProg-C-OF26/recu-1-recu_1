package Estructuras_Selectivas_01;
import java.util.Scanner;
/**
 * Solicite al usuario su edad (entero).  
 * Si la edad es **mayor o igual a 18**, muestre: `Acceso permitido`.  
 * Si no, no muestre nada adicional.
 * @author Esteban Rocano
 */
public class Ejercicio_01_IfSimple {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = tcl.nextInt();
        if(edad >= 18){
            System.out.println("Acceso permitido");
        }
    } 
}
/**
 * RUN:
 * Ingrese su edad
 * 19
 * Acceso permitido
 * BUILD SUCCESSFUL (total time: 7 seconds)
 */