package PacticePack2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class MultipleWindowPractice extends BaseClass {
	
	@Test
	public void MultipleWindow() throws InterruptedException {
		
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.partialLinkText("Page 2")).click();
		
		ArrayList<String>page2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(page2.get(1));
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		ArrayList<String>facebook=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(facebook.get(2));
		driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Nehal");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Hasnain");
		Thread.sleep(3000);
		
		ArrayList<String>mainWindow=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(mainWindow.get(0));
		driver.findElement(By.id("LN")).sendKeys("Hasnain");
		Thread.sleep(2000);
		
		driver.switchTo().window(facebook.get(2));
		driver.findElement(By.id("u_0_k")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("u_0_n")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		
		driver.switchTo().window(page2.get(1));
		driver.findElement(By.xpath("/html/body/input[1]")).click();
	}

}
