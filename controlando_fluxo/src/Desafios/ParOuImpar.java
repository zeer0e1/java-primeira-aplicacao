package Desafios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = inp.nextInt();

        if (n % 2 == 1){
            System.out.println("Numero impar");
        }else System.out.println("Numero par");


        inp.close();
    }
}
