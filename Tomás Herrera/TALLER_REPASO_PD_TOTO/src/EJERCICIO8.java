/**
 *ComparacionCiclos.java – Suma de 1..N con 3 ciclos
Problema: Ingrese un entero N (>=1). Calcule la suma 1+2+...+N usando:

while
do-while
for
Muestre los tres resultados y verifique que coinciden.

Requisitos:

Validación de N (>=1).
Mostrar:
Suma con while: ...
Suma con do-while: ...
Suma con for: ...
Si no coinciden (no debería ocurrir), mostrar Revisar implementación.
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Ingrese N (>= 1): ");
            N = sc.nextInt();
        } while (N < 1);

        int sumaWhile = 0;
        int i = 1;
        while (i <= N) {
            sumaWhile += i;
            i++;
        }

        int sumaDoWhile = 0;
        int j = 1;
        do {
            sumaDoWhile += j;
            j++;
        } while (j <= N);

        int sumaFor = 0;
        for (int k = 1; k <= N; k++) {
            sumaFor += k;
        }

        System.out.println("Suma con while: " + sumaWhile);
        System.out.println("Suma con do-while: " + sumaDoWhile);
        System.out.println("Suma con for: " + sumaFor);

        if (sumaWhile == sumaDoWhile && sumaWhile == sumaFor) {
            System.out.println("Calculos coinciden correctamente.");
        } else {
            System.out.println("Revisar implementacion.");
        }
    }
}
/***
 * RUN:
 * Ingrese N (>= 1): 2
Suma con while: 3
Suma con do-while: 3
Suma con for: 3
Calculos coinciden correctamente.
* 
* Ingrese N (>= 1): 19
Suma con while: 190
Suma con do-while: 190
Suma con for: 190
Calculos coinciden correctamente
 */