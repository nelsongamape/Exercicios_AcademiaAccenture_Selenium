package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.*;

import java.util.List;

public class StepsDefinitionGoogle {

	WebDriver driver = Hooks.driver;

	@Dado("que estou na tela de pesquisa do google")
	public void que_estou_na_tela_de_pesquisa_do_google() {
		driver.get("https://www.google.com.br/");
		assertEquals("Google", driver.getTitle());
	}

	@Quando("digito {string} na pesquisa e realizo a pesquisa")
	public void digito_na_pesquisa_e_realizo_a_pesquisa(String termo) {
		WebElement elementPesquisa = driver.findElement(By.name("q"));
		elementPesquisa.sendKeys(termo);
		elementPesquisa.sendKeys(Keys.ENTER);

	}

	@Entao("deve exibir resultados")
	public void deve_exibir_resultados() {
		List<WebElement> retornoPesquisa = driver.findElements(By.tagName("h3"));
		// assertTrue(retornoPesquisa.size() > 0);
		assertFalse(retornoPesquisa.isEmpty());

	}

	@Entao("deve exibir o resultado {string} na primeira pagina")
	public void deve_exibir_o_resultado_na_primeira_pagina(String resultado) {
		boolean isAchoElemento = false;

		List<WebElement> elements = driver.findElements(By.tagName("h3"));

		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().contains(resultado)) {
				isAchoElemento = true;
				break;
			}
		}
		assertTrue(isAchoElemento);
	}
}
