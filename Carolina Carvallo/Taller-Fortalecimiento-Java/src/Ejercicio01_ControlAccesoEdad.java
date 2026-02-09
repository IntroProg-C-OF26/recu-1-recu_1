import java.util.Scanner;
/**
 *Solicite al usuario su edad (entero).  
*Si la edad es **mayor o igual a 18**, muestre: `Acceso permitido`.  
*Si no, no muestre nada adicional.
 * @author carolina carvallo 
 */
public class Ejercicio01_ControlAccesoEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("ingrese la edad: ");
        double edad = sc.nextDouble();
       
        if (edad <= 0 )
            System.out.println("Edad invalida");
            
        if (edad >= 18 )
            System.out.println("Acceso Permitido");
        else 
            System.out.println(" ");
    }
}

/*run:
ingrese la edad: 18
Acceso Permitido

run:
ingrese la edad: -2
Edad invalida

