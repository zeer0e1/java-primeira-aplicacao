package Desafios;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n = inp.nextDouble();

        if (n > 0){
            System.out.println("Número positivo");
        }else System.out.println("Numero negativo");

        inp.close();
    }
}
