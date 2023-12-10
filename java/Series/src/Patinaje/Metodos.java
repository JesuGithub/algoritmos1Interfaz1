/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patinaje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author j2a0a
 */
public class Metodos {
    public static int cantidadRegistros(String nombreArchivo) throws FileNotFoundException{
        Scanner lectora = new Scanner(new File(nombreArchivo));
        int contador = 0;
        while(lectora.hasNextLine()){
            lectora.nextLine();
            contador++;
        }
        return contador;
    }
    
    public static void almacenarDatos(String[] nombres, int[][] datos, String nombreArchivo) throws FileNotFoundException{
        Scanner lectora = new Scanner(new File(nombreArchivo));
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = lectora.next();
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = lectora.nextInt();
            }
        }
    }
    
    public static void mayorFilas(int[][] datos, int[] mayores){
        for (int i = 0; i < datos.length; i++) {
            mayores[i] = datos[i][0];
            for (int j = 0; j < datos[i].length; j++) {
                if(mayores[i] < datos[i][j]){
                    mayores[i] = datos[i][j];
                }
            }
        }
    }
    
    public static void menorFilas(int[][] datos, int[] menores){
        for (int i = 0; i < datos.length; i++) {
            menores[i] = datos[i][0];
            for (int j = 0; j < datos[i].length; j++) {
                if(menores[i] > datos[i][j]){
                    menores[i] = datos[i][j];
                }
            }
        }
        
    }
    
    public static void puntaje(int[][] datos, int[] mayores, int[] menores, double[] puntajes){
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = 0;
            for (int j = 0; j < datos[i].length; j++) {
                suma += datos[i][j];
            }
            puntajes[i] = (suma - mayores[i] - menores[i]) / (4.0);
        }
    }
    
    public static void mostrarConsola(String[] nombres, int[][] datos, double[] puntajes){
        System.out.println("Nombre           Calificaciones     Puntaje");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-15s ",nombres[i]);
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%2d ", datos[i][j]);
            }
            System.out.printf("      %2.02f\n", puntajes[i]);
        }
    }
}
