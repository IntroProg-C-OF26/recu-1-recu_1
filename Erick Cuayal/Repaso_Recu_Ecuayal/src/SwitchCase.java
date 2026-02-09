
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class SwitchCase {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int resultado = 0;
        System.out.println("Ingrese los dos numeros para realizar la operacion: ");
        double num1 = tcl.nextDouble();
        double num2 = tcl.nextDouble();
        System.out.println("Ingrese la operacion que quiere realizas" + "\n"
                + "1.suma 2.restar 3.Mutiplicar 4.Dividir");
        int operacion = tcl.nextInt();
        if (operacion >= 5) {
            System.out.println("Opcion no valida");
        }
        switch (operacion) {
            case 1:
                resultado = (int) (num1 + num2);
                break;
            case 2:
                resultado = (int) (num1 - num2);
                break;
            case 3:
                resultado = (int) (num1 * num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir para cero");
                }
                resultado = (int) (num1 / num2);
                break;

        }
        System.out.println("Resultado es: " + resultado);
    }

}
