
const togglebox = document.querySelector('#toggle-theme-box')
const items = document.querySelectorAll('.item')

togglebox.addEventListener('change', function(){
    const bg_body = document.body
    const bg_nav = document.querySelector('.nav')
    bg_nav.classList.toggle('dark-nav')
    bg_body.classList.toggle('dark-bg')
    
    items.forEach(function(option) {

      option.classList.toggle('dark-item')

  }
  ) 
})

    