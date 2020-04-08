Feature: adicionar um produto no carrinho

Scenario: Quando o usuario adicionar um produto no carrinho o usuario deve conseguir ver o produto adicionado.

Given e o usuario logado

	When adicionar produto no carrinho
		And verificar o frete do produto
		And calcular o frete
	
	Then visualizar valor do frete	