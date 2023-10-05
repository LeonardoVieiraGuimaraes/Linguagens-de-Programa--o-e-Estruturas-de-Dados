public class VetorCaracteres {
    public static void main(String[] args) {
        String[] vetorDeStrings = new String[3]; // Declara um vetor de 3 strings

        // Atribuindo valores às strings no vetor
        vetorDeStrings[0] = "Primeira string";
        vetorDeStrings[1] = "Segunda string";
        vetorDeStrings[2] = "Terceira string";

        // Acessando e imprimindo as strings no vetor
        System.out.println("Vetor de Strings:");
        for (int i = 0; i < 3; i++) {
            System.out.println(vetorDeStrings[i]);
        }
    }
}
