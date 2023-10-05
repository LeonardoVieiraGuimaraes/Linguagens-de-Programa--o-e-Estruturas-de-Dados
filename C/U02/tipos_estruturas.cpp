#include <stdio.h>

// Definição de uma estrutura (struct) para representar um ponto 2D
struct Ponto {
    int x;
    int y;
};

int main() {
    // Declaração e inicialização de uma variável do tipo struct Ponto
    struct Ponto p1 = {3, 4};

    // Acessando os campos da estrutura
    printf("Coordenadas do ponto: (%d, %d)\n", p1.x, p1.y);

    return 0;
}
