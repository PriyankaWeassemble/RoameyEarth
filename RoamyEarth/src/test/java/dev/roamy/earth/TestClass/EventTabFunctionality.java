package dev.roamy.earth.TestClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EventTabFunctionality {


		@Test(invocationCount=30,threadPoolSize=30)
		public void HomePageFunctionality()
		{
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser open");
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		driver.get("https://roamyuser:CEwrlmuCl7eThudohizU@dev.roamy.earth/");
		System.out.println("Website open");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eventab=driver.findElement(By.xpath("//a[@class='cursor--pointer roamy__link text-white']"));
		eventab.click();
		System.out.println("click Event tab");
		
//		WebElement sort=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/section/div[2]/div[1]/div/div/div/div/div[1]/button"));
//		sort.click();
//		
//		List<WebElement> li=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='dropdown__menu Sort']//div//ul//li")));
//		li.get(1).click();
//		
//		WebElement date=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/section/div[2]/div[1]/div/div/div/div/div[2]/button"));
//		date.click();
//		
//		List<WebElement> dates=new ArrayList<WebElement>(driver.findElements(By.xpath("//div//div[@class='custom-date-picker-container dropdown__menu']//div//ul//li")));
//		dates.get(2).click();
//		
//		WebElement artist=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/section/div[2]/div[1]/div/div/div/div/div[3]/button"));
//		artist.click();
//		
//		List<WebElement> artistlist=new ArrayList<WebElement>(driver.findElements(By.xpath("//div//div[@class='dropdown__menu Artist']//div//ul//li")));
//		artistlist.get(5).click();
//		
//		WebElement genre=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/section/div[2]/div[1]/div[1]/div/div/div/div[4]/button"));
//		genre.click();
//		
//		List<WebElement> genrelist=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='dropdown__menu Genre']//div//ul//li")));
//		genrelist.get(5).click();
//		
//		WebElement location=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/section/div[2]/div[1]/div[1]/div/div/div/div[5]/button"));
//		location.click();
//		
//		List<WebElement> locationlist=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='dropdown__menu Location filter-left-align']//div[@class='mt-0 scroll']//ul//li")));
//		locationlist.get(5).click();
		
		driver.quit();
      }	
}
