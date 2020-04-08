Feature: criar conta no facebook

Scenario: quando o usuario acessar a tela inicial de facebook devera ser aprovado e criado cadastro de nova conta no facebook
		  
Given usuario na tela inical do facebook 
	When possui uma conta de e-mail ou numero de celular
		And clicar no botao "criar conta"
	
	Then ir para tela de cadastro	
		And prencher os campos de cadastro
		And apresentar	mensagem "Conta cadastrada com sucesso"
		And redirecionar para a pagina inicial da conta
	