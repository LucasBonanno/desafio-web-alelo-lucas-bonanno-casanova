package br.com.alelo.teste.steps;

import br.com.alelo.actions.BuscaEnderecoAction;
import io.cucumber.java.pt.Entao;

public class BuscaEnderecoStep {

	private BuscaEnderecoAction buscaEndereco = new BuscaEnderecoAction();

	/********* @Entao ************/

	@Entao("sera possivel dar output das informacoes retornadas")
	public void seraPossivelDarOutputDasInformaçõesRetornadas() {
		buscaEndereco.confirmarTelaBuscaEnderecoCarregada();
		buscaEndereco.validarRetorno();
	}

}
