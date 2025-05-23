import java.util.Locale;
import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // distancia percorrida
        double Y = sc.nextDouble(); // total de combustível gasto
        double consumoMedioDoAutomovel = X / Y;
        System.out.printf(" %.3f km/l\n", consumoMedioDoAutomovel);

    }
}
