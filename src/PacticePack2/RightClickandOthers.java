package PacticePack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import pack1.BaseClass;

public class RightClickandOthers extends BaseClass  {
	@Test
	public void RightClickPractice() {
		
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		Actions act=new Actions(driver);
		
		List<WebElement>firstName=driver.findElements(By.id("FN"));
		
		for(int i=1; i<firstName.size(); i=i+1)
		{
			WebElement ele=firstName.get(i);
			int X1=ele.getLocation().getX();
			if(X1!=0)
			{
				act.moveToElement(ele).contextClick().build().perform();
			}
		}
	}

}
