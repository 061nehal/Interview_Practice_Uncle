package practicePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentPageSameWindowPractice {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void HowToHandleDifferentPageSameWindow() throws InterruptedException {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		driver.findElement(By.xpath("//*[@id=\"u_0_f\"]")).sendKeys("Anik");
		Thread.sleep(2000);
	}
	
	/*@AfterTest
	public void CLoseBrowser() {
		driver.close();
	}*/
	

}
