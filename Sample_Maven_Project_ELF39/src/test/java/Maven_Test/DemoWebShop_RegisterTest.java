package Maven_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop_RegisterTest {
	@Test
	public void p2() {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.cssSelector("input[value='F']")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Zohra");
	driver.findElement(By.id("LastName")).sendKeys("Nafi");
	driver.findElement(By.id("Email")).sendKeys("Tasir@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("zohra123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("zohra123");
	driver.findElement(By.id("register-button")).click();
	}
}
