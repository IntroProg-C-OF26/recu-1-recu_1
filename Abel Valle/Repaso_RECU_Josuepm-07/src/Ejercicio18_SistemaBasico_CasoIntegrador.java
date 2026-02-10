import java.util.Scanner;
/**
 * Desarrollar un sistema en consola que permita:
 * 1. Registrar N estudiantes (1..30): nombre y nota (0..100)
 * 2. Mostrar listado (nombre – nota)
 * 3. Calcular y mostrar:
   - Promedio del curso
   - Mayor nota y estudiante
   - Menor nota y estudiante
 * 4. Permitir buscar por nombre (coincidencia exacta) y mostrar su nota
 * @author ABEL
 */
public class Ejercicio18_SistemaBasico_CasoIntegrador {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese el numero de estudiantes (1 - 30): ");
            n = tcl.nextInt();
            if (n < 1 || n > 30) {
                System.out.println("Número de estudiantes invalido.");
            }
        } while (n < 1 || n > 30);

        String[] nombres = new String[n];
        int[] notas = new int[n];

        int opc;
        do {
            System.out.println("\n\t===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar estudiantes");
            System.out.println("2. Mostrar listado");
            System.out.println("3. Mostrar promedio, mayor y menor");
            System.out.println("4. Buscar estudiante por nombre");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opc = tcl.nextInt();

            switch (opc) {
                case 1:
                    registrarEstudiantes(nombres, notas, n, tcl);
                    break;
                case 2:
                    mostrarListado(nombres, notas, n);
                    break;
                case 3:
                    double promedio = calcularPromedio(notas, n);
                    System.out.printf("Promedio del curso: %.2f%n", promedio);
                    mostrarMayorYMenor(nombres, notas, n);
                    break;
                case 4:
                    buscarPorNombre(nombres, notas, n, tcl);
                    break;
                case 0:
                    System.out.println("Salir del programa");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }

        } while (opc != 0);
    }
    
    public static int leerNotaValida(Scanner tcl) {
        int nota;
        do {
            System.out.print("Ingrese la nota (0 - 100): ");
            nota = tcl.nextInt();
            if (nota < 0 || nota > 100) {
                System.out.println("Nota invalida.");
            }
        } while (nota < 0 || nota > 100);
        return nota;
    }
    
    public static void registrarEstudiantes(String[] nombres, int[] notas, int n, Scanner tcl) {
        tcl.nextLine(); 
        System.out.println("\n--- INGRESO DE NOMBRES ---");
        for (int i = 0; i < n; i++) {
        System.out.print("Nombre del estudiante " + (i + 1) + ": ");
        nombres[i] = tcl.nextLine();
        }
        System.out.println("\n--- INGRESO DE NOTAS ---");
        for (int i = 0; i < n; i++) {
        System.out.println("Estudiante: " + nombres[i]);
        notas[i] = leerNotaValida(tcl);
    }

    System.out.println("Estudiantes y notas registrados correctamente");
    }
    
    public static void mostrarListado(String[] nombres, int[] notas, int n) {
        System.out.println("\n--- LISTADO DE ESTUDIANTES ---");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }
    
    public static double calcularPromedio(int[] notas, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }
        return suma / n;
    }
    
    public static void mostrarMayorYMenor(String[] nombres, int[] notas, int n) {
        int mayor = notas[0];
        int menor = notas[0];
        int posMayor = 0;
        int posMenor = 0;

        for (int i = 1; i < n; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
                posMayor = i;
            }
            if (notas[i] < menor) {
                menor = notas[i];
                posMenor = i;
            }
        }

        System.out.println("Mayor nota: " + mayor + " (" + nombres[posMayor] + ")");
        System.out.println("Menor nota: " + menor + " (" + nombres[posMenor] + ")");
    }
    
    public static void buscarPorNombre(String[] nombres, int[] notas, int n, Scanner tcl) {
    tcl.nextLine();
    System.out.print("Ingrese el nombre a buscar: ");
    String buscar = tcl.nextLine();

    boolean encontrado = false;
    for (int i = 0; i < n; i++) {
        if (nombres[i].equalsIgnoreCase(buscar)) {
            System.out.println("Estudiante: " + nombres[i]);
            System.out.println("Nota: " + notas[i]);
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("Estudiante no encontrado");
        }
    }
}
