
import java.util.Scanner;

/**
 * Con un arreglo de `N` enteros (cargado por teclado), calcular:
- Mayor
- Menor
- Promedio (double)
 * @author carolina carvallo
 */
public class Ejercicio11_EstadísticasBsasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese el tamano del arreglo (1-50): ");
            n = sc.nextInt();
        } while (n < 1 || n > 50);
        
        int[] cacular = new int[n];
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(" ingrese el valor: ");
            cacular[i] = sc.nextInt();
            suma += cacular[i];
        }
        
        int mayor = cacular[0];
        int menor = cacular[0];
        
        for (int i = 0; i < n; i++) {
            if (cacular[i] > mayor){
                mayor = cacular[i];}
            if (cacular[i] < menor){
                menor = cacular[i];} 
        }
        double promedio = suma/n; 
        
        System.out.println("---RESULTADOS---");
        System.out.println(" TOTAL DE MAYORES: " +  mayor);
        System.out.println(" TOTAL MENORES: " + menor);
        System.out.printf("PROMEDIO: %.2f\n ", promedio);
    }
}
/**
 * run:
Ingrese el tamano del arreglo (1-50): 5
 ingrese el valor: 12
 ingrese el valor: 32
 ingrese el valor: 5
 ingrese el valor: 6
 ingrese el valor: 23
---RESULTADOS---
 TOTAL DE MAYORES: 32
 TOTAL MENORES: 5
PROMEDIO: 15.60
 */