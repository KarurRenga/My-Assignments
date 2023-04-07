package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//import java.time.Duration;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead extends BaseClassSelf{

	@Test
	
	public void duplicateLead() throws InterruptedException {

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
				
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("emailofrenga@gmail.com");
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[6]")).click();
		Thread.sleep(1000);
		WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		String leadText = lead.getText();
		System.out.println("The first name of the first lead is - "+leadText);
		
			
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-cell-first')]//a[@class='linktext']")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("4444");
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement firstName = driver.findElement(By.id("viewLead_firstName_sp"));
		String duplicateName = firstName.getText();
		System.out.println("The first name of the duplicate lead is "+firstName.getText());
		if (leadText.contains(duplicateName)) {
			System.out.println("The first name of duplicate lead- "+duplicateName+" is same as that of first name of original lead- "+leadText);
			
		}
		
//		driver.close();
	}
 
}
