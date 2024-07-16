const selecao = document.getElementById('temaCustom');
const padrao = document.getElementById('temaNormal');

function mudaTema() {
    document.body.classList.toggle("light");
}

function resetaTema() {
    document.body.classList.remove("light");
}

function enviar() {
    window.location="../html/index.html";
    alert('Dados enviados com sucesso!')
}