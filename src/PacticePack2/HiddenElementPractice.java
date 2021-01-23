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

public class HiddenElementPractice extends BaseClass {
	
	@Test
	public void HiddenElementandScreenShot() throws IOException {
		
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		List<WebElement>firstName=driver.findElements(By.id("FN"));
		
		for(int i=1; i<firstName.size(); i=i+1)
		{
			WebElement ele=firstName.get(i);
			int X1=ele.getLocation().getX();
			System.out.println("Point is "+X1);
			if (X1!=0)
			{
				ele.sendKeys("Nehal");
			}
		}
		
		
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("D:\\ITTraining\\ScreenShot\\Arekta.jpg"));
		
	
	
		List<WebElement>radioButton=driver.findElements(By.id("ml"));
		
		for (int i=1; i<radioButton.size(); i=i+1 )
		{
			WebElement rbtn=radioButton.get(i);
			int X2=rbtn.getLocation().getX();
			if(X2!=0)
			{
				rbtn.click();
			}
			
		}
	}
	

}
