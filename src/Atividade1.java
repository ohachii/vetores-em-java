public class Atividade1 {
    public static void main(String[] args) {
        int soma = 0;
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {  
            vetor[i] = i;
            soma += vetor[i]; 

            System.out.println(vetor[i]);
        }
        System.out.println("\nResultado: " + soma);
    }
}