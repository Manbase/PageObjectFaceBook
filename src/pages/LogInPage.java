package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	
	WebDriver driver = null;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public LandingPage logIn() {
		driver.findElement(By.name("email")).sendKeys("manbase101@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("manhattan101");
		driver.findElement(By.name("pass")).submit();
		
		return new LandingPage(driver);
	}
	public void signUp() {


	}
	

}
