package PacticePack2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class DifferentPageSameWindow extends BaseClass {
	
	@Test
	public void DifferentPageEkiWindow() throws InterruptedException {
		
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.id("LN")).sendKeys("Hasnain");
		driver.findElement(By.cssSelector("#EM")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Seleniu")).click();
		
		driver.navigate().forward();
		driver.findElement(By.cssSelector("[id='gsc-i-id1']")).sendKeys("I will ace. Inshallah.");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Select month=new Select(driver.findElement(By.id("month")));
		Select day=new Select(driver.findElement(By.id("day")));
		Select year=new Select(driver.findElement(By.id("year")));
		
		month.selectByVisibleText("November");
		day.selectByIndex(6);
		year.selectByVisibleText("2001");
		driver.findElement(By.partialLinkText("Goog")).click();
		
		driver.close();
	}

}
