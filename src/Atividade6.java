import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner lerVetor = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = lerVetor.nextInt();
        }

        int repeticoes = 0;

        for (int i = 0; i < 10; i++) {
            int jaExibido = 0;
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    jaExibido = 1;
                    break;
                }
            }

            if (jaExibido == 0) {
                int frequencia = 0;
                for (int j = 0; j < 10; j++) {
                    if (vetor[i] == vetor[j]) {
                        frequencia++;
                    }
                }

                if (frequencia > 1) {
                    if (repeticoes == 0) {
                        System.out.println("Número(s) que se repete no vetor:");
                    }
                    System.out.println(vetor[i]);
                    repeticoes++;
                }
            }
        }

        if (repeticoes == 0) {
            System.out.println("Nenhum número se repete no vetor.");
        }

        lerVetor.close();
    }
}