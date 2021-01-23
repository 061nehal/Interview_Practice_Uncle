package PacticePack2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class DoubelClickPractice extends BaseClass  {
	
	@Test
	public void DoubleClick() throws IOException {
		
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,2400)");
		
		WebElement dc=driver.findElement(By.xpath("//*[@id=\"fullbody\"]/button[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(dc).doubleClick().build().perform();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\ITTraining\\ScreenShot\\Tryout.jpg")); 
		
	}

}
