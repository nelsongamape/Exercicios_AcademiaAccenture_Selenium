package Exemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExempleCheckAndRadioBox {

	public static void main(String[] args) {

		WebDriver drv = new ChromeDriver();

		drv.manage().window().maximize();
		drv.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");

		
//		drv.findElement(By.id("index")).click(); // foi parar na prestashop

		WebElement checkCategory = drv.findElement(By.id("uniform-layered_category_4"));

		checkCategory.click();

		System.out.println(checkCategory.isDisplayed());
		System.out.println(checkCategory.isEnabled());
		System.out.println(checkCategory.isSelected());

		drv.navigate().to("http://automationpractice.com/index.php?id_product=1&controller=product");

		WebElement radioBtnOrange = drv.findElement(By.id("color_13"));
		WebElement radioBtnBlue = drv.findElement(By.id("color_14"));
		System.out.println(radioBtnOrange.isDisplayed());
		System.out.println(radioBtnOrange.isEnabled());
		System.out.println(radioBtnOrange.isSelected());

		if (radioBtnOrange.isSelected()==false) {
			radioBtnBlue.click();
		}
		System.out.println(radioBtnOrange.isSelected());
		System.out.println(radioBtnBlue.isSelected());
				
		
//		drv.quit();
		
	}

}
