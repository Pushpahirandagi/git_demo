package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.ajio.com/");
		 driver.get("https://www.flipkart.com/");
		//driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize(); 
		
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("T-shirts");
	//	driver.findElement(By.xpath("//input[@class='Pke_EE'][@type='text']")).sendKeys("T-shirts");
		
		//Xpath with mulitipale attribute
		//driver.findElement(By.xpath("//input[@name='searchVal[@placeholder='Search AJIO']")).sendKeys("T-shirt");
		
	// Xpath with 'and' 'or' Operator
		//driver.findElement(By.xpath("//input[@name='searchVal' and @placeholder='Search AJIO']")).sendkeys("T-shirt");"
		//driver.findElement(By.xpath("//input[@name='searchVal' or @placeholder='Search AJIO']")).sendKeys("T-shirt");
		
		// xpath with text()  - inner text
		//driver.findElement(By.xpath("//*[text()='Myntra']")).click();
		//driver.findElement(By.xpath("//*[text()='Cleartrip']")).click();
		
	/*	Boolean displayedstatus=driver.findElement(By.xpath("//*[text()='Flipkart Stories']")).isDisplayed();
		System.out.println(displayedstatus);
		
		String Value=driver.findElement(By.xpath("//*[text()='Flipkart Stories']")).getText();
		System.out.println(Value);
		*/
		
		// Xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		// xpath with start-with()
		driver.findElement(By.xpath("//input[start-with(@placeholder, 'Sea']")).sendKeys("Tshirts");
		
		// Chained x-path
		boolean status=driver.findElement(By.xpath("//div[@id='container']/a/img")).isDisplayed();
		System.out.println(status);
		
		
		
		


	}
	
	
}
