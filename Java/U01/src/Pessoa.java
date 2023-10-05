public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.");
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 30);
        Pessoa pessoa2 = new Pessoa("Bob", 25);

        pessoa1.saudacao();
        pessoa2.saudacao();
    }
}
