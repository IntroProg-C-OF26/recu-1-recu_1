import java.util.Scanner;
/**
 *Problema: Ingrese un entero N(>=1). Calcula la suma 1+2+...+N usando:
mientras
hacer mientras
para
Muestre los tres resultados y verifique que coincidan.
 * @author Santiago Iñiguez
 */
public class ComparacionCiclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese un numero entero: ");
            n = tcl.nextInt();
            if (n < 1) System.out.println("Error: El número debe ser mayor o igual a 1.");
        } while (n < 1);
        int sumaWhile = 0, sumaDoWhile = 0, sumaFor = 0;
        int i; 
        i = 1;
        while (i <= n) {
            sumaWhile += i;
            i++;
        }
        i = 1;
        do {
            sumaDoWhile += i;
            i++;
        } while (i <= n);
        for (int j = 1; j <= n; j++) {
            sumaFor += j;
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma con while: " + sumaWhile);
        System.out.println("Suma con do-while: " + sumaDoWhile);
        System.out.println("Suma con for: " + sumaFor);
        if (sumaWhile == sumaDoWhile && sumaDoWhile == sumaFor) {
            System.out.println("\nLos tres resultados coinciden.");
        } else {
            System.out.println("\nRevisar implementación: los resultados no son iguales.");
        }
    }
}
/**
 * run:
Ingrese un numero entero: 4
--- RESULTADOS ---
Suma con while: 10
Suma con do-while: 10
Suma con for: 10
Los tres resultados coinciden.
BUILD SUCCESSFUL (total time: 3 seconds)
 */
