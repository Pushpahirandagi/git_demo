package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.ajio.com/");
		// driver.get("https://www.flipkart.com/");
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize(); //Maximize the Browser window
		//tag &attribute
		//driver.findElement(By.cssSelector("input[name='searchVal']")).sendKeys("shoes");
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Kurties");
		
		//tag& class
		//driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("T-shirts");
		
		//tag& Name
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("earings");
		
		//Tag & name
		//driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Rings");
		
	
		
		
		
		
		
		
		
		

	}

}
