package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Identify the WebElement
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajalakshmi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mahalingam");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8939946155");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Dharani@03");
		
		WebElement selBirthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select ddBdate = new Select(selBirthday);
		ddBdate.selectByValue("5");

		WebElement selBirthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select ddBMonth = new Select(selBirthMonth);
		ddBMonth.selectByValue("6");
		
		WebElement selBirthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select ddBYear = new Select(selBirthYear);
		ddBYear.selectByValue("1984");	
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
	}

}
