
import java.util.Scanner;

/**
 * Ingrese un entero `N` (>=1). Calcule la suma 1+2+...+N usando:
- while
- do-while
- for

Muestre los tres resultados y verifique que coinciden.
 * @author carolina carvallo
 */
public class Ejercicio08_SumaConCiclos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese un numero entero: ");
        int n = sc.nextInt();
        
        int sumaWhile = 0;
        int i = 1;
        while (i <= n) {
            sumaWhile += i;
            i++;
        }
        
        int sumaDoWhile = 0;
        int j = 1;
        do {
            sumaDoWhile += j;
            j++;
        } while (j <= n);

        int sumaFor = 0;
        for (int k = 1; k <= n; k++) {
            sumaFor += k;
        }

        System.out.println("Resultado con while: " + sumaWhile);
        System.out.println("Resultado con do-while: " + sumaDoWhile);
        System.out.println("Resultado con for: " + sumaFor);
        
        if (sumaWhile == sumaDoWhile && sumaDoWhile == sumaFor) {
            System.out.println("Todos los resultados coiciden");
        } else {
            System.out.println("revisar implementacion");
        }
    }
}   
 /*
run:
ingrese un numero entero: 3
Resultado con while: 6
Resultado con do-while: 6
Resultado con for: 6
Todos los resultados coiciden
*/
