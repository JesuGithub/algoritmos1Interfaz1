/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Electoral;

/**
 *
 * @author j2a0a
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] vectorNombres = Electoral.leerCandidatos(5);
        int[][] matrizVotos = Electoral.crearMatrizVotos(5);
        Electoral.mostrarDatos(vectorNombres, matrizVotos);
        Electoral.mostrarCalculos(vectorNombres, matrizVotos);
    }
    
}
