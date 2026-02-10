import java.util.Scanner;
/**
 * Construya un menú:
 * 1. Sumar  
 * 2. Restar  
 * 3. Multiplicar  
 * 4. Dividir  
 * Solicite al usuario una opción (1–4) y dos números (double). Ejecute la operación y muestre el resultado
 * @author ABEL
 */
public class Ejercicio04_MenuOperaciones_SwitchCase {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        int num1;
        int num2;
        
        System.out.println("-----MENU DE OPCIONES-----");
        System.out.println("1= +");
        System.out.println("2= -");
        System.out.println("3= *");
        System.out.println("4= /");
        System.out.print("Seleccione una opcion: ");  
        opcion = tcl.nextInt();
        
        System.out.print("Ingrese valor del numero 1: ");
        num1 = tcl.nextInt();
        System.out.print("Inggrese el valor del numero 2: ");
        num2 = tcl.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
                
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
                
            case 4:
                if (num2 == 0){
                    System.out.println("No se puede dividir para 0");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }                    
                break;    
                
            default:
                System.out.println("Opcion invalida");    
        }
    }
}

/**
 * run:
-----MENU DE OPCIONES-----
1= +
2= -
3= *
4= /
Seleccione una opcion: 4
Ingrese valor del numero 1: 4
Inggrese el valor del numero 2: 0
No se puede dividir para 0
BUILD SUCCESSFUL (total time: 17 seconds)
 */