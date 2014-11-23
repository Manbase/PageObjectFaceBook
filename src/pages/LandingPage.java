package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver = null;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public Messages messages() {
		driver.findElement(By.xpath("(//span[contains(.,'Messages')])[2]")).click();
		return new Messages(driver);
	}
	public Photos photos() {
		driver.findElement(By.xpath("//div/span[text()='Photos']")).click();
		return new Photos(driver);
	}
	
}
