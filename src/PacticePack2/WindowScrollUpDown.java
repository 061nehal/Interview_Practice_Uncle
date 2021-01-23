package PacticePack2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class WindowScrollUpDown extends BaseClass  {
	@Test
	public void WindowUpandDown() throws InterruptedException {
		
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,2350)");
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//*[@id=\"fullbody\"]/div[4]/form[1]/input")).sendKeys("D:\\ITTraining\\ScreenShot\\facebook.jpg");
		
		jsx.executeScript("window.scrollBy(0, -2350)");
	}

}
