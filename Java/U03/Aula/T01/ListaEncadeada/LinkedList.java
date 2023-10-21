package T01.ListaEncadeada;

// Classe que representa a lista encadeada
class LinkedList {
    private Node head;  // Referência para o primeiro nó da lista (cabeça)

    public LinkedList() {
        head = null;  // Inicializa a lista vazia
    }

    // Método para adicionar um nó no final da lista
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

    // Método para adicionar um nó no início da lista (prefixar)
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Método para remover um nó com um valor específico
    public void delete(int data) {
        if (head == null) {
            return;  // Nada a fazer se a lista estiver vazia
        }
        if (head.data == data) {
            head = head.next;  // Remove o primeiro nó se ele tiver o valor desejado
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;  // Remove o nó seguinte
                return;
            }
            current = current.next;
        }
    }

    // Método para imprimir os elementos da lista
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}