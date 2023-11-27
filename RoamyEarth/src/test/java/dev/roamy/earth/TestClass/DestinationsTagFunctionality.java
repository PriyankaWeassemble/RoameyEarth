package dev.roamy.earth.TestClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DestinationsTagFunctionality {
	@Test
	public void DestinationsTag()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Browser open");
	driver.manage().window().maximize();
//	driver.get("https://www.google.com/");
	driver.get("https://roamyuser:CEwrlmuCl7eThudohizU@dev.roamy.earth/");
	System.out.println("Website open");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement DestinationsTag=driver.findElement(By.xpath("//span[@class='cursor--pointer roamy__link text-white']"));
	DestinationsTag.click();
	System.out.println("Destinations Tag tab");
	
	WebElement imgsrc=driver.findElement(By.xpath("//img[@alt='India Ahmedabad']"));
	imgsrc.click();
	
	List<WebElement> loctonlist=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='roamy__event-card mx-0 searchcard']")));
	loctonlist.get(2).click();
	
	
	//img[@alt='India Ahmedabad']
//	driver.quit();
  }

}
