var pontuacaoUs = 0
var pontuacaoPc = 0



function jogar() {
    let maoUsuario = parseInt(prompt('Pedra(1), Papel(2) ou Tesoura(3)?'))
    // math.random gera numeros aleatorios de 0 a 1
    let random = parseInt(Math.random() * 3 + 1)
    let maoComputador = random


    if (maoUsuario === maoComputador) {
        alert('Deu Empate!')
                
        
    }


    else if (maoUsuario === 1) {
        if (maoComputador === 2) {
            alert('O computador ganhou!')
            pontuacaoPc++
        }

        else {
            alert ('O usuário ganhou!')
            pontuacaoUs++

        }

    }

    else if (maoUsuario === 2) {
        if (maoComputador === 1) {
            alert('O usuário ganhou!')
            pontuacaoUs++
        }

        else {
            alert('O computador ganhou!')
            pontuacaoPc++
        }


    }

    else if (maoUsuario === 3) {
        if (maoComputador === 2){
            alert('O usuário ganhou!')
            pontuacaoUs++
        }
        
        else {
            alert('O computador ganhou!')
            pontuacaoPc++
        }
    }

    else {
        alert('Insira um valor válido!')
    }

    if (pontuacaoUs == 2) {
        alert('O usuário ganhou a md3')
       
        
    }

    else if (pontuacaoPc == 2 ) {
        alert('O computador ganhou a md3')
     
    }


    

}

