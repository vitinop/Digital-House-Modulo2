import java.util.Scanner;

public class main {
    public static int qntPacotes( float qnt) {
        Scanner entrada=new Scanner(System.in);
        float kilo=0.0f;
        int pacote=0;


        while (kilo<qnt){
            System.out.print("Digite o Peso do Pacote de ração: ");
            float peso = entrada.nextFloat();
            kilo=kilo+peso;
            pacote = pacote+1;
        }
        entrada.close();
        return pacote;
    }


    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Inisira o nome do cão: ");

        String nome = ler.nextLine();

        System.out.print("Digite a quantidade de ração em kg: ");

        float qntRacao = ler.nextFloat();

        int valor = qntPacotes(qntRacao);
        System.out.printf("Seu cão precisará de %d pacotes", valor);

        ler.close();
    }
}
