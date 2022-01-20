package Exemplos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploAlertas {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

//		drv.findElement(By.id("alertexamples"));

		driver.findElement(By.id("confirmexample")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();

		driver.findElement(By.id("promptexample")).click();

		alert.sendKeys("Academia Accenture 2022");
		alert.accept();

		driver.quit();

	}

}
