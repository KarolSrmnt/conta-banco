# 💻 Conta-Banco

Esse projeto foi criado como desafio para o bootcamp de java, feito pela Santander em parceria com a DIO.

A classe `ContaTerminal` permite inserir os seguintes dados via terminal, que serão as variáveis do sistema:

Atributo   | Tipo
:-------: | :------:
numeroDaConta | int
agenciaBancaria | String
nomeCompletoCliente | String
saldo | double

Posteriormente, o sistema pergunta se o usuário deseja realizar um depósito.

Por fim, é dada a escolha de consultar o saldo:
1. Caso a resposta seja "n", é exibida a se mensagem:
> "Olá `nomeCompletoCliente`, obrigado por criar uma conta em nosso banco, sua agência é `agenciaBancaria`, conta `numeroDaConta`".

2. Caso a resposta seja "s": 
> "Olá `nomeCompletoCliente`, obrigado por criar uma conta em nosso banco, sua agência é `agenciaBancaria`, conta `numeroDaConta` e seu saldo `saldo` já está disponível para saque".

