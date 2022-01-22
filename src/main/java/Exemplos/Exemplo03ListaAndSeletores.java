package Exemplos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exemplo03ListaAndSeletores {

	public static void main(String[] args) {
		
		WebDriver drv = new ChromeDriver();

		drv.manage().window().maximize();
		drv.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
		
		
		Select seletorProdutos = new Select(drv.findElement(By.id("selectProductSort")));
		
		List<WebElement> listaSeletorProd = seletorProdutos.getOptions();
		
		
		System.out.println("Tamanho da lista de seleção: " + listaSeletorProd.size());
		
		System.out.println();

		System.out.println("************Lista dos itens************");

		
		for (int i = 0; i < listaSeletorProd.size(); i++) {
			
			System.out.println(listaSeletorProd.get(i).getText());
			
		}

		System.out.println("*****Opção Selecionada*****");
		seletorProdutos.selectByIndex(2);
		System.out.println(seletorProdutos.getFirstSelectedOption().getText());
		
		seletorProdutos.selectByVisibleText("Price: Lowest first");
		System.out.println(seletorProdutos.getFirstSelectedOption().getText());
		
		
		drv.quit();
		
	}

}
