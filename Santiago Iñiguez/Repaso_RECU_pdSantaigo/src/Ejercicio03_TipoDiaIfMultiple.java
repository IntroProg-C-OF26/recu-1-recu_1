/**
 * Un sistema clasifica el día según la temperatura: frío (≤15 °C), templado 
 * (16–25 °C) o caluroso (≥26 °C).
 * @author macbookpro
 */
public class Ejercicio03_TipoDiaIfMultiple {

    public static void main(String[] args) {

        int temperatura = 45; // TODO: asignar valor
    String clima = "";

        if (temperatura <= 15) {
            clima = "frio";
        } else if (temperatura<= 25 ) {
            clima = "Templado";
        } else {
            clima = "Caluroso";
        }
        System.out.println("Temperatura es: " + clima); 

    }
}