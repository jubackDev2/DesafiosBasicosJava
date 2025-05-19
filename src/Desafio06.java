import java.util.Locale;
import java.util.Scanner;

public class Desafio06 {
    /*

    Neste problema, deve-se ler o código de uma peça 1, o numero de uma peças 1, o valor
    unitário de cada peça 1, o código de uma peça 2, numero de peças 2 e o valor unitário
    de cada peça 2. Após, calcule e mostre o valor a ser pago.

    Entrada - > o arquivo contém duas linhas de dados. Em cada linha haverá 3 valores, RESPECTIVAMENTE
    dois numeros inteiros e um valor com 2 casas  decimais.
    -----------------------------------------------------------------------------------------------------
    Saída ->
    Exemplos de entrada | exemplos de saída
             12 1 5.30
             16 2 5.10    VALOR A PAGAR: R$ 15.50
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoDePeca1 = sc.nextInt();
        int numeroDePeca1 = sc.nextInt();
        double valorUnitarioPeca1 = sc.nextDouble();

        int codigoDePeca2 = sc.nextInt();
        int numereroDePeca2 = sc.nextInt();
        double valorUnitarioPeca2 = sc.nextDouble();

        double valorApagar = valorUnitarioPeca1 * numeroDePeca1 + valorUnitarioPeca2  * numereroDePeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorApagar);



    }
}
