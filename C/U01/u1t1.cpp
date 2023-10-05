#include <stdio.h>

int main()
{
    // Declaração de variáveis
    int numero1, numero2, soma;

    // Solicita ao usuário que insira dois números
    printf("Digite o primeiro número: ");
    scanf("%d", &numero1);

    printf("Digite o segundo número: ");
    scanf("%d", &numero2);

    // Calcula a soma dos dois números
    soma = numero1 + numero2;

    // Exibe o resultado
    printf("A soma de %d e %d é igual a %d\n", numero1, numero2, soma);

    return 0; // Retorna 0 para indicar que o programa foi executado com sucesso
}