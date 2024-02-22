#language:pt
#enconding: UTF-8
#author: Guilherme Teixeira

Funcionalidade: Cadastro conteudo

  Contexto:
    Dado acessar a tela de login
    E inserir os dados de usuário
      | email               | senha     |
      | automacao@etech.dev | Etech@123 |

  @novoConteudo @smokeTest
  Esquema do Cenario: Validar o cadastro de um novo conteudo
    Quando adicionar o conteudo to tipo <conteudo>
    Então deve exibir a mensagem <mensagem> após realizar o cadastro do conteudo com sucesso

    Exemplos:
      | conteudo | mensagem                        |
      | "filme"  | "Filme cadastrado com sucesso!" |
      | "serie"  | "Série cadastrada com sucesso!" |

