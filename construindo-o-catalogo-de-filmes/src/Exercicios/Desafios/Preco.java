package Exercicios.Desafios;

public class Preco {
    public static void main(String[] args) {
        double precoProduto = 23.50;
        int quantidade = 10;

        double precoFinal = precoProduto * quantidade;

        System.out.printf("Preco do produto: %.2f%n",precoProduto);
        System.out.printf("Quantidade: %d%n",quantidade);
        System.out.printf("Valor total: %.2f", precoFinal);

    }
}
