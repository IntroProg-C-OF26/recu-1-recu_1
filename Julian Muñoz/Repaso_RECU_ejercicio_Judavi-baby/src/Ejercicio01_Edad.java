
import java.util.Scanner;


public class Ejercicio01_Edad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad < 0){
            System.out.println("Edad Inválida");
        }
        
        if (edad >= 18){
            System.out.println("Acceso Permitido");
        }
    }
}
/**
 * run:
Ingrese su edad: 
5
BUILD SUCCESSFUL (total time: 3 seconds)
 * run:
Ingrese su edad: 
2
BUILD SUCCESSFUL (total time: 15 seconds)

 */