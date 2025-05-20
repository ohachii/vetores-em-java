public class Atividade3 {
    public static void main(String[] args) {
        int[] vetor = new int[6];

        for (int i = 0; i < 6; i++) {
            vetor[i] = i;
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}