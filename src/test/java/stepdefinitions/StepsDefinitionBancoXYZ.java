package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepsDefinitionBancoXYZ {

	WebDriver driver = Hooks.driver;

	@Dado("que acesse o site do banco XYZ")
	public void que_acesse_o_site_do_banco_xyz() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		assertEquals("XYZ Bank", driver.getTitle());
	}

	@Dado("que o usuario esteja logado como {string}")
	public void que_o_usuario_esteja_logado_como(String nomeUsuario) {
		driver.findElement(By.xpath("//button[@ng-click='customer()']")).click();
		Select selecionaUsuario = new Select(driver.findElement(By.id("userSelect")));
		selecionaUsuario.selectByVisibleText(nomeUsuario);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		WebElement usuarioLogado = driver.findElement(By.xpath("//span[@class='fontBig ng-binding']"));
		assertEquals(nomeUsuario, usuarioLogado.getText());
	}

	@Dado("que esteja na conta {string}")
	public void que_esteja_na_conta(String numeroConta) {
		Select selecionaConta = new Select(driver.findElement(By.id("accountSelect")));
		selecionaConta.selectByVisibleText(numeroConta);
		assertTrue(driver.findElement(By.xpath("//option[text()='" + numeroConta + "']")).isSelected());
	}

	@Quando("o cliente depositar {int} em sua conta")
	public void o_cliente_depositar_em_sua_conta(Integer valorDeposito) {
		driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
		driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys(valorDeposito.toString());
		driver.findElement(By.xpath("//button[text()='Deposit']")).click();
		assertTrue(driver.findElement(By.xpath("//span[text()='Deposit Successful']")).isDisplayed());
	}

	@Entao("a quantia deve ser depositada na conta fornecida")
	public void a_quantia_deve_ser_depositada_na_conta_fornecida() {
		List<WebElement> infosConta = driver.findElements(By.xpath("//strong[@class='ng-binding']"));
		assertTrue(infosConta.get(1).isDisplayed());
	}

	@Dado("que o gerente esteja logado")
	public void que_o_gerente_esteja_logado() {
		driver.findElement(By.xpath("//button[@ng-click='manager()']")).click();
		assertTrue(driver.findElement(By.xpath("//button[@ng-click='addCust()']")).isEnabled());
	}

	@Dado("esteja no formulario de adicionar cliente")
	public void esteja_no_formulario_de_adicionar_cliente() {
		driver.findElement(By.xpath("//button[@ng-click='addCust()']")).click();
		assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
	}

	@Quando("o gerente preencher com dados validos as informacoes do cliente {string}, {string}, {string}")
	public void o_gerente_preencher_com_dados_validos_as_informacoes_do_cliente(String primeiroNome, String ultimoNome,
			String postalCode) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(primeiroNome);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(ultimoNome);
		driver.findElement(By.xpath("// input[@placeholder='Post Code']")).sendKeys(postalCode);

		assertNotNull(primeiroNome);
		assertNotNull(ultimoNome);
		assertNotNull(postalCode);
	}

	@Quando("clicar em adicionar cliente")
	public void clicar_em_adicionar_cliente() {
		assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Entao("uma novo cliente deve ser criado com sucesso")
	public void uma_novo_cliente_deve_ser_criado_com_sucesso() {
		Alert alert = driver.switchTo().alert();
		assertTrue((alert.getText().contains("id")));
		alert.accept();
	}

	@Dado("esteja no formulario de abrir conta")
	public void esteja_no_formulario_de_abrir_conta() {
		assertTrue(driver.findElement(By.xpath("//button[@ng-click='openAccount()']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//button[@ng-click='openAccount()']")).isEnabled());
		driver.findElement(By.xpath("//button[@ng-click='openAccount()']")).click();
	}

	@Quando("o gerente preencher com dados validos as informacoes {string} e {string}")
	public void o_gerente_preencher_com_dados_validos_as_informacoes_e(String nomeCliente, String moeda) {
		Select selecionaCliente = new Select(driver.findElement(By.id("userSelect")));
		selecionaCliente.selectByVisibleText(nomeCliente);
		Select selecionaMoeda = new Select(driver.findElement(By.id("currency")));
		selecionaMoeda.selectByVisibleText(moeda);

		assertNotNull(nomeCliente);
		assertNotNull(moeda);
	}

	@Quando("clicar em criar conta")
	public void clicar_em_criar_conta() {
		assertTrue(driver.findElement(By.xpath("//button[text()='Process']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//button[text()='Process']")).isEnabled());
		driver.findElement(By.xpath("//button[text()='Process']")).click();
	}

	@Entao("uma nova conta para o cliente deve ser criada com sucesso")
	public void uma_nova_conta_para_o_cliente_deve_ser_criada_com_sucesso() {
		Alert alert = driver.switchTo().alert();
		assertTrue((alert.getText().contains("Number")));
		alert.accept();
	}
}
