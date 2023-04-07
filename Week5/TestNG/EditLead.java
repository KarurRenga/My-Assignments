package week2.day2;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends BaseClassSelf {

	@Test
	
	public void editLead() throws InterruptedException {

//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(option);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("http://leaftaps.com/opentaps/control/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("DemoCSR");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
// in second page now
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
// 		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		driver.findElement(By.className("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		// click first name field and enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Renga");

//		click find leads button after entering first name
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[6]")).click();
		
		
//		WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
//		String leadText = lead.getText();
//		System.out.println("The first name of the first lead is - "+leadText);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-cell-first')]//a[@class='linktext']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		// click Edit button
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("RRSN Group");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		WebElement name1 = driver.findElement(By.id("viewLead_companyName_sp"));
		String newName = name1.getText();
		System.out.println(newName);
	
		
	}
 
}
