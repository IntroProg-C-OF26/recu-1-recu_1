import java.util.Scanner;
/**
 *18) SistemaBasico.java– Registro de notas (integrador)
Problema: Desarrollar un sistema en consola que permita:
Registrador N estudiantes (1..30): nombre y nota (0..100)
Mostrar listado (nombre – nota)
Calcular y mostrar:
Promedio del curso
Mayor nota y estudiante
Menor nota y estudiante
Permitir buscar por nombre (coincidencia exacta) y mostrar su nota
 * @author Santaigo Iñiguez
 * @version 1.0
 */
public class Caso_Integrador {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[] nombres = new String[30];
        int[] notas = new int[30];
        int cantidadActual = 0; 
        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE REGISTRO ACADEMICO ---");
            System.out.println("1. Registrar Estudiantes");
            System.out.println("2. Mostrar Listado");
            System.out.println("3. Ver EstadIsticas (Promedio, Mayor, Menor)");
            System.out.println("4. Buscar Estudiante por Nombre");
            System.out.println("0. Salir");
            opcion = leerEnteroEnRango(tcl, "Seleccione una opcion: ", 0, 4);

            switch (opcion) {
                case 1:
                    int n = leerEnteroEnRango(tcl, "¿Cuantos estudiantes registrara? (1-30): ", 1, 30);
                    registrarEstudiantes(tcl, nombres, notas, n);
                    cantidadActual = n; 
                    break;
                case 2:
                    if (cantidadActual > 0) mostrarListado(nombres, notas, cantidadActual);
                    else System.out.println("No hay datos registrados.");
                    break;
                case 3:
                    if (cantidadActual > 0) mostrarEstadisticas(nombres, notas, cantidadActual);
                    else System.out.println("No hay datos registrados.");
                    break;
                case 4:
                    if (cantidadActual > 0) {
                        System.out.print("Ingrese nombre a buscar: ");
                        String busqueda = tcl.next();
                        buscarPorNombre(nombres, notas, cantidadActual, busqueda);
                    } else System.out.println("No hay datos registrados.");
                    break;
            }
        } while (opcion != 0);
    }
    public static int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max) {
        int valor;
        do {
            System.out.print(mensaje);
            valor = sc.nextInt();
            if (valor < min || valor > max) System.out.println("Error: Valor fuera de rango (" + min + "-" + max + ").");
        } while (valor < min || valor > max);
        return valor;
    }
    public static void registrarEstudiantes(Scanner sc, String[] nombres, int[] notas, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = sc.next();
            notas[i] = leerEnteroEnRango(sc, "Nota (0-100): ", 0, 100);
        }
    }
    public static void mostrarListado(String[] nombres, int[] notas, int n) {
        System.out.println("\n--- LISTADO DE NOTAS ---");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - Nota: " + notas[i]);
        }
    }
    public static void mostrarEstadisticas(String[] nombres, int[] notas, int n) {
        double suma = 0;
        int mayor = notas[0], menor = notas[0];
        int posMayor = 0, posMenor = 0;

        for (int i = 0; i < n; i++) {
            suma += notas[i];
            if (notas[i] > mayor) { mayor = notas[i]; posMayor = i; }
            if (notas[i] < menor) { menor = notas[i]; posMenor = i; }
        }
        System.out.println("\n--- ESTADISTICAS ---");
        System.out.println("Promedio del curso: " + (suma / n));
        System.out.println("Mayor nota: " + mayor + " (" + nombres[posMayor] + ")");
        System.out.println("Menor nota: " + menor + " (" + nombres[posMenor] + ")");
    }
    public static void buscarPorNombre(String[] nombres, int[] notas, int n, String busqueda) {
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (nombres[i].equalsIgnoreCase(busqueda)) {
                System.out.println("Encontrado: " + nombres[i] + " tiene una nota de: " + notas[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("Estudiante no encontrado.");
    }
}
/**
 *run:
--- SISTEMA DE REGISTRO ACADEMICO ---
1. Registrar Estudiantes
2. Mostrar Listado
3. Ver EstadIsticas (Promedio, Mayor, Menor)
4. Buscar Estudiante por Nombre
0. Salir
Seleccione una opcion: 1
�Cuantos estudiantes registrara? (1-30): 3

Estudiante #1
Nombre: Santaigo
Nota (0-100): 99

Estudiante #2
Nombre: Analia
Nota (0-100): 60

Estudiante #3
Nombre: Micaela
Nota (0-100): 67

--- SISTEMA DE REGISTRO ACADEMICO ---
1. Registrar Estudiantes
2. Mostrar Listado
3. Ver EstadIsticas (Promedio, Mayor, Menor)
4. Buscar Estudiante por Nombre
0. Salir
Seleccione una opcion: 2

--- LISTADO DE NOTAS ---
Santaigo - Nota: 99
Analia - Nota: 60
Micaela - Nota: 67

--- SISTEMA DE REGISTRO ACADEMICO ---
1. Registrar Estudiantes
2. Mostrar Listado
3. Ver EstadIsticas (Promedio, Mayor, Menor)
4. Buscar Estudiante por Nombre
0. Salir
Seleccione una opcion: 3

--- ESTADISTICAS ---
Promedio del curso: 75.33333333333333
Mayor nota: 99 (Santaigo)
Menor nota: 60 (Analia)

--- SISTEMA DE REGISTRO ACADEMICO ---
1. Registrar Estudiantes
2. Mostrar Listado
3. Ver EstadIsticas (Promedio, Mayor, Menor)
4. Buscar Estudiante por Nombre
0. Salir
Seleccione una opcion: 4
Ingrese nombre a buscar: Santiago
Estudiante no encontrado.

--- SISTEMA DE REGISTRO ACADEMICO ---
1. Registrar Estudiantes
2. Mostrar Listado
3. Ver EstadIsticas (Promedio, Mayor, Menor)
4. Buscar Estudiante por Nombre
0. Salir
Seleccione una opcion: 0
BUILD SUCCESSFUL (total time: 1 minute 3 seconds)
 */