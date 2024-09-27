package list;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Adicione um número");
        int num1 = in.nextInt();
        for (int i = 0; i <10; i++)
            System.out.println(num1);
    }
}
