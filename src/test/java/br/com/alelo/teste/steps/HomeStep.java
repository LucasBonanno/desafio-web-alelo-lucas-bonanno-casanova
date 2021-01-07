package br.com.alelo.teste.steps;

import br.com.alelo.actions.HomeAction;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class HomeStep {

	private HomeAction home = new HomeAction();

	/********* @Dado ************/

	@Dado("que tenha carregado o portal do Correios")
	public void queTenhaCarregadoOPortalDoCorreios() {
		home.confirmarTelaHomeCarregada();
	}

	/********* @Quando ************/

	@Quando("efetuar a pesquisa por {string}")
	public void efetuarAPesquisaPor(String texto) {
		home.pesquisar(texto);
	}

}
