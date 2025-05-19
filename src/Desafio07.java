import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raioDaEsfera = sc.nextDouble();
        double volume = (4 / 3.0 ) *  3.14159 * raioDaEsfera * raioDaEsfera * raioDaEsfera;
        System.out.printf("VOLUME = %.3f\n", volume);

        // voce pode fazer dessa forma: (4 / 3.0 ) *  3.14159 * Math.pow(raioDaEsfera, 3)

    }
}
