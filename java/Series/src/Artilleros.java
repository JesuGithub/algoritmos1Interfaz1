/**
 *
 * @author j2a0a
 */
public class Artilleros {
    String nombre;
    double anguloDisparo;
    double velocidadInicial;
    double distanciaPtoDisparo;
    double tiempo;
    double ALTURA_BLANCO = 20;
    
    public Artilleros(String nombre, double anguloDisparo, double velocidadInicial, double distanciaPtoDisparo) {
        this.nombre = nombre;
        this.anguloDisparo = anguloDisparo;
        this.velocidadInicial = velocidadInicial;
        this.distanciaPtoDisparo = distanciaPtoDisparo;
    }
    
    public double conversionX() {   
        return velocidadInicial * Math.cos(Math.toRadians(anguloDisparo));
    }
    
    public double conversionY() {   
        return velocidadInicial * Math.sin(Math.toRadians(anguloDisparo));
    }
    
    public void tiempoCalcular(){
        tiempo = distanciaPtoDisparo / conversionX();
    }
    
    public double alturaDisparo(){
        return conversionY() * tiempo  - ((9.8 * Math.pow(tiempo, 2)) / 2);
    }
    
    public String condicionCaida(){
        if (alturaDisparo()<= ALTURA_BLANCO && alturaDisparo()> 0){
            if (( (double) alturaDisparo()) == 10){
                return "si pegó, y dió en el centro del blanco";
            }
            else{
                return "si pegó en el blanco";
            }
        }
        else if(alturaDisparo()<= 0){
            return "no pegó, cayó antes del blanco";
        }
        else if(alturaDisparo()> ALTURA_BLANCO){
            return "no pegó, cayó después del blanco";
        }
        return null;
    }   
}

