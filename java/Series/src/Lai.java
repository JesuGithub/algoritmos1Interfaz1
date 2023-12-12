import java.io.IOException;

/**
 *
 * @author Lai
 */
public class Lai {

    public static void main(String[] args) throws IOException {
        //System.out.println("ola");
        int fila = Serie1.registroCantidad();
        //System.out.println("ola");
        String nonbreLote[]= new String[fila];
        double matrizDatos [][] = new double[fila][6];
        double matrizPromedio [][] =new double[fila][2];
        String vectorStatus []= new String [fila];
        
        Serie1.llenado(matrizDatos, nonbreLote);
        Serie1.salida1(matrizDatos, nonbreLote);
        Serie1.calculos(matrizDatos, matrizPromedio);
        Serie1.status(matrizPromedio, vectorStatus);
        Serie1.salida2(nonbreLote, matrizPromedio, vectorStatus);
    }
    
}