import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner lerVetor = new Scanner(System.in);

        int[][] mapa = new int[5][5];
        System.out.println("Digite os valores da matriz 5x5 (0 para terreno livre, 1 para obstáculo):");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapa[i][j] = lerVetor.nextInt();
            }
        }

        System.out.println("Mapa do jogo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mapa[i][j] == 0) {
                    System.out.print(" ");
                } else if (mapa[i][j] == 1) {
                    System.out.print("@");
                }
            }
        }

        lerVetor.close();
    }
}