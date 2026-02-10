/*
 *PasoParametros.java – Validación y reutilización
Problema: Solicite una nota (0–100). Use métodos para:

Leer y validar la nota
Determinar estado: Aprobado (>=70) o Reprobado
Requisitos:

Métodos sugeridos:
leerNotaValida(Scanner sc) → retorna int válido
obtenerEstado(int nota) → retorna String
main solo orquesta y muestra.
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nota = leerNotaValida(sc);
        String estado = obtenerEstado(nota);
        
        System.out.println("La nota es: " + nota);
        System.out.println("Estado del alumno: " + estado);
    }

    public static int leerNotaValida(Scanner sc) {
        int nota;
        do {
            System.out.print("Ingrese nota (0-100): ");
            nota = sc.nextInt();
        } while (nota < 0 || nota > 100);
        return nota;
    }

    public static String obtenerEstado(int nota) {
        if (nota >= 70) return "Aprobado";
        else return "Reprobado";
    }
}
/***
 * Ingrese nota (0-100): 77
La nota es: 77
Estado del alumno: Aprobado
* 
* Ingrese nota (0-100): 69
La nota es: 69
Estado del alumno: Reprobado
 */
