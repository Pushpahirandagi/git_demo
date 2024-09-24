package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://wwww.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("abc@gmail.com");
		
		//driver.close();
	}

}
