 // Uso da função
 // Declaração de função que calcula a soma de dois números inteiros
#include <stdio.h>
  // As funções são blocos de código que realizam uma tarefa específica. Elas podem receber parâmetros e retornar valores. Funções em C são declaradas com um tipo de retorno, um nome e uma lista de parâmetros.

// Função para calcular a soma de dois números inteiros
int soma(int a, int b) {
    return a + b;
}

int main() {
    int x = 10;
    int y = 5;

    int resultado = soma(x, y);

    printf("A soma de %d e %d é %d\n", x, y, resultado);

    return 0;
}
