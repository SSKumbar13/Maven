package Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest 
{
	public static WebDriver driver;
	
	@BeforeTest
	public void steUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumProjects\\DriversForSelenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	@Test
	public void doLogin()
	{
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ShivamKumbar2115");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Shivam@123");
		//driver.findElement(By.linkText("Log In")).click();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
