import java.util.Scanner;

public class DescuentoCafeteriaIfDoble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADAS (para completar en vivo)
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = sc.nextDouble();

        System.out.print("Ingrese la universidad (UTPL / UNL): ");
        String universidad = sc.next();

        // PROCESO (IF DOBLE)
        double descuento = 0.0;

        if (/* TODO: condición para UTPL */) {
            // TODO: asignar descuento del 10%
        } else {
            // TODO: asignar descuento del 15%
        }

        // TODO: calcular el total a pagar

        // SALIDA
        // TODO: mostrar universidad, descuento aplicado y total a pagar

        sc.close();
    }
}