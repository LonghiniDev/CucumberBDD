package caso4.pacote;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Caso4Step {
	@Given("^e o usuario logado$")
	public void e_o_usuario_logado() throws Throwable {
	  System.out.println(" --------- Caso 4");
	  System.out.println(" Passo 1 - OK");
	}

	@When("^adicionar produto no carrinho$")
	public void adicionar_produto_no_carrinho() throws Throwable {
		  System.out.println(" Passo 2 - OK");
	}

	@When("^verificar o frete do produto$")
	public void verificar_o_frete_do_produto() throws Throwable {
		  System.out.println(" Passo 3 - OK");
	}

	@When("^calcular o frete$")
	public void calcular_o_frete() throws Throwable {
		  System.out.println(" Passo 4 - OK");
	}

	@Then("^visualizar valor do frete$")
	public void visualizar_valor_do_frete() throws Throwable {
		  System.out.println(" Passo 5 - OK");
	}

}
