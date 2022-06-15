*** Settings ***
Library  SeleniumLibrary
Resource  ./aula.resource


*** Test Cases ***
Processo de compra na loja Sauce Demo
    Acessar a loja
    Fazer Login
