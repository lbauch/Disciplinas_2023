function registra(){
    let elmnt = document.getElementById('word');
    var str = "" + elmnt.value;
    let senha = "prato";
    var achou = false;
    if(achou === true){
        alert("Palavra já encontrada. Reinicie para continuar.");
    }
    else {
        if(str.length < 5){

        }
        else{
            if(str === senha){
                achou = true;
                alert("Parabéns! Você encontrou a palavra");
            }
            let palavra = str.split('');
            let quebraSenha  = senha.split('');
            var vTabela = document.getElementById('tabela');
            var vLinha = vTabela.insertRow();
            for(var i = 0; i < str.length; i ++){
                var vCol = vLinha.insertCell(i);
                vCol.innerHTML = palavra[i];
                if(quebraSenha[i] === palavra[i]){
                    vCol.classList.add('sucesso');
                }
                else if(senha.includes(palavra[i])){
                    vCol.classList.add('quase');
                }
            }
            elmnt.value = "";
            localStorage.clear();
        }
    }
}

function resetar(){
    localStorage.clear();
    window.location.reload();
}

