
import java.util.Scanner;

/**
 * Ingrese una nota final (0–100).  
*Si la nota es **>= 70**, muestre `Aprobado`; caso contrario, `Reprobado`.
 * @author carolina carvallo 
 */
    public class Ejercicio02_AprobadoReprobado {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Ingrese la nota final:");
            double notaFinal = sc.nextDouble();
            
            if (notaFinal < 0 || notaFinal > 100){
                System.out.println("NOTA IVALIDA");
        }
            else {
                if (notaFinal >= 70)
                    System.out.println("Aprobado");
                else 
                   System.out.println("Reprobado");}
        }
}
/*run:
Ingrese la nota final:85
Aprobado
run:
Ingrese la nota final:60
Reprobado
run:
Ingrese la nota final:120
NOTA IVALIDA*/