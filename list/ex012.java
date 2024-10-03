package list;
import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = in.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = in.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = in.nextInt();

        double media = (num1 + num2 + num3) / 3;
        System.out.println("A média é: "+ media);
    }
}
