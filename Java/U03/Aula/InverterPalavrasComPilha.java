import java.util.Scanner;
import java.util.Stack;

public class InverterPalavrasComPilha {

    public static void main(String[] args) {
        // Crie um scanner para ler a linha de texto
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma linha de texto:");
        String linha = scanner.nextLine();

        // Fecha o scanner após a leitura
        scanner.close();

        // Divide a linha em palavras usando espaços como delimitadores
        String[] palavras = linha.split(" ");

        // Crie uma pilha para inverter a ordem das palavras
        Stack<String> pilha = new Stack<>();

        // Empilhe as palavras na pilha
        for (String palavra : palavras) {
            pilha.push(palavra);
        }

        // Desempilhe e imprima as palavras na ordem inversa
        System.out.println("Palavras na ordem inversa:");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop() + " ");
        }
    }
}
