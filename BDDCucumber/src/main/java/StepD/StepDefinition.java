package StepD;

import org.openqa.selenium.WebDriver;

import Login.LoginClass;
import io.cucumber.java.en.Given;

public class StepDefinition extends LoginClass {
	WebDriver driver;
	
	@Given("launch browser")
	public void launch_browser() {

	launch();
	}



}