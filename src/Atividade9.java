import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner lerVetor = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = lerVetor.nextInt();
        }

        int ultimo = vetor[9]; 
        for (int i = 9; i > 0; i--) {
            vetor[i] = vetor[i - 1]; 
        }
        vetor[0] = ultimo; 

        System.out.println("Vetor após a rotação para a direita:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        lerVetor.close();
    }
}