package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void antes() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void depois() {
		driver.quit();
	}
}
