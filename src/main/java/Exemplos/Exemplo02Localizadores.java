package Exemplos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exemplo02Localizadores {
	public static void main(String[] args) {

//		WebDriver dr = new ChromeDriver();
//
//		dr.manage().window().maximize();
//		dr.get("http://sampleapp.tricentis.com/110/");
//
//		WebElement requestButton = dr.findElement(By.id("downloadtrial"));
//
//		requestButton.click();
//
//		dr.navigate().back();
//
//		WebElement getCamperButton = dr.findElement(By.id("get_camper"));
//
//		getCamperButton.click();
//
//		List<WebElement> camperMenu = dr.findElements(By.className("menu-item"));
//		System.out.println(camperMenu.size());
//
//		WebElement linkMotos = dr.findElement(By.linkText("Motorcycle"));
//		linkMotos.click();
//		dr.navigate().back();
//
//		List<WebElement> tagsA = dr.findElements(By.tagName("a"));
//		System.out.println(tagsA.size());
//		
//		WebElement download = dr.findElement(By.xpath(//[@tag="a" and title="Download Trial"));
		
		
				
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		
		drv.get("http://automationpractice.com/index.php");
		
		WebElement contactUsButton = drv.findElement(By.id("contact-link"));
		
		WebElement carrinhoBtn = drv.findElement(By.xpath("//a[@id]"));
		
		WebElement facebookLink = drv.findElement(By.xpath("//span[contains(text(),'Face')]"));
		
		List<WebElement> tagsA = drv.findElements(By.xpath("//a"));
		System.out.println(tagsA.size());
		
		List<WebElement> tagsAComImg= drv.findElements(By.xpath("//a"));
		
		
//		WebElement getSavingsButton = drv.findElement(By.linkText("http://automationpractice.com/modules/blockbanner/img/sale70.png"));
				
//		List<WebElement> tagsA = drv.findElements(By.tagName("a"));
//		System.out.println(tagsA.size());
					
		drv.quit();

	}

}
