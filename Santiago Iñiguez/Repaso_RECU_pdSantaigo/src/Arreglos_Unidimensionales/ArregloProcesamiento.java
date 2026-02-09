import java.util.Random;
import java.util.Scanner;
/**
 *Problema: Con un arreglo de Nenteros (cargado por teclado), calcular:
Alcalde
Menor
Promedio (doble)
 * @author Santiago Iñiguez
 */
public class ArregloProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
        int n, mayor, menor, suma = 0;
        double promedio;
        do {
            System.out.print("Ingrese la cantidad de numeros a procesar (1-50): ");
            n = tcl.nextInt();
        } while (n < 1 || n > 50);
        int[] valores = new int[n];
        System.out.println("Valores generados:");
        for (int i = 0; i < n; i++) {
            valores[i] = ale.nextInt(100) + 1; 
            System.out.print(valores[i] + " ");
        }
        System.out.println(); 
        mayor = valores[0];
        menor = valores[0];

        for (int i = 0; i < n; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
            suma += valores[i];
        }
        promedio = (double) suma / n;
        System.out.println("\n--- RESULTADOS ESTADISTICOS ---");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.printf("Promedio: %.2f\n", promedio);
    }
}
/**
 * run:
Ingrese la cantidad de numeros a procesar (1-50): 15
Valores generados:
43 75 95 94 16 93 68 25 34 4 82 14 81 67 5 

--- RESULTADOS ESTADISTICOS ---
Mayor: 95
Menor: 4
Promedio: 53,07
BUILD SUCCESSFUL (total time: 6 seconds)
 */