import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner lerVetor = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = lerVetor.nextInt();
        }

        for (int i = 0; i < 10 / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[9 - i];
            vetor[9 - i] = temp;
        }

        System.out.println("Vetor invertido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        lerVetor.close();
    }
}