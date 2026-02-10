import java.util.Scanner;
/**
 * Ingrese un entero `N` (>=1). Calcule la suma 1+2+...+N usando:
 * - while
 * - do-while
 * - for
 * Muestre los tres resultados y verifique que coinciden.
 * @author ABEL
 */
public class Ejercicio08_CompCiclos_Suma {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese un numero entero: ");
        n = tcl.nextInt();
        if (n < 1) {
            System.out.println("Numero inválido");
        } else {

            // Suma usando while
            int sumaWhile = 0;
            int i = 1;
            while (i <= n) {
                sumaWhile += i;
                i++;
            }

            // Suma usando do-while
            int sumaDoWhile = 0;
            int j = 1;
            do {
                sumaDoWhile += j;
                j++;
            } while (j <= n);

            // Suma usando for
            int sumaFor = 0;
            for (int k = 1; k <= n; k++) {
                sumaFor += k;
            }
            System.out.println("Suma con while: " + sumaWhile);
            System.out.println("Suma con do-while: " + sumaDoWhile);
            System.out.println("Suma con for: " + sumaFor);

            if (sumaWhile != sumaDoWhile || sumaWhile != sumaFor) {
                System.out.println("Revisar implementación");
            }
        }
    }
}

/**
 * Ingrese un numero entero: 3
Suma con while: 6
Suma con do-while: 6
Suma con for: 6
BUILD SUCCESSFUL (total time: 2 seconds)
 */