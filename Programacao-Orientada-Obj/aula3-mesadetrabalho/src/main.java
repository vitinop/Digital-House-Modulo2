import java.util.Scanner;
public class main {


    public static void main(String[] args) {

        int contadorPrimos;

        int arrayLength=num.length;
        ler = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros primos que vc gostaria de descobrir: ");
        contadorPrimos = ler.nextInt();

        While (arrayLength<contadorPrimos) {
        for (int i = 2; i <= 5000; i++) {
            if (ehPrimo(i))
                System.out.println(i + " é primo.");
        }

        }
}

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }


}
