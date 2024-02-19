import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numero = new Random().nextInt(10);
        int numeroTentativas = 0;

        System.out.println("Olá, seja bem vindo ao jogo da adivinhação");
        System.out.print("Qual o seu nome ?: ");
        String nome = input.nextLine();

        System.out.printf("%s, você tem 5 tentativas de acertar o número de 0 a 10%n", nome);
        while (true) {
            numeroTentativas += 1;
            System.out.print("Digite um número: ");
            int numeroEscolhido = input.nextInt();

            if (numeroEscolhido == numero){
                System.out.printf("Parabéns %s você acertou em %d tentativa(s)",nome,numeroTentativas);
                break;
            } else if (numeroTentativas  != 5) {
                System.out.println("Tente novamente");
            }else{
                System.out.println("Você perdeu, o número escolhido era "+ numero);
                break;
            }


        }

        input.close();

    }
}
