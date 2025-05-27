import java.util.Locale;
import java.util.Scanner;

public class Desafio11 {
    public static void main(String[] args) {
        // Distância Entre Dois Pontos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextFloat();
        double y1 = sc.nextFloat();

        double x2 = sc.nextFloat();
        double y2 = sc.nextFloat();
        double distancia = Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2);
        distancia = Math.sqrt(distancia);
        System.out.printf(" %.4f\n ",distancia);
    }



}
