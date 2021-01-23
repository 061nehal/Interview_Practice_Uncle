package practicePack;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShotPractice {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void ScreenShot() throws IOException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Nehal");
		driver.findElement(By.name("lastname")).sendKeys("Hasnain");
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\ITTraining\\ScreenShot\\facebook.jpg"));
		
		
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();
	}

}
