import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.print("Digite um número a procurar: ");
        int x = entrada.nextInt();

        for (i = 0; i < 10; i++) {
            if (vetor[i] == x) {
                System.out.println("O número " + x + " está no vetor.");
                break;
            }
        }

        if (i == 10) {
            System.out.println("O número " + x + "não está no vetor.");
        }

        entrada.close();
    }
}