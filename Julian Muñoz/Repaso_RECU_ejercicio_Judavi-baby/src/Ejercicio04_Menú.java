
import java.util.Scanner;


public class Ejercicio04_Menú {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Ingrese una opción: ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir para cero");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Opción inválida");
        }
    }
}
