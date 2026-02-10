
import java.util.Scanner;

/**
 *Con un arreglo de `N` enteros (cargado por teclado):
- Mostrar todos los valores
- Contar cuántos son **pares** y cuántos **impares**
 * @author carolina carvallo
 */
public class Ejercicio10_MostrarContar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("CUANTOS NUMEROS QUIERE INGRESAR: ");
        n = sc.nextInt();
        
        int[] numero= new int[n];
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero");
            numero[i] = sc.nextInt();
        }
        System.out.println("\nvalores ingresados");
        for (int i = 0; i < n; i++) {
            System.out.print(numero[i] + " ");
            
            if (numero[i] % 2 == 0 )
                pares++;
            else 
                impares++;
        }
        System.out.println("\n\n----RESULTADOS----");
        System.out.println("PARES: "  + pares);
        System.out.println("IMPARES: " + impares);
    }
}
/**
 * run:
CUANTOS NUMEROS QUIERE INGRESAR: 5
Ingrese el numero
1
Ingrese el numero
2
Ingrese el numero
3
Ingrese el numero
4
Ingrese el numero
5

valores ingresados
1 2 3 4 5 

----RESULTADOS----
PARES: 2
IMPARES: 3
 */