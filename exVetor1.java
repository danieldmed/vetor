import java.util.Scanner;

public class exVetor1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int [10];
        int soma = 0;
        double media;

        System.out.println("Digite 10 números inteiros:");

        for(int i = 0; i < 10; i++) {
            System.out.println("Número " + (i) + " :");
            vetor[i] = scanner.nextInt();

            soma += vetor[i];
        }

            media = soma / 10.0;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
    }
}