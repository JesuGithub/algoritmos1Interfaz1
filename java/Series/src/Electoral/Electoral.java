package Electoral;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author j2a0a
 */
public class Electoral {
    public static String[] leerCandidatos(int cantidadCandidatos){
        Scanner lectora = new Scanner(System.in);
        String[] vectorNombres = new String[cantidadCandidatos];
        for (int i = 0; i < vectorNombres.length; i++) {
            System.out.print("Diga el nombre del candidato #" +(i+1)+ ": ");
            vectorNombres[i] = lectora.next();
        }
        
        return vectorNombres;        
    }
    
    public static int[][] crearMatrizVotos(int cantidadVotos){
        int[][] matrizVotos = new int[cantidadVotos][4];
        for (int i = 0; i < matrizVotos.length; i++) {
            for (int j = 0; j < matrizVotos[i].length; j++) {
                matrizVotos[i][j] = (int) (Math.random() * 201)  + 100;
                
            }
        }
        
        return matrizVotos;
    }
    
    public static void mostrarDatos(String[] nombres, int[][] votos){
        System.out.println("\nDatos Elecciones ");
        System.out.println("           A   B   C   D");
        int[] matriz;
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-10s" , nombres[i]);
            for (int j = 0; j < votos[i].length; j++) {
                System.out.printf("%3d " , votos[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void mostrarCalculos(String[] nombres, int[][] votos){
        int[] sumaVotos = new int[votos.length];
        double[] porcentajeVotos = new double[votos.length];
        int votosSumados = 0;
        for (int i = 0; i < votos.length; i++) {
            for (int j = 0; j < votos[i].length; j++) {
                sumaVotos[i] += votos[i][j];
            }
            votosSumados += sumaVotos[i];
        }
        
        int mayor = sumaVotos[0];
        String nombreMayor = nombres[0];
        for (int i = 0; i < porcentajeVotos.length; i++) {
            if(mayor < sumaVotos[i]){
                mayor = sumaVotos[i];
                nombreMayor = nombres[i];
            }
            porcentajeVotos[i] = (double) (sumaVotos[i] * 100) / votosSumados;
        }
        
        System.out.println("\nResultados de las elecciones");
        System.out.println("          Votos Porcentaje");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-10s %4d %2.2f\n", nombres[i], sumaVotos[i], porcentajeVotos[i]);
        }
        System.out.println("El ganador fue: " + nombreMayor);
    }
}
