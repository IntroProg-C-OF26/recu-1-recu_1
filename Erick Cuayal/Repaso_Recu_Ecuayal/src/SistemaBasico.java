
import java.util.Scanner;


/**
 *
 * @author Erick 
 */

public class SistemaBasico {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n = leerEnteroEnRango(tcl, "Cantidad de estudiantes (1-30): ", 1, 30);
        
        String[] nombres = new String[n];
        double[] notas = new double[n];
        
        int opcion;
        boolean cargado = false;

        do {
            System.out.println("\n1. Registrar");
            System.out.println("2. Mostrar");
            System.out.println("3. Estadisticas");
            System.out.println("4. Buscar");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = tcl.nextInt();

            switch (opcion) {
                case 1:
                    registrarEstudiantes(tcl, nombres, notas);
                    cargado = true;
                    break;
                case 2:
                    if (cargado) mostrarListado(nombres, notas);
                    else System.out.println("No hay datos");
                    break;
                case 3:
                    if (cargado) mostrarEstadisticas(nombres, notas);
                    else System.out.println("No hay datos");
                    break;
                case 4:
                    if (cargado) buscarPorNombre(tcl, nombres, notas);
                    else System.out.println("No hay datos");
                    break;
            }
        } while (opcion != 0);
    }

    public static int leerEnteroEnRango(Scanner sc, String msj, int min, int max) {
        int valor;
        do {
            System.out.print(msj);
            valor = sc.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }

    public static void registrarEstudiantes(Scanner sc, String[] nombres, double[] notas) {
        for (int i = 0; i < nombres.length; i++) {
            sc.nextLine();
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            
            double nt;
            do {
                System.out.print("Nota: ");
                nt = sc.nextDouble();
            } while (nt < 0 || nt > 100);
            notas[i] = nt;
        }
    }

    public static void mostrarListado(String[] nombres, double[] notas) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }

    public static void mostrarEstadisticas(String[] nombres, double[] notas) {
        double suma = 0, mayor = notas[0], menor = notas[0];
        int pM = 0, pm = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] > mayor) {
                mayor = notas[i];
                pM = i;
            }
            if (notas[i] < menor) {
                menor = notas[i];
                pm = i;
            }
        }
        System.out.printf("Promedio: %.2f\n", (suma / notas.length));
        System.out.println("Mayor: " + mayor + " (" + nombres[pM] + ")");
        System.out.println("Menor: " + menor + " (" + nombres[pm] + ")");
    }

    public static void buscarPorNombre(Scanner sc, String[] nombres, double[] notas) {
        sc.nextLine();
        System.out.print("Nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean ok = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscado)) {
                System.out.println("Nota: " + notas[i]);
                ok = true;
                break;
            }
        }
        if (!ok) System.out.println("No encontrado");
    }
}