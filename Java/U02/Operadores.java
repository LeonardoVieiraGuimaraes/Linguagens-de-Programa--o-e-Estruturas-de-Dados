public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 3;
        int resultado;

        resultado = a + b; // Operador de adição
        System.out.println("Soma: " + resultado);

        resultado = a - b; // Operador de subtração
        System.out.println("Subtração: " + resultado);

        resultado = a * b; // Operador de multiplicação
        System.out.println("Multiplicação: " + resultado);

        resultado = a / b; // Operador de divisão
        System.out.println("Divisão: " + resultado);

        // Operadores de comparação
        if (a == b) {
            System.out.println("a é igual a b");
        } else if (a != b) {
            System.out.println("a é diferente de b");
        } else if (a < b) {
            System.out.println("a é menor que b");
        } else if (a > b) {
            System.out.println("a é maior que b");
        }

        // Operadores lógicos
        int x = 5;
        int y = 10;

        if (x < 10 && y > 5) {
            System.out.println("Ambas as condições são verdadeiras");
        }

        if (x < 10 || y < 5) {
            System.out.println("Pelo menos uma das condições é verdadeira");
        }

        if (!(x < 10)) {
            System.out.println("A negação da primeira condição é verdadeira");
        }

        // Operadores de atribuição
        int c = 5;
        int d = 10;

        c += d; // c = c + d
        System.out.println("c += d: " + c);

        c -= d; // c = c - d
        System.out.println("c -= d: " + c);

        c *= d; // c = c * d
        System.out.println("c *= d: " + c);

        c /= d; // c = c / d
        System.out.println("c /= d: " + c);
    }
}
