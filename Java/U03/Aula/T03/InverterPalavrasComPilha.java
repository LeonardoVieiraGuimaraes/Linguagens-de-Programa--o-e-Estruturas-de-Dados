package T03;
import java.util.Stack;

public class InverterPalavrasComPilha {
    public static void main(String[] args) {
        String inputLine = "Esta é uma frase de exemplo";

        Stack<Character> letterStack = new Stack<>();
        StringBuilder reversedPhrase = new StringBuilder();

        for (char c : inputLine.toCharArray()) {
            if (c != ' ') {
                letterStack.push(c);
            } else {
                while (!letterStack.isEmpty()) {
                    reversedPhrase.append(letterStack.pop());
                }
                reversedPhrase.append(' ');
            }
        }

        // Certifique-se de lidar com a última palavra se não houver espaço após ela
        while (!letterStack.isEmpty()) {
            reversedPhrase.append(letterStack.pop());
        }

        System.out.println("Frase com palavras invertidas: " + reversedPhrase.toString());
    }
}
