package selenium;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC2bookmyshow {

	public static void main(String[] args) {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//span[@id='4']"));

		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//span[@id='4']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sir");
		driver.findElement(By.xpath("//strong[text()='Sir']")).click();
		
		driver.findElement(By.xpath("//button[@data-phase='postRelease']")).click();
		WebElement theatre = driver.findElement(By.xpath("//a[@class='__venue-name']"));
		System.out.println(theatre.getText());
		
		driver.findElement(By.xpath("//div[@class='info-section']/img")).click();
		WebElement parking = driver.findElement(By.xpath("(//div[@class='facility-text'])[2]"));
		System.out.println(parking.getText());
		
		driver.findElement(By.className("cross-container")).click();
		driver.findElement(By.xpath("//a[@data-availability='A']//div")).click();
		driver.findElement(By.xpath("//ul[@id='popQty']/li")).click();
		driver.findElement(By.id("proceed-Qty")).click();
		
		// selecting seat
		
		driver.findElement(By.xpath("//div[@data-seat-type='1']//a")).click();
		driver.findElement(By.id("btmcntbook")).click();
		
		WebElement subtotal = driver.findElement(By.className("__sub-total"));
		String sub = subtotal.getText();
		System.out.println(sub);
	}

}
