package Artilleros;

import java.util.Scanner;

/**
 *
 * @author j2a0a
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectora = new Scanner(System.in);
        /**System.out.print("De el valor de x: ");
        double x = lectora.nextDouble();
        System.out.print("De el valor de y: ");
        double y = lectora.nextDouble();
        System.out.print("De el valor de epsilon: ");
        double epsilon = lectora.nextDouble();
        System.out.print("De el valor de n: ");
        double n = lectora.nextDouble();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Termino "+(i+1)+": " + Serie1.Terminos(x, y, n, i+1));
        }
        
        int contador = 1;
        double termAnterior = 0;
        double termSiguiente = Serie1.Terminos(x, y, n, 1);
        
        System.out.print("Nombre del artillero: ");
        String nombre = lectora.next();
        
        System.out.print("Angulo del disparo: ");
        double anguloDisparo = lectora.nextDouble();
        
        System.out.print("Velocidad del disparo: ");
        double velocidadInicial = lectora.nextDouble();
        
        System.out.print("Distancia desde el punto del disparo al blanco: ");
        double distanciaPtoDisparo = lectora.nextDouble();

        Artilleros artillerito = new Artilleros(nombre, anguloDisparo, velocidadInicial, distanciaPtoDisparo);
        
        artillerito.tiempoCalcular();
        
        System.out.println("El artillero " + artillerito.nombre + " " + artillerito.condicionCaida());*/
        
        
        
        
        System.out.print("Cuantas veces desea ejecutar: ");
        int repeticion = lectora.nextInt();
        /*Lai promedio = new Lai();
        
        do {            
        //llamando artillero
        
        //entrada de nombre del artillero
        System.out.print("Nombre del artillero: ");
        String nombreArtillero = lectora.next();
        //entrada de angulo de disparo
        System.out.print("Angulo del disparo: ");
        double anguloDisparote = lectora.nextDouble();
        //entrada de velocidad de disparo = incial
        System.out.print("Velocidad de disparo: ");
        double velocidadDisparo = lectora.nextDouble();
        //distancia del punto de disparo al blanco
        System.out.print("Distancia del punto de disparo al blanco: ");
        double distanciaDisparo = lectora.nextDouble();
        
        //llamando funciones
        anguloDisparote = Lai.Radianes(anguloDisparote);
        //inicializacion de variable asignando a traves de llamar funciones
        double velocidadDisparoX = Lai.VelocidadX(velocidadDisparo, anguloDisparote);
        double velocidadDisparoY = Lai.VelocidadY(velocidadDisparo, anguloDisparote);
        double tiempo = Lai.Tiempo(distanciaDisparo, velocidadDisparoX);
        double altura = Lai.Altura(velocidadDisparoY, tiempo);
        //salida 
        System.out.println("El artillero " + nombreArtillero + " " + Lai.Condicion(altura));
        --repeticion;
        
        } while (repeticion != 0);*/
    }
}
