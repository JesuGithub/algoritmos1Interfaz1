/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Patinaje;

import java.io.FileNotFoundException;

/**
 *
 * @author j2a0a
 */
public class Patinaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String nombreArchivo = "src\\Archivos\\Competidores.txt"; // Nombre archivo
        int cantidad = Metodos.cantidadRegistros(nombreArchivo);  // Cantidad de filas
        
        String[] vectorNombres = new String[cantidad];            // Inicializando vector
        int[][] matrizDatos = new int[cantidad][6];               // Inicializando matriz
        Metodos.almacenarDatos(vectorNombres, matrizDatos, nombreArchivo); // Almacenando Datos
         
        int[] mayores = new int[cantidad];                        // Inicializando vector     
        Metodos.mayorFilas(matrizDatos, mayores);                 // Almacenando Datos mayores
        
        int[] menores = new int[cantidad];                        // Inicializando vector     
        Metodos.menorFilas(matrizDatos, menores);                 // Almacenando Datos menores
        
        double[] puntajes = new double[cantidad];                 // Inicializando vector
        Metodos.puntaje(matrizDatos, mayores, menores, puntajes); // Almacenando puntajes
        
        Metodos.mostrarConsola(vectorNombres, matrizDatos, puntajes);
        
        
    }
    
}
