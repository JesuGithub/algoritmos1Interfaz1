/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Despacho;

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
    
    public static void almacenarDatos(String[] nombres, double[][] datos, String nombreArchivo) throws FileNotFoundException{
        Scanner lectora = new Scanner(new File(nombreArchivo));
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = lectora.next();
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = lectora.nextDouble();       
            }
        }
    }
    
    public static void imprimirDatos(String[] nombres, double[][] datos){
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-10s ",nombres[i]);
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%02.2f ",datos[i][j]);
            }
            System.out.println("");
        }
    }
}
