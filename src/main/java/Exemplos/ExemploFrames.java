package Exemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		WebElement faceFrame = driver.findElement(By.xpath("//iframe[@title='fb:like_box Facebook Social Plugin']"));
		driver.switchTo().frame(faceFrame);

		System.out.println(driver.findElement(By.id("facebook")).getAttribute("lang"));

		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@title='Women']")).click();

	}

}
