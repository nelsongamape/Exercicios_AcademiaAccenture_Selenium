package stepdefinitions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepsDefinitionCalculadora {

	WebDriver driver = Hooks.driver;

	@Dado("que estou no formulario de calculo de idade e signo")
	public void que_estou_no_formulario_de_calculo_de_idade_e_signo() {
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/exercise_6_1.html");
		assertEquals("Lesson 6 - Age Calculator", driver.getTitle());
	}

	@Quando("preencho os campos obrigatorios {string}, {string}, {string}")
	public void preencho_os_campos_obrigatorios(String string, String string2, String string3) {

		Select seletorDia = new Select(driver.findElement(By.id("dayOfBirth")));
		seletorDia.selectByVisibleText(string);

		Select seletorMes = new Select(driver.findElement(By.id("monthOfBirth")));
		seletorMes.selectByVisibleText(string2);

		driver.findElement(By.id("yearOfBirth")).sendKeys(string3);
	}

	@Quando("pressiono o botao de calcular")
	public void pressiono_o_botao_de_calcular() {
		driver.findElement(By.id("calculate")).click();
	}

	@Entao("deve exibir a idade esperada {string} e o signo do zoodiaco {string} para aquela data")
	public void deve_exibir_a_idade_esperada_e_o_signo_do_zoodiaco_para_aquela_data(String string, String string2) {

		String age = driver.findElement(By.id("age")).getText();
		String sign = driver.findElement(By.id("zodiacSign")).getText();
		assertEquals(string, age);
		assertEquals(string2, sign);
	}

	@Entao("deve exibir um seletor com todos os meses do ano em ordem")
	public void deve_exibir_um_seletor_com_todos_os_meses_do_ano_em_ordem() {
		ArrayList<String> listaMesesEmOrdem = new ArrayList<String>();
		listaMesesEmOrdem.add("Choose...");
		listaMesesEmOrdem.add("January");
		listaMesesEmOrdem.add("February");
		listaMesesEmOrdem.add("March");
		listaMesesEmOrdem.add("April");
		listaMesesEmOrdem.add("May");
		listaMesesEmOrdem.add("June");
		listaMesesEmOrdem.add("July");
		listaMesesEmOrdem.add("August");
		listaMesesEmOrdem.add("September");
		listaMesesEmOrdem.add("October");
		listaMesesEmOrdem.add("November");
		listaMesesEmOrdem.add("December");

		ArrayList<String> listaMeses = new ArrayList<String>();

		Select listaSelecaoMes = new Select(driver.findElement(By.id("monthOfBirth")));

		List<WebElement> listaOpcoesMes = listaSelecaoMes.getOptions();
		for (int i = 0; i < listaOpcoesMes.size(); i++) {
			String textoOption = listaOpcoesMes.get(i).getText();
			listaMeses.add(textoOption);
		}
//		assertArrayEquals(listaMesesEmOrdem.toArray(), listaMeses.toArray());
		assertEquals(listaMesesEmOrdem, listaMeses);
	}
}
