public class ExemploOperadoresAritmeticos {
    public static void main(String[] args) {
         // Operadores aritméticos em Java

         int numero1 = 10;
         int numero2 = 5;
 
         // Adição
         int soma = numero1 + numero2;
         System.out.println("Soma: " + soma); // Saída: 15
 
         // Subtração
         int subtracao = numero1 - numero2;
         System.out.println("Subtração: " + subtracao); // Saída: 5
 
         // Multiplicação
         int multiplicacao = numero1 * numero2;
         System.out.println("Multiplicação: " + multiplicacao); // Saída: 50
 
         // Divisão (observe que estamos usando tipos double para obter uma divisão de ponto flutuante)
         double divisao = (double) numero1 / numero2;
         System.out.println("Divisão: " + divisao); // Saída: 2.0
 
         // Módulo (resto da divisão)
         int modulo = numero1 % numero2;
         System.out.println("Módulo: " + modulo); // Saída: 0
 
         // Incremento (pós-incremento)
         int x = 5;
         int y = x++;
         System.out.println("x: " + x); // Saída: 6
         System.out.println("y: " + y); // Saída: 5
 
         // Decremento (pré-decremento)
         int a = 8;
         int b = --a;
         System.out.println("a: " + a); // Saída: 7
         System.out.println("b: " + b); // Saída: 7

    }

}
