package caso2.pacote;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Caso2Step {

@Given("^usuario na tela inical do facebook$")
public void usuario_na_tela_inical_do_facebook() throws Throwable {
	System.out.println(" --   Caso 2 ");
	System.out.println("Passo 1 - OK");
}

@When("^possui uma conta de e-mail ou numero de celular$")
public void possui_uma_conta_de_e_mail_ou_numero_de_celular() throws Throwable {
	System.out.println("Passo 2 - OK");
}

@When("^clicar no botao \"([^\"]*)\"$")
public void clicar_no_botao(String arg1) throws Throwable {
	System.out.println("Passo 3 - OK");
}

@Then("^ir para tela de cadastro$")
public void ir_para_tela_de_cadastro() throws Throwable {
	System.out.println("Passo 4 - OK");
}

@Then("^prencher os campos de cadastro$")
public void prencher_os_campos_de_cadastro() throws Throwable {
	System.out.println("Passo 5 - OK");
}

@Then("^apresentar	mensagem \"([^\"]*)\"$")
public void apresentar_mensagem(String arg1) throws Throwable {
	System.out.println("Passo 6 - OK");
}

@Then("^redirecionar para a pagina inicial da conta$")
public void redirecionar_para_a_pagina_inicial_da_conta() throws Throwable {
	System.out.println("Passo 7 - OK");
}


}
