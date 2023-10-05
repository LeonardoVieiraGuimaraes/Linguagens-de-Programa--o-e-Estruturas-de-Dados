#include <iostream>

// Declaração da função soma que recebe dois inteiros como parâmetros
int soma(int a, int b) {
    int resultado = a + b;
    return resultado; // Retorna o resultado da soma
}

int main() {
    int num1 = 5;
    int num2 = 3;

    // Chamada da função soma e armazenamento do resultado em uma variável
    int resultadoSoma = soma(num1, num2);

    // Imprime o resultado da soma
    std::cout << "A soma de " << num1 << " e " << num2 << " é: " << resultadoSoma << std::endl;

    return 0;
}
