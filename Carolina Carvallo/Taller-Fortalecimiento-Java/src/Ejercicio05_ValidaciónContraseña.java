
import java.util.Scanner;

/**
 *Defina una contraseña correcta (por ejemplo: `"utpl"`).  
Pida al usuario ingresar una contraseña **hasta que** sea correcta.

 * @author carol
 */
public class Ejercicio05_ValidaciónContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String correcta = "utpl";
        String intento = "";
        int contador = 0 ;
        
        while (intento.compareTo(correcta) != 0) {
            System.out.print("Ingrese la clave: ");
            intento = sc.nextLine();
            contador++;
        }

        System.out.println("Acceso concedido en " + contador + " intento(s).");
    }
} 
/**
 * run:
Ingrese la clave: abc
Ingrese la clave: 123
Ingrese la clave: utpl
Acceso concedido en 3 intento(s).
 */