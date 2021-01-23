package PacticePack2;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class SubMenu extends BaseClass {
	
	@Test
	public void SubMenuHandling() throws InterruptedException {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		WebElement sm=driver.findElement(By.linkText("Social Media"));
		
		Actions act=new Actions(driver);
		act.moveToElement(sm).build().perform();
		driver.findElement(By.partialLinkText("Googl")).click();
		
		String superTechWindow=driver.getWindowHandle();
		Set<String>googleWindow=driver.getWindowHandles();
		
		for(String child:googleWindow)
		{
			driver.switchTo().window(child);
		}
		
		driver.findElement(By.name("q")).sendKeys("Software Automation Test Engineer");
		Thread.sleep(3000);
		
		driver.switchTo().window(superTechWindow);
		
		driver.findElement(By.id("btnPrompt")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Nehal");
		Thread.sleep(3000);
		alt.accept();
		
		
		
	}

}
