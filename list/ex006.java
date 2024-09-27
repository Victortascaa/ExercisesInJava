package list;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        //Test Data:
        //Input first number: 125
        //Input second number: 24
        Scanner ler = new Scanner(System.in);
        int i, n;
        System.out.printf("Digite um número:\n");
        n = ler.nextInt();
        System.out.printf("Digite outro número:\n");
        i = ler.nextInt();
        System.out.println(n+i);
        System.out.println(n-i);
        System.out.println(n*i);
        System.out.println(n/i);
    }
}
