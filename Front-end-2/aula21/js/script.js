//criar um usuario

function fetchAPI() {
  fetch('https://ctd-todo-api.herokuapp.com/v1/users', {
    method: 'POST',
    headers: {
      'Accept': '*/* , application/json, text/plain',
      'Content-Type':  'application/json'
    },
    body: JSON.stringify({
      "firstName": "Victor",
      "lastName": "Luz",
      "email": "victor@gmail.com",
      "password": "vi-123"
    })
  })
  .then(res => res.json())
  .then(data => console.log(data))
}


