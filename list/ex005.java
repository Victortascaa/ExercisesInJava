package list;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, n;
        System.out.printf("Digite um número:\n");
        n = ler.nextInt();
        System.out.printf("Digite outro número:\n");
        i = ler.nextInt();
        System.out.println(n * i);
    }
}
