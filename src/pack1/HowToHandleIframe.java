	package pack1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowToHandleIframe extends BaseClass {
	
	@Test
	public void IFrameHandling () {
		
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("LoginForm");
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe[1]")));
	
		driver.findElement(By.name("first_name")).sendKeys("Nehal");
		driver.switchTo().defaultContent();
		//driver.switchTo().frame(1);
		//driver.findElement(By.linkText("Download")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//*[@id=\"inputstring\"]")).sendKeys("11432");
		
	}

}
