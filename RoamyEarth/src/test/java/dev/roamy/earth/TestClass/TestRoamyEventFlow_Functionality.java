package dev.roamy.earth.TestClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestRoamyEventFlow_Functionality {
	@Test(dataProvider="diffrentgmail")
//	/(invocationCount=10,threadPoolSize=10)
	public void Eventflow(String emailid,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser open");
		driver.manage().window().maximize();

		driver.get("https://roamyuser:CEwrlmuCl7eThudohizU@dev.roamy.earth/");
		System.out.println("Website open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/div[1]/div[2]/div/div/div[1]/div"));
		login.click();
		
		WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/div/div/div/input"));
		email.sendKeys(emailid);
		
		WebElement cntinueafemail=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/button/div"));
		cntinueafemail.click();
		
		WebElement paswd=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/div[2]/div/div/input"));
		paswd.sendKeys(password);

		WebElement login1=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/button/div"));
		login1.click();
		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@type='text' and @class='search__input w-100 h-100 py__mob--14 pl__mob--24 pr__mob--48 border-0 placeholder-color search-active']"));
		SearchBox.sendKeys("mid");
		
		WebElement eventsearchclick=driver.findElement(By.xpath("//div[@class='d-flex align-items-center']//div[@class='ml-3 search__result--pill-title']"));
		eventsearchclick.click();
		System.out.println("event clicked");
		
		WebElement clickonbookon=driver.findElement(By.xpath("//div[@class='pb-2 px-3 w-100']"));
		clickonbookon.click();
		System.out.println("click on book now");
		
		
		WebElement increTravellers=driver.findElement(By.xpath("//button[@class='btns mb-0 position-relative right-border roamy__cta--blue']"));
		increTravellers.click();
		increTravellers.click();
		System.out.println("increment traveller by 1");
		
		WebElement clickcontinue=driver.findElement(By.xpath("//button[@class='border roamy__cta--blue position-relative roamy__cta--light-blue text-lg-left']"));
		clickcontinue.click();
		System.out.println("click on continue");
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		
		
		WebElement selectpckg=driver.findElement(By.xpath("(//div[@class='align-items-center d-flex justify-content-center w-100'])[1]"));
		selectpckg.click();
		System.out.println("package is selected");
		
		
		WebElement cntinueafterpackg=driver.findElement(By.xpath("//button[@class='border roamy__cta--blue position-relative roamy__cta--light-blue text-lg-left']"));
		cntinueafterpackg.click();
		System.out.println("after package selection click on continue");
		
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,500)");
		WebElement addhotel=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div/div/div/div/div[2]/div[4]/div/div/button/div"));
		addhotel.click();
		System.out.println("Hotel selected and added");
		
		
		WebElement ctnueafteraddhotel=driver.findElement(By.xpath("//button[@class='border roamy__cta--blue position-relative roamy__cta--light-blue text-lg-left']"));
		ctnueafteraddhotel.click();
		System.out.println("after hotel selected click on continue");
		
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,800)");
		WebElement addroom=driver.findElement(By.xpath("(//button[@class='border roamy__cta--blue add-btn position-relative px-3 roamy__cta--light-blue w-100'])[1]"));
		addroom.click();
		System.out.println("room added");
		
		
		WebElement incrguest=driver.findElement(By.xpath("//button[@class='btns mb-0 position-relative right-border roamy__cta--blue roamy__cta--light-blue cursor--normal']"));
		incrguest.click();
		incrguest.click();
		incrguest.click();
		System.out.println("increment guest as per previous selection");
		
		WebElement cntnueafterguestadd=driver.findElement(By.xpath("//button[@class='border roamy__cta--blue position-relative roamy__cta--light-blue text-lg-left']"));
		cntnueafterguestadd.click();
		System.out.println("after room add click on continue");

		Thread.sleep(2000);
		js.executeScript("window.scroll(0,700)");
		WebElement addon=driver.findElement(By.xpath("//button[@class='align-items-center d-flex blue-brand-light button-wd my--10 my__mob--16 py-3']"));
		addon.click();
		System.out.println("click on addon");
		
		WebElement cntnueafteraddons=driver.findElement(By.xpath("//button[@class='border roamy__cta--blue position-relative roamy__cta--light-blue text-lg-left']"));
		cntnueafteraddons.click();
		System.out.println("after add on click on continue");
		
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,650)");
		
		WebElement name1=driver.findElement(By.xpath("(//input[@class='pb__mob--10 pr__mob--35 pl__mob--20 pt__mob--26'])[1]"));
		name1.sendKeys("Prachee");
		
		
		WebElement email1=driver.findElement(By.xpath("(//input[@class='pb__mob--10 pr__mob--35 pl__mob--20 pt__mob--26'])[2]"));
		email1.sendKeys("maha123@gmail.com");
		
		WebElement name2=driver.findElement(By.xpath("(//input[@class='pb__mob--10 pr__mob--35 pl__mob--20 pt__mob--26'])[3]"));
		name2.sendKeys("ram");
		WebElement email2=driver.findElement(By.xpath("(//input[@class='pb__mob--10 pr__mob--35 pl__mob--20 pt__mob--26'])[4]"));
		email2.sendKeys("ram@gmail.com");
		
		WebElement name3=driver.findElement(By.xpath("(//input[@class='pb__mob--10 pr__mob--35 pl__mob--20 pt__mob--26'])[5]"));
		name3.sendKeys("krishna");
		WebElement email3=driver.findElement(By.xpath("(//input[@class='pb__mob--10 pr__mob--35 pl__mob--20 pt__mob--26'])[6]"));
		email3.sendKeys("krishna@gmail.com");
		
		WebElement name4=driver.findElement(By.xpath("(//input[@class='pb__mob--10 pr__mob--35 pl__mob--20 pt__mob--26'])[7]"));
		name4.sendKeys("nimesh");
		WebElement email4=driver.findElement(By.xpath("(//input[@class='pb__mob--10 pr__mob--35 pl__mob--20 pt__mob--26'])[8]"));
		email4.sendKeys("nimesh@gmail.com");
		
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,2650)");
		
		WebElement clickcheckbox=driver.findElement(By.xpath("//input[@class='height--16 width--16']"));
		clickcheckbox.click();
		
		WebElement cntnuetopayment=driver.findElement(By.xpath("//span[@class='float-md-left left-space']"));
		cntnuetopayment.click();
		
		WebElement cntnue=driver.findElement(By.xpath("//button[@class='border roamy__cta--blue faint-blue mt-3 roamy__cta--light-blue w-100']"));
		cntnue.click();
		
