#include <stdio.h>
#include <string.h>

int main() {
    char vetorDeStrings[3][20]; // Declara um vetor de 3 strings, cada uma com espaço para até 19 caracteres e o caractere nulo '\0'
    
    // Atribuindo valores às strings no vetor
    strcpy(vetorDeStrings[0], "Primeira string");
    strcpy(vetorDeStrings[1], "Segunda string");
    strcpy(vetorDeStrings[2], "Terceira string");

    // Acessando e imprimindo as strings no vetor
    printf("Vetor de Strings:\n");
    for (int i = 0; i < 3; i++) {
        printf("%s\n", vetorDeStrings[i]);
    }

    return 0;
}
