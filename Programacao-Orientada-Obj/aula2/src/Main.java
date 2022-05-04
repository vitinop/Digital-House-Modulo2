import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int n1,n2;
        float f1,f2;
        Scanner ler;
        ler = new Scanner(System.in);

        System.out.print("Digite o valor de n1: ");
        n1 = ler.nextInt();
        System.out.print("Digite o valor de n2: ");
        n2 = ler.nextInt();
        System.out.print("Digite o valor de f1: ");
        f1 = ler.nextFloat();
        System.out.print("Digite o valor de f2: ");
        f2 = ler.nextFloat();

        // CTRL + d
        System.out.println("Valor digitado para n1: " + n1);
        System.out.println("Valor digitado para n2: " + n2);
        System.out.println("Valor digitado para n2: " + f1);
        System.out.println("Valor digitado para n2: " + f2);

        int soma, subtracao,mult,div;
        soma=n1+n2;
        System.out.println("Valor da soma dos numeros é: " + soma);

        subtracao=n1-n2;
        System.out.println("Valor da subtração dos numeros é: " + subtracao);

        mult=n1*n2;
        System.out.println("Valor da multiplicação dos numeros é: " + mult);

        div=n1/n2;
        System.out.println("Valor da divisao dos numeros é: " + div);

        ler.close();
    }
}
