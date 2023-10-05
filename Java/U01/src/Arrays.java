public class Arrays {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        String[] nomes = { "Alice", "Bob", "Charlie" };

        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Tamanho do array de nomes: " + nomes.length);

        System.out.println("Elementos do array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
