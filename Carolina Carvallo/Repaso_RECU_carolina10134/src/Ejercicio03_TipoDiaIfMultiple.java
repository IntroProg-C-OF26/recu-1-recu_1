/**
 * Un sistema clasifica el día según la temperatura: frío (≤15 °C), templado 
 * (16–25 °C) o caluroso (≥26 °C).
 * @author carolina carvallo
 */
import java.util.Random;
public class Ejercicio03_TipoDiaIfMultiple {
    public static void main(String[] args) {
        Random ale = new Random();
        int temperatura = ale.nextInt(40); // TODO: asignar valor

        if (temperatura <= 15) {
            System.out.println("FRIO: " + temperatura);
        } else if (temperatura <= 25) {
            System.out.println("TEMPLADO: " + temperatura);
        } else {
            System.out.println("CALUROSO: " + temperatura);
        }

    }
}
