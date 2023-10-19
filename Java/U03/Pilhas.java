// Pilhas, em termos de estruturas de dados, são uma coleção de elementos organizados em que a inserção e remoção de itens seguem o princípio Last-In, First-Out (LIFO). Isso significa que o último elemento inserido na pilha é o primeiro a ser removido. Pilhas são usadas em muitos contextos, como gerenciamento de chamadas de funções em uma linguagem de programação (a pilha de chamadas), gerenciamento de histórico de navegação em um navegador da web e muito mais.


import java.util.EmptyStackException;

class Stack {
    private int maxSize;       // Tamanho máximo da pilha
    private int[] stackArray;  // Array para armazenar os elementos da pilha
    private int top;           // Índice do topo da pilha

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // A pilha está vazia no início
    }

    // Método para empilhar um elemento
    public void push(int value) {
        if (isFull()) {
            System.out.println("A pilha está cheia. Não é possível adicionar " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Método para desempilhar um elemento
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return (top == -1);
    }

    // Método para verificar se a pilha está cheia
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class Pilhas {
    public static void main(String[] args) {
        Stack myStack = new Stack(5); // Criando uma pilha com tamanho máximo 5

        // Empilhando elementos
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Desempilhando e exibindo elementos
        System.out.println("Elemento desempilhado: " + myStack.pop());
        System.out.println("Elemento desempilhado: " + myStack.pop());

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + myStack.isEmpty());
    }
}
