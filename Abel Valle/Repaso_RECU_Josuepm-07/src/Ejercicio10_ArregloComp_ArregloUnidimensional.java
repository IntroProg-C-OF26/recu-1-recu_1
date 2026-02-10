import java.util.Scanner;
/**
 * Con un arreglo de `N` enteros (cargado por teclado):
 * - Mostrar todos los valores
 * - Contar cuántos son **pares** y cuántos **impares**
 * @author ABEL
 */
public class Ejercicio10_ArregloComp_ArregloUnidimensional {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        int par;
        int impar;
        System.out.print("Ingrese la cantidad de elementos: ");
        n = tcl.nextInt();
        
        int [] arreglo = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arreglo[i] = tcl.nextInt();
        }
        par = 0;
        impar = 0;
 
        System.out.print("Valores ingresados: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + ",");

            if (arreglo[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("\nPares: " + par + "  Impares: " + impar);
    }
}

/**
 * Ingrese la cantidad de elementos: 4
Ingrese el valor 1: 3
Ingrese el valor 2: 4
Ingrese el valor 3: 2
Ingrese el valor 4: 5
Valores ingresados: 3,4,2,5
Pares: 2  Impares: 2
 */
