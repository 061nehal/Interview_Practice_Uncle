package practicePack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SubMenuHandlePractice {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		
		//System.setProperty("webdriver.gecko.driver", "D:\\ITTraining\\AllDriver\\geckodriver.exe");
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void SubMenuHandlePracticeTest() throws InterruptedException {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		WebElement sm=driver.findElement(By.linkText("Social Media"));
		Actions act=new Actions(driver);
		act.moveToElement(sm).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Goog")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String>childWindow=driver.getWindowHandles();
		
		for (String child:childWindow) {
			driver.switchTo().window(child);
		}
		
		driver.findElement(By.name("q")).sendKeys("Phamacist Canada");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.xpath("//*[@id=\"btnAlert\"]")).click();
	}
	
	/*@AfterTest
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}*/
     
}
