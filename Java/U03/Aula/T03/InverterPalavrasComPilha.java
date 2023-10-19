package T03;

import java.util.Stack;

public class InverterPalavrasComPilha {
    public static void main(String[] args) {
        String inputLine = "Esta é uma frase de exemplo"; // Frase de entrada

        Stack<Character> letterStack = new Stack<>(); // Cria uma pilha para armazenar letras
        StringBuilder reversedPhrase = new StringBuilder(); // Cria um StringBuilder para construir a frase invertida

        for (char c : inputLine.toCharArray()) { // Percorre cada caractere da frase
            if (c != ' ') { // Se o caractere não for um espaço em branco
                letterStack.push(c); // Empilha o caractere na pilha
            } else { // Se encontrar um espaço (final de uma palavra)
                while (!letterStack.isEmpty()) { // Desempilha e anexa as letras à frase invertida
                    reversedPhrase.append(letterStack.pop());
                }
                reversedPhrase.append(' '); // Adiciona um espaço em branco entre as palavras
            }
        }

        // Certifica-se de lidar com a última palavra se não houver espaço após ela
        while (!letterStack.isEmpty()) {
            reversedPhrase.append(letterStack.pop());
        }

        System.out.println("Frase com palavras invertidas: " + reversedPhrase.toString()); // Imprime a frase com palavras invertidas
    }
}
