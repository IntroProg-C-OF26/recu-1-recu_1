
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
/**
 * run:
Men� de opciones:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
Ingrese una opci�n: 1
Ingrese el primer n�mero: 5
Ingrese el segundo n�mero: 5
Resultado: 10.0
BUILD SUCCESSFUL (total time: 7 seconds)
 * run:
Men� de opciones:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
Ingrese una opci�n: 4
Ingrese el primer n�mero: 11000
Ingrese el segundo n�mero: 100
Resultado: 110.0
BUILD SUCCESSFUL (total time: 5 seconds)

 */