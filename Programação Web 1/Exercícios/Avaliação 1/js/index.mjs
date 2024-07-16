let imagemLogin = document.getElementById('direita')
const imagem = `<a href="cadastro.html"><img src="../imagens/user-6380868_1280.png" height="50em"></a> `
const autenticado = localStorage.getItem('login')
const textoAutenticado = `<h6>${autenticado}</h6>`

if (autenticado != null) {
    imagemLogin.innerHTML = imagem + textoAutenticado;
}
