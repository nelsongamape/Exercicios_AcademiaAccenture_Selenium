package ExChercherTech;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExercicioWaits {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

				driver.get("https://chercher.tech/practice/explicit-wait");
				
				WebDriverWait wait = new WebDriverWait(driver, 20);
				
				driver.findElement(By.id("alert")).click();
				
				wait.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
				
				driver.findElement(By.id("populate-text")).click();
				wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("h2")), "Selenium Webdriver"));
				System.out.println(driver.findElement(By.id("h2")).getText());
				
				driver.findElement(By.id("display-other-button")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hidden"))));
				System.out.println("Botão hidden mostrado? " + (driver.findElement(By.id("hidden"))).isDisplayed());
				
				driver.findElement(By.id("enable-button")).click();
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("disable"))));
				System.out.println("Botão disabled habilitado? " + (driver.findElement(By.id("disable"))).isEnabled());
				
				driver.findElement(By.id("checkbox")).click();
				wait.until(ExpectedConditions.elementSelectionStateToBe((driver.findElement(By.id("ch"))), true));
				System.out.println("Checkbox habilitada?s " + (driver.findElement(By.id("ch"))).isEnabled());
				
				
				
			driver.quit();
				
	}

}
