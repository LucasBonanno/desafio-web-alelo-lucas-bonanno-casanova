package br.com.alelo.actions;

import org.junit.Assert;

import br.com.alelo.core.BaseAction;
import br.com.alelo.pages.HomePage;

public class HomeAction extends BaseAction {

	private HomePage homePage = new HomePage();

	public void confirmarTelaHomeCarregada() {
		verificarElementosCarregadoNaPage(homePage.barraMenu, homePage.barraPesquisa, homePage.cardBuscaEndereco);
		validationTitle("web.home.expected");
	}

	public void pesquisar(String texto) {
		try {
			dsl.escreverEnter(homePage.barraPesquisa, texto);		
		} catch (Exception e) {
			Assert.fail("MSG AUTOMAÇÃO:\nNão foi possível efetuar pesquisa.\nMSG ERROR:\n" + e.getMessage());
		}
	}
}
