package T02;
// 2 Desenvolva uma função que possibilite a cópia dos dados de um vetor para uma lista duplamente encadeada.

import Node;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CopiaVetorParaListaDupla {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        // Cria uma lista duplamente encadeada a partir do vetor
        Node listaDupla = copyArrayToDoublyLinkedList(vetor);

        // Exibe a lista duplamente encadeada
        displayDoublyLinkedList(listaDupla);
    }

    // Função para copiar dados de um vetor para uma lista duplamente encadeada
    public static Node copyArrayToDoublyLinkedList(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Node head = new Node(array[0]);
        Node current = head;

        for (int i = 1; i < array.length; i++) {
            Node newNode = new Node(array[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }

        return head;
    }

    // Função para exibir a lista duplamente encadeada
    public static void displayDoublyLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
