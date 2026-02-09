/**
 *ForBasico.java – Tabla de multiplicar
Problema: Solicite un número entero n y muestre su tabla del 1 al 12.

Requisitos:

Usar for.
Validar que n sea positivo.
Salida esperada (formato sugerido): n x i = resultado
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un numero entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.println("Tabla del " + n + ":");
        
        for (int i = 1; i <= 12; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
/***
 * RUN:
 * Ingrese un numero entero positivo: 8
Tabla del 8:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
8 x 11 = 88
8 x 12 = 96
* 
* Ingrese un numero entero positivo: 19
Tabla del 19:
19 x 1 = 19
19 x 2 = 38
19 x 3 = 57
19 x 4 = 76
19 x 5 = 95
19 x 6 = 114
19 x 7 = 133
19 x 8 = 152
19 x 9 = 171
19 x 10 = 190
19 x 11 = 209
19 x 12 = 228
 */