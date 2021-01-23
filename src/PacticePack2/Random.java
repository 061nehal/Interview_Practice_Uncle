package PacticePack2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class Random extends BaseClass {
	
	@Test
	public void HiddenElement() throws IOException {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		List<WebElement>firstName=driver.findElements(By.id("FN"));
		
		for(int i=1; i<firstName.size(); i=i+1)
		{
			WebElement ele=firstName.get(i);
			int X1=ele.getLocation().getX();
			if(X1!=0)
			{
				ele.sendKeys("Nehal");
			}
		}
		
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("D:\\ITTraining\\ScreenShot\\Random.jpg"));
		
		
	}

}
