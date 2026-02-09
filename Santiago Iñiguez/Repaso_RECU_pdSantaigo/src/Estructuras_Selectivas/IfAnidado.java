import java.util.Scanner;
/**
 *Problema: Ingrese un puntaje (0–100) y clasifique:
90–100:Excelente
70–89:Bueno
0–69:En proceso
 * @author Santiago Iñiguez
 */
public class IfAnidado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el puntaje (0-100): ");
        int puntaje = tcl.nextInt();
        if (puntaje < 0 || puntaje > 100) {
            System.out.println("Puntaje inválido");
        } else {
            if (puntaje >= 90) {
                System.out.println("Excelente");
            } else {
                if (puntaje >= 70) {
                    System.out.println("Bueno");
                } else {
                    System.out.println("En proceso");
                }
            }
        }
    }
}
/**
 * run:
Ingrese el puntaje (0-100): 45
En proceso
BUILD SUCCESSFUL (total time: 8 seconds)
run:
Ingrese el puntaje (0-100): 78
Bueno
BUILD SUCCESSFUL (total time: 5 seconds)

 */