//		//email box
//		WebElement passwor=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/div/div/div/input"));
//		passwor.sendKeys(emailid1);
//		
//		
//		//change password
//		WebElement password1=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/div[2]/div/div/input"));
//		password1.sendKeys(password);
//		
//		WebElement login=driver.findElement(By.xpath("	/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/button/div"));
//		login.click();
//	
//		WebElement cntnu2=driver.findElement(By.xpath("//span[@class='float-md-left left-space']"));
//		cntnu2.click();
		
		
		//Payment
		
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,250)");
		
		WebElement cardinfo=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div[1]/div/fieldset/div/div[1]/div/div[1]/span/input"));
		cardinfo.sendKeys("4242 4242 4242 4242");

		WebElement mmyy=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div[1]/div/fieldset/div/div[2]/div/div[1]/span/input"));
          mmyy.sendKeys("07 / 25");
          
		WebElement cvv=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div[1]/div/fieldset/div/div[3]/div/div[1]/span/input"));
		cvv.sendKeys("765");
		
		WebElement nameoncard=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div[3]/div/div/div[1]/div/div[2]/div/div[1]/div/div/span/input"));
		nameoncard.sendKeys("Mahalaxmi");
		
		
		WebElement pay=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[2]/div/div[2]/button/div[3]"));
		pay.click();
		
	}
	
	@DataProvider(name="diffrentgmail")
	public Object[][] getData()
	{
		return new Object[][] {
			
			{"mahalaxmi@weassemble.team","Indira@77"}
//			{"rohit@jbsols.com","abc@123RR"}
	
			
		};
		
	}

}
