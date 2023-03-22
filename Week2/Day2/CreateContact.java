package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//form[@id='login']//input[@id='username']
//		driver.findElement(By.xpath("//form[@id='login']//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
// in second page now
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//		driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
// 		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		driver.findElement(By.className("loginButton")).click();
				
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Rengarajan");
		driver.findElement(By.id("lastNameField")).sendKeys("Vasudevan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Renga");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Vasu");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("I love India");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("emailofrenga@gmail.com");
				
		WebElement stateProv= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(stateProv);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
//		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I LOVE INDIA");
		driver.findElement(By.xpath("//td[@colspan='4']/input[@value='Update']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
