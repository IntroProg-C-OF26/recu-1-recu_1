



/**
 * 2) IfDoble.java – Aprobado / Reprobado
Problema: Ingrese una nota final (0–100).
Si la nota es >= 70, muestre Aprobado; caso contrario, Reprobado.

Requisitos:

Validar rango 0–100. Si no cumple, mostrar Nota inválida y terminar.
Usar if doble (if/else).
Ejemplo:

85 → Aprobado
60 → Reprobado
120 → Nota inválida
 * @author toto1
 */
import java.util.Scanner;
        
public class EJERCICIO2 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese la nota: ");
        Scanner sc = new Scanner(System.in);

        double nota = sc.nextDouble();
        boolean notaValida = nota >= 0 && nota <= 100;

        if (notaValida) {
            if (nota >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        } else {
            System.out.println("Nota inválida");
        }

      
    }
}
/***
 * RUN:
 * Ingrese la nota: 
70,7
Aprobado
BUILD SUCCESSFUL (total time: 5 seconds)

* Ingrese la nota: 
59,9
Reprobado
BUILD SUCCESSFUL (total time: 4 seconds)
* 
* Ingrese la nota: 
100,1
Nota inv�lida
BUILD SUCCESSFUL (total time: 3 seconds)
 */
