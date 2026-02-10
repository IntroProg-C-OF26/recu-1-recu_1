
import java.util.Scanner;

/**
 * IfAnidado.java – Clasificación por rango (3 niveles)
Problema: Ingrese un puntaje (0–100) y clasifique:
90–100: Excelente
70–89: Bueno
0–69: En proceso
Requisitos:
Validar rango 0–100.
Usar if anidado (mínimo 2 niveles).
No usar switch.
 * @author Daniela
 */
public class Ejercicio03_IfAnidado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int puntaje;
        String msj = "";
        System.out.print("Ingrese el puntaje (0-100): ");
        puntaje = tcl.nextInt();
        if (puntaje >= 90 && puntaje <= 100) {
            msj = "Excelente";
        } else if (puntaje >= 70 && puntaje <= 89) {
            msj = "Bueno";
        } else if (puntaje >= 0 && puntaje <= 69) {
            msj = "En proceso";
        } else {
            msj = "Puntaje fuera de rang)";
        }
        System.out.println(msj);
    }
}

/**
 * run:
Ingrese el puntaje (0-100): 89
Bueno
 */
