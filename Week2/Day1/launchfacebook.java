package week2.day1;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class launchfacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
//		EdgeDriver driver = new EdgeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//		driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
//		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		driver.findElement(By.className("loginButton")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
			
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RENGA & CO");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rengarajan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VASUDEVAN");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Renga");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Renga creating scripts.Thanks to Testleaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("emailofrenga@gmail.com");
		WebElement stateProv= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateProv);
		state.selectByVisibleText("New York");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	//	driver.close();
	}

}
