package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC3amazon {

	public static void main(String[] args) {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		driver.findElement(By.xpath("//div[@role='button']/span[text()=' for boys']")).click();
		WebElement results = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing')]/span"));
		System.out.println(results.getText());
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("//li[@id='p_89/Skybags']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
//		driver.findElement(By.id("//span[@class='a-dropdown-label']")).click();
//		driver.findElement(By.id("s-result-sort-select_4")).click();
		
		WebElement text = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]"));
		System.err.println(text.getText());		 
	}

}
