window.autenticar = function () {
    let login = document.getElementById('login').value;
    let senha = document.getElementById('senha').value;
    if(login == " " || senha == " "){
        alert('Login/senha inválido');
    }
    if(login != null && senha != null && login != "" && senha != "" && login != " " && senha != " "){
        window.location="../html/index.html";
        localStorage.setItem("login", login);
        alert('Usuário foi autenticado');
    }
    else {
        alert('Usuário não autenticado');
    }
}