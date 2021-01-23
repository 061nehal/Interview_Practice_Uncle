package PacticePack2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class AlertHandle extends BaseClass{
	
	@Test
	public void alertHandlePractice() {
		
		/*driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		driver.findElement(By.id("btnAlert")).click();
		
		Alert alrt=driver.switchTo().alert();
		System.out.println(alrt.getText());
		
		alrt.accept();*/
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Nehal Hasnain");
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Anik");
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println("The message is  "+alt.getText());
		alt.dismiss();
	}
		
	
	
	

}
