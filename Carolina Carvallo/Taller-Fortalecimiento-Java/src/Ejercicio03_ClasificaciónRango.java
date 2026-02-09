import java.util.Scanner;
/**
 *Ingrese un puntaje (0–100) y clasifique:
*- 90–100: `Excelente`
*- 70–89: `Bueno`
*- 0–69: `En proceso`
 * @author carolina Carvallo
 */
public class Ejercicio03_ClasificaciónRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("INGRESE EL PUNTAJE: ");
        double puntaje = sc.nextDouble();
        
        if (puntaje < 0 || puntaje > 100 ){
            System.out.println("Puntaje Invalido");}
        
        else 
            if (puntaje >= 90 && puntaje <= 100){
                System.out.println(" Exelente");}
            else 
                if (puntaje >= 70 && puntaje <= 89){
                    System.out.println("Bueno");}
                else 
                    if (puntaje >= 0 && puntaje <= 69 ){
                        System.out.println("En proceso");}
    }
}
/**
 * run:
INGRESE EL PUNTAJE: 95
 Exelente
 * run:
INGRESE EL PUNTAJE: 75
Bueno
* run:
INGRESE EL PUNTAJE: 45
En proceso
 */