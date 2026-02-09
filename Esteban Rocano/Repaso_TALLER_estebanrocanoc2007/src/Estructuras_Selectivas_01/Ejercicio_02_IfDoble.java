package Estructuras_Selectivas_01;
import java.util.Scanner;
/**
 * Validar que la edad sea **>= 0**. Si no lo es, mostrar `Edad inválida`.
 * Usar **if simple**.
 * @author Esteban Rocano
 */
public class Ejercicio_02_IfDoble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = tcl.nextInt();
        if (edad>= 0 && edad <= 18) {
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Edad invalida");
        }
    }
}
/**
 * RUN:
 * Ingrese su edad
 * 19
 * Edad invalida
 * BUILD SUCCESSFUL (total time: 4 seconds)
 */