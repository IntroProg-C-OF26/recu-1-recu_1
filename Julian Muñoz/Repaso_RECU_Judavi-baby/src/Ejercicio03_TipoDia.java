
import java.util.Random;

/**
 * Un sistema clasifica el día según la temperatura: frío (≤15 °C), templado (16–25 °C) o caluroso (≥26 °C).
 * @author julian muñoz
 */
public class Ejercicio03_TipoDia {
    public static void main(String[] args) {
        Random ale = new Random();
        int temperatura = ale.nextInt(40);
        
        if (temperatura <= 15){
            System.out.println("Frio: " + temperatura);
        } else if (temperatura <= 25) {
            System.out.println("Templado: " + temperatura);
        } else {
            System.out.println("Caluroso: " + temperatura);
        }
    }
}
