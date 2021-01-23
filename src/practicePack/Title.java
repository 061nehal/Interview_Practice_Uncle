package practicePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Title {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void TitlePractice() {
		
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		String totl=driver.getTitle();
		System.out.println("So Title is:    "+totl);
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
