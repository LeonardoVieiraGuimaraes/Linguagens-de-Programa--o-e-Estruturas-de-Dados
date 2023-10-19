#include <stdio.h>
#include <string.h>

int main() {
    char str1[] = "Leonardo, ";
    char str2[] = "Bom dia";
    char result[20]; // Uma string para armazenar o resultado

    // Concatenação de strings
    // strcat(result, str1); // Concatena str1 em result
    printf(strcat(result, str1));
    // strcat(result, str2); // Concatena str2 em result
    printf(strcat(result, str2));

    printf("Resultado da concatenação: %s\n", result);

    // Comprimento da string
    int comprimento = strlen(result);
    printf("Comprimento da string: %d\n", comprimento);

    // Comparação de strings
    char str3[] = "Leonardo, Bom dia!";
    if (strcmp(result, str3) == 0) {
        printf("As strings result e str3 são iguais.\n");
    } else {
        printf("As strings result e str3 são diferentes.\n");
    }

    // Extração de subcadeia
    char subcadeia[10];
    strncpy(subcadeia, result + 7, 5); // Copia os caracteres de result a partir da posição 7 (índice 0-based) em subcadeia
    subcadeia[5] = '\0'; // Adiciona o terminador de string
    printf("Subcadeia extraída: %s\n", subcadeia);

    return 0;
}
