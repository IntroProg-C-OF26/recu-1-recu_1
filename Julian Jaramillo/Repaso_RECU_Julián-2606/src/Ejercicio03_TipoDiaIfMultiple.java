/**
 * Un sistema clasifica el día según la temperatura: frío (≤15 °C), templado 
 * (16–25 °C) o caluroso (≥26 °C).
 * @author macbookpro
 */
import java.util.Random;
public class Ejercicio03_TipoDiaIfMultiple {

    public static void main(String[] args) {
        Random ale = new Random();
        int temperatura = ale.nextInt(40); // TODO: asignar valor
        System.out.println("la temperatura es de: " + temperatura);
        if (temperatura <= 15) {
            System.out.println("FRIO");
        } else if (temperatura <= 25) {
            System.out.println("TEMPLADO");
        } else {
            System.out.println("CALUROSO");
        }

    }
}
/**
 * run:
la temperatura es de: 17
TEMPLADO
BUILD SUCCESSFUL (total time: 0 seconds)

 */