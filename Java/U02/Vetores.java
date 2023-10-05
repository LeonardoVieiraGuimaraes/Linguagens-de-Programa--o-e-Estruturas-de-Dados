public class Vetores {
        public static void main(String[] args) {
            // Declaração e inicialização de um vetor de inteiros
            int[] vetor = new int[5];
    
            // Escrita de valores no vetor
            vetor[0] = 10;
            vetor[1] = 20;
            vetor[2] = 30;
            vetor[3] = 40;
            vetor[4] = 50;
    
            // Leitura e impressão dos valores do vetor
            System.out.println("Valores do vetor:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Elemento " + i + ": " + vetor[i]);
            }
        }
}
