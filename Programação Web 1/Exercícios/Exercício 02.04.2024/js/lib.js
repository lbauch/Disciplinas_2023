/*Tela 1*/
function calcular(val1, val2){
    var numero1 = Number.parseInt(val1.value);
    var numero2 = Number.parseInt(val2.value);
    var calc = numero1 + numero2
    document.getElementById('soma').innerHTML = "resultado: " + calc;
}

function verificaMaior(num1, num2){
    var numero1 = Number.parseInt(num1.value);
    var numero2 = Number.parseInt(num2.value);
    let vElemento = document.getElementById('maior');
    if(numero1 > numero2){
        vElemento.innerHTML = "Primeiro número é maior";
        vElemento.classList.add('primeiro');
        vElemento.classList.remove('segundo','iguais');
    } 
    else if(numero1 < numero2){
        vElemento.innerHTML = "Segundo número é maior";
        vElemento.classList.add('segundo');
        vElemento.classList.remove('primeiro','iguais');
    }
    else{
        vElemento.innerHTML = "Ambos são iguais”";
        vElemento.classList.add('iguais');
        vElemento.classList.remove('segundo','primeiro');
    }
}

/*Tela 2*/
function reescrever(texto){
    document.getElementById('novoTexto').innerHTML = texto.value;
}

function calculaTamanho(texto){
    document.getElementById('tamanho').innerHTML = "O tamanho atual do campo é de " + texto.value.length;
}

/*Tela 3*/
function exibirItem(texto){
    alert(texto);
}

function vermelho(vElemento){
    vElemento.style.backgroundColor = "Red"

}

/*Tela 3 Opcional*/

function insereLinha(){
    var table = document.getElementById("tabela2");
    var row = table.insertRow(table.rows.length);

    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    var cell3 = row.insertCell(2);

    cell1.innerHTML = 'Item 1';
    cell2.innerHTML = 'Item 2';
    cell3.innerHTML = 'Item 3';

}

