#include <stdio.h>

int main() {
    // Declarando e inicializando um array de inteiros
    int numeros[5] = {1, 2, 3, 4, 5};

    // Acessando elementos do array e imprimindo-os
    printf("Elemento 1: %d\n", numeros[0]); // Saída: Elemento 1: 1
    printf("Elemento 3: %d\n", numeros[2]); // Saída: Elemento 3: 3
    
    int tamanho = 5;
    for (int i = 0; i < tamanho; i++) {
        printf("%d\n", numeros[i]);
    }
    // Modificando elementos do array
    numeros[1] = 10;
    printf("Novo elemento 2: %d\n", numeros[1]); // Saída: Novo elemento 2: 10

   
    return 0;
}
