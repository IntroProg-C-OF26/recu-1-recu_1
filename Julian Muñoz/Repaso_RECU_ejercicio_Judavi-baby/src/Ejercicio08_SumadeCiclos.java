
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
