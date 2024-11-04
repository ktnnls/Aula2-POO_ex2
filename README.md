# Aula2-POO_ex2
Armazenando alguns exercícios da faculdade ADS Uninter, Matéria Programação Orientada a Objetos em JAVA.

Projeto Banco - Simulação de Conta Bancária
Este projeto em Java simula operações bancárias básicas, como saque, depósito, consulta de informações e transferência de valores entre contas. Ele foi desenvolvido para fins de prática e aprendizado de programação orientada a objetos.

Estrutura do Projeto
O projeto contém duas classes principais:

Classe Conta
A classe Conta representa uma conta bancária com as seguintes características:

Atributos:
numero: Número da conta.
titular: Nome do titular da conta.
saldo: Saldo disponível na conta.
limite: Limite para operações de saque.
Métodos:
sacar(double valor): Realiza a operação de saque, desde que o valor não exceda o limite e o saldo da conta.
depositar(double valor): Permite o depósito de um valor positivo na conta.
transferir(Conta destino, double valor): Transfere um valor de uma conta para outra, caso o saque seja bem-sucedido.
info(): Exibe informações detalhadas da conta (titular, número, saldo e limite).
Classe Principal
A classe Principal serve como ponto de entrada do programa, onde uma conta é instanciada e as operações são realizadas.

Funcionalidades
Criação de Conta: Cria uma nova conta com número, titular, saldo e limite especificados.
Saque: Permite realizar um saque, com verificação do saldo e limite.
Depósito: Permite realizar depósitos para aumentar o saldo da conta.
Transferência: Permite transferir valores entre contas.
Exibição de Informações: Mostra os dados da conta e o saldo atualizado após as operações.
