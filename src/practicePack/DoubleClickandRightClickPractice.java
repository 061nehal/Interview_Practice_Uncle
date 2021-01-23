package practicePack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClickandRightClickPractice {
	
	WebDriver driver;
	
	@BeforeTest
	public void Openrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void DoubleLClickandRightClickPractice() {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 2300)");
		
		WebElement DC=driver.findElement(By.xpath("//*[@id=\"fullbody\"]/button[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(DC).doubleClick().build().perform();
	}

}
