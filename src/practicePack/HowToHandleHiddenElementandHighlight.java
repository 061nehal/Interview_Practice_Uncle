package practicePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class HowToHandleHiddenElementandHighlight extends BaseClass {
	
	@Test
	public void HiddenElementandHighlight() {
		
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		
		List<WebElement>fname=driver.findElements(By.id("FN"));
		System.out.println("Total points  "+fname.size());
		
		for (int i=0; i<fname.size(); i=i+1) {
			WebElement ele=fname.get(i);
			int Y1=ele.getLocation().getX();
			System.out.println("Point "+Y1);
		
			if (Y1!=0) {
				
				JavascriptExecutor jse=((JavascriptExecutor)driver);
				jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:4px solid red;');", ele);
			}
		}
		
		
	}

}
	
	
	


