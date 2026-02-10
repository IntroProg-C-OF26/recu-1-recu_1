import java.util.Random;
import java.util.Scanner;
/**
 *Problema: Con un arreglo de Nenteros (cargado por teclado):
Mostrar todos los valores
Contar cuantos son pares y cuantos impares
 * @author Santiago Iñiguez
 */
public class ArregloRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);       
        Random ale = new Random();
        int n, pares = 0, impares = 0;
        do {
            System.out.print("Cuantos numeros aleatorios desea generar (1-50)?: ");
            n = tcl.nextInt();
        } while (n < 1 || n > 50);
        int[] valores = new int[n];
        for (int i = 0; i < n; i++) {
            valores[i] = ale.nextInt(100) + 1;
        }
        System.out.println("\n--- VALORES GENERADOS ---");
        for (int i = 0; i < n; i++) {
            System.out.print(valores[i] + " ");
            if (valores[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if ((i + 1) % 10 == 0) System.out.println();
        }
        System.out.println("\n-----------------------------");
        System.out.println("Pares encontrados: " + pares);
        System.out.println("Impares encontrados: " + impares);
    }
}
/**
 * run:
Cuantos numeros aleatorios desea generar (1-50)?: 23

--- VALORES GENERADOS ---
91 73 1 64 18 54 53 63 12 18 
86 53 77 56 73 91 10 92 46 96 
50 96 87 
-----------------------------
Pares encontrados: 13
Impares encontrados: 10
BUILD SUCCESSFUL (total time: 6 seconds)
 */