package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class HowToCountDropDownList extends BaseClass {
	@Test
	public void CountingDropDownList() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		List<WebElement>monthlist=driver.findElement(By.id("month")).findElements(By.tagName("option"));
		int totalmonth=monthlist.size()-1;
		
		System.out.println("Total month is   "+  totalmonth);
		
		for (int i=1; i<=totalmonth; i=i+1) {
			System.out.println(i+". " +monthlist.get(i).getText());
		}
		
	}

}
