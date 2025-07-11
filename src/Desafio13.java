import java.util.Locale;
import java.util.Scanner;

public class Desafio13 {
    // Gasto de Combustível

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


       double tempoGastoNaViagem, velocidadeMedia, kmCarro;
       kmCarro = 12;
       tempoGastoNaViagem = sc.nextInt();
       velocidadeMedia = sc.nextInt();
       double litrosNecessario = (tempoGastoNaViagem*velocidadeMedia)/kmCarro;
       System.out.printf("%.3f%n", litrosNecessario);



    }
}
