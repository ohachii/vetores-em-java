public class Atividade2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int numerosPares = 0;
        for (int i = 0; i < 10; i++) {
            vetor[i] = i;
            System.out.println(vetor[i]);
            if (vetor[i] % 2 == 0) {
                numerosPares++;
            }
        }
        System.out.println("Quantidade de pares: " + numerosPares);
    }
}