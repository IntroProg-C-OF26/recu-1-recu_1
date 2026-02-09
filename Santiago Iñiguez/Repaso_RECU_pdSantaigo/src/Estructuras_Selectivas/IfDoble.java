import java.util.Scanner;
/**
 *Problema: Ingrese una nota final (0–100).
Si la nota es >= 70 , muestree Aprobado; caso contrario, Reprobado.
 * @author Santiago Iñiguez
 */
public class IfDoble {
    public static void main(String[] args){
        Scanner tcl = new Scanner(System.in);
        int nota;
        System.out.print("Ingrese la nota final (0-100): ");
        nota = tcl.nextInt();
        if (nota < 0 || nota > 100) {
            System.out.println("Nota invalida");
        } 
        else {
            if (nota >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}
/**
 * run:
Ingrese la nota final (0-100): 45
Reprobado
BUILD SUCCESSFUL (total time: 8 seconds)
*run:
Ingrese la nota final (0-100): 75
Aprobado
BUILD SUCCESSFUL (total time: 3 seconds)
 
 */