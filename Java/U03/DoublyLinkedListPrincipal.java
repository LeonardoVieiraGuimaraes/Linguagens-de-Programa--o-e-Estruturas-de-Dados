public class DoublyLinkedListPrincipal {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Lista para frente:");
        list.printForward();

        System.out.println("Lista para trás:");
        list.printBackward();

        list.prepend(0);

        System.out.println("Após inserção no início:");
        list.printForward();

        list.remove(2);

        System.out.println("Após remover o valor 2:");
        list.printForward();
    }
}
