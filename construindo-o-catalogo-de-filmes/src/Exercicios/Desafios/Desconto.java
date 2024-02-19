package Exercicios.Desafios;

public class Desconto {
    public static void main(String[] args) {

        double precoOriginal = 40.00;
        double percentualDesconto = 10;

        double totalDesconto = (percentualDesconto / 100) * precoOriginal;
        System.out.printf("Total desconto: %.2f", precoOriginal - totalDesconto);
    }
}
