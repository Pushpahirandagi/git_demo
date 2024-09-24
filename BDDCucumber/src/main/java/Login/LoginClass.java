package Login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class LoginClass {
	
	
	WebDriver driver;
	
	public void launch() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.facebook.com");
	}

}
