#language: pt
#enconding: UTF-8
#author: Guilherme Teixeira

Funcionalidade: Cadastro de um usuário

  Contexto:
    Dado acessar a tela de login

  @cadastroUsuario @smokeTest
  Cenário: Validar o cadastro de um novo usuário
    Quando realizar o cadastro de um novo usuário
    Então deve realizar o cadastro com sucesso
