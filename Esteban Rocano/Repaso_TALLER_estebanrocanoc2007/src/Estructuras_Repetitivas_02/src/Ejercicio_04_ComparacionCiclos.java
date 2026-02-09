import java.util.Scanner;
/**
 * Suma de 1..N con 3 ciclos
 * Ingrese un entero `N` (>=1). Calcule la suma 1+2+...+N usando:
 * while
 * do-while
 * for
 * Muestre los tres resultados y verifique que coinciden.
 **Requisitos:**
 * Validación de N (>=1).
 * Mostrar:
 * "Suma con while: ..." "Suma con do-while: ..." "Suma con for: ..."
 * Si no coinciden (no debería ocurrir), mostrar `Revisar implementación`.
 * @author Esteban Rocano
 */
public class Ejercicio_04_ComparacionCiclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese un numero (>=1): ");
            n = tcl.nextInt();
        } while (n < 1);
        int sumaWhile = 0;
        int i = 1;
        while (i <= n) {
            sumaWhile += i;
            i++;
        }
        int sumaDoWhile = 0;
        i = 1;
        do {
            sumaDoWhile += i;
            i++;
        } while (i <= n);
        int sumaFor = 0;
        for (i = 1; i <= n; i++) {
            sumaFor += i;
        }
        System.out.println("Suma con while: " + sumaWhile);
        System.out.println("Suma con do-while: " + sumaDoWhile);
        System.out.println("Suma con for: " + sumaFor);
        if (sumaWhile == sumaDoWhile && sumaWhile == sumaFor) {
            System.out.println("Las sumas coinciden correctamente");
        } else {
            System.out.println("Revisar implementación");
        }
        tcl.close();
    }
}
/**
 * run:
Ingrese un numero (>=1): 3
Suma con while: 6
Suma con do-while: 6
Suma con for: 6
Las sumas coinciden correctamente
BUILD SUCCESSFUL (total time: 33 seconds)
 */