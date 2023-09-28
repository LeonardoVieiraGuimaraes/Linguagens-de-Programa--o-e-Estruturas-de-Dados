public class ControleFluxo {
    public static void main(String[] args) {
        int numero = 10;

        if (numero > 5) {
            System.out.println("O número é maior que 5.");
        } else {
            System.out.println("O número não é maior que 5.");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }

        while (numero > 0) {
            System.out.println("Número atual: " + numero);
            numero--;
        }
    }
}
