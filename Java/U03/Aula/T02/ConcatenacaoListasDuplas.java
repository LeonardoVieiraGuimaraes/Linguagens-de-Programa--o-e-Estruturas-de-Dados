package T02;
// 1 Desenvolva uma função que possibilite a concatenação de duas listas duplamente encadeadas.

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

public class ConcatenacaoListasDuplas {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Converte os arrays em listas duplamente encadeadas
        Node lista1 = createDoublyLinkedList(array1);
        Node lista2 = createDoublyLinkedList(array2);

        // Concatena as duas listas
        Node result = concatenateDoublyLinkedLists(lista1, lista2);

        // Exibe a lista resultante
        displayDoublyLinkedList(result);
    }

    // Função para criar uma lista duplamente encadeada a partir de um array
    public static Node createDoublyLinkedList(int[] array) {
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

    // Função para concatenar duas listas duplas
    public static Node concatenateDoublyLinkedLists(Node lista1, Node lista2) {
        if (lista1 == null) {
            return lista2;
        }
        if (lista2 == null) {
            return lista1;
        }

        Node current = lista1;
        while (current.next != null) {
            current = current.next;
        }

        current.next = lista2;
        lista2.prev = current;

        return lista1;
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
