import java.util.Scanner;
/** 
 * Con un arreglo de `N` enteros (cargado por teclado), calcular:
 * - Mayor
 * - Menor
 * - Promedio (double)
 * @author ABEL
 */
public class Ejercicio11_ArregloProcesamiento_ArregloUnidimensional {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        int mayor, menor, suma;
        double prom;       
        System.out.print("Ingrese la cantidad de elementos (1-50): ");
        n = tcl.nextInt();
        
        if (n < 1 || n > 50) {
            System.out.println("Cantidad fuera de rango");
        } else {
            int[] arreglo = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = tcl.nextInt();
            }
            mayor = arreglo[0];
            menor = arreglo[0];
            suma = 0;
            for (int i = 0; i < n; i++) {
                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];
                }

                if (arreglo[i] < menor) {
                    menor = arreglo[i];
                }
                suma += arreglo[i];
            }
            prom = suma / n;
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.printf("Promedio: %.2f%n", prom);
        }
    }
}

/**
 * run:
Ingrese la cantidad de elementos (1-50): 6
Ingrese el valor 1: 55
Ingrese el valor 2: 66

Ingrese el valor 3: 33
Ingrese el valor 4: 22
Ingrese el valor 5: 54
Ingrese el valor 6: 11
Mayor: 66
Menor: 11
Promedio: 40,00
BUILD SUCCESSFUL (total time: 13 seconds)
 */