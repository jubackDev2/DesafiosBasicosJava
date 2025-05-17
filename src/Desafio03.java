import java.util.Locale;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int hoursWorked = sc.nextInt();
        double hourlyRate = sc.nextDouble();

        double SALARY = hoursWorked * hourlyRate;
        System.out.println("NUMBER = "+employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", SALARY );


    }
}
