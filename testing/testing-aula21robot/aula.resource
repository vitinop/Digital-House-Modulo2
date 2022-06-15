*** Variables ***
${SITE}                 https://www.saucedemo.com
${NAVEGADOR}            Chrome
${CAMPO_USUARIO}        css=#user-name
${CAMPO_SENHA}          css=#password
${BOTAO_LOGIN}          css=#login-button
${DEFAULT_USER}         standard_user
${DEFAULT_PASSWORD}     secret_sauce

*** Keywords ***
Acessar a loja
    Open Browser    ${SITE}             ${NAVEGADOR}  

Fazer Login
    Input Text      ${CAMPO_USUARIO}    ${DEFAULT_USER}
    Input Text      ${CAMPO_SENHA}      ${DEFAULT_PASSWORD}
    Click Element   ${BOTAO_LOGIN}