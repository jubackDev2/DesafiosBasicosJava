import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);





        int n = sc.nextInt();
        int valorInteiro = n ;
        int cedulasDe100= valorInteiro / 100;

        valorInteiro = valorInteiro % 100;
        int cedulasDe50 = valorInteiro / 50;
        valorInteiro = valorInteiro % 50;
        int cedulasDe20 = valorInteiro /20;
        valorInteiro = valorInteiro % 20;
        int cedulasDe10 = valorInteiro / 10;
        valorInteiro =  valorInteiro % 10;
        int cedulasDe5 = valorInteiro / 5;
        valorInteiro = valorInteiro % 5;
        int cedulasDe2 = valorInteiro / 2;
        valorInteiro =  valorInteiro % 2;
        int cedulasDe1 = valorInteiro / 1;


        System.out.println(n);
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
