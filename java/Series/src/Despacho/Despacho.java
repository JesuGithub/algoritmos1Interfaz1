package Despacho;

import java.io.FileNotFoundException;

/**
 *
 * @author j2a0a
 */
public class Despacho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String nombreArchivo = "src\\Archivos\\Despacho.txt";
        int cantidad = Metodos.cantidadRegistros(nombreArchivo);
        String[] vectorNombres = new String[cantidad];
        double[][] matrizDatos = new double[cantidad][4];
        Metodos.almacenarDatos(vectorNombres, matrizDatos, nombreArchivo);
        Metodos.imprimirDatos(vectorNombres, matrizDatos);
    }
    
}
