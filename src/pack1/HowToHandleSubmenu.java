package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HowToHandleSubmenu extends BaseClass {
	
	@Test
	public void submenuHandling() throws InterruptedException {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		
		
		WebElement sm=driver.findElement(By.linkText("Social Media"));
		Actions act =new Actions(driver);
		act.moveToElement(sm).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Goog")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String>childWindow=driver.getWindowHandles();
		
		for(String child:childWindow) {
			driver.switchTo().window(child);
		}
		driver.findElement(By.name("q")).sendKeys("Seleium WebDriver");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.xpath("//*[@id=\"btnConfirm\"]")).click();
	}

}
