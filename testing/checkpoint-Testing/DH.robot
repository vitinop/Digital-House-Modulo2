*** Settings ***
Library    SeleniumLibrary
Resource   ./DH.resource


*** Test Cases ***

Validação das informações do curso de Data Analytics
    # Passo 1 - Método geral
    Abrir o site da Digital House
    # Passo 2 - Método geral
    Clicar em “Aceitar Cookies”
    # Passo 3 - Método geral
    Clicar em "Ver outros cursos"
    # Passo 4
    Selecionar o curso “Data Analytics”
    # Passo 5
    Validacao de conteudo de texto de Data Analytics
    # Passo 6 - Método geral
    Clicar em “Inscreva-se agora" e "Increva-se"
    # Passo 7 - VALOR DO CURSO “R$10.315” , definido em variavel própria
    Validacao de valor do curso de Data Analytics
    #Passo 8 - Método Geral
    Test Teardown
    
Validação das informações do curso de Data Science
    # Passo 1 - Método geral
    Abrir o site da Digital House
    # Passo 2 - Método geral
    Clicar em “Aceitar Cookies”
    # Passo 3 - Método geral
    Clicar em "Ver outros cursos"
    # Passo 4
    Selecionar o curso “Data Science”
    # Passo 5
    Validacao de conteudo de texto de Data Science
    # Passo 6 - Método geral
    Clicar em “Inscreva-se agora" e "Increva-se"
    # Passo 7 - VALOR DO CURSO “R$11.878” , definido em variavel própria
    Validacao de valor do curso de Data Science
    #Passo 8 - Método Geral
    Test Teardown
   
Validação das informações do curso de Marketing Digital
    # Passo 1 - Método geral
    Abrir o site da Digital House
    # Passo 2 - Método geral
    Clicar em “Aceitar Cookies”
    # Passo 3 - Método geral
    Clicar em "Ver outros cursos"
    # Passo 4
    Selecionar o curso “Marketing Digital”
    # Passo 5
    Validacao de conteudo de texto de Marketing Digital
    # Passo 6 - Método geral
    Clicar em “Inscreva-se agora" e "Increva-se"
    # Passo 7 - VALOR DO CURSO “R$11.878” , definido em variavel própria
    Validacao de valor do curso de Marketing Digital
    #Passo 8 - Método Geral
    Test Teardown

 
Validação das informações do curso Certified Tech Developer
    # Passo 1 - Método geral
    Abrir o site da Digital House
    # Passo 2 - Método geral
    Clicar em “Aceitar Cookies”
    # Passo 3 - Método geral
    Clicar em "Ver outros cursos"
    # Passo 4
    Selecionar o curso “Certified Tech Developer"
    # Passo 5
    Validacao de conteudo de texto do Certified Tech Developer
    # Passo 6 - Método geral
    Clicar em “Inscreva-se agora" e "Increva-se"
    # Passo 7 - VALOR DO CURSO “R$ 289,00 mensais” , definido em variavel própria
    Validacao de valor do curso Certified Tech Developer
    # Passo 8
    Preenchimento dos campos input
    #Passo 9 - Método Geral
    Test Teardown


Validação das informações do Programa de Bolsas BLK PWR DEV
    # Passo 1 - Método geral
    Abrir o site da Digital House
    # Passo 2 - Método geral
    Clicar em “Aceitar Cookies”
    # Passo 3 - Método geral
    Clicar em "Quero minha bolsa"
    # Passo 4 - 
    Validacao de conteudo de texto de Bolsas BLK PWR DEV
    # Passo 5 - VALOR DO CURSO “R$88,00 mensais” , definido em variavel própria
    Validacao de valor do Programa de Bolsas BLK PWR DEV
    # Passo 6 
    Clicar em “Quero minha bolsa de estudo”
    # Passo 7
    Preenchimento dos campos input bolsa
    #Passo 8 - Método Geral
    Test Teardown
    
    
   