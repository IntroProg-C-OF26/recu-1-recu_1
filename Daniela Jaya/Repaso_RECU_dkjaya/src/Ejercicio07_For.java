
import java.util.Scanner;

/** 
 * Problema: Solicite un número entero n y muestre su tabla del 1 al 12.
Requisitos:
Usar for.
Validar que n sea positivo.
 * @author Daniela
 */
public class Ejercicio07_For {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num = 0;
        System.out.print("Deme el numero de la tabla que desea: ");
        num = tcl.nextInt();
        for (int i = 1; i <= 12 && num > 0; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}

/*
run:
Deme el numero de la tabla que desea: 9
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
9 * 10 = 90
9 * 11 = 99
9 * 12 = 108
*/