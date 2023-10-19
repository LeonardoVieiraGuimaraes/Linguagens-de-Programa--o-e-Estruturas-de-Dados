// 1 Desenvolva um programa que possibilite a inserção de 25 valores do tipo inteiro aleatórios de 0 a 100 em ordem em um objeto de lista encadeada. Ao final o programa deverá calcular a soma dos elementos e a média em ponto flutuante dos elementos.


import java.util.LinkedList;
import java.util.Random;

public class ListaEncadeada {

    public static void main(String[] args) {
        // Criar a lista encadeada
        LinkedList<Integer> listaEncadeada = new LinkedList<>();

        // Criar um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Inserir 25 valores inteiros aleatórios na lista
        for (int i = 0; i < 25; i++) {
            int valor = random.nextInt(101); // Gera números aleatórios de 0 a 100
            listaEncadeada.add(valor);
        }

        // Calcular a soma dos elementos
        int soma = 0;
        for (int valor : listaEncadeada) {
            soma += valor;
        }

        // Calcular a média em ponto flutuante dos elementos
        double media = (double) soma / listaEncadeada.size();

        // Exibir a lista, a soma e a média
        System.out.println("Valores na lista: " + listaEncadeada);
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);
    }
}
