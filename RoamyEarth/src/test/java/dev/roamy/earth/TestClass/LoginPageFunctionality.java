package dev.roamy.earth.TestClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.inject.Key;

public class LoginPageFunctionality {
	
	@Test
	public void LoginTag()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Browser open");
	driver.manage().window().maximize();
//	driver.get("https://www.google.com/");
	driver.get("https://roamyuser:CEwrlmuCl7eThudohizU@dev.roamy.earth/");
	System.out.println("Website open");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement LoginTag=driver.findElement(By.xpath("//div[@class='d-flex align-items-center px__mob--20 py__mob--9']"));
	LoginTag.click();
	System.out.println("Login Tag tab clicked");
	
	//email id
	WebElement emailid=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/div/div/div/input"));
	emailid.sendKeys("priyankalanjekar12@gmail.com");
	System.out.println("Email id send");
	
	//continue
	WebElement cntn=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/button/div"));
	cntn.click();
	System.out.println("click on continue");
	
	//first name
	WebElement firstname=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div/div/div/input"));
	firstname.sendKeys("Priyanka");//id are varies
	
	//lastname
	WebElement lasttname=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[2]/div/div/div/input"));
	lasttname.sendKeys("Lanjekar");

	//country codedropdown
	WebElement codedropdown=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[1]/div/div/div"));
	codedropdown.click();

	List<WebElement> cdli=new ArrayList<WebElement>(driver.findElements(By.xpath("//ul[@id='vs1__listbox']//li[@class='vs__dropdown-option']")));
	for(int i=0;i<cdli.size();i++)
	{
		if(cdli.get(i).getText().contains("+91"))
		{
			cdli.get(i).click();
			break;
		}
	}

	//mobile number
	WebElement mobile=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[2]/div/div/input"));
	mobile.sendKeys("9876543467");
	
	//date
	WebElement dob=driver.findElement(By.xpath("//input[@name='date']"));
	dob.click();
	
	//year selection
	List<WebElement> yearli=new ArrayList<WebElement>(driver.findElements(By.xpath("//table[@class='mx-table mx-table-year']//tr//td")));
	for(int i=0;i<yearli.size();i++)
	{
		if(yearli.get(i).getText().contains("1994"))
		{
			yearli.get(i).click();
			break;
		}
	}
	//month selection
		List<WebElement> monthli=new ArrayList<WebElement>(driver.findElements(By.xpath("//table[@class='mx-table mx-table-month']//tr//td")));
		for(int i=0;i<monthli.size();i++)
		{
			if(monthli.get(i).getText().contains("Sep"))
			{
				monthli.get(i).click();
				break;
			}
		}
		
	//Date selection
		List<WebElement> dateli=new ArrayList<WebElement>(driver.findElements(By.xpath("//table[@class='mx-table mx-table-date']//tr//td")));
		for(int i=0;i<dateli.size();i++)
		{
			if(dateli.get(i).getText().contains("18"))
			{
				dateli.get(i).click();
				break;
			}
		}
	
		//country of origin
		
	WebElement coorigin=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/form/div[4]/div/div/div/div/div[1]/input"));
	coorigin.click();
	
	List<WebElement> coli=new ArrayList<WebElement>(driver.findElements(By.xpath("//ul[@id='vs2__listbox']//li")));
	for(int i=0;i<coli.size();i++)
	{
		if(coli.get(i).getText().contains("Albania"))
		{
			coli.get(i).click();
			break;
		}
	}
	
	//checkbox confirmation
	WebElement cnfcheckbox=driver.findElement(By.xpath("//input[@id='newsletter_subscription']"));
	cnfcheckbox.click();
	
	//continue
	WebElement cntnue=driver.findElement(By.xpath("//div[@class='d-md-flex justify-content-between']"));
	cntnue.click();
	
	//password
	WebElement pswd=driver.findElement(By.xpath("//input[@type='password']"));
	pswd.sendKeys("Ram@1987");
	
	//submit
	WebElement submit=driver.findElement(By.xpath("//button[@type='submit' and @class='border roamy__cta--blue faint-blue pl--15 position-relative roamy__cta--light-blue text-center text-md-left']"));
	submit.click();
	
	//how to add OTP send to email automatically
	 
	
	
//	driver.quit();
  }

}
