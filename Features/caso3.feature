Feature: alterar senha dos usuarios

Scenario: como usuario administrador gostaria de mudar a senha das contas de outros usuarios para atualizar senha

Given usuario administrador
	
	When estando no sistema RH
		And conta administradora
	
	Then atualizar a senha de um usuario
		And receber mensagem "senha atualizada com sucesso"
		And senha antiga do usuario eh atualizada