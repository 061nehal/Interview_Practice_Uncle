package multiwindow;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class HowtoHandleMultipleWindow extends BaseClass{
	
	@Test (priority=0)
	public void MainWindowTest () throws InterruptedException {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		//driver.findElement(By.id("FN")).sendKeys("Nehal");
		driver.findElement(By.id("EM")).sendKeys("hasnain_ban@hotmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Page 2")).click();
	}
	@Test(priority=1)
	public void Page2Test() throws InterruptedException {
		ArrayList<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Facebook")).click();
	}
	@Test(priority=2)
	public void ThridWindowTest() throws InterruptedException {
		ArrayList<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		
		driver.findElement(By.name("firstname")).sendKeys("Nehal");
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void ReturnToMainPageTest () throws InterruptedException {
		ArrayList<String>mainwindow=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(mainwindow.get(0));
		
		driver.findElement(By.id("LN")).sendKeys("Hasnain");
		Thread.sleep(3000);
	}
}
