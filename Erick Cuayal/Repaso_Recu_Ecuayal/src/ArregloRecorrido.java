
import java.util.Scanner;



/**
 *
 * @author Erick
 */

public class ArregloRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Cuantos numeros desea ingresar: ");
        int n = tcl.nextInt();
        int[] numeros = new int[n];
        
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero en la posicion [" + i + "]: ");
            numeros[i] = tcl.nextInt();
        }

        System.out.println("\n Valores en el arreglo ");
        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i] + " ");
            
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        
    }
}
