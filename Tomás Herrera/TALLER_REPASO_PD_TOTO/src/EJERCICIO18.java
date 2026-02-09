/*
 SistemaBasico.java – Registro de notas (integrador)
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
Validaciones básicas (N, notas, opción de menú)
Buenas prácticas: nombres claros, comentarios breves.
Sugerencia de métodos (mínimos):

leerEnteroEnRango(...)
leerNotaValida(...)
registrarEstudiantes(...)
mostrarListado(...)
calcularPromedio(...)
buscarPorNombre(...)
 * @author toto1
 */
import java.util.Scanner;

public class EJERCICIO18 {
    
    static String[] nombres;
    static double[] notas;
    static int cantidadEstudiantes = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Defina la capacidad del curso: ");
        int N = sc.nextInt();
        nombres = new String[N];
        notas = new double[N];

        int opcion;
        do {
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Ver Listado");
            System.out.println("3. Calcular Promedio del Curso");
            System.out.println("4. Buscar por Nombre");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: registrarEstudiante(sc, N); break;
                case 2: mostrarListado(); break;
                case 3: calcularPromedioCurso(); break;
                case 4: buscarPorNombre(sc); break;
                case 0: System.out.println("Gracias"); break;
                default: System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }

    public static void registrarEstudiante(Scanner sc, int max) {
        if (cantidadEstudiantes >= max) {
            System.out.println("Error: Curso lleno.");
            return;
        }
        
        System.out.print("Nombre: ");
        nombres[cantidadEstudiantes] = sc.next();
        
        double nota;
        do {
            System.out.print("Nota (0-100): ");
            nota = sc.nextDouble();
        } while (nota < 0 || nota > 100);
        
        notas[cantidadEstudiantes] = nota;
        cantidadEstudiantes++;
        System.out.println("Registrado con exito.");
    }

    public static void mostrarListado() {
        System.out.println(" LISTADO ");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println((i+1) + ". " + nombres[i] + " - " + notas[i]);
        }
    }

    public static void calcularPromedioCurso() {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay alumnos registrados.");
            return;
        }
        double suma = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            suma += notas[i];
        }
        System.out.println("Promedio del curso: " + (suma / cantidadEstudiantes));
    }

    public static void buscarPorNombre(Scanner sc) {
        System.out.print("Ingrese nombre a buscar: ");
        String buscar = sc.next();
        boolean encontrado = false;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (nombres[i].equals(buscar)) {
                System.out.println("Encontrado: " + nombres[i] + " tiene nota " + notas[i]);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Estudiante no encontrado.");
    }
}
/***
 * Defina la capacidad del curso: 8
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 1
Nombre: Tomas
Nota (0-100): 88
Registrado con exito.
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 1
Nombre: Jose
Nota (0-100): 77
Registrado con exito.
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 1
Nombre: Isaac
Nota (0-100): 100
Registrado con exito.
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 1
Nombre: Che
Nota (0-100): 98
Registrado con exito.
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 2
--- LISTADO ---
1. Tomas - 88.0
2. Jose - 77.0
3. Isaac - 100.0
4. Che - 98.0
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 3
Promedio del curso: 90.75
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 4
Ingrese nombre a buscar: Che
Encontrado: Che tiene nota 98.0
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 4
Ingrese nombre a buscar: Isaias
Estudiante no encontrado.
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 4
Ingrese nombre a buscar: Tomas
Encontrado: Tomas tiene nota 88.0
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 0
Gracias
* 
*  Defina la capacidad del curso: 2
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 1
Nombre: Tomas
Nota (0-100): 100
Registrado con exito.
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 1
Nombre: Irene
Nota (0-100): 100
Registrado con exito.
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 1
Error: Curso lleno.
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 2
 LISTADO 
1. Tomas - 100.0
2. Irene - 100.0
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 3
Promedio del curso: 100.0
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 4
Ingrese nombre a buscar: Irene
Encontrado: Irene tiene nota 100.0
1. Registrar Estudiante
2. Ver Listado
3. Calcular Promedio del Curso
4. Buscar por Nombre
0. Salir
Opcion: 0
Gracias
 */