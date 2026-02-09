/**
 * En una cafetería, si el cliente es estudiante de la UTPL recibe 10% de descuento; 
 * pero si es de la UNL su descuento es del 15%.
 * autor Daniela Jaya
 */
import java.util.Scanner;

public class Ejercicio02_IfDoble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADAS (para completar en vivo)
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = sc.nextDouble();

        System.out.print("Ingrese la universidad (UTPL / UNL): ");
        String universidad = sc.next();

        // PROCESO (IF DOBLE)
        double descuento = 0.0;

        if (universidad.equals("UTPL")) {
            descuento = 0.10;
        } else {
            descuento = 0.15;
        }

        totalCompra = totalCompra - (totalCompra * descuento); 

        System.out.println("Descuento y Compra: (" + (descuento*100) + "%), ($" + totalCompra +")");
    }
}

/*
run:
Ingrese el total de la compra: 5
Ingrese la universidad (UTPL / UNL): UTPL
Descuento y Compra: (10.0%), ($4.5)
*/