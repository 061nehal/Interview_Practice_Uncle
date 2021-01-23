package pack1;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class HowToScrollUpandDown extends BaseClass   {
	
	@Test
	public void ScrollUpandDown () throws InterruptedException {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		//For Scroll down
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0, 2300)");
		
		Thread.sleep(3000);
		
		//For Scroll up
		jsx.executeScript("window.scrollBy(0, -2300)");
		
		Thread.sleep(3000);
		
	}

}
