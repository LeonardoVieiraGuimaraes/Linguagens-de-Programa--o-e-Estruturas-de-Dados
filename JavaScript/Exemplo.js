// Função que recebe outra função como argumento
function executarOperacao(operacao, a, b) {
    return operacao(a, b);
}

// Funções para serem usadas como argumentos
function soma(x, y) {
    return x + y;
}

function subtracao(x, y) {
    return x - y;
}

// Chamando a função com diferentes operações
console.log(executarOperacao(soma, 5, 3)); // Resultado: 8
console.log(executarOperacao(subtracao, 5, 3)); // Resultado: 2
