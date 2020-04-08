package caso1.pacote;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Caso1Step {


@Given("^e correntista$")
public void e_correntista() throws Throwable {
	System.out.println(" --   Caso 1 ");
    System.out.println("Passo 1 - OK");
}

@When("^estar com RS (\\d+),(\\d+) de saldo em sua conta$")
public void estar_com_RS_de_saldo_em_sua_conta(int arg1, int arg2) throws Throwable {
	System.out.println("Passo 2 - OK");
}

@When("^possuir limite de credito aprovado maior que RS (\\d+),(\\d+)$")
public void possuir_limite_de_credito_aprovado_maior_que_RS(int arg1, int arg2) throws Throwable {
	System.out.println("Passo 3 - OK");
}

@When("^cliente nao possuir saldo suficiente em conta$")
public void cliente_nao_possuir_saldo_suficiente_em_conta() throws Throwable {
	System.out.println("Passo 4 - OK");
}

@Then("^cliente deve receber o valor de RS (\\d+),(\\d+)$")
public void cliente_deve_receber_o_valor_de_RS(int arg1, int arg2) throws Throwable {
	System.out.println("Passo 5 - OK");
}

@Then("^conta cliente fica com saldo em RS (\\d+),(\\d+) negativos\\.$")
public void conta_cliente_fica_com_saldo_em_RS_negativos(int arg1, int arg2) throws Throwable {
	System.out.println("Passo 6 - OK");
}


}
