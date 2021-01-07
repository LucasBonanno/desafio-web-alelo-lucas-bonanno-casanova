package br.com.alelo.pages;

import org.openqa.selenium.By;

public class HomePage {

	public final By barraPesquisa = By.id("acesso-busca");
	public final By barraMenu = By.id("barra-menu");
	public final By cardBuscaEndereco = By.xpath("//*[contains(text(), 'Busca CEP ou Endereço')]");

}
