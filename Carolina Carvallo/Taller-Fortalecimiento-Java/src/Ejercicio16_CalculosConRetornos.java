
import java.util.Scanner;

/**
 *Solicite 2 números y calcule:
- suma
- resta
- producto
- mayor (retornar el mayor)

 * @author carolina carvallo
 */
public class Ejercicio16_CalculosConRetornos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        double n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = sc.nextInt();
        
        System.out.println("\n---RESULTADOS---");
        System.out.println("la suma es: "+ sumar(n1, n2));
        System.out.println("la resta es: " + resta(n1, n2));
        System.out.println("el producto: " + multiplicacion(n1, n2));
        System.out.println("el numero mayor es: " + obtenerMayor(n1, n2));
    }
    
    public static double sumar(double a, double b){
    return a + b;
    }
    public static double resta(double a, double b){
    return a - b;
    }    
    public static double multiplicacion(double a, double b){
    return a * b;
    }
    public static double obtenerMayor(double a, double b){
    if (a > b ){
        return a;
    }else {
        return b;
    }
    }
}
/*
run:
Ingrese el primer numero: 2
Ingrese el segundo numero: 1

---RESULTADOS---
la suma es: 3.0
la resta es: 1.0
el producto: 2.0
el numero mayor es: 2.0
BUILD SUCCESSFUL (total time: 6 seconds)
*/