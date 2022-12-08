package Framework_utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base_test {
	 public WebDriver driver;
	@BeforeClass
	public void BrowserSetup() throws IOException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/");
		String url=Utility_methods.Test_config();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void TearDown() {
		driver.close();
		
	}

}
