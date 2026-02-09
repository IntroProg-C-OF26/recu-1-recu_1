
import java.util.Scanner;


public class Ejercicio09_CargarValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores: ");
        int n = sc.nextInt();

        if (n < 1 || n > 50) {
            System.out.println("Valor inválido");
        } else {
            int[] arreglo = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = sc.nextInt();
            }

            System.out.println("Carga completada");
        }
    }
}
