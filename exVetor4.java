
import java.util.Scanner;

public class exVetor4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Digite 5 notas: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        int acima = 0, abaixo = 0, naMedia = 0;

        for (double nota : notas) {
            if (nota > media) {
                acima++;
            } else if (nota < media) {
                abaixo++;
            } else {
                naMedia++;
            }
        }

        System.out.println("Média das notas: " + media);
        System.out.println("Acima da média: " + acima);
        System.out.println("Abaixo da média: " + abaixo);
        System.out.println("Na média: " + naMedia);

        scanner.close();
    }
}
