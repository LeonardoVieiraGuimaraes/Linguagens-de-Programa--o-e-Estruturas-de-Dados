// package nead.ads.vetor;

public class Testador {
    
    public static void main(String[] args) {

        int x;
        // int[] vetorDeInteiros = new int[3];
        Aluno[] vetorDeInteiros = new Aluno[3];
        vetorDeInteiros[0] = new Aluno(1, "João");
        vetorDeInteiros[1] = new Aluno(2, "Cecilia");
        vetorDeInteiros[2] = new Aluno(3, "Catarina");


        for (int i = 0; i < vetorDeInteiros.length; i++) {
            System.out.println(vetorDeInteiros[i]);
        }

        vetorDeInteiros[3] = 13;
        System.out.println("Passeio pelo Vetor");
    }
}