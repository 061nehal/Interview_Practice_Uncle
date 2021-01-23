 package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowToAlertHandle  extends BaseClass{
	
	@Test
	public void alerthandling() throws InterruptedException {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.xpath("//*[@id=\"btnConfirm\"]")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert Text is : "+alt.getText());
		//alt.accept();
		alt.dismiss();
		
	}

}
