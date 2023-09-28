var contadorElement = document.getElementById("contador");
var aumentarBotao = document.getElementById("aumentar");
var diminuirBotao = document.getElementById("diminuir");

var contador = 0;


function atualizarContador() {
    contadorElement.innerHTML = contador;
}

aumentarBotao.addEventListener("click", function() {
    contador++;
    atualizarContador();
});


diminuirBotao.addEventListener("click", function() {
    if (contador > 0) {
        contador--;
        atualizarContador();
    }
});


atualizarContador();