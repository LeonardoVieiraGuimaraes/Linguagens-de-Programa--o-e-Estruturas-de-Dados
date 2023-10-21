package T01.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);

        list.prepend(0);
        list.append(4);

        System.out.print("Lista: ");
        list.print();  // Imprime os elementos da lista

        list.delete(2);  // Remove o elemento 2

        System.out.print("Lista após a remoção do elemento 2: ");
        list.print();  // Imprime a lista atualizada
    }
}