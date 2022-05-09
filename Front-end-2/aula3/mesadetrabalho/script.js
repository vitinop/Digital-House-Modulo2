function jogar() {
    let playerScore = 0
    let computerScore = 0
    symbols = ["","Rock", "Paper", "Scissors"]
    let user = parseInt(prompt("Type:\n1 for Rock,\n2 for paper\n3 for scissors\n"))
    let computer = Math.floor(Math.random() * 3 + 1)
    console.log(`You: ${symbols[user]}\nComputer: ${symbols[computer]}`)
    switch (user) {
        case computer:
            console.log("Draw!")
        break;
        case 1:
            if (computer == 2) {
                console.log("You lose!")
                computerScore++
            } else if (computer == 3){
                console.log("You win!")
                playerScore++
            }
            break;
        case 2:
            if (computer == 1) {
                console.log("You win!")
                playerScore++
            } else if (computer == 3){
                console.log("You lose!")
                computerScore++
            }
            break;
        case 3:
            if (computer == 1) {
            console.log("You lose!")
            computerScore++
            } else if (computer == 2) {
                console.log("You win!")
                playerScore++
            }
            break;
        default:
            console.log("Invalid input, please enter 1, 2 or 3")
    }
    if (computerScore > 1){
        console.log("Computer wins the best of three")
    }
    if (userScore > 1){
        console.log("You win the best of three")
    }
}