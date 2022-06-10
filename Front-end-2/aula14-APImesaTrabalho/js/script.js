function fetchAPI() {
    fetch('https://rickandmortyapi.com/api/character').then((response) => {
        response.json().then((data) => {
            const galery = document.getElementById('lista');

            console.log(data);

            data.results.map((item) => {
                const div = document.createElement('div');
                const img = document.createElement('img');
                img.setAttribute('src', item.image);
                div.innerHTML = 
                `
                <img src="${item.image}" alt="">
                `
                galery.appendChild(div);
                div.appendChild(img);
            });
        })
    })

}

fetchAPI();