#include <iostream>
#include <string>

// Definição de uma estrutura chamada "Pessoa"
struct Pessoa {
    std::string nome;
    int idade;
    double altura;
};

int main() {
    // Criação de uma variável do tipo Pessoa
    Pessoa pessoa1;
    pessoa1.nome = "Alice";
    pessoa1.idade = 30;
    pessoa1.altura = 1.65;

    // Acessando os campos da estrutura
    std::cout << "Nome: " << pessoa1.nome << std::endl;
    std::cout << "Idade: " << pessoa1.idade << std::endl;
    std::cout << "Altura: " << pessoa1.altura << std::endl;

    return 0;
}
