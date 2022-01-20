package ExDriverUniversity;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExemploActions {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Actions/index.html");

		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement dragAndDrop = driver.findElement(By.id("draggable"));
				
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		WebElement doubleClick = driver.findElement(By.id("double-click"));
		
		List<WebElement> hoverOverList = driver.findElements(By.xpath("//button[@class='dropbtn']"));
		
		WebElement clickAndHold = driver.findElement(By.id("click-box"));

		List<WebElement> dropLinks = driver.findElements(By.xpath("//a[@class='list-alert']"));

		System.out.println(dropLinks.size());
			
		
		
		action.dragAndDrop(dragAndDrop, droppable).perform();
		
		action.moveToElement(doubleClick).doubleClick().perform();
		
		action.moveToElement(hoverOverList.get(1)).perform();
		action.moveToElement(dropLinks.get(1)).click().perform();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		action.clickAndHold(clickAndHold);
			
		
		driver.quit();
		
	}

}
