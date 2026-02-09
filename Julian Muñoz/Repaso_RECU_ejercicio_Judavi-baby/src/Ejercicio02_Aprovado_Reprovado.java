
import java.util.Scanner;


public class Ejercicio02_Aprovado_Reprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota final (0-100): ");
        int nota = sc.nextInt();
        
        if (nota < 0 || nota > 100){
            System.out.println("Nota Invalida");     
        } else
        if (nota >= 70){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
