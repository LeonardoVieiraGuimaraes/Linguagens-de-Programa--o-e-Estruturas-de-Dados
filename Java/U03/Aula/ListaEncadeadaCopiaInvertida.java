// 2 Desenvolva um programa que crie um objeto de lista encadeada de 10 caracteres e depois crie um segundo objeto de lista que contém uma cópia da primeira lista, mas na ordem inversa, e exiba os dados ao usuário


import java.util.LinkedList;

public class ListaEncadeadaCopiaInvertida {

    public static void main(String[] args) {
        // Criar a primeira lista encadeada
        LinkedList<Character> primeiraLista = new LinkedList<>();

        // Adicionar 10 caracteres à primeira lista
        primeiraLista.add('A');
        primeiraLista.add('B');
        primeiraLista.add('C');
        primeiraLista.add('D');
        primeiraLista.add('E');
        primeiraLista.add('F');
        primeiraLista.add('G');
        primeiraLista.add('H');
        primeiraLista.add('I');
        primeiraLista.add('J');

        // Criar a segunda lista encadeada como uma cópia inversa da primeira
        LinkedList<Character> segundaLista = new LinkedList<>(primeiraLista);
        // Reverter a ordem dos elementos na segunda lista
        for (int i = 0; i < segundaLista.size() / 2; i++) {
            char temp = segundaLista.get(i);
            segundaLista.set(i, segundaLista.get(segundaLista.size() - 1 - i));
            segundaLista.set(segundaLista.size() - 1 - i, temp);
        }

        // Exibir os dados da primeira lista
        System.out.println("Primeira Lista: " + primeiraLista);

        // Exibir os dados da segunda lista (cópia invertida)
        System.out.println("Segunda Lista (Cópia Invertida): " + segundaLista);
    }
}
