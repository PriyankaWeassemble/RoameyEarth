package dev.roamy.earth.TestClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FAQTagFunctionality {
	@Test
	public void FAQTag()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Browser open");
	driver.manage().window().maximize();
//	driver.get("https://www.google.com/");
	driver.get("https://roamyuser:CEwrlmuCl7eThudohizU@dev.roamy.earth/");
	System.out.println("Website open");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement FAQTag=driver.findElement(By.xpath("//a[@class='roamy__link text-white']"));
	FAQTag.click();
	System.out.println("FAQ Tag tab");
	
	driver.quit();
  }


}
