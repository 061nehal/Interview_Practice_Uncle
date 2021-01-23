package pack1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowToHandleDifferenPageSameInWindow extends BaseClass {
	
	@Test
	public void DifferentPageSameWindow() throws Throwable {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Nehal");
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("FN")).sendKeys("Anik");
		driver.navigate().forward();
		driver.findElement(By.name("lastname")).sendKeys("Hasnain");
	}

}
