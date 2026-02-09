
import java.util.Scanner;


public class Ejercicio03_Clasificacion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el puntaje:");
        int puntaje = sc.nextInt();

        if (puntaje < 0 || puntaje > 100) {
            System.out.println("Puntaje inválido");
        } else {
            if (puntaje >= 90) {
                System.out.println("Excelente");
            } else {
                if (puntaje >= 70) {
                    System.out.println("Bueno");
                } else {
                    System.out.println("En proceso");
                }
            }
        }
    }
}
/**
 * run:
Ingrese el puntaje:
40
En proceso
BUILD SUCCESSFUL (total time: 5 seconds)
 * run:
Ingrese el puntaje:
80
Bueno
BUILD SUCCESSFUL (total time: 1 second)

 */