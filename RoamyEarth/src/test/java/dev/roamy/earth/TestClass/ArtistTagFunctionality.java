	package dev.roamy.earth.TestClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ArtistTagFunctionality {
	@Test
	public void ArtistTag()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Browser open");
	driver.manage().window().maximize();
//	driver.get("https://www.google.com/");
	driver.get("https://www.amazon.in/");
	System.out.println("Website open");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	WebElement artisttab=driver.findElement(By.xpath("//span[@class='cursor--pointer cursor--pointer roamy__link text-white']"));
//	artisttab.click();
//	System.out.println("click Artist tab");
//	
//	driver.quit();
  }

}
