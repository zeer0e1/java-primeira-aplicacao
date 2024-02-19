package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a temperaratura em Celsius para ser convertida para Fahrenheit: ");
        double temp = in.nextDouble();
        in.nextLine();

        int tempCovertida =  (int)(temp * 1.8) + 32;

        String textBlock = """
                Temperatura em Celsiues : %.1f
                Temperatura em Fahrenheit: %d
                """;

        System.out.printf(textBlock,temp, tempCovertida);


        in.close();



    }
}
