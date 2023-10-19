// Listas encadeadas são uma estrutura de dados fundamental em ciência da computação e programação. Elas consistem em uma sequência de elementos, cada um dos quais possui um valor e uma referência (ponteiro) para o próximo elemento da lista. Isso permite a criação de uma estrutura de dados flexível e dinâmica, onde os elementos podem ser facilmente inseridos, removidos e acessados.


// Definição da classe Node para representar os elementos da lista
class Node {
    int data;   // O valor do nó
    Node next;  // Referência para o próximo nó

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Definição da classe LinkedList para manipular a lista
class LinkedList {
    Node head; // Nó inicial (cabeça) da lista

    public LinkedList() {
        this.head = null;
    }

    // Método para adicionar um elemento no final da lista
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Método para imprimir os elementos da lista
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class ListasEncadeadas {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // Adicionando elementos à lista
        myList.append(10);
        myList.append(20);
        myList.append(30);

        // Exibindo os elementos da lista
        myList.display();
    }
}
