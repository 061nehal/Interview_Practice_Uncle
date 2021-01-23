package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.Test;

public class HowToGetScreenShot extends BaseClass{
	
	
	@Test
	public void GetScreenShot() throws IOException {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Shemonty");
		
		//File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		TakesScreenshot tsc=(TakesScreenshot)driver;
		File srcFile=tsc.getScreenshotAs(OutputType.FILE);
		File f=new File(System.getProperty("user.dir")+"\\src");
		FileUtils.copyFile(f, new File("D:\\ITTraining\\ScreenShot\\Facebook.jpg"));
		
		
	}
	
	

}
