package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterOptional {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("input-username"));
		eleUserName.sendKeys("Rajalakshmi");
		// driver.findElement(By.id("input-firstname")).sendKeys("Rajalakshmi");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Rajalakshmi");
		// driver.findElement(By.id("input-lastname")).sendKeys("Mahalingam");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Mahalingam");
		// driver.findElement(By.id("input-email")).sendKeys("raji5.maha@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("raji5.maha@gmail.com");
		//WebElement ele = driver.findElement(By.id("input-country"));
		//Select ic = new Select(ele);
		//ic.deselectByVisibleText("United States");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("RajiRamesh123");
		driver.findElement(By.xpath("//button[contains[text(),'Register']")).click();
		
				
	}
}
