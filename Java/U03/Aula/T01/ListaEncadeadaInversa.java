package T01;
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int size;

    LinkedList() {
        head = null;
        size = 0;
    }

    void insert(char data) {
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
        size++;
    }

    LinkedList reverseCopy() {
        LinkedList reversedList = new LinkedList();
        Node current = head;
        while (current != null) {
            reversedList.insert(current.data);
            current = current.next;
        }
        return reversedList;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ListaEncadeadaInversa {
    public static void main(String[] args) {
        LinkedList originalList = new LinkedList();
        LinkedList reversedList;

        // Inserir 10 caracteres na lista original
        for (int i = 0; i < 10; i++) {
            originalList.insert((char) ('A' + i));
        }

        // Criar a lista reversa
        reversedList = originalList.reverseCopy();

        // Exibir os dados da lista original
        System.out.println("Lista original:");
        originalList.display();

        // Exibir os dados da lista reversa
        System.out.println("Lista reversa:");
        reversedList.display();
    }
}
