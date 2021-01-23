package practicePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkCountPractice {
	
	WebDriver driver;
	
	@BeforeTest 
	public void OpenBrowser () {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void LinkCount() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		List<WebElement>link=driver.findElements(By.tagName("a"));
		
		int totalLink=link.size();
		System.out.println("Total Links Are :  "+totalLink);
		
		for (int i=0; i<totalLink; i=i+1) {
			System.out.println(i+" ."+link.get(i).getText()+"------"+link.get(i).getAttribute("href"));
		}
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	

}
