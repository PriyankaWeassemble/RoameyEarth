import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void run()
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
		email.sendKeys("mahalaxmi@weassemble.team");
		
		WebElement cntinueafemail=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/button/div"));
		cntinueafemail.click();
		
		WebElement paswd=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/div[2]/div/div/input"));
		paswd.sendKeys("Indira@77");

		WebElement login1=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/form/button/div"));
		login1.click();
		
		WebElement SearchBox=driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/div[1]/div[1]"));
		SearchBox.sendKeys("mid");
		
		
	}

}
