package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d x %d = %d%n",n,i, n * j);
            }
            System.out.println("-----------");
        }



        sc.close();
    }
}
