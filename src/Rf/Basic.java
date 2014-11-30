package Rf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basic {
	static Properties	p = new Properties();
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream
				(new File("src\\data\\config.properties"));

		p.load(fileInputStream);
		
		/*String s[] = {"Bashar","Bishow","Kamolesh", "Bimal","Hamid"};
		
		for(String ss:s){
			System.out.println(ss);
		}*/
		
		
		String s = p.getProperty("browser");
		switch (s) {
		
		case "Firefox":
			driver = new FirefoxDriver();
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Dev\\driver/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\Dev\\driver/IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		//properties read
		
			

			
			
			System.out.println(p.getProperty("browser"));
			
			
			
			driver.get("http://www.google.com");
			
		}
	
	
	}


