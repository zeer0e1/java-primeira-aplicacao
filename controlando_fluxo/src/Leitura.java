import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.print("Qual o ano de lançamento: ");
        int anoLancamento = leitura.nextInt();

        System.out.print("Diga sua avaliacao para o filme: ");
        double avalicao = leitura.nextDouble();

        System.out.println("Filme escolhido: " +filme);
        System.out.println("Filme Ano de lancamento: " + anoLancamento);
        System.out.println("Avaliacao: " + avalicao);
        leitura.close();
    }
}
