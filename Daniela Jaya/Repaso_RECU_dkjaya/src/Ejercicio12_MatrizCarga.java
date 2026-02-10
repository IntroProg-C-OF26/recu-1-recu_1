
import java.util.Scanner;

/**
 * MatrizCarga.java – Crear y llenar una matriz
Problema: Solicite filas f (1..10) y columnas c (1..10). Cree una matriz f x c
* de enteros y llénela por teclado.
Requisitos:
Validar rangos.
Al finalizar, mostrar Matriz cargada.
 * @author Daniela
 */
public class Ejercicio12_MatrizCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c;
        System.out.print("Ingrese la cantidad de filas: ");
        f = tcl.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        c = tcl.nextInt();
        int matriz[][] = new int [f][c];
        if (f < 1 || f > 10 || c < 1 || c > 10) {
            System.out.println("Valores no validos");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor de [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("Matriz Cargada");
    }
}

/*
run:
Ingrese la cantidad de filas: 4
Ingrese la cantidad de columnas: 4
Ingrese el valor de [0][0]: 12
Ingrese el valor de [0][1]: 23
Ingrese el valor de [0][2]: 45
Ingrese el valor de [0][3]: 12
Ingrese el valor de [1][0]: 89
Ingrese el valor de [1][1]: 98
Ingrese el valor de [1][2]: 45
Ingrese el valor de [1][3]: 67
Ingrese el valor de [2][0]: 45
Ingrese el valor de [2][1]: 34
Ingrese el valor de [2][2]: 27
Ingrese el valor de [2][3]: 59
Ingrese el valor de [3][0]: 65
Ingrese el valor de [3][1]: 45
Ingrese el valor de [3][2]: 12
Ingrese el valor de [3][3]: 44
Matriz Cargada
*/