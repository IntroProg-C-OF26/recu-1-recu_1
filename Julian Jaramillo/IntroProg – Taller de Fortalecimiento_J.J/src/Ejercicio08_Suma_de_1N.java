/**
 * Ejercicio08:
 * Problema: Ingrese un entero N(>=1). Calcula la suma 1+2+...+N usando:
mientras
hacer mientras
para
Muestre los tres resultados y verifique que coincidan.
Requisitos:
Validación de N (>=1).
Mostrar:
Suma con while: ...
Suma con do-while: ...
Suma con for: ...
Si no coincide (no debería ocurrir), mostrar Revisar implementación.
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio08_Suma_de_1N {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme un numero (N): ");
        int N = tcl.nextInt();
        if (N < 1) {
            System.out.println("Numero invalido");
            return;
        }
        int sumaWhile = 0, i = 1;
        while (i <= N) {
            sumaWhile += i;
            i++;
        }
        int sumaDoWhile = 0;
        i = 1;
        do {
            sumaDoWhile += i;
            i++;
        } while (i <= N);
        int sumaFor = 0;
        for (i = 1; i <= N; i++)
            sumaFor += i;
        System.out.println("Suma con while: " + sumaWhile);
        System.out.println("Suma con do-while: " + sumaDoWhile);
        System.out.println("Suma con for: " + sumaFor);
        if (sumaWhile != sumaDoWhile || sumaWhile != sumaFor) {
            System.out.println("Revisar implementacion");
        }
    }
}

/**
 * run:
Deme un numero (N): 
6
Suma con while: 21
Suma con do-while: 21
Suma con for: 21
BUILD SUCCESSFUL (total time: 3 seconds)
 */

/**
 * run:
Deme un numero (N): 
-1
Numero invalido
BUILD SUCCESSFUL (total time: 2 seconds)
 */