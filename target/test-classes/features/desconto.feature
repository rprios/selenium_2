# language: pt
  Funcionalidade: Receber desconto da Qazando
    Eu como usuário da Qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

  Cenário: Vizualizar código de desconto
    Dado que estou no site da Qazando
    Quando eu preencho meu email
    E clico no ganhar cupom
    Então eu vejo o código de desconto

  Cenario: XPTO
    Dado que tenho cupom gerado