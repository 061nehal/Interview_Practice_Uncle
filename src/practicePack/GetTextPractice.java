package practicePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTextPractice {
	
	WebDriver driver;

	@BeforeTest
	public void OpenBrowser()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void GetTextPractice() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
        String scrollText=driver.findElement(By.xpath("//*[@id=\"mrq\"]/font/h1")).getText();
		System.out.println("Scroll Text is=    "+scrollText);
       
		
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
		
	}
	
}
