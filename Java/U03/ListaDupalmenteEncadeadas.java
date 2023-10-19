class Node {
    int data;        // Valor do nó
    Node next;       // Referência para o próximo nó
    Node previous;   // Referência para o nó anterior

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

class DoublyLinkedList {
    Node head; // Nó inicial (cabeça) da lista

    public DoublyLinkedList() {
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
            newNode.previous = current;
        }
    }

    // Método para exibir os elementos da lista da esquerda para a direita
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Método para exibir os elementos da lista da direita para a esquerda
    public void displayBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.previous;
        }
        System.out.println("null");
    }
}

public class ListaDupalmenteEncadeadas {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        // Adicionando elementos à lista
        myList.append(10);
        myList.append(20);
        myList.append(30);

        // Exibindo os elementos da lista da esquerda para a direita
        System.out.println("Lista da esquerda para a direita:");
        myList.displayForward();

        // Exibindo os elementos da lista da direita para a esquerda
        System.out.println("Lista da direita para a esquerda:");
        myList.displayBackward();
    }
}
