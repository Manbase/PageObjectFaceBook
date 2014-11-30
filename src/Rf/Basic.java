package Rf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Basic {
	
	public static void main(String[] args) throws IOException {
		
		/*String s[] = {"Bashar","Bishow","Kamolesh", "Bimal","Hamid"};
		
		for(String ss:s){
			System.out.println(ss);
		}*/
		
		
		
		switch (p.getProperty("browser")) {
		
		case "Firefox":
			System.out.println("your age is 0" );
			break;
			
		case "Chrome":
			System.out.println("your age is 1" );
			break;
			
		case "IE":
			System.out.println("your age is 2" );
			break;
		default:
			System.out.println("you are not born yet");
			break;
		}
		//properties read
		
			

			FileInputStream fileInputStream = new FileInputStream
					(new File("src\\data\\config.properties"));

			p.load(fileInputStream);
			
			System.out.println(p.getProperty("browser"));
		}
	
	static Properties	p = new Properties();
	}


