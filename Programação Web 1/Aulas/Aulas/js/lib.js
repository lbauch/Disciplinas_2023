function minhaFuncao() {
    alert('Esse é um alerta!');
}

function outraFuncao(pMensagem = 'Não foi passado parâmetro') {
    alert(pMensagem);
}

function alteraDiv() {
    document.getElementById('div1').innerHTML = "Muda conteúdo";
}

function alteraBG() {
    let vElemento = document.getElementById('mensagem');
    vElemento.style.backgroundColor = "Red";
    vElemento.style.fontFamily = "Verdana";
    vElemento.style.textAlign = "center";
}

function ativaSucesso() {
    let vElemento = document.getElementById('mensagem');
    vElemento.classList.add('sucesso');
    vElemento.classList.remove('erro','cuidado');
}

function ativaErro() {
    let vElemento = document.getElementById('mensagem');
    vElemento.classList.add('erro');
    vElemento.classList.remove('sucesso','cuidado');
}

function ativaCuidado() {
    let vElemento = document.getElementById('mensagem');
    vElemento.classList.add('cuidado');
    vElemento.classList.remove('erro','sucesso');
}

function setInfo() {
    localStorage.setItem("nome","Marcos");
    localStorage.setItem("objeto","{ nome: 'Marcos', emprego: 'Professor'}");
}

function delInfo() {
    localStorage.removeItem("nome");
}

function criaElemento() {
    var vElemento = document.createElement('p');
    vElemento.innerHTML = "Conteúdo novo";
    var vElementoPai = document.getElementById('elementoPai');
    vElementoPai.appendChild(vElemento);
}

var vItem = 2;
function criaItem() {
    var vNovoItem = document.createElement('li');
    vNovoItem.innerHTML = 'Item '+vItem;
    vItem++;
    document.getElementById('lista').appendChild(vNovoItem);
}

function removeItem() {
    document.getElementById('lista').lastChild.remove();
}

function insereLinha() {
    var vTabela = document.getElementById('tabela');
    var vLinha = vTabela.insertRow(-1);
    var vCol1 = vLinha.insertCell(0);
    var vCol2 = vLinha.insertCell(1);
    var vCol3 = vLinha.insertCell(2);
    vCol1.innerHTML = "Nova col 1";
    vCol2.innerHTML = "Nova col 2";
    vCol3.innerHTML = "Nova col 3";
}

function somatorio(...pNumeros) {
    var vSoma = 0;
    for (let vNumero of pNumeros) {
        vSoma += vNumero;
    }
    return vSoma;
}