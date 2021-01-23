package practicePack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingMultipleWindowPractice {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void MultipleWindowHandlingPractice() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.partialLinkText("Google")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String>childWindow=driver.getWindowHandles();
		
		for (String child:childWindow) {
			driver.switchTo().window(child);
		}
		
		driver.findElement(By.name("q")).sendKeys("Pharmacist Canada");
		
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		
		for (String child:childWindow) {
			driver.switchTo().window(child);
		}
		
		driver.findElement(By.xpath("/html/body/a")).click();
		
	}
	
	/*@AfterTest
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}*/

}
