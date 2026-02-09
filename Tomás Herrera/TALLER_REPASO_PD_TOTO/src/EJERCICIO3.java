
/**
 *3) IfAnidado.java – Clasificación por rango (3 niveles)
 * Problema: Ingrese un puntaje (0–100) y clasifique:
 *
 * 90–100: Excelente
 * 70–89: Bueno
 * 0–69: En proceso
 * Requisitos:
 *
 * Validar rango 0–100.
 * Usar if anidado (mínimo 2 niveles).
 * No usar switch.
 * Ejemplo:
 *
 * 95 → Excelente
 * 75 → Bueno
 * 40 → En proceso
 *
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el puntaje: ");
        double puntaje = sc.nextDouble();

        if (puntaje >= 0 && puntaje <= 100) {
            
            if (puntaje >= 90) {
                System.out.println("Excelente");
            } else {
                
                if (puntaje >= 70) {
                    System.out.println("Bueno");
                } else {
                    System.out.println("En proceso");
                }
            }
        } else {
            
            System.out.println("Puntaje invalido");
        }

      
    }
}
/***
 * RUN:
 * Ingresa el puntaje: 75,5
Bueno
BUILD SUCCESSFUL (total time: 3 seconds)

* Ingresa el puntaje: 59,9
En proceso
BUILD SUCCESSFUL (total time: 6 seconds)
* 
* Ingresa el puntaje: 90,1
Excelente
BUILD SUCCESSFUL (total time: 12 seconds)

 */