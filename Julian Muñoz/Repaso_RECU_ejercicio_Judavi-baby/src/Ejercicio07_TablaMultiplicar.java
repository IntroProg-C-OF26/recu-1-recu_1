
import java.util.Scanner;


public class Ejercicio07_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido");
        } else {
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
