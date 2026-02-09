
import java.util.Scanner;

/**
 *Solicite `N` (1..50). Cree un arreglo de `N` enteros y cargue valores por teclado.
 * @author carolina carvallo
 */
public class Ejercicio09_CargarNvalores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("INGRESE EL VALOR (1-50): ");
            n = sc.nextInt();            
            if (n < 1 || n > 50 ){
                System.out.println("TAMANO NO VALIDO RANGO DE 1-50");
            } 
        }while (n < 1 || n > 50);
        
        int [] valores = new int[n];
        System.out.println("cargando " + n + " valores ");
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el valor para la posicion");
            valores [i] = sc.nextInt();  
        } 
        System.out.println("Carga completada");
    }
}
/**
 * run:
INGRESE EL VALOR (1-50): 5
cargando 5 valores 
ingrese el valor para la posicion
1
ingrese el valor para la posicion
2
ingrese el valor para la posicion
3
ingrese el valor para la posicion
4
ingrese el valor para la posicion
5
Carga completada
 */