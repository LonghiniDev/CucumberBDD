package caso3.pacote;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Caso3Step {

@Given("^usuario administrador$")
public void usuario_administrador() throws Throwable {
    System.out.println(" --------- Caso 3");
    System.out.println(" Passo 1 - OK");
}

@When("^estando no sistema RH$")
public void estando_no_sistema_RH() throws Throwable {
    System.out.println(" Passo 2 - OK"); 
}

@When("^conta administradora$")
public void conta_administradora() throws Throwable {
    System.out.println(" Passo 3 - OK");
}

@Then("^atualizar a senha de um usuario$")
public void atualizar_a_senha_de_um_usuario() throws Throwable {
    System.out.println(" Passo 4 - OK");
}

@Then("^receber mensagem \"([^\"]*)\"$")
public void receber_mensagem(String arg1) throws Throwable {
    System.out.println(" Passo 5 - OK");
}

@Then("^senha antiga do usuario eh atualizada$")
public void senha_antiga_do_usuario_eh_atualizada() throws Throwable {
    System.out.println(" Passo 6 - OK");
}


}
