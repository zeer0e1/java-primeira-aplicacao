package Desafios;

public class Fatorial {
    public static void main(String[] args) {
        int numero = 5; // Número para calcular o fatorial
        long resultado = 1;

        // Calculando o fatorial sem criar um método separado
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
