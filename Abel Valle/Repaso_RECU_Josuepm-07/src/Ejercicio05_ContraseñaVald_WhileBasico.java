import java.util.Scanner;
/**
 * Defina una contraseña correcta (por ejemplo: `"utpl"`).  
 * Pida al usuario ingresar una contraseña **hasta que** sea correcta.
 * @author ABEL
 */
public class Ejercicio05_ContraseñaVald_WhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String CTcorrect = "Josue";
        String Nint = "";
        int contador = 0;
        while (!Nint.equals(CTcorrect)){
            System.out.print("Ingrese la contraseña: ");
            Nint = tcl.nextLine();
            contador++;
        }
        System.out.println("Acceso permitido en: " + contador + " intentos");
    }
}

/**
 * run:
Ingrese la contrase�a: maria
Ingrese la contrase�a: joshua
Ingrese la contrase�a: Josue
Acceso permitido en: 3 intentos
BUILD SUCCESSFUL (total time: 8 seconds)
 */