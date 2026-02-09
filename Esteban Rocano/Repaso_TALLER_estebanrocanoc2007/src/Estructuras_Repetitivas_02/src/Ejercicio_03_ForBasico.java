import java.util.Scanner;
/**
 * Tabla de multiplicar
 * Solicite un número entero `n` y muestre su tabla del 1 al 12.
 * Requisitos:
 * Usar **for**
 * Validar que `n` sea positivo.
 * Salida esperada (formato sugerido):
 * n x i = resultado
 * @author Esteban Rocano
 */
public class Ejercicio_03_ForBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese un numero");
        n = tcl.nextInt();
        for (int i = 0; i <= 12; i++) {
            System.out.println(+n+"x"+i+"="+i*n);    
        }
    }
}
/**
 * run:
Ingrese un numero
6
6x0=0
6x1=6
6x2=12
6x3=18
6x4=24
6x5=30
6x6=36
6x7=42
6x8=48
6x9=54
6x10=60
6x11=66
6x12=72
BUILD SUCCESSFUL (total time: 4 seconds)
 */