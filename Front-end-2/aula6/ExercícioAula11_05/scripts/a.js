
//Capturando o elemento Pai 
let elementoPai = document.getElementById("elementoPai");


/* Função é chamada automaticamente após a 
exeucção da pagina pelo navegador */
window.onload = function () {
    percorreListaFelinos();
}

function percorreListaFelinos() {

    //Percorrendo a lista de felinos
    for (let felino of listafelinos) {

        /////////1) Forma simplificada

        //Cria o card
        let card =
            `<div class = "item">
                <img src="${felino.imgURL}">
                <h2>${felino.titulo}</h2>
                <p>${felino.descricao}</p>
            </div> `

        //Adiciona ao innerHTML do elemento pai (sem usar o append)
        //elementoPai.innerHTML += card;

        ////////2) Forma de adicionar os elementos

        //Cria um novo nó do tipo 'div'
        let novoNo = document.createElement('div');

        //Adiciona o conteúdo do card ao novo nó do tipo 'div', atraves do innerHTML
        novoNo.innerHTML = card;

        //adiciona a nova div ao elemento pai
        elementoPai.appendChild(novoNo);
    }
}