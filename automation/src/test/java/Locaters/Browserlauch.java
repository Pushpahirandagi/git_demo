package Locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlauch {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	//	driver.get("https//www.flipkart.com");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Name
	//	driver.findElement(By.name("search")).sendKeys("mac");
		
		//ID
	//	Boolean logoDisplayestatus=driver.findElement(By.name("logo")).isDisplayed();
	//	System.out.println(logoDisplayestatus);
		
		//Linktext & partial Linktext
		//driver.findElement(By.linkText("Tablets")).click();
	//driver.findElement(By.partialLinkText("table")).click();
		
		//ClassName
		//List<WebElement>Headerlinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total Number of Header links:"+ Headerlinks.size());
		
		//TagName
		//List<WebElement>Links=driver.findElements(By.tagName("a"));
		//System.out.println("Total Number of links:"+ Links.size());
		
		//Tagname
		//List<WebElement>images=driver.findElements(By.tagName("img"));
		//System.out.println("Total number of Images:"+ images.size());
		
		
		
		
		
		
		
		
		
		


	}
}
