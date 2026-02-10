import java.util.Scanner;
/**
 * PROBLEMA:
 * Registrar estudiantes
 * Mostrar listado
 * Calcular y mostrar estadísticas
 * Buscar por nombre.
 * @author Esteban Rocano
 */
public class EjercicioFinal_SistemaBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[30];
        int[] notas = new int[30];
        int n = 0;              
        int opcion;             
        boolean registrado = false;
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Registrar estudiantes");
            System.out.println("2. Mostrar listado");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Buscar estudiante por nombre");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leerEnteroEnRango(sc, 0, 4);
            if (opcion == 1) {
                n = leerEnteroEnRango(sc, 1, 30);
                registrarEstudiantes(sc, nombres, notas, n);
                registrado = true;
            } else if (opcion == 2) {
                if (registrado) {
                    mostrarListado(nombres, notas, n);
                } else {
                    System.out.println("Primero registre estudiantes.");
                }
            } else if (opcion == 3) {
                if (registrado) {
                    mostrarEstadisticas(nombres, notas, n);
                } else {
                    System.out.println("Primero registre estudiantes.");
                }
            } else if (opcion == 4) {
                if (registrado) {
                    buscarPorNombre(sc, nombres, notas, n);
                } else {
                    System.out.println("Primero registre estudiantes.");
                }
            } else if (opcion == 0) {
                System.out.println("Saliendo del sistema...");
            }
        } while (opcion != 0);

        sc.close();
    }
    public static int leerEnteroEnRango(Scanner sc, int min, int max) {
        int valor;
        do {
            valor = sc.nextInt();
            if (valor < min || valor > max) {
                System.out.print("Valor fuera de rango (" + min + "-" + max + "), intente nuevamente: ");
            }
        } while (valor < min || valor > max);
        return valor;
    }
    public static int leerNotaValida(Scanner sc) {
        int nota;
        do {
            nota = sc.nextInt();
            if (nota < 0 || nota > 100) {
                System.out.print("Nota inválida (0-100), intente nuevamente: ");
            }
        } while (nota < 0 || nota > 100);
        return nota;
    }
    public static void registrarEstudiantes(Scanner sc, String[] nombres, int[] notas, int n) {
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese nota (0-100): ");
            notas[i] = leerNotaValida(sc);
        }
        System.out.println("Registro completado.");
    }
    public static void mostrarListado(String[] nombres, int[] notas, int n) {
        System.out.println("\nLISTADO DE ESTUDIANTES");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }
    public static void mostrarEstadisticas(String[] nombres, int[] notas, int n) {
        double promedio = calcularPromedio(notas, n);
        int mayor = notas[0];
        int menor = notas[0];
        String estMayor = nombres[0];
        String estMenor = nombres[0];
        for (int i = 1; i < n; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
                estMayor = nombres[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
                estMenor = nombres[i];
            }
        }
        System.out.println("Promedio del curso: " + promedio);
        System.out.println("Mayor nota: " + mayor + " (" + estMayor + ")");
        System.out.println("Menor nota: " + menor + " (" + estMenor + ")");
    }
    public static double calcularPromedio(int[] notas, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }
        return (double) suma / n;
    }
    public static void buscarPorNombre(Scanner sc, String[] nombres, int[] notas, int n) {
        sc.nextLine(); 
        System.out.print("Ingrese el nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (nombres[i].equals(buscado)) {
                System.out.println("Estudiante: " + nombres[i]);
                System.out.println("Nota: " + notas[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
