package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassSelf {
	
	public ChromeDriver driver;
		
@BeforeMethod
	public void precondition() {
		// TODO Auto-generated method stub
		
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
			
		driver = new ChromeDriver(option);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
// in second page now
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
@AfterMethod
 public void postcondition() {
	driver.close();

}

}
