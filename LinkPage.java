package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		System.out.println("The URL IS:" + driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]")).click();
		driver.findElement(By.xpath("//img[@src='images/image.png']")).click();
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img"))
				.click();
		driver.findElement(By.xpath("//img[@src='images/checkbox.png']")).click();
		driver.findElement(By.xpath("//input[contains(text(),'Java']/perent::div[@class='example']")).click();

	}

}
