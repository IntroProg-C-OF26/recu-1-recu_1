
import java.util.Scanner;

/**
 * ArregloRecorrido.java – Mostrar y contar
Problema: Con un arreglo de N enteros (cargado por teclado):
Mostrar todos los valores
Contar cuántos son pares y cuántos impares
Requisitos:
Mostrar al final: Pares: X, Impares: Y.
 * @author Daniela
 */
public class Ejercicio10_ArregloRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, par = 0, impar = 0;
        System.out.print("Deme el tamanio del arreglo: ");
        n = tcl.nextInt();
        int [] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arreglo[i] = tcl.nextInt();

        }
        System.out.println("VALORES");
        for (int i = 0; i < n; i++) { 
            if (arreglo[i]%2 == 0) {
                System.out.println(arreglo[i]+ ": es par");
                par++;
            } else {
                System.out.println(arreglo[i]+ ": es impar");
                impar++;
            }
        }
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}

/*
run:
Deme el tamanio del arreglo: 5
Valor 1: 19
Valor 2: 23
Valor 3: 22
Valor 4: 3
Valor 5: 4
VALORES
19: es impar
23: es impar
22: es par
3: es impar
4: es par
Pares: 2
Impares: 3
*/