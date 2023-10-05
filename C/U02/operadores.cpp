#include <stdio.h>

int main()
{
    // Operadores aritméticos
    int a = 10;
    int b = 3;
    int resultado;

    resultado = a + b; // Operador de adição
    printf("Soma: %d\n", resultado);

    resultado = a - b; // Operador de subtração
    printf("Subtração: %d\n", resultado);

    resultado = a * b; // Operador de multiplicação
    printf("Multiplicação: %d\n", resultado);

    resultado = a / b; // Operador de divisão
    printf("Divisão: %d\n", resultado);

    // Operadores de comparação
    if (a == b)
    {
        printf("a é igual a b\n");
    }
    else if (a != b)
    {
        printf("a é diferente de b\n");
    }
    else if (a < b)
    {
        printf("a é menor que b\n");
    }
    else if (a > b)
    {
        printf("a é maior que b\n");
    }

    // Operadores lógicos
    int x = 5;
    int y = 10;

    if (x < 10 && y > 5)
    {
        printf("Ambas as condições são verdadeiras\n");
    }

    if (x < 10 || y < 5)
    {
        printf("Pelo menos uma das condições é verdadeira\n");
    }

    if (!(x < 10))
    {
        printf("A negação da primeira condição é verdadeira\n");
    }

    // Operadores de atribuição
    int c = 5;
    int d = 10;

    c += d; // c = c + d
    printf("c += d: %d\n", c);

    c -= d; // c = c - d
    printf("c -= d: %d\n", c);

    c *= d; // c = c * d
    printf("c *= d: %d\n", c);

    c /= d; // c = c / d
    printf("c /= d: %d\n", c);

    return 0;
}
