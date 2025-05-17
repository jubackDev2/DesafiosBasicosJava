import java.util.Locale;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeVendedor = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalDeVendasNoMes = sc.nextDouble();

        double  comissao = totalDeVendasNoMes * 15.0 / 100;
        double salarioFinal = salarioFixo + comissao;
        System.out.printf("TOTAL =  %.2f", salarioFinal);

    }
}
