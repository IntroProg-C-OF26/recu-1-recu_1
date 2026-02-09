
import java.util.Scanner;

/**
 *Solicite una nota (0–100). Use métodos para:
- Leer y validar la nota
- Determinar estado: `Aprobado` (>=70) o `Reprobado
 * @author carolina carvallo
 */
public class Ejercicio17_validacionYreutilizacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = LeerNotaValida(sc);
        
        String estado = obtenerEstado(nota);
                        
        System.out.println("\n---RESULTADO FINAL---");
        System.out.println("notas ingresadas: " + nota);
        System.out.println("Estado de la nota: " + estado);
    }
    
    public static int LeerNotaValida(Scanner sc){
        int n; 
        do{
            System.out.print("INGRESE LA NOTA: ");
            n = sc.nextInt();
            if (n < 0 || n > 100){
                System.out.print("la nota no valida rango de (0-100)");
            }
        }while (n < 0 || n > 100);
    return n;    
    }
    public static String obtenerEstado(int nota){
        if (nota >= 70){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
    }
}    
/**
 * run:
INGRESE LA NOTA: 65

---RESULTADO FINAL---
notas ingresadas: 65
Estado de la nota: Reprobado
run:
INGRESE LA NOTA: 87

---RESULTADO FINAL---
notas ingresadas: 87
Estado de la nota: Aprobado
 */