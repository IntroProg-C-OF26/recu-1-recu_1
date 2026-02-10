/**
 * Ejercicio05: 
 * Problema: Defina una contraseña correcta (por ejemplo: "utpl").
Pida al ingresar usuario una contraseña hasta que sea correcta.
Requisitos:
Usar mientras .
Contar intentos y al final mostrar: Acceso concedido en X intento(s).
 * @author julian jaramillo
 */

import java.util.Scanner;
public class Ejercicio05_Validacion_Contrasena {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String claveCorr = "utpl";
        String claveIngres = "";
        int intentos = 0;
        System.out.println("ingrese la clave: ");
        while (!claveIngres.equals(claveCorr)) {
            claveIngres = tcl.nextLine();
            intentos++;
        }
        System.out.println("Acceso concedido en " + intentos + " intento(s)");
    }
}
/**
 * run:
ingrese la clave: 
perro
hola
si
abc
utpl
Acceso concedido en 5 intento(s)
BUILD SUCCESSFUL (total time: 24 seconds)
 */