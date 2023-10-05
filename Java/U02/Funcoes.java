public class Funcoes {
    // Método para calcular a soma de dois inteiros
    public static int soma(int a, int b) {
        int resultado = a + b;
        return resultado; // Retorna o resultado da soma
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        // Chamada do método soma e armazenamento do resultado em uma variável
        int resultadoSoma = soma(num1, num2);

        // Imprime o resultado da soma
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultadoSoma);
    }
}
