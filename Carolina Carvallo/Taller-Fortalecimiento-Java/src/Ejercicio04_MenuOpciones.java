
import java.util.Scanner;

/**
 *Construya un menú:
1. Sumar  
2. Restar  
3. Multiplicar  
4. Dividir  
 * @author carolina carvallo 
 */
public class Ejercicio04_MenuOpciones {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("------MENU------");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("INGRESE UN NUMERO (1-4): ");
        int opcion = sc.nextInt();
        
        System.out.println("ingrese el primer numero para la operacion");
        double n1 = sc.nextDouble();
        System.out.println("ingrese el segundo numero para la operacion");
        double n2 = sc.nextDouble();
        
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2: 
                System.out.println(" Resultado: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Resultado: " + (n1 / n2));
                break;
                
            default:
                System.out.println("OPCION INVALIDA");
                break;
        }
        
        
    }
}
/**\
 * run:
------MENU------
1. sumar
2. restar
3. Multiplicar
4. Dividir
INGRESE UN NUMERO (1-4): 1
ingrese el primer numero para la operacion
5
ingrese el segundo numero para la operacion
3
Resultado: 8.0
 */
