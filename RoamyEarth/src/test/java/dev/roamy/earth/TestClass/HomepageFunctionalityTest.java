package dev.roamy.earth.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageFunctionalityTest extends Thread {
	
	public void run()
	{
		int i=0;
		while(i<10) {
			
		//	start code
			System.out.println("start");
			System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://roamyuser:CEwrlmuCl7eThudohizU@dev.roamy.earth/");
			System.out.println("End");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.quit();	
		
		//end code
		i++;
		}
	}
}
	
	


