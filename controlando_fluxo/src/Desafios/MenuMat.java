package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class MenuMat {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inp = new Scanner(System.in);

        System.out.println("Escolha uma das opções: ");
        System.out.println("1 -- Calcular a área do quadrado");
        System.out.println("2 -- Calcular a area do circulo");
        int choice = inp.nextInt();

        if(choice == 1){
            System.out.println("Digite um lado do quadrado: ");
            int lado = inp.nextInt();

            System.out.printf("A area do quadrado é : %.2f ", Math.pow(lado,2));
        }else{
            System.out.println("Digite diametro do circulo: ");
            double lado = inp.nextDouble();

            System.out.printf("A area do quadro é : %.2f ", Math.PI * (Math.pow(lado,2)));

        }


        inp.close();
    }
}
