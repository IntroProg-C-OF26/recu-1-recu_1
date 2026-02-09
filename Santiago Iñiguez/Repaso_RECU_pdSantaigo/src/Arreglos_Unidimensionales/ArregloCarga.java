import java.util.Scanner;
import java.util.Random; 
/**
 * Problema: Solicite N(1..50). Cree un arreglo de N enteros y 
 * lo llene con números aleatorios.
 * @author Santiago Iñiguez
 */
public class ArregloCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();        
        int n;
        do {
            System.out.print("Ingrese el tamaño del arreglo (1-50): ");
            n = tcl.nextInt();           
            if (n < 1 || n > 50) { 
                System.out.println("Error: N fuera de rango. Intente de nuevo.");
            }
        } while (n < 1 || n > 50);
        int[] valores = new int[n];
        System.out.println("Generando " + n + " valores aleatorios:");
        for (int i = 0; i < n; i++) {
            valores[i] = ale.nextInt(100) + 1;
            System.out.println("Posicion [" + i + "]: " + valores[i]);
        }
        System.out.println("Carga completada exitosamente.");        
    }
}
/**
 * Ingrese el tama�o del arreglo (1-50): 20
Generando 20 valores aleatorios:
Posicion [0]: 99
Posicion [1]: 49
Posicion [2]: 23
Posicion [3]: 70
Posicion [4]: 50
Posicion [5]: 99
Posicion [6]: 57
Posicion [7]: 77
Posicion [8]: 21
Posicion [9]: 33
Posicion [10]: 92
Posicion [11]: 2
Posicion [12]: 34
Posicion [13]: 85
Posicion [14]: 40
Posicion [15]: 1
Posicion [16]: 52
Posicion [17]: 2
Posicion [18]: 61
Posicion [19]: 84
Carga completada exitosamente.
BUILD SUCCESSFUL (total time: 6 seconds)
 */