#include <stdio.h>
#include <stdlib.h>

int main()
{
    int linhas, colunas;

    // Solicita ao usuário a quantidade de linhas e colunas
    printf("Digite o número de linhas: ");
    scanf("%d", &linhas);
    printf("Digite o número de colunas: ");
    scanf("%d", &colunas);

    // Aloca memória para a matriz com base nas entradas do usuário
    int **matriz = (int **)malloc(linhas * sizeof(int *));
    for (int i = 0; i < linhas; i++)
    {
        matriz[i] = (int *)malloc(colunas * sizeof(int));
    }

    // Preenche a matriz com valores inseridos pelo usuário
    printf("Digite os elementos da matriz:\n");
    for (int i = 0; i < linhas; i++)
    {
        for (int j = 0; j < colunas; j++)
        {
            printf("Matriz[%d][%d]: ", i+1, j +1);
            scanf("%d", &matriz[i][j]);
        }
    }

    // Imprime a matriz
    printf("Matriz inserida:\n");
    for (int i = 0; i < linhas; i++)
    {
        for (int j = 0; j < colunas; j++)
        {
            printf("%d\t", matriz[i][j]);
        }
        printf("\n");
    }

    // Libera a memória alocada para a matriz
    for (int i = 0; i < linhas; i++)
    {
        free(matriz[i]);
    }
    free(matriz);

    return 0;
}
