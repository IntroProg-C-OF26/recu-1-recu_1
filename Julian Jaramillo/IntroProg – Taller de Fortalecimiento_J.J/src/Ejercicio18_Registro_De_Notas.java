/**
 * Ejercicio18:
 * Problema: Desarrollar un sistema en consola que permita:
Registrador N estudiantes (1..30): nombre y nota (0..100)
Mostrar listado (nombre – nota)
Calcular y mostrar:
Promedio del curso
Mayor nota y estudiante
Menor nota y estudiante
Permitir buscar por nombre (coincidencia exacta) y mostrar su nota
Requisitos:
Usar:
arreglos (nombre[], nota[])
ciclos (para/mientras)
métodos (modularización obligatoria)
Menú principal repetitivo hasta opción0. Salir
Validaciones básicas (N, notas, opción de menú)
Buenas prácticas: nombres claros, comentarios breves.
Sugerencia de métodos (mínimos):
leerEnteroEnRango(...)
leerNotaValida(...)
registrarEstudiantes(...)
mostrarListado(...)
calcularPromedio(...)
buscarPorNombre(...)
 * @author julian jaramillo 
 */
import java.util.Scanner;
public class Ejercicio18_Registro_De_Notas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[] nombres = new String[30];
        int[] notas = new int[30];
        int N = 0, opciones;
        do {
            System.out.println("ELIJA UNA OPCION: ");
            System.out.println("1. Registrar estudiantes");
            System.out.println("2. Mostrar listado");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Buscar por nombre");
            System.out.println("0. Salir");
            opciones = tcl.nextInt();
            switch (opciones) {
                case 1:
                    System.out.println("Ingrese el numero de estudiantes:");
                    N = leerEnteroEnRango(tcl, 1, 30);
                    registrarEstudiantes(tcl, nombres, notas, N);
                    break;
                case 2:
                    mostrarListado(nombres, notas, N);
                    break;
                case 3:
                    mostrarEstadisticas(nombres, notas, N);
                    break;
                case 4:
                    tcl.nextLine();
                    System.out.println("Ingrese nombre:");
                    String nombre = tcl.nextLine();
                    buscarPorNombre(nombres, notas, N, nombre);
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opciones != 0);
    }
    // aqui lee un entero dentro de un rango
    public static int leerEnteroEnRango(Scanner tcl, int min, int max) {
        int valornum;
        do {
            valornum = tcl.nextInt();
        } while (valornum < min || valornum > max);
        return valornum;
    }
    // aqui lee una nota valida
    public static int leerNotaValida(Scanner tcl) {
        return leerEnteroEnRango(tcl, 0, 100);
    }
    // aqui registra nombres y notas
    public static void registrarEstudiantes(Scanner tcl, String[] nombres, int[] notas, int N) {
        for (int i = 0; i < N; i++) {
            tcl.nextLine();
            System.out.println("Nombre:");
            nombres[i] = tcl.nextLine();

            System.out.println("Nota:");
            notas[i] = leerNotaValida(tcl);
        }
    }
    // aqui muestra listado
    public static void mostrarListado(String[] nombres, int[] notas, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }
    // aqui calcula y muestra promedio, mayor y menor
    public static void mostrarEstadisticas(String[] nombres, int[] notas, int N) {
        int suma = 0, mayor = notas[0], menor = notas[0];
        String nombreMayor = nombres[0], nombreMenor = nombres[0]; 
        for (int i = 0; i < N; i++) {
            suma += notas[i];
            if (notas[i] > mayor) {
                mayor = notas[i];
                nombreMayor = nombres[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
                nombreMenor = nombres[i];
            }
        }
        double promedio = (double) suma / N;
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor nota: " + mayor + " " + nombreMayor);
        System.out.println("Menor nota: " + menor + " " + nombreMenor);
    }
    // aqui busca estudiante por nombre
    public static void buscarPorNombre(String[] nombres, int[] notas, int N, String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < N; i++) {
            if (nombres[i].equals(nombre)) {
                System.out.println(nombres[i] + " - " + notas[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No encontrado");
        }
    }
}

/**
 * run:
ELIJA UNA OPCION: 
1. Registrar estudiantes
2. Mostrar listado
3. Mostrar estadisticas
4. Buscar por nombre
0. Salir
1
Ingrese el numero de estudiantes:
5
Nombre:
julian
Nota:
8
Nombre:
vanessa
Nota:
5
Nombre:
julio
Nota:
2
Nombre:
alex
Nota:
9
Nombre:
maria
Nota:
10
ELIJA UNA OPCION: 
1. Registrar estudiantes
2. Mostrar listado
3. Mostrar estadisticas
4. Buscar por nombre
0. Salir
2
julian - 8
vanessa - 5
julio - 2
alex - 9
maria - 10
ELIJA UNA OPCION: 
1. Registrar estudiantes
2. Mostrar listado
3. Mostrar estadisticas
4. Buscar por nombre
0. Salir
3
Promedio: 6.8
Mayor nota: 10 maria
Menor nota: 2 julio
ELIJA UNA OPCION: 
1. Registrar estudiantes
2. Mostrar listado
3. Mostrar estadisticas
4. Buscar por nombre
0. Salir
4
Ingrese nombre:
maria
maria - 10
ELIJA UNA OPCION: 
1. Registrar estudiantes
2. Mostrar listado
3. Mostrar estadisticas
4. Buscar por nombre
0. Salir
0
Programa finalizado
BUILD SUCCESSFUL (total time: 1 minute 12 seconds)
 */