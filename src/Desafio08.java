import java.util.Locale;
import java.util.Scanner;

public class Desafio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTrianguloRetangulo  =   A * C / 2;
        double areaDoCirculo = 3.14159 *  Math.pow(C, 2);
        double areaDoTrapezio = (A + B) * C / 2;
        double areaDoQuadrado = B * B;
        double areaRetangulo = A * B;





        System.out.printf("TRIANGULO: %.3f\n",areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n",areaDoCirculo);
        System.out.printf("TRAPEZIO: %.3f\n",areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f\n",areaDoQuadrado);
        System.out.printf("RETANGULO %.3f\n",areaRetangulo);
    }
}
