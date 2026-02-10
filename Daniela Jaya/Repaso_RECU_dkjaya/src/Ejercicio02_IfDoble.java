import java.util.Scanner;
/**
 * Problema: Ingrese una nota final (0–100).
Si la nota es >= 70, muestre Aprobado; caso contrario, Reprobado.
Requisitos:
Validar rango 0–100. Si no cumple, mostrar Nota inválida y terminar.
Usar if doble (if/else).
 * @author Daniela
 */
public class Ejercicio02_IfDoble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota;
        String msj = "";
        System.out.print("Ingrese la nota final (0-100): ");
        nota = tcl.nextInt();
        if (nota < 0 || nota > 100) {
            msj = "Nota invalida";
        } else {
            if (nota >= 70) {
                msj = "Aprobado";
            } else {
                msj = "Reprobado";
            }
        }
        System.out.println(msj);
    }
}

/**
 * run:
Ingrese la nota final (0-100): 100
Aprobado
 */
