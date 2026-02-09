
import java.util.Scanner;

/**
 * Desarrollar un sistema en consola que permita: 1. Registrar N estudiantes
 * (1..30): nombre y nota (0..100) 2. Mostrar listado (nombre – nota) 3.
 * Calcular y mostrar: - Promedio del curso - Mayor nota y estudiante - Menor
 * nota y estudiante 4. Permitir buscar por nombre (coincidencia exacta) y
 * mostrar su nota
 *
 * @author carolina carvallo
 */
public class Ejercicio18_RegistroNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = leerEnteroEnRango(sc, "Ingrese cantidad de estudiantes (1-30): ", 1, 30);

        String[] nombres = new String[n];
        int[] notas = new int[n];

        int opcion;
        boolean registrado = false;

        do {
            System.out.println("\n--- SISTEMA DE REGISTRO DE NOTAS ---");
            System.out.println("1. Registrar estudiantes");
            System.out.println("2. Mostrar listado");
            System.out.println("3. Estadisticas (Promedio, Max, Min)");
            System.out.println("4. Buscar estudiante por nombre");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt(); 

            switch (opcion) {
                case 1:
                    registrarEstudiantes(sc, nombres, notas);
                    registrado = true;
                    break;
                case 2:
                    if (registrado) {
                        mostrarListado(nombres, notas);
                    } else {
                        System.out.println("Primero debe registrar datos.");
                    }
                    break;
                case 3:
                    if (registrado) {
                        mostrarEstadisticas(nombres, notas);
                    } else {
                        System.out.println("No hay datos para procesar.");
                    }
                    break;
                case 4:
                    if (registrado) {
                        buscarPorNombre(sc, nombres, notas);
                    } else {
                        System.out.println("Registro vacío.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

   
    public static int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max) {
        int valor;
        do {
            System.out.print(mensaje);
            valor = sc.nextInt();
            if (valor < min || valor > max) {
                System.out.println("Error: Fuera de rango.");
            }
        } while (valor < min || valor > max);
        return valor;
    }

    public static void registrarEstudiantes(Scanner sc, String[] nom, int[] not) {
        for (int i = 0; i < nom.length; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Nombre: ");
            nom[i] = sc.nextLine();
            not[i] = leerEnteroEnRango(sc, "Nota (0-100): ", 0, 100);
            sc.nextLine();
        }
        System.out.println("\n>> Registro completado.");
    }

    public static void mostrarListado(String[] nom, int[] not) {
        System.out.println("\nLISTADO DE ESTUDIANTES:");
        for (int i = 0; i < nom.length; i++) {
            System.out.println("- " + nom[i] + ": " + not[i]);
        }
    }

    public static void mostrarEstadisticas(String[] nom, int[] not) {
        double suma = 0;
        int max = not[0], min = not[0];
        int posMax = 0, posMin = 0;

        for (int i = 0; i < not.length; i++) {
            suma += not[i];
            if (not[i] > max) {
                max = not[i];
                posMax = i;
            }
            if (not[i] < min) {
                min = not[i];
                posMin = i;
            }
        }

        System.out.println("\n--- ESTADiISTICAS ---");
        System.out.println("Promedio del curso: " + (suma / not.length));
        System.out.println("Mayor nota: " + max + " (" + nom[posMax] + ")");
        System.out.println("Menor nota: " + min + " (" + nom[posMin] + ")");
    }

    public static void buscarPorNombre(Scanner sc, String[] nom, int[] not) {
        System.out.print("\nIngrese nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nom.length; i++) {
            if (nom[i].equalsIgnoreCase(buscado)) {
                System.out.println("Encontrado -> " + nom[i] + " - Nota: " + not[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no registrado.");
        }
    }
}
