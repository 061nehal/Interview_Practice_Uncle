package practicePack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HighlightWebElement {
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void HighlightWebElementTest() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		WebElement fname=driver.findElement(By.id("FN"));
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:4px solid red;');", fname);
	}

}
