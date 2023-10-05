#include <iostream>
#include <string>

// Definição de uma estrutura Pessoa
struct Pessoa {
    std::string nome;
    int idade;
};

int main() {
    // Criação de uma variável do tipo Pessoa
    Pessoa pessoa1 = {"Alice", 30};

    // Criação de um ponteiro para a estrutura Pessoa e inicialização com o endereço de pessoa1
    Pessoa* ptrPessoa = &pessoa1;

    // Acessando os campos da estrutura através do ponteiro
    std::cout << "Nome: " << ptrPessoa->nome << std::endl;
    std::cout << "Idade: " << ptrPessoa->idade << std::endl;

    return 0;
}
