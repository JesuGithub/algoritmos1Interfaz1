import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Serie1 {
    //metodo1
    public static int registroCantidad() throws IOException{
        int contador =0;
        Scanner archivo = new Scanner(new File("src\\Archivos\\Lotes.txt"));
        while(archivo.hasNextLine()){
            archivo.nextLine();
            contador++;
        }
        archivo.close();
        return contador;
    }
    //metodo 2
    public static void llenado(double matrizDatos[][], String numeroLote []) throws IOException{
        Scanner archivo = new Scanner(new File("src\\Archivos\\Lotes.txt"));
        int f =0;
        while(archivo.hasNextLine()){
                numeroLote[f] = archivo.next();
                for (int j = 0; j < matrizDatos[0].length; j++) {
                    matrizDatos[f][j] = archivo.nextDouble();
                }
                f++;
                //System.out.println("ola");
        }
        archivo.close();
    }
    //metodo 3
    public static void salida1(double matrizDatos[][], String numeroLote []){
        System.out.println("No Lote         --%Carbono--        --%Magnesio--");
        for (int i = 0; i < numeroLote.length; i++) {
            System.out.printf("%-7s",numeroLote[i]);
            for (int j = 0; j < matrizDatos[0].length; j++) {
                System.out.printf("%6.2f", matrizDatos[i][j]); 
            }
            System.out.println();  
        }
    }
    //metodo 4
    public static void calculos(double matrizDatos[][], double matrizPromedio [][]){
        double sumaC,sumaM;
        for (int i = 0; i < matrizPromedio.length; i++) {
            sumaC =0;
            sumaM =0;

            sumaC = matrizDatos[i][0]+matrizDatos[i][1]+matrizDatos[i][2];
            sumaM = matrizDatos[i][3]+matrizDatos[i][4]+matrizDatos[i][5];
            matrizPromedio[i][0]=sumaC/3;
            matrizPromedio[i][1]=sumaM/3;
        }
    }
    //metodo 5
    public static void status(double matrizPromedio [][], String vectorStatus []){
        for (int i = 0; i < vectorStatus.length; i++) {
            if ((24.92<matrizPromedio[i][0]) && (matrizPromedio[i][0]<27.92) && (matrizPromedio[i][1]>19.84) && (matrizPromedio[i][1]<25.3)) {
                vectorStatus[i] = "Aprobado";
            }   
            else {vectorStatus[i] ="Rechazado";}
        }
    }
    //metodo 6
    public static void salida2(String vectorNombre [], double matrizPromedio [][], String vectorStatus[]){
        System.out.println("Resultados de laboratorio");
        System.out.println("Cmax: 27.92,    Cmin: 24.92");
        System.out.println("MgMax: 25.30,  MgMin: 19.84");
        System.out.println("no lote    Prom %C     Prom %Mg    Estatus");
        
        for (int i = 0; i < vectorStatus.length; i++) {
            System.out.printf("%8s        %6.2f       %6.2f      %12s\n",vectorNombre[i],matrizPromedio[i][0],matrizPromedio[i][1],vectorStatus[i]);
        }
    }
}