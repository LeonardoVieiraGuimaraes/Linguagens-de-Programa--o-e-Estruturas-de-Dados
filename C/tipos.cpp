#include <stdio.h>

// As constantes são valores fixos que não podem ser alterados após sua definição. Em C, você pode usar a palavra-chave const para criar constantes.
#define PI 3.14159265

const int ANO_ATUAL = 2023;

int main()
{

    // Os tipos primitivos de dados definem o tipo de informação que uma variável pode armazenar. Em C, alguns dos tipos primitivos de dados mais comuns incluem inteiros (int), números de ponto flutuante (float e double), caracteres (char), entre outros.
    int numero = 42;         // Variável do tipo inteiro
    float salario = 3500.50; // Variável do tipo ponto flutuante
    char letra = 'A';        // Variável do tipo caractere

    printf("Número: %d\n", numero);
    printf("Salário: %.2f\n", salario);
    printf("Letra: %c\n", letra);

    
    printf("Valor de PI: %.2f\n", PI);
    printf("Ano atual: %d\n", ANO_ATUAL);

     // Variáveis são espaços de memória nomeados que armazenam valores. Elas podem ser usadas para armazenar dados que podem ser alterados durante a execução do programa.

    int contador = 0; // Declaração e inicialização de uma variável
    printf("Nova idade: %d\n", contador);

    contador = 10;    // Atribuição de um novo valor à variável
    printf("Idade: %d\n", contador);
    

    // A atribuição é o processo de associar um valor a uma variável. Em C, o operador de atribuição é =.

    int x = 5;
    int y = 10;
    int soma = x + y; // O valor de soma será 15 após a atribuição

    printf("A soma de %d e %d é %d\n", x, y, soma);

    // Os operadores aritméticos são usados para realizar operações matemáticas em variáveis e constantes. Alguns operadores aritméticos em C incluem + (adição), - (subtração), * (multiplicação), / (divisão) e % (módulo)

    int a = 10;
    int b = 3;

    
    int resultado = a + b; // resultado será 13
    printf("Soma: %d\n", resultado);
    resultado = a - b;     // resultado será 7
    printf("Subtração: %d\n", resultado);
    resultado = a * b;     // resultado será 30
    printf("Multiplicação: %d\n", resultado);
    resultado = a / b;     // resultado será 3
    printf("Divisão: %d\n", resultado);
    resultado = a % b;     // resultado será 1 (resto da divisão)
    printf("Resto: %d\n", resultado);

   
    return 0;
}