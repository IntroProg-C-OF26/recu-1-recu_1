import java.util.Scanner;
/**
 * Validación de contraseña
 * Defina una contraseña correcta (por ejemplo: `"utpl"`).  
 * Pida al usuario ingresar una contraseña **hasta que** sea correcta.
 **Requisitos:**
 * Usar **while**.
 * Contar intentos y al final mostrar: `Acceso concedido en X intento(s)`.
 **Ejemplo:**
 * Entradas: `abc`, `123`, `utpl` → `Acceso concedido en 3 intento(s)`
 * @author Esteban Rocano
 */
public class Ejercicio_01_WhileBasico {
    public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);
        String contrasenaCorrecta = "utpl";
        String contrasenaIngresada = "";
        int intentos = 0;
        while (!contrasenaIngresada.equals(contrasenaCorrecta)) {
            System.out.print("Ingrese Codigo de Acceso: ");
            contrasenaIngresada = tcl.nextLine();
            intentos++;
        }
        System.out.println("Acceso concedido en " + intentos);
    }
}
/**
 * run:
 * Ingrese Codigo de Acceso: 123
 * Ingrese Codigo de Acceso: abc
 * Ingrese Codigo de Acceso: utpl
 * Acceso concedido en 3
 * BUILD SUCCESSFUL (total time: 11 seconds)
 */