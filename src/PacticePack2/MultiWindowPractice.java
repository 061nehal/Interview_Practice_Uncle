package PacticePack2;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class MultiWindowPractice extends BaseClass {
	
	@Test
	public void MultiWindow() throws InterruptedException {
		
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		driver.findElement(By.partialLinkText("RUET")).click();
		
		String superTechWindow=driver.getWindowHandle();
		Set<String> ruetWindow=driver.getWindowHandles();
		
		for(String ruet:ruetWindow)
		{
			driver.switchTo().window(ruet);
		}
			driver.findElement(By.id("fos_user_registration_form_firstName")).sendKeys("Nehal");
			driver.findElement(By.id("fos_user_registration_form_lastName")).sendKeys("Hasnain");
			Select designation=new Select(driver.findElement(By.id("fos_user_registration_form_designation")));
			designation.selectByVisibleText("Lecturer");
			Thread.sleep(2000);
			
			driver.switchTo().window(superTechWindow);
			driver.findElement(By.id("btnConfirm")).click();
			Thread.sleep(2000);
			
			Alert alt=driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.dismiss();
			
			for (String ruet:ruetWindow)
			{
				driver.switchTo().window(ruet);
			}
			
			String expectedTitle="Rajshahi University of Engineering & Technology - RUET";
			String actualTitle=driver.getTitle();
			
			Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
