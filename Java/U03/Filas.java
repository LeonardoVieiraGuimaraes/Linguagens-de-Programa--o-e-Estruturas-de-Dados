// Filas, em termos de estruturas de dados, são uma coleção de elementos organizados de acordo com o princípio First-In, First-Out (FIFO). Isso significa que o primeiro elemento inserido na fila é o primeiro a ser removido. Filas são amplamente usadas em programação para gerenciar tarefas em ordem cronológica, como processamento de tarefas em um sistema de impressão, gerenciamento de solicitações de recursos compartilhados e muito mais.

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();

        // Enfileirando elementos
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);

        // Desenfileirando e exibindo elementos
        System.out.println("Elemento desenfileirado: " + myQueue.poll());
        System.out.println("Elemento desenfileirado: " + myQueue.poll());

        // Verificando se a fila está vazia
        System.out.println("A fila está vazia? " + myQueue.isEmpty());
    }
}
