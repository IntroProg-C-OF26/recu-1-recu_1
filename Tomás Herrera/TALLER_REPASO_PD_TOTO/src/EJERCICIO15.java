/*
 * MetodosSinRetorno.java – Menú modular (void)
Problema: Implementar un menú con opciones que llamen a métodos void:

Mostrar saludo
Mostrar tabla de un número (1..12)
Salir
Requisitos:

Crear métodos:
mostrarSaludo()
mostrarTabla(int n)
main controla el menú y llama a métodos
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Saludar");
            System.out.println("2. Tabla de multiplicar");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                mostrarSaludo();
            } else if (opcion == 2) {
                System.out.print("Ingrese numero: ");
                int n = sc.nextInt();
                mostrarTabla(n);
            }

        } while (opcion != 0);
    }

    public static void mostrarSaludo() {
        System.out.println("Hola Bienvenido al sistema modular.");
    }

    public static void mostrarTabla(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
/***
 * 1. Saludar
2. Tabla de multiplicar
0. Salir
1
Hola Bienvenido al sistema modular.
1. Saludar
2. Tabla de multiplicar
0. Salir
2
Ingrese numero: 13
13 x 1 = 13
13 x 2 = 26
13 x 3 = 39
13 x 4 = 52
13 x 5 = 65
13 x 6 = 78
13 x 7 = 91
13 x 8 = 104
13 x 9 = 117
13 x 10 = 130
13 x 11 = 143
13 x 12 = 156
1. Saludar
2. Tabla de multiplicar
0. Salir
24
1. Saludar
2. Tabla de multiplicar
0. Salir
2
Ingrese numero: 1
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
1 x 6 = 6
1 x 7 = 7
1 x 8 = 8
1 x 9 = 9
1 x 10 = 10
1 x 11 = 11
1 x 12 = 12
1. Saludar
2. Tabla de multiplicar
0. Salir
0
* 
* 1. Saludar
2. Tabla de multiplicar
0. Salir
2
Ingrese numero: 2
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
2 x 11 = 22
2 x 12 = 24
1. Saludar
2. Tabla de multiplicar
0. Salir
1
Hola Bienvenido al sistema modular.
1. Saludar
2. Tabla de multiplicar
0. Salir
0
 */
