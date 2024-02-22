#language: pt
#enconding: UTF-8
#author: Guilherme Teixeira

@login
Funcionalidade: Login

  Contexto:
    Dado acessar a tela de login

  @loginCorreto @smokeTest
  Cenário: Validar login na aplicação
    Quando inserir os dados de usuário
      | email               | senha     |
      | automacao@etech.dev | Etech@123 |
    Então deve realizar o login com sucesso
