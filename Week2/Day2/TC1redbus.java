package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TC1redbus {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chennai");
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@class='selected']")).click();
		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//td[text()='16']")).click();
		driver.findElement(By.id("search_btn")).click();
		
		WebElement bus = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		System.out.println(bus.getText());
		
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label[1]")).click();
		
		WebElement busname = driver.findElement(By.xpath("(//div[contains(@class,'travels lh-24')])[2]"));
		System.out.println(busname.getText());

	}

}
