import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner lerVetor = new Scanner(System.in);

        int[] vetor = new int[5];
        System.out.println("Digite 5 números inteiros entre 0 e 9:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = lerVetor.nextInt();
        }

        int Palindromo = 1; 
        for (int i = 0; i < 5 / 2; i++) {
            if (vetor[i] != vetor[4 - i]) {
                Palindromo = 0;
                break;
            }
        }

        if (Palindromo == 1) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        lerVetor.close();
    }
}