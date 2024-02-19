import java.util.Locale;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNota = 0;
        while (nota != -1) {
            System.out.print("Diga sua avaliação: ");
            nota = input.nextDouble();
            if (totalNota == -1) {
                break;
            }else {
                mediaAvaliacao += nota;
                totalNota ++;
            }

        }

        System.out.println("Media de avaliações: " + mediaAvaliacao / totalNota );


        input.close();
    }
}
