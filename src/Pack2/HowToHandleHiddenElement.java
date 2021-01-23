package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class HowToHandleHiddenElement extends BaseClass {
	
	@Test
	public void HiddenElementHandling() throws InterruptedException {
	
	driver.get("file:///D:/ITTraining/OurWebSite.html");
	//driver.findElement(By.id("FN")).sendKeys("Nehal");
	
    List<WebElement>firstname=driver.findElements(By.id("FN"));
	//System.out.println("Total Elements "+ firstname.size());
			for (int i=0; i<firstname.size(); i=i+1) {
				WebElement ele=firstname.get(i);
				int X1=ele.getLocation().getX();
				System.out.println("Point " +X1);
				if (X1 !=0) {
					ele.sendKeys("Anik");
				}
			}

	List<WebElement> male=driver.findElements(By.xpath("//*[@id='ml']"));
	for (int i=0; i<male.size(); i=i+1) {
		WebElement ele=male.get(i);
		int X2=ele.getLocation().getX();
		System.out.println("Point " +X2);
		if (X2 !=0) {
			ele.click();
		}
		
	}
			Thread.sleep(2000);
         
	
	}

}
