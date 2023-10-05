public class Ponteiros {
    public static void main(String[] args) {
        // Criação de um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Alice", 30);

        // Criação de uma referência para o objeto Pessoa
        Pessoa referenciaPessoa = pessoa1;

        // Acessando os campos do objeto através da referência
        System.out.println("Nome: " + referenciaPessoa.getNome());
        System.out.println("Idade: " + referenciaPessoa.getIdade());
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
