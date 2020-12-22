#language: pt
#enconding: UTF-8
#Author: Guilherme Teixeira


  Funcionalidade: Formulário

    @mobile
    Cenario: Validar inserção do nome no formulário
      Dado que esteja na aplicação
      E toco no botão "Formulário"
      E preencho o campo nome
      Quando toco no botão "SALVAR"
      Entao visualizo as informações na tela

    @mobile @formulario
    Cenario: Validar inserção do nome no formulario
      Dado que esteja na aplicação
      E toco no botão "Formulário"
      E preencho os campos necessários
      Quando toco no botão "SALVAR"
      Então visualizo as informações necessárias na tela


