import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner lerVetor = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = lerVetor.nextInt();
        }

        System.out.print("Digite um número para buscar no vetor: ");
        int numeroBuscado = lerVetor.nextInt();

        System.out.print("O número " + numeroBuscado + " aparece nas posições: ");
        int contador = 0; 
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numeroBuscado) {
                System.out.print(i + " ");
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("não foi encontrado no vetor.");
        }

        lerVetor.close();
    }
}