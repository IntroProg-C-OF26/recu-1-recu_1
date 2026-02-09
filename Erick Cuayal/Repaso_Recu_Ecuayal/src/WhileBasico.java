
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class WhileBasico {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String contraseña = "utpl";
        int contador = 0;
        String contra = "";
        while (!contra.equals(contraseña)) {
            System.out.println("Ingrese la contraseña: ");
            contra = tcl.nextLine(); 
            contador ++; 
        }
        System.out.println("Acceso consedido en "+ contador + " intento/s");
        }
    }
