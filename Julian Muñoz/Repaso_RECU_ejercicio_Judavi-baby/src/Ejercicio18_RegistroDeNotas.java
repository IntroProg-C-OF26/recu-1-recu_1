
import java.util.Scanner;

public class Ejercicio18_RegistroDeNotas {
    public static void mostrarMenu() {
        System.out.println("\nMENÚ PRINCIPAL");
        System.out.println("1. Registrar estudiantes");
        System.out.println("2. Mostrar listado");
        System.out.println("3. Mostrar estadísticas");
        System.out.println("4. Buscar estudiante por nombre");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }


    public static int leerCantidadEstudiantes(Scanner sc) {
        int n;
        do {
            System.out.print("Ingrese número de estudiantes (1-30): ");
            n = sc.nextInt();
            sc.nextLine(); // limpiar buffer
        } while (n < 1 || n > 30);
        return n;
    }


    public static void registrarEstudiantes(String[] nombres, double[] notas, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            do {
                System.out.print("Nota (0-100): ");
                notas[i] = sc.nextDouble();
            } while (notas[i] < 0 || notas[i] > 100);

            sc.nextLine(); 
        }
        System.out.println("Registro completado.");
    }


    public static void mostrarListado(String[] nombres, double[] notas, int n) {
        System.out.println("\nLISTADO DE ESTUDIANTES");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }


    public static void mostrarEstadisticas(String[] nombres, double[] notas, int n) {
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];
        String estMayor = nombres[0];
        String estMenor = nombres[0];

        for (int i = 0; i < n; i++) {
            suma += notas[i];

            if (notas[i] > mayor) {
                mayor = notas[i];
                estMayor = nombres[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
                estMenor = nombres[i];
            }
        }

        double promedio = suma / n;

        System.out.printf("Promedio del curso: %.2f%n", promedio);
        System.out.println("Mayor nota: " + mayor + " (" + estMayor + ")");
        System.out.println("Menor nota: " + menor + " (" + estMenor + ")");
    }


    public static void buscarPorNombre(String[] nombres, double[] notas, int n, Scanner sc) {
        System.out.print("Ingrese el nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < n; i++) {
            if (nombres[i].equals(buscado)) {
                System.out.println("Nota de " + nombres[i] + ": " + notas[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int n = 0;
        String[] nombres = null;
        double[] notas = null;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    n = leerCantidadEstudiantes(sc);
                    nombres = new String[n];
                    notas = new double[n];
                    registrarEstudiantes(nombres, notas, n, sc);
                    break;

                case 2:
                    if (nombres != null)
                        mostrarListado(nombres, notas, n);
                    else
                        System.out.println("Primero registre estudiantes.");
                    break;

                case 3:
                    if (nombres != null)
                        mostrarEstadisticas(nombres, notas, n);
                    else
                        System.out.println("Primero registre estudiantes.");
                    break;

                case 4:
                    if (nombres != null)
                        buscarPorNombre(nombres, notas, n, sc);
                    else
                        System.out.println("Primero registre estudiantes.");
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }
}
