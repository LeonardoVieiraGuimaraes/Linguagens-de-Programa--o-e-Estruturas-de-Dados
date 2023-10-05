#include <iostream>

int main() {
    // Declaração e inicialização de um vetor de inteiros
    int numeros[5] = {1, 2, 3, 4, 5};

    // Acessando e imprimindo os elementos do vetor
    std::cout << "Elementos do vetor:" << std::endl;
    for (int i = 0; i < 5; i++) {
        std::cout << numeros[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}
