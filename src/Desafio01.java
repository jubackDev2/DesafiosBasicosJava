import java.util.Locale;
import java.util.Scanner;


public class Desafio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double MEDIA = (A * 2.0 + B * 3.0 + C * 5.0 ) / (2.0 + 3.0 + 5.0);
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
