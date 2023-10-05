#include <iostream>

int main() {
    // Declaração e inicialização de uma matriz 2D (3x3) de inteiros
    int matriz[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Acessando e imprimindo os elementos da matriz
    std::cout << "Elementos da matriz:" << std::endl;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            std::cout << matriz[i][j] << " ";
        }
        std::cout << std::endl;
    }

    return 0;
}
