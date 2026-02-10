import java.util.Scanner;
/**
 * SistemaBasico.java – Registro de notas (integrador)
Problema: Desarrollar un sistema en consola que permita:
Registrar N estudiantes (1..30): nombre y nota (0..100)
Mostrar listado (nombre – nota)
Calcular y mostrar:
Promedio del curso
Mayor nota y estudiante
Menor nota y estudiante
Permitir buscar por nombre (coincidencia exacta) y mostrar su nota
Requisitos:
Usar:
arreglos (nombre[], nota[])
ciclos (for/while)
métodos (modularización obligatoria)
Menú principal repetitivo hasta opción 0. Salir
 * @author Daniela
 */
public class Ejercicio18_SistemaBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamanioNomb = 30, tamanioNotas = 30;
        String[] nombres = new String[tamanioNomb];
        int[] notas = new int[tamanioNotas];
        int cantidadEstudiantes = 0;
        int opcion = -1;

        System.out.println("SISTEMA REGISTRO DE NOTAS");
        while (opcion != 0) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = tcl.nextInt();
            tcl.nextLine();
            switch (opcion) {
                case 1:
                    cantidadEstudiantes = registrarEstudiantes(tcl, nombres, notas);
                    break;
                case 2:
                    if (cantidadEstudiantes > 0) {
                        mostrarListado(nombres, notas, cantidadEstudiantes);
                    } else {
                        System.out.println("No hay datos para registrar");
                    }
                    break;
                case 3:
                    if (cantidadEstudiantes > 0) {
                        mostrarEstadisticas(nombres, notas, cantidadEstudiantes);
                    } else {
                        System.out.println("No hay datos para registrar");
                    }
                    break;
                case 4:
                    if (cantidadEstudiantes > 0) {
                        buscarPorNombre(tcl, nombres, notas, cantidadEstudiantes);
                    } else {
                        System.out.println("No hay datos registrar");
                    }
                    break;
                case 0:
                    System.out.println("Salio del registro");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    public static int registrarEstudiantes(Scanner tcl, String[] nombres, int[] notas) {
        System.out.print("Estudiantes que registrara (0-30): ");
        int n = tcl.nextInt();
        tcl.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
            int notaIngresada = -1;
            while (notaIngresada < 0 || notaIngresada > 100) {
                System.out.print("Nota para " + nombres[i] + " (0-100): ");
                notaIngresada = tcl.nextInt();
                if (notaIngresada < 0 || notaIngresada > 100) {
                    System.out.println("Error: La nota debe estar entre 0 y 100.");
                }
            }
            notas[i] = notaIngresada;
            tcl.nextLine();
        }
        return n;
    }

    public static void mostrarListado(String[] nombres, int[] notas, int n) {
        System.out.println("\nLISTADO:");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " -> Nota: " + notas[i]);
        }
    }

    public static void mostrarEstadisticas(String[] nombres, int[] notas, int n) {
        int suma = 0;
        int mayor = notas[0];
        int menor = notas[0];
        int posMayor = 0;
        int posMenor = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
            if (notas[i] > mayor) {
                mayor = notas[i];
                posMayor = i;
            }
            if (notas[i] < menor) {
                menor = notas[i];
                posMenor = i;
            }
        }
        double promedio = (double) suma / n;
        System.out.println("\nESTADISTICAS:");
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor nota: " + mayor + " (Estudiante: " + nombres[posMayor] + ")");
        System.out.println("Menor nota: " + menor + " (Estudiante: " + nombres[posMenor] + ")");
    }

    public static void buscarPorNombre(Scanner tcl, String[] nombres, int[] notas, int n) {
        System.out.print("Nombre que quiere buscar: ");
        String buscar = tcl.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (nombres[i].equals(buscar)) {
                System.out.println("Nota de " + nombres[i] + ": " + notas[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("No se encontró el nombre.");
    }

    public static void mostrarMenu() {
        System.out.println("1. Registrar");
        System.out.println("2. Mostrar Listado");
        System.out.println("3. Mostrar Estadisticas");
        System.out.println("4. Buscar por nombre");
        System.out.println("0. Salir");
    }
}

/*
run:
SISTEMA REGISTRO DE NOTAS
1. Registrar
2. Mostrar Listado
3. Mostrar Estadisticas
4. Buscar por nombre
0. Salir
Seleccione una opcion: 1
Estudiantes que registrara (0-30): 4
Nombre 1: Daniela Jaya
Nota para Daniela Jaya (0-100): 90
Nombre 2: Luis Torres
Nota para Luis Torres (0-100): 45
Nombre 3: Wendy Ochoa
Nota para Wendy Ochoa (0-100): 79
Nombre 4: Liliana Herrera
Nota para Liliana Herrera (0-100): 99
1. Registrar
2. Mostrar Listado
3. Mostrar Estadisticas
4. Buscar por nombre
0. Salir
Seleccione una opcion: 2

LISTADO:
Daniela Jaya -> Nota: 90
Luis Torres -> Nota: 45
Wendy Ochoa -> Nota: 79
Liliana Herrera -> Nota: 99
1. Registrar
2. Mostrar Listado
3. Mostrar Estadisticas
4. Buscar por nombre
0. Salir
Seleccione una opcion: 3

ESTADISTICAS:
Promedio: 78.25
Mayor nota: 99 (Estudiante: Liliana Herrera)
Menor nota: 45 (Estudiante: Luis Torres)
1. Registrar
2. Mostrar Listado
3. Mostrar Estadisticas
4. Buscar por nombre
0. Salir
Seleccione una opcion: 4
Nombre que quiere buscar: Wendy Ochoa
Nota de Wendy Ochoa: 79
1. Registrar
2. Mostrar Listado
3. Mostrar Estadisticas
4. Buscar por nombre
0. Salir
Seleccione una opcion: 0
Salio del registro
*/