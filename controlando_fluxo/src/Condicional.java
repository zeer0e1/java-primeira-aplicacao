public class Condicional
{
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String tipoPlano ="Plus";

        if (anoDeLancamento > 202){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else {
            System.out.println("Filme retro que vale a pena assistir");
        }


        if (incluidoNoPlano && tipoPlano.equals("Plus") ){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve assinar o Plus");
        }
    }
}
