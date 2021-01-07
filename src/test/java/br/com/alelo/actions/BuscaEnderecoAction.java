package br.com.alelo.actions;

import org.junit.Assert;

import br.com.alelo.core.BaseAction;
import br.com.alelo.core.PropertyReader;
import br.com.alelo.pages.BuscaEnderecoPage;

public class BuscaEnderecoAction extends BaseAction {

	private BuscaEnderecoPage buscaEnderecoPage = new BuscaEnderecoPage();

	public void confirmarTelaBuscaEnderecoCarregada() {
		dsl.mudaAbaBrowser();
		verificarElementosCarregadoNaPage(buscaEnderecoPage.menu, buscaEnderecoPage.trilha,
				buscaEnderecoPage.btnVoltar);
	}

	public void validarRetorno() {
		try {
			String retornoMensagem = dsl.obterTexto(buscaEnderecoPage.mensagemResultado);
			if (!retornoMensagem.contains(PropertyReader.getProperty("web.busca.not.expected"))) {
				String lista = dsl.obterLista(buscaEnderecoPage.table);
				System.out.println("[PASSED] Retorno da Lista: \n" + lista);
			} else {
				Assert.fail("[FAILED] Lista retornou vazia: \n" + retornoMensagem);
			}
		} catch (Exception e) {
			Assert.fail("MSG AUTOMAÇÃO:\nNão foi possível validar lista.\nMSG ERROR: \n" + e.getMessage());
		}

	}
}
