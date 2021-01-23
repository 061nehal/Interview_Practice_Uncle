package practicePack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertHandlingPractice {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void AlertHadlePractice() throws InterruptedException {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.xpath("//*[@id=\"btnAlert\"]")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert Text is:  "+alt.getText());
		alt.accept();
	}
	
	@AfterTest 
	public void CloseBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
