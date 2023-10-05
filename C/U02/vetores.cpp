#include <iostream>

int main() {
    // Declaração e inicialização de um vetor de inteiros
    int vetor[5];

    // Escrita de valores no vetor
    vetor[0] = 10;
    vetor[1] = 20;
    vetor[2] = 30;
    vetor[3] = 40;
    vetor[4] = 50;

    // Leitura e impressão dos valores do vetor
    std::cout << "Valores do vetor:" << std::endl;
    for (int i = 0; i < 5; i++) {
        std::cout << "Elemento " << i << ": " << vetor[i] << std::endl;
    }

    return 0;
}
