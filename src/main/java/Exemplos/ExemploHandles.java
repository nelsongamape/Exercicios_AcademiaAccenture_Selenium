package Exemplos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		WebElement linkYT = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
		

		linkYT.click();

		ArrayList<String> handles = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(handles.get(0));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(handles.get(1));
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
