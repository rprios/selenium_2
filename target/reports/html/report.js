$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "Receber desconto da Qazando",
  "description": "Eu como usuário da Qazando\r\nquero receber um cupom de desconto\r\npara comprar um curso com valor reduzido",
  "id": "receber-desconto-da-qazando",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 7,
  "name": "Vizualizar código de desconto",
  "description": "",
  "id": "receber-desconto-da-qazando;vizualizar-código-de-desconto",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 8,
  "name": "que estou no site da Qazando",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "eu preencho meu email",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "clico no ganhar cupom",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "eu vejo o código de desconto",
  "keyword": "Então "
});
formatter.match({
  "location": "DescontosStep.acessar_site_qazando()"
});
formatter.result({
  "duration": 7558723000,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_preencho_meu_email()"
});
formatter.result({
  "duration": 133132000,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_no_ganhar_cupom()"
});
formatter.result({
  "duration": 77872500,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_vejo_o_codigo_de_desconto()"
});
formatter.result({
  "duration": 26685000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "XPTO",
  "description": "",
  "id": "receber-desconto-da-qazando;xpto",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 14,
  "name": "que tenho cupom gerado",
  "keyword": "Dado "
});
formatter.match({
  "location": "DescontosStep.queTenhoCupomGerado()"
});
formatter.result({
  "duration": 5610684000,
  "status": "passed"
});
});