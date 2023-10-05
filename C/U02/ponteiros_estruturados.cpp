#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Definição da estrutura Aluno
struct Aluno
{
    int mat;
    char nome[81];
    char end[121];
    char tel[21];
};

typedef struct Aluno Aluno;

int main()
{
    // Vetor de estruturas
    Aluno alunos[3]; // Cria um vetor de 3 alunos

    // Preenchendo os dados dos alunos
    alunos[0].mat = 1;
    strcpy(alunos[0].nome, "João");
    strcpy(alunos[0].end, "Rua A");
    strcpy(alunos[0].tel, "123456789");

    alunos[1].mat = 2;
    strcpy(alunos[1].nome, "Maria");
    strcpy(alunos[1].end, "Rua B");
    strcpy(alunos[1].tel, "987654321");

    alunos[2].mat = 3;
    strcpy(alunos[2].nome, "Pedro");
    strcpy(alunos[2].end, "Rua C");
    strcpy(alunos[2].tel, "555555555");

    // Imprimindo os dados dos alunos
    for (int i = 0; i < 3; i++)
    {
        printf("Aluno %d:\n", alunos[i].mat);
        printf("Nome: %s\n", alunos[i].nome);
        printf("Endereço: %s\n", alunos[i].end);
        printf("Telefone: %s\n", alunos[i].tel);
        printf("\n");
    }

    // Vetor de ponteiros para estruturas
    Aluno *vetorDePonteiros[3]; // Cria um vetor de 3 ponteiros para Aluno

    // Alocando memória e preenchendo os dados dos alunos
    for (int i = 0; i < 3; i++)
    {
        vetorDePonteiros[i] = (Aluno *)malloc(sizeof(Aluno));
        vetorDePonteiros[i]->mat = i + 4;
        strcpy(vetorDePonteiros[i]->nome, "Novo Aluno");
        strcpy(vetorDePonteiros[i]->end, "Novo Endereço");
        strcpy(vetorDePonteiros[i]->tel, "999999999");
    }

    // Imprimindo os dados dos alunos no vetor de ponteiros
    for (int i = 0; i < 3; i++)
    {
        printf("Aluno %d:\n", vetorDePonteiros[i]->mat);
        printf("Nome: %s\n", vetorDePonteiros[i]->nome);
        printf("Endereço: %s\n", vetorDePonteiros[i]->end);
        printf("Telefone: %s\n", vetorDePonteiros[i]->tel);
        printf("\n");
    }

    // Liberando a memória alocada para os alunos no vetor de ponteiros
    for (int i = 0; i < 3; i++)
    {
        free(vetorDePonteiros[i]);
    }

    return 0;
}
