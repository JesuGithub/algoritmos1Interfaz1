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
                System.out.printf("%05.2f ",datos[i][j]);
            }
            System.out.println("");
        }
    }
    
    private static double mayorDimension(double dimension1, double dimension2, double dimension3){
        double mayor = Math.max(Math.max(dimension1, dimension2), dimension3);
        return mayor;
    }
    
    private static double perimetroPaquete(double alto, double largo, double ancho){
        double mayor = mayorDimension(alto, largo, ancho);
        double perimetro = 2 * (alto + largo + ancho - mayor);
        return perimetro;
    }
    
    public static double calcularTarifa(double peso){
        double tarifa = 0;
        if(peso >= 0.10 && peso <= 3.5){
            tarifa = peso * 156;
        }
        else if(peso >= 3.51 && peso <= 6.5){
            tarifa = peso * 240;
        }
        else if(peso >= 6.51 && peso <= 18){
            tarifa = peso * 492;
        }
        return tarifa;
    }
    
    
    public static void mostrarDatos(String[] nombres, double[][] datos){
        String tipoEnvio = "Rechazado";
        double tarifa = 0;
        double perimetro, mayor, alto, largo, ancho, peso;
        
        System.out.println("\n*Listado de despachos enviados o rechazados*");
        System.out.println("Cliente      Envio               Costo");
        for (int i = 0; i < nombres.length; i++) {
            peso = datos[i][0];
            alto = datos[i][1];
            largo = datos[i][2];
            ancho = datos[i][3];
            perimetro = perimetroPaquete(alto, largo, ancho);
            mayor = mayorDimension(alto, largo, ancho);
            tarifa = 0;
            if(peso < 18){
                if(((alto < 1) && (largo < 1) && (ancho < 1)) && ((mayor + perimetro) < 2)){
                    tipoEnvio = "Normal";
                    tarifa = calcularTarifa(peso);
                }
                else if((alto < 2) && (largo < 2) && (ancho < 2) && ((mayor + perimetro) < 3)){
                    tipoEnvio = "Extraordinario";
                    tarifa = calcularTarifa(peso) + (calcularTarifa(peso) * 10 / 100);
                }
                else{
                    tipoEnvio = "Rechazado";
                    tarifa = 0;
                }
            }
            else{
                tipoEnvio = "Rechazado";
                tarifa = calcularTarifa(peso);
            }
            
            System.out.printf("%-10s %-20s %07.2f\n", nombres[i], tipoEnvio, tarifa);
        }
    }
}