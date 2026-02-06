
import java.util.Scanner;

/**
 * En una cafetería, si el cliente es estudiante de la UTPL recibe 10% de 
 * descuento; pero si es de la UNL su descuento es del 15%.
 * @author julian muñoz
 */
public class Ejercicio02_DescuentoCafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el total de la compra: ");
        double totalCompra = sc.nextDouble();
        
        System.out.println("Intrese la universidad (UTPL / UNL): ");
        String universidad = sc.next();
        
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
