package PacticePack2;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class ScreenshotPractice extends BaseClass {
	
	@Test
	public void Screenshot() throws IOException {
		
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.partialLinkText("Google")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String>googleWindow=driver.getWindowHandles();
		
		for(String child:googleWindow)
		{
			driver.switchTo().window(child);
		}
		
		driver.findElement(By.name("q")).sendKeys("Selenium Automation Engineer");
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("D:\\ITTraining\\ScreenShot\\Practice.jpg"));
	}

}
