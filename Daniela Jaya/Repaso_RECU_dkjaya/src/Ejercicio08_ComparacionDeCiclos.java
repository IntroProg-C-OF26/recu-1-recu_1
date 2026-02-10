
import java.util.Scanner;

/**
 * Problema: Ingrese un entero N (>=1). Calcule la suma 1+2+...+N usando:
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
 * @author Daniela
 */
public class Ejercicio08_ComparacionDeCiclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, i, sumaWhile = 0, sumaDoWhile = 0, sumaFor = 0;
        System.out.print("Ingrese un numero: ");
        n = tcl.nextInt();
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
        
        for (i = 1; i <= n; i++) {
            sumaFor += i;
        }        
        System.out.println("Suma con While: " + sumaWhile);
        System.out.println("Suma con Do While: " + sumaDoWhile);
        System.out.println("Suma con For: " + sumaFor);

        if (sumaWhile != sumaDoWhile || sumaWhile != sumaFor) {
            System.out.println("Revisar implementación");
        }
    }
}

/**
 * run:
Ingrese un numero: 9
Suma con While: 45
Suma con Do While: 45
Suma con For: 45
 */