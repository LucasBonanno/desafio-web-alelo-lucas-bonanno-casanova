package br.com.alelo.core;

import static br.com.alelo.core.DriverFactory.getDriver;
import static br.com.alelo.core.DriverFactory.getWaitDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DSL {

	/********* TextField e TextArea ************/

	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escreverEnter(By by, String texto) {
		escrever(by, texto);
		getDriver().findElement(by).sendKeys(Keys.ENTER);
	}

	/********* Textos ************/

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	/********* Title ************/

	public String obterTitulo() {
		return getDriver().getTitle();
	}

	/************** Table *********************/

	public String obterLista(By lista) {
		WebElement table = getDriver().findElement(lista);
		String body = table.findElement(By.xpath("./tbody")).getText();
		return body;
	}

	/************** Wait *********************/

	public void locatorVisivel(By locator) {
		getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public boolean isVisible(By locator) {
		try {
			locatorVisivel(locator);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/************** Screens *********************/

	public void mudaAbaBrowser() {
		String winHandleBefore = getDriver().getWindowHandle();
		getDriver().switchTo().window(winHandleBefore);
		getDriver().close();
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle);
		}
	}

}
