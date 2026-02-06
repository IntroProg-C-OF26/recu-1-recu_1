
import java.util.Random;

/**
 * Un sistema clasifica el día según la temperatura: frío (≤15 °C), templado 
 * (16–25 °C) o caluroso (≥26 °C).
 * @author Erick
 */

public class Ejercicio03_TipoDiaIfMultiple {

    public static void main(String[] args) {
        Random ale = new Random(); 
        
        int temperatura = ale.nextInt(40); // TODO: asignar valor

        if (temperatura <= 15) {
            System.out.println("Todo el dia frio");
        } else if (temperatura <= 25) {
             System.out.println("Dia templado"); 
        } else {
            System.out.println("Todo el dia caluroso");
        }
        System.out.println("temperatura es = °" + temperatura);
    }
}
/*
run:
Dia templado
temperatura es = �23
BUILD SUCCESSFUL (total time: 0 seconds)
*/