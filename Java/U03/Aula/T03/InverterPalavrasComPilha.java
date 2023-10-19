package T03;
import java.util.Stack;
import java.util.Scanner;

public class InverterPalavrasComPilha {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma linha de texto: ");
        String inputLine = scanner.nextLine();
        scanner.close();

        String[] words = inputLine.split(" ");

        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }

        System.out.println("Palavras na ordem inversa:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
