import io.cucumber.core.internal.com.fasterxml.jackson.databind.type.TypeParser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	public boolean clienteEspecial = false;
	public int conta;
	public int saque;
	public int saldo;

	public void cliente() {
		/**
		 *  aqui vemos se o cliente é especial ou não
		 */
		

		if (this.clienteEspecial == true) {
			um_cliente_especial_com_saldo_atual_de_reais(conta);
			for_solicitado_um_saque_no_valor_de_reais(saque);
			deve_efetuar_o_sque_e_atualizar_o_saldo_da_conta_para_reais(saldo);
		} else {
			um_cliente_commum_com_saldo_atual_de_reais(conta);
			solicitar_um_saque_de_reais(saque);
			nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente();
			System.out.print("entrou");
		}
	}

	/**
	 * 
	 * @param int1 Verifica se a conta é de um cliente especial
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		// Given Um cliente especial com saldo atual de -200 reais
		this.conta = conta;

		if (conta instanceof Integer && this.clienteEspecial == true) {
		} else
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Verifica se e um cliente especial, para autorizar ou nao o valor   do saque
	 */
	@When("For solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {		
		// When for solicitado um saque no valor de 100 reais
		this.saque = saque;

		if (saque instanceof Integer && this.clienteEspecial) {
		} else

		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Se o conta for de um cliente especial, autoriza a saque
	 */

	@Then("Deve efetuar o sque e atualizar o saldo da conta para {int} reais.")
	public void deve_efetuar_o_sque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		// Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
		if (saldo instanceof Integer && this.clienteEspecial == true) {
			saldo = this.conta - (this.saque);
		} else
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Se a conta der false para cliente especial é um cliente comum
	 */

	@Given("Um cliente commum com saldo atual de {int} reais")
	public void um_cliente_commum_com_saldo_atual_de_reais(Integer int1) {
		// Given um cliente comum com saldo atual de -300 reais
		this.conta = conta;

		if (conta instanceof Integer && this.clienteEspecial == false) {
		} else
			
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Pede autorizarão para a sacar o dinheiro
	 */

	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		// When solicitar um saque de 200 reais
		this.saque = saque;

		if (saque instanceof Integer) {
		} else

		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param int1 Se a conta estiver com valor mairo que zero
	 * com o saque menor que a conta 
	 * e for um cliente comum pode sacar.
	 * Caso não entre em nunhuma dessas opções, não autorizar o saque
	 */
	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente(Integer int1) {
		// Then n�o deve efetuar o saque e deve retornar a mensagem Saldo Insulficiente
		if (this.conta > 0 && this.saque < this.conta && this.clienteEspecial == false) {

		} else

		throw new io.cucumber.java.PendingException();
	}

}
