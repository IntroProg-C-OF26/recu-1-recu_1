
import java.util.Scanner;


public class Ejercicio08_SumadeCiclos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Número inválido");
        } else {

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
 * run:
Ingrese un n�mero N: 2
Suma con while: 3
Suma con do-while: 3
Suma con for: 3
BUILD SUCCESSFUL (total time: 2 seconds)
 * run:
Ingrese un n�mero N: 1
Suma con while: 1
Suma con do-while: 1
Suma con for: 1
BUILD SUCCESSFUL (total time: 1 second)

 */