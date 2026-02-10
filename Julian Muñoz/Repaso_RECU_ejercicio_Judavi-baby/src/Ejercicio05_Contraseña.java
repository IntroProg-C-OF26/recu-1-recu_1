
import java.util.Scanner;


public class Ejercicio05_Contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "utpl";
        String claveIngresada = "";
        int intentos = 0;

        while (!claveIngresada.equals(claveCorrecta)) {
            System.out.print("Ingrese la contraseña: ");
            claveIngresada = sc.nextLine();
            intentos++;
        }

        System.out.println("Acceso concedido en " + intentos + " intento(s)");
    }
}
/**
 * run:
Ingrese la contrase�a: utpl
Acceso concedido en 1 intento(s)
BUILD SUCCESSFUL (total time: 5 seconds)
 * run:
Ingrese la contrase�a: dops
Ingrese la contrase�a: dsopdasop
Ingrese la contrase�a: dsasdopi
Ingrese la contrase�a: utpl
Acceso concedido en 4 intento(s)
BUILD SUCCESSFUL (total time: 6 seconds)

 */