
import java.util.Scanner;


/**
 * 1) IfSimple.java – Control de acceso por edad
Problema: Solicite al usuario su edad (entero).
Si la edad es mayor o igual a 18, muestre: Acceso permitido.
Si no, no muestre nada adicional.

Requisitos:

Validar que la edad sea >= 0. Si no lo es, mostrar Edad inválida.
Usar if simple (sin else para el caso “menor a 18”).
 * @author Daniela
 */
public class Ejercicio01_IfSimple {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        String msj = "";
        System.out.println("Ingrese su edad");
        edad = tcl.nextInt();
        if (edad >= 18) {
            msj = "Acceso Permitido";
        } else 
            if (edad < 0) {
            msj = "Edad invalida";
        }
        if (edad < 18 && edad > 0) {
            msj = "Menor a 18";
        }
        System.out.println(msj);
    }
}

/**
run:
Ingrese su edad
19
Acceso Permitido
 */
