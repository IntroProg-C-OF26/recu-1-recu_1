
/**
 *5) WhileBasico.java – Validación de contraseña
 * Problema: Defina una contraseña correcta (por ejemplo: "utpl").
 * Pida al usuario ingresar una contraseña hasta que sea correcta.
 *
 * Requisitos:
 *
 * Usar while.
 * Contar intentos y al final mostrar: Acceso concedido en X intento(s).
 * Ejemplo:
 *
 * Entradas: abc, 123, utpl → Acceso concedido en 3 intento(s)
 *
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secreta = "PROGRAMAR";

        int intentos = 0;
        String respuesta = "";
        while (!respuesta.equals(secreta)) {

         
            System.out.print("Ingrese la contraseña: ");
            respuesta = sc.next();
            intentos++;
            if (!respuesta.equals(secreta)) {
                System.out.println("Contraseña incorrecta");
            }
        }
            System.out.println("Acceso concedido en " + intentos + " intento(s)");

        }
    }
/***
 * RUN:Ingrese la contrase�a: ProgRamar
Contrase�a incorrecta
Ingrese la contrase�a: PROGRAMAr
Contrase�a incorrecta
Ingrese la contrase�a: PROGRAMAR
Acceso concedido en 3 intento(s)
BUILD SUCCESSFUL (total time: 13 seconds)
* 
* Ingrese la contrase�a: HErrera
Contrase�a incorrecta
Ingrese la contrase�a: PRogramacion
Contrase�a incorrecta
Ingrese la contrase�a: Clave
Contrase�a incorrecta
Ingrese la contrase�a: PROGRAMARR
Contrase�a incorrecta
Ingrese la contrase�a: PROGRAMAR
Acceso concedido en 6 intento(s)
BUILD SUCCESSFUL (total time: 25 seconds)
 */