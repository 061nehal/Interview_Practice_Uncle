package practicePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrameHandlePractice {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void IFrameHandling() throws InterruptedException {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"fullbody\"]/iframe[1]")));
		driver.findElement(By.name("first_name")).sendKeys("Anik");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//*[@id=\"inputstring\"]")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.name("last_name")).sendKeys("Hasnain");
		
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
