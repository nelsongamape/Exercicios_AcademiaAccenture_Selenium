package Exemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploJS {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
		
		
		WebElement productSort = driver.findElement(By.id("selectProductSort"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='quantity:desc';", productSort);

		driver.quit();
		
	}

}
