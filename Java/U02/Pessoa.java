public class Pessoa {
    // Campos da classe Pessoa
    private String nome;
    private int idade;
    private double altura;

    // Construtor para inicializar os campos
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Métodos para acessar os campos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public static void main(String[] args) {
        // Criação de um objeto do tipo Pessoa
        Pessoa pessoa1 = new Pessoa("Alice", 30, 1.65);

        // Acessando os campos do objeto
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
    }
}
