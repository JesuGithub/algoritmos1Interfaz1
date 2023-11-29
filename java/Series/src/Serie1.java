/**
 *
 * @author j2a0a
 */
public class Serie1 {
    public static double Terminos(double x, double y, double n, int contador){
        return (Math.pow(-1, contador) * ((Math.pow(x, contador) * Math.pow(y, n - contador + 1)) / (n - contador + 1) ));
    }
}
