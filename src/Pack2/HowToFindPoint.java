package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class HowToFindPoint extends BaseClass {
	
	@Test
	public void FindingPOint ( ) {
	driver.get("file:///D:/ITTraining/OurWebSite.html");	
	WebElement fname=driver.findElement(By.id("FN"));
	
	int X=fname.getLocation().getX();
	int Y=fname.getLocation().getY();
	
	System.out.println("Point= ("+X+", "+Y+")");
	
	WebElement male=driver.findElement(By.xpath("/html/body/input[6]"));
	
	int X1=male.getLocation().getX();
	int Y1=male.getLocation().getY();
	
	System.out.println("Point= ("+X1+", "+Y1+")");
	
		
	}
	

}
