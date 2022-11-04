import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {

	/**
	 * 
	 * @param int1 Informar que o valor de saldo do cliente especial � de -200
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		// Given Um cliente especial com saldo atual de -200 reais
		um_cliente_especial_com_saldo_atual_de_reais = -200;

		System.out.println("Saldo do cliente especial � de: " + um_cliente_especial_com_saldo_atual_de_reais);

		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Verifica se � um cliente especial, para autorizar ou n�o o valor
	 *             do saque
	 */
	@When("For solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		// When for solicitado um saque no valor de 100 reais
		if (um_cliente_especial_com_saldo_atual_de_reais = (-200)) {
			for_solicitado_um_saque_no_valor_de_reais = 100;
			System.out.println(
					"Cliente especial autorizado saque no valor de: " + for_solicitado_um_saque_no_valor_de_reais);
		}

		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Apos a verifica��o, autoriza o valor do saque de 100, subitraindo
	 *             no valor do salto de -200 para -300
	 */

	@Then("Deve efetuar o sque e atualizar o saldo da conta para {int} reais.")
	public void deve_efetuar_o_sque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		// Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
		deve_efetuar_o_sque_e_atualizar_o_saldo_da_conta_para_reais = 
				um_cliente_especial_com_saldo_atual_de_reais - for_solicitado_um_saque_no_valor_de_reais;
		System.out.println("Seu saldo novo � de: " + deve_efetuar_o_sque_e_atualizar_o_saldo_da_conta_para_reais);

		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Cliente comum com um saldo de -300
	 */

	@Given("Um cliente commum com saldo atual de {int} reais")
	public void um_cliente_commum_com_saldo_atual_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		// Given um cliente comum com saldo atual de -300 reais
		um_cliente_commum_com_saldo_atual_de_reais(int1) = -300;

		System.out.println("Cliente comum com saldo de: " + um_cliente_commum_com_saldo_atual_de_reais);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Cliente comum pede um saque de 200
	 */

	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		// When solicitar um saque de 200 reais
		if (um_cliente_especial_com_saldo_atual_de_reais = -300) {
			solicitar_um_saque_de_reais = 200;
			System.out.println("Cliente comum no saque de: " + solicitar_um_saque_de_reais);
		}

		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Cliente comum n�o autorizado para retirar o saque de 200.
	 */
	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		// Then n�o deve efetuar o saque e deve retornar a mensagem Saldo Insulficiente
		System.out.println("Cliente comum n�o estaautorizado para fazer o saque: " + solicitar_um_saque_de_reais);

		throw new io.cucumber.java.PendingException();
	}

}
