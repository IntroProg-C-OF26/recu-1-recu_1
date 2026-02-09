
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
