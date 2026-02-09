
    import java.util.Scanner;

    
    
/**
 *
 * @author Erick
 */
public class ArregloProcesamiento {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese el tamano del arreglo (1-50): ");
            n = tcl.nextInt();
            if (n < 1 || n > 50) {
                System.out.println("El tamaño debe estar entre 1 y 50.");
            }
        } while (n < 1 || n > 50);

        int[] numeros = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Numero [" + i + "]: ");
            numeros[i] = tcl.nextInt();
            suma += numeros[i]; 
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double promedio = (double) suma / n;

        System.out.println("\n Estadisticas ");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.printf("Promedio: %.2f\n", promedio);
        
    }
}

