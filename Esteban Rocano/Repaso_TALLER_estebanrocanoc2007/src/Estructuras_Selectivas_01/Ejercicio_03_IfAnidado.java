package Estructuras_Selectivas_01;
import java.util.Scanner;
/**
 * Clasificación por rango (3 niveles) 
 * Problema: Ingrese un puntaje (0–100) y clasifique:
 * 90–100: `Excelente`/ 70–89: `Bueno`/ 0–69: `En proceso`
 * Requisitos:
 * Validar rango 0–100./ Usar **if anidado** (mínimo 2 niveles) / No usar switch
**Ejemplo:**
* `95` → `Excelente`
* 75` → `Bueno`
* 40` → `En proceso`
 * @author Esteban Rocano
 */
public class Ejercicio_03_IfAnidado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese Estado");
        int nivel = tcl.nextInt();
        if (nivel >= 90 && nivel <= 100) {
            System.out.println("Exelente");
        } else if (nivel >= 70 && nivel <= 89) {
            System.out.println("Bueno");
        } else {
            System.out.println("En Proceso");
        }
    }
}
/**
 * RUN:
 * Ingrese Estado
 * 0
 * En Proceso
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */