package practicePack;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class WindowHAndle extends BaseClass {
	
	@Test
	public void WindowHandle() throws InterruptedException {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		driver.findElement(By.partialLinkText("Goo")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String> childWindow=driver.getWindowHandles();
		
		for (String child:childWindow)
		{
			driver.switchTo().window(child);
		}
		driver.findElement(By.name("q")).sendKeys("Test Automation Engineer");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.id("LN")).sendKeys("Hasnain");
		Thread.sleep(2000);
		
		for (String child:childWindow)
		{
			driver.switchTo().window(child);
		}
		driver.findElement(By.name("q")).sendKeys("Pharmacist in Canada");
		
		Thread.sleep(3000);
		//driver.close();
	}
	
	

}
