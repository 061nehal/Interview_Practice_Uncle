 package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowToHandleMultipleWindow extends BaseClass  {
	@Test
	public void WindowHandle () throws InterruptedException {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.partialLinkText("Google")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String>childWindow=driver.getWindowHandles();
		
		for(String child:childWindow) {
			driver.switchTo().window(child);
		}
		
		driver.findElement(By.name("q")).sendKeys("Bangladesh News");
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Selenium")).click();
		
	}

}
