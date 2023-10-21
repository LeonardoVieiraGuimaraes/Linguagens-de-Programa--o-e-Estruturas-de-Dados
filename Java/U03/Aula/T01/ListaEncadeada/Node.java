package T01.ListaEncadeada;

// Classe que representa um nó da lista encadeada
class Node {
    int data;   // Valor armazenado no nó
    Node next;  // Referência para o próximo nó

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}