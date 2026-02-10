import java.util.Scanner;
/**
 * En una cafetería, si el cliente es estudiante de la UTPL recibe 10% de 
 * descuento; pero si es de la UNL su descuento es del 15%. 
 * @author ABEL
     */
public class Ejercicio02_DescuentoCafeteria {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el total de la compra: ");
        double totalCompra = tcl.nextDouble();
        
        System.out.println("Intrese la universidad (UTPL / UNL): ");
        String universidad = tcl.next();
        
        double descuento = 0.0;
        
        if (universidad.equals("UTPL")){
            descuento = 0.10;
        } else {
            descuento = 0.15;
        }
        
        totalCompra = totalCompra - (totalCompra * descuento);
        System.out.println("Descuento y Compra: (" + (descuento*100) + "%), ($" + totalCompra +")");
    }
}

/**
 * run:
Ingrese el total de la compra: 
10
Intrese la universidad (UTPL / UNL): 
unl
Descuento y Compra: (15.0%), ($8.5)
BUILD SUCCESSFUL (total time: 5 seconds)
 */