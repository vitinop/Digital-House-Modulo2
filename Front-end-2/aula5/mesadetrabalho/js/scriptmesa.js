
const togglebox = document.querySelector('#toggle-theme-box')

togglebox.addEventListener('change', function(){
    const bg_body = document.body
    bg_body.classList.toggle('dark-bg')
})

const titulo = document.querySelector('#pageTitle')

titulo.addEventListener('change', function(){
    const titulo_change = document.getElementsByID("pageTitle")
    titulo_change.classList.toggle('dark-h1')
})
