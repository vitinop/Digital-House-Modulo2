*** Variables ***
${SITE}                          https://www.digitalhouse.com/br
${NAVEGADOR}                     Chrome
${BOTAO_QUEROBOLSADEESTUDO}      xpath=//*[@id="S6I9mVUafA1bbD5Bqc0xkFaqOMcdCRbf"]
${BOTAO_MINHABOLSA}              xpath=//*[@id="__next"]/div/main/div[1]/div/div/div[2]/div/a
${BOTAO_VERCURSOS}               xpath=//*[@id="__next"]/div/main/section/div/div[3]/div/a
${BOTAO_INSCREVASEAGORA}         xpath=//*[@id="__next"]/div/main/section/div/div/div[1]/div/div[2]/div[1]/a
${BOTAO_INSCREVASE}              xpath=//*[@id="0"]/div/a
${BOTAO_CURSODATAANALYTICS}      xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[3]/a/span
${BOTAO_CURSOMARKTING}           xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[8]/a
${BOTAO_CURSODATASCIENCE}        xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[4]/a/span
${BOTAO_CURSOCTD}                xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[1]/a/span
${VALOR_CURSODATAANALYTICS}      R$10.315
${VALOR_CURSOMARKTING}           R$9.376
${VALOR_CURSODATASCIENCE}        R$11.878
${VALOR_BOLSA}                   R$88,00 mensais
${VALOR_CURSOCTD}                R$ 289,00 mensais
${CAMPO_NOME_BOLSA}              xpath=//*[@id="CzpXMe7EhpI6diDHrN8Oa1GHrhEPfIsA"]
${CAMPO_SOBRENOME_BOLSA}         xpath=//*[@id="f02RR9bt0eNTrF0fJuC2azUMkD7TRX7M"]
${CAMPO_EMAIL_BOLSA}             xpath=//*[@id="MUDBMzoKRZnrEBNp5XfGwgA0rdT7iCUw"]
${CAMPO_DDDECELULAR}             xpath=//*[@id="IIqCGDME1hJVbZz5duh3TgaPEzSbSd6G"]
${CAMPO_NOME}                    xpath=//*[@id="name"]
${CAMPO_SOBRENOME}               xpath=//*[@id="lastname"]
${CAMPO_EMAIL}                   xpath=//*[@id="email"]
${CAMPO_DDD}                     xpath=//*[@id="phonecode"]
${CAMPO_CELULAR}                 xpath=//*[@id="phone"]
${INPUT_NOME}                    Victor  
${INPUT_SOBRENOME}               Luz      
${INPUT_EMAIL}                   victor.fernando.moura@hotmail.com
${INPUT_DDD}                     31
${INPUT_CELULAR}                 985748416
${INPUT_DDDECELULAR}             31985748416

           


*** Keywords ***
# Métodos de acesso gerais
Test Teardown
        Close Browser
Abrir o site da Digital House
        Open Browser                    ${SITE}        ${NAVEGADOR}
        Maximize Browser Window

Clicar em “Aceitar Cookies”
        Sleep                           6
        Select frame                    xpath=/html/body/iframe[4]
        Click Element                   xpath=/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]
        Unselect frame

Clicar em "Ver outros cursos"
        Sleep                           1
        Click Element                   ${BOTAO_VERCURSOS}

Clicar em “Inscreva-se agora" e "Increva-se"
        Click Element                   ${BOTAO_INSCREVASEAGORA}
        Click Element                   ${BOTAO_INSCREVASE}

# <----  ---->

#Métodos de verificação de Data Analytics
Selecionar o curso “Data Analytics”
        Sleep                           1
        Click Element                   ${BOTAO_CURSODATAANALYTICS}

Validacao de conteudo de texto de Data Analytics     
        Page Should Contain             voltado para qualquer pessoa que deseja ampliar suas capacidades analíticas
        Page Should Contain             pessoas interessadas em business intelligence

Validacao de valor do curso de Data Analytics
        Page Should Contain             ${VALOR_CURSODATAANALYTICS}



# <----  ---->

#Métodos de verificação de Data Science
Selecionar o curso “Data Science”
        Sleep                           1
        Click Element                   ${BOTAO_CURSODATASCIENCE}

Validacao de conteudo de texto de Data Science     
        Page Should Contain             profissionais de diversas áreas que desejam melhorar sua comunicação como engenheiros de Big Data
        Page Should Contain             adquirir habilidades práticas com as ferramentas específicas para fazer análises

Validacao de valor do curso de Data Science
        Page Should Contain             ${VALOR_CURSODATASCIENCE}

# <----  ---->

#Métodos de verificação de Marketing Digital
Selecionar o curso “Marketing Digital”
        Sleep                           1
        Click Element                   ${BOTAO_CURSOMARKTING}

Validacao de conteudo de texto de Marketing Digital   
        Page Should Contain             voltado para as pessoas que querem ingressar na carreira de marketing digital
        Page Should Contain             Empreendedores que desejam compreender os fundamentos da área e as principais estratégias de marketing digital

Validacao de valor do curso de Marketing Digital
        Page Should Contain             ${VALOR_CURSOMARKTING}



# <----  ---->

#Métodos de verificação de Desenvolvimento Certified Tech Developer
Selecionar o curso “Certified Tech Developer"
        Sleep                           1
        Click Element                   ${BOTAO_CURSOCTD}

Validacao de conteudo de texto do Certified Tech Developer
        Page Should Contain             Uma carreira pensada e desenhada pela Digital House, Mercado Livre e Globant
        Page Should Contain             Se você deseja mergulhar no mundo da programação e no desenvolvimento de novos produtos digitais 

Validacao de valor do curso Certified Tech Developer  
        Page Should Contain             ${VALOR_CURSOCTD}
Preenchimento dos campos input
        Input Text                      ${CAMPO_NOME}          ${INPUT_NOME}
        Input Text                      ${CAMPO_SOBRENOME}     ${INPUT_SOBRENOME}
        Input Text                      ${CAMPO_EMAIL}         ${INPUT_EMAIL} 
        Input Text                      ${CAMPO_DDD}           ${INPUT_DDD} 
        Input Text                      ${CAMPO_CELULAR}       ${INPUT_CELULAR}   
# <----  ---->  

#Métodos de verificação de Programa de Bolsas BLK PWR DEV
Clicar em "Quero minha bolsa"
        Click Element                   ${BOTAO_MINHABOLSA}
Validacao de conteudo de texto de Bolsas BLK PWR DEV
        Page Should Contain             Uma carreira em Programação para mudar o seu futuro
        Page Should Contain             Confira os requisitos para a bolsa de estudo 
Validacao de valor do Programa de Bolsas BLK PWR DEV
        Page Should Contain             ${VALOR_BOLSA}
Clicar em “Quero minha bolsa de estudo”
        Click Element                   ${BOTAO_QUEROBOLSADEESTUDO}
Preenchimento dos campos input bolsa
        Input Text                      ${CAMPO_NOME_BOLSA}          ${INPUT_NOME}
        Input Text                      ${CAMPO_SOBRENOME_BOLSA}     ${INPUT_SOBRENOME}
        Input Text                      ${CAMPO_EMAIL_BOLSA}         ${INPUT_EMAIL} 
        Input Text                      ${CAMPO_DDDECELULAR}         ${INPUT_DDDECELULAR} 
       
# <----  ---->  
