import java.util.Locale;
import java.util.Scanner;

public class Desafio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        int n = sc.nextInt();
        int valorDeN = n;
        int cedulasDe100= n / 100;

        n = n % 100;
        int cedulasDe50 = n / 50;
        n = n%50;
        int cedulasDe20 = n /20;
        n = n % 20;
        int cedulasDe10 = n / 10;
        int cedulasDe5 = n / 5;
        n = n%5;
        int cedulasDe2 = n / 2;
        n = n%2;
        int cedulasDe1 = n /1;
        n = n%1;

        System.out.println(valorDeN);
        System.out.println(cedulasDe100+ " nota(s) de 100,00");
        System.out.println(cedulasDe50+ " nota(s) de 50,00");
        System.out.println(cedulasDe20+" nota(s) de 20,00");
        System.out.println(cedulasDe10+" nota(s) de 10,00");
        System.out.println(cedulasDe5+" nota(s) de 5,00");
        System.out.println(cedulasDe2+" nota(s) de 2,00");
        System.out.println(cedulasDe1+" nota(s) de 1,00");














        sc.close();










    }
}
