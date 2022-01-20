package Exemplos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloDriver {

	public static void main(String[] args) {

		WebDriver driver01 = new ChromeDriver();

		driver01.get("http://automationpractice.com/index.php");

		driver01.manage().window().maximize();

		System.out.println(
				"Titulo da página visitada: " + driver01.getTitle() + "  Endereço: " + driver01.getCurrentUrl());

		driver01.navigate().refresh();

		driver01.quit();

//		driver01.get("http://sampleapp.tricentis.com/101/app.php");
//
//		System.out.println(
//				"Titulo da página visitada: " + driver01.getTitle() + "  Endereço: " + driver01.getCurrentUrl());
//
//		driver01.manage().window().maximize();
//
//		driver01.navigate().refresh();
//
//		driver01.navigate().back();
//
//		driver01.quit();

	}

}
