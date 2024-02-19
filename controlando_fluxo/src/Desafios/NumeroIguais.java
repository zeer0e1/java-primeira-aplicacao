package Desafios;

import java.util.Scanner;

public class NumeroIguais {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n1 = inp.nextDouble();

        System.out.println("Digite um número: ");
        double n2 = inp.nextDouble();

        if(n1 == n2){
            System.out.println("Os números são iguais");
        }else {
            System.out.println("Os números não são iguais");
        }

        if (n1 > n2){
            System.out.printf("%.0f é maior que %.0f",n1,n2);
        }else{
            System.out.printf("%.0f é maior que %.0f",n2,n1);
        }


        inp.close();
    }
}
