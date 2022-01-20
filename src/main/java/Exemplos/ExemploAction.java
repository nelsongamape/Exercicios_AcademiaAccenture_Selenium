package Exemplos;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExemploAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");


		Actions actions = new Actions(driver);

		WebElement indexSearch = driver.findElement(By.id("search_query_top"));

		actions.moveToElement(indexSearch).click().sendKeys("blouse").perform();
		
//		falta utilizar o actions.keyDown(keys.ENTER)*** quando usei o site deu erro
		
		List<WebElement> imgLinkList = driver.findElements(By.xpath("//a[@class='item-link']"));

		actions.moveToElement(imgLinkList.get(3)).perform();

		WebElement sitemap = driver.findElement(By.xpath("//a[@title='Sitemap']"));

		actions.moveToElement(sitemap);

		driver.quit();

	}

}
