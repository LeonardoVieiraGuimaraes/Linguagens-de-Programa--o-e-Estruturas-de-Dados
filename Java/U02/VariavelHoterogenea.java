public class VariavelHoterogenea {
    private String nome;
    private int idade;
    private double altura;

    public VariavelHoterogenea(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

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
        VariavelHoterogenea registro = new VariavelHoterogenea("Alice", 30, 1.65);

        System.out.println("Nome: " + registro.getNome());
        System.out.println("Idade: " + registro.getIdade());
        System.out.println("Altura: " + registro.getAltura());
    }
}
