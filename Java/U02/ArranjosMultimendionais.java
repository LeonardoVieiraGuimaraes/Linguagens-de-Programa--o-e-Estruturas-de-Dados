public class ArranjosMultimendionais {
    public static void main(String[] args) {
        // Declaração e inicialização de uma matriz 2D (3x3) de inteiros
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Acessando e imprimindo os elementos da matriz
        System.out.println("Elementos da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
