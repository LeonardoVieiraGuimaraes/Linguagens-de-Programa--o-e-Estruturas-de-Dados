#include <iostream>
#include <string>

// Definição de uma estrutura (registro) para representar informações de uma pessoa
struct Pessoa {
    std::string nome;
    int idade;
    char sexo;
};

int main() {
    // Declaração e inicialização de uma variável do tipo Pessoa
    Pessoa pessoa1;
    pessoa1.nome = "João";
    pessoa1.idade = 25;
    pessoa1.sexo = 'M';

    // Acessando os campos da estrutura
    std::cout << "Nome: " << pessoa1.nome << std::endl;
    std::cout << "Idade: " << pessoa1.idade << std::endl;
    std::cout << "Sexo: " << pessoa1.sexo << std::endl;

    return 0;
}
