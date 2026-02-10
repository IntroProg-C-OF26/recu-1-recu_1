
import java.util.Scanner;

/**
 * WhileBasico.java – Validación de contraseña
Problema: Defina una contraseña correcta (por ejemplo: "utpl").
Pida al usuario ingresar una contraseña hasta que sea correcta.
Requisitos:
Usar while.
Contar intentos y al final mostrar: Acceso concedido en X intento(s).
 * @author Daniela
 */
public class Ejercicio05_While {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String contraCorrecta = "utpl";
        String contraIngresada = "";
        int intentos = 0;

        while (!contraIngresada.equals(contraCorrecta)) {
            System.out.print("Ingrese la contrasenia: ");
            contraIngresada = tcl.nextLine();
            intentos++;
        }
        System.out.println("Acceso concedido en " + intentos + " intento(s)");
    }
}

/*
run:
Ingrese la contrasenia: abc
Ingrese la contrasenia: 123
Ingrese la contrasenia: utpl
Acceso concedido en 3 intento(s)
*/