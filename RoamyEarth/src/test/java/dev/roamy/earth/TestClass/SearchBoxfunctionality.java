package dev.roamy.earth.TestClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchBoxfunctionality {
	@Test
	public void SearchBox() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Browser open");
	driver.manage().window().maximize();
//	driver.get("https://www.google.com/");
	driver.get("https://roamyuser:CEwrlmuCl7eThudohizU@dev.roamy.earth/");
	System.out.println("Website open");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	//eventsearch
	
	WebElement SearchBox=driver.findElement(By.xpath("//input[@type='text' and @class='search__input w-100 h-100 py__mob--14 pl__mob--24 pr__mob--48 border-0 placeholder-color search-active']"));
	SearchBox.sendKeys("crone event");
	
	WebElement eventsearchclick=driver.findElement(By.xpath("//div[@class='scroll search__result']"));
	eventsearchclick.click();
	
	Thread.sleep(20000);
	
	WebElement suscribenow=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[1]/section[2]/div/div/div[2]/div/div[2]/button"));
	suscribenow.click();
	
	
	
	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("priyanka@weassmble.team");
	
	WebElement suscribe=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/form/div/button/div"));
	suscribe.click();
	
	
//	driver.quit();
  }

}
