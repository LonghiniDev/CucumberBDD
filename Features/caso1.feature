Feature: Retirar dinheiro

Scenario: Um caixa eletronico deve permitir a retirada de dinheiro,
quando o cliente nao possui saldo suficiente em conta e possuir limite de credito aprovado.

	Given e correntista
	When estar com RS 500,00 de saldo em sua conta
		
		And possuir limite de credito aprovado maior que RS 600,00
		And cliente nao possuir saldo suficiente em conta
		
	Then cliente deve receber o valor de RS 600,00
	
		And conta cliente fica com saldo em RS 600,00 negativos. 
	
 