package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HowToPerformRightClick extends BaseClass {
	
	@Test
	public void PerformRightClick() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		Actions act=new Actions(driver);
		//act.contextClick().build().perform();
		
		
		WebElement FirstName=driver.findElement(By.id("FN"));
		act.contextClick(FirstName).build().perform();
	
		
		
	}

}
