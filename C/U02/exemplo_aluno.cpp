#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Definição da estrutura Aluno
struct aluno
{
    int mat;
    char nome[81];
    char end[121];
    char tel[21];
};
typedef struct aluno Aluno;

// Função para retirar um aluno do vetor
void retira(int n, Aluno **tab, int i)
{
    if (i < 0 || i >= n)
    {
        printf("Índice fora do limite do vetor\n");
        return;
    }

    if (tab[i] != NULL)
    {
        free(tab[i]);
        tab[i] = NULL;
    }
}

// Função para inicializar o vetor de alunos
void inicializa(int n, Aluno **tab)
{
    int i;
    for (i = 0; i < n; i++)
    {
        tab[i] = NULL;
    }
}

// Função para preencher os dados de um aluno
void preencher(int n, Aluno **tab, int i)
{
    if (i < 0 || i >= n)
    {
        printf("Índice fora do limite do vetor\n");
        return;
    }

    if (tab[i] == NULL)
    {
        tab[i] = (Aluno *)malloc(sizeof(Aluno));
        if (tab[i] == NULL)
        {
            printf("Falha na alocação de memória\n");
            exit(1);
        }

        printf("Entre com a matrícula: ");
        scanf("%d", &tab[i]->mat);
        printf("Entre com o nome: ");
        scanf("%s", tab[i]->nome);
        printf("Entre com o endereço: ");
        scanf("%s", tab[i]->end);
        printf("Entre com o telefone: ");
        scanf("%s", tab[i]->tel);
    }
}

// Função para inserir dados de um aluno
void inserir_dados(int n, Aluno **tab)
{
    int i;
    for (i = 0; i < n; i++)
    {
        if (tab[i] == NULL)
        {
            preencher(n, tab, i);
            return; // Sai após inserir um aluno
        }
    }
    printf("O vetor de alunos está cheio\n");
}

// Função para imprimir os dados de um aluno
void imprime(int n, Aluno **tab, int i)
{
    if (i < 0 || i >= n)
    {
        printf("Índice fora do limite do vetor\n");
        return;
    }

    if (tab[i] != NULL)
    {
        printf("Matrícula: %d\n", tab[i]->mat);
        printf("Nome: %s\n", tab[i]->nome);
        printf("Endereço: %s\n", tab[i]->end);
        printf("Telefone: %s\n", tab[i]->tel);
    }
}

// Função para imprimir todos os alunos do vetor
void imprime_tudo(int n, Aluno **tab)
{
    int i;
    for (i = 0; i < n; i++)
    {
        imprime(n, tab, i);
    }
}

int main()
{
    int n = 5;               // Tamanho do vetor de alunos
    Aluno *vetorDeAlunos[n]; // Vetor de ponteiros para Aluno

    // Inicializa o vetor de alunos
    inicializa(n, vetorDeAlunos);

    // Inserir dados de alunos
    inserir_dados(n, vetorDeAlunos);
    inserir_dados(n, vetorDeAlunos);

    // Imprime os dados dos alunos
    imprime_tudo(n, vetorDeAlunos);

    // Retira um aluno do vetor
    retira(n, vetorDeAlunos, 0);

    // Imprime os dados dos alunos novamente
    imprime_tudo(n, vetorDeAlunos);

    return 0;
}
