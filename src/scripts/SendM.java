package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.LogInPage;
import pages.Messages;
import pages.Photos;

public class SendM {
	
	@Test
	public void main() {
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\Dev\\driver\\IEDriverServer.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		
		LogInPage l = new LogInPage(driver);
		
		//l.logIn().messages().sendMessages();
		
		LandingPage landingPage = l.logIn();
		Messages messages = landingPage.messages();
		messages.sendMessages();
		driver.quit();
	}
	@Test
	public void changP() throws InterruptedException {
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Dev\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		
		LogInPage l = new LogInPage(driver);
		
		//l.logIn().messages().sendMessages();
		
		LandingPage landingPage = l.logIn();
		Photos photos = landingPage.photos();
		photos.changePic();
		driver.quit();
	}
	
	

}
