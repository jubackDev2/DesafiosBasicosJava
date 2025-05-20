import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

int c = sc.nextInt();
        int MaiorAB = (a + b + Math.abs(a-b)) / 2; // formula pra saber qual dos dois é maior, a ou b.

        if (MaiorAB > c){ // Esse trecho verifica qual é o maior entre MaiorAB (ou seja, o maior entre a e b) e c.
            System.out.println(MaiorAB+" eh o maior");
        }else {
            System.out.println(c+" eh o maior");
        }

    }
}
