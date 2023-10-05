public class CadeiaCaracteres {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "world!";

        // Concatenação de strings
        String resultado = str1 + str2;
        System.out.println("Resultado da concatenação: " + resultado);

        // Comprimento da string
        int comprimento = resultado.length();
        System.out.println("Comprimento da string: " + comprimento);

        // Comparação de strings
        String str3 = "Hello, world!";
        if (resultado.equals(str3)) {
            System.out.println("As strings resultado e str3 são iguais.");
        } else {
            System.out.println("As strings resultado e str3 são diferentes.");
        }

        // Extração de subcadeia
        String subcadeia = resultado.substring(7, 12); // Obtém a subcadeia a partir da posição 7 até a posição 11
        System.out.println("Subcadeia extraída: " + subcadeia);

        // Inversão da string
        String inversao = new StringBuilder(resultado).reverse().toString();
        System.out.println("String invertida: " + inversao);
    }
}
