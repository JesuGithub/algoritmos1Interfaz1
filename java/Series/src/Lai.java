/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author j2a0a
 */
public class Lai {
    int cantidadBlanco = 0;
    //de grados a radianes
    public static double Radianes(double angulo) {
        return(Math.toRadians(angulo));
    }
    //velocidad x
    public static double VelocidadX(double velocidadInicial, double angRadianes){
        return(velocidadInicial * Math.cos(angRadianes));
    }
    //velocidad y
    public static double VelocidadY(double velocidadInicial, double angRadianes){
        return(velocidadInicial * Math.sin(angRadianes));
    }
    //tiempo
    public static double Tiempo(double distanciaBlanco, double velocidadX){
        return(distanciaBlanco/velocidadX);
    }
    //altura
    public static double Altura(double velocidadY, double tiempo){
        return((velocidadY*tiempo)- (9.8*tiempo*tiempo/2));
    }
    //condicion de caida
    public static String Condicion(double alturaProyectil){
        int ALTURA_PARED = 20;
        if(alturaProyectil <= ALTURA_PARED && alturaProyectil>0){
        //++cantidadBlanco;
        return("si pego en el blanco");
        }
        else if(alturaProyectil<=0){
        return ("cayo antes");
        }
        else if(alturaProyectil>ALTURA_PARED){
        return ("cayo despues");
        }
        return null;
    }
}
