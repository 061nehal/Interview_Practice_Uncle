package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HowToPerformDoubleClickandRightClick extends BaseClass {
	
	@Test
	public void DoubleClick() {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0, 2300)");
		
		WebElement DC=driver.findElement(By.xpath("//*[@id=\"fullbody\"]/button[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(DC).doubleClick().build().perform();
				
		
	}
	
	

}
