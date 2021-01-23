package FailedTestScreenshot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class FailedScreenshotTest extends BaseClass {
	
	@Test
	public void SubmenuHandling() throws InterruptedException {
		//driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Social Media"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("Google")).click();
		
	}
	@Test
	public void AlertHandling() throws InterruptedException {
		//driver.get("file:///E:/WebSite/SuperTech.html");
		driver.findElement(By.id("btnConfir")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		System.out.println("Inside Alert Text is : "+alt.getText());
		alt.accept();
		
	}

}
