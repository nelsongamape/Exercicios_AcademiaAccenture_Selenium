package Exemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exemplo04MsgBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");

		WebElement contactLink = driver.findElement(By.id("contact-link"));

		contactLink.click();

		WebElement messageBox = driver.findElement(By.id("message"));

		messageBox.click();
		messageBox.sendKeys("Agradecendo os conhecimentos adquiridos!");

		messageBox.clear();
		messageBox.sendKeys("Cucumber salva vidas!");

		System.out.println(messageBox.getAttribute("value"));

		driver.findElement(By.id("id_contact")).sendKeys(Keys.ARROW_DOWN);

		driver.findElement(By.id("email")).sendKeys("nelsongama@yahoo.com");
		
		driver.findElement(By.id("submitMessage")).click();
		

		driver.quit();

	}

}
