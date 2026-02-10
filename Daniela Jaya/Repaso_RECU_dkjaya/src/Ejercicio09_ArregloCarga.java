
import java.util.Scanner;


/**
 * Problema: Solicite N (1..50). Cree un arreglo de N enteros y cargue valores por teclado.
Requisitos:
Validar N en rango.
Al finalizar, mostrar Carga completada.
 * @author Daniela
 */
public class Ejercicio09_ArregloCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamanio del arreglo: ");
        n = tcl.nextInt();
        while (n < 1 || n > 50) {
            System.out.print("Ingrese el tamaño del arreglo (1..50): ");
            n = tcl.nextInt();
        }
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = tcl.nextInt();
        }

        System.out.println("Carga completada");
    }
}

/*
 * run:
Ingrese el tamanio del arreglo: 5
Valor 1: 12
Valor 2: 23
Valor 3: 4
Valor 4: 6
Valor 5: 19
Carga completada
 */
