package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



import pack1.BaseClass;

public class GoogleSearch extends BaseClass {
	
	@Test
	public void GoogleSearchTest () {
	driver.get("https://www.google.com/");	
	driver.findElement(By.name("q")).sendKeys("New York");
	List<WebElement>list=driver.findElements(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/ul/li"));
	System.out.println("Total number of search item ======>" + list.size());
	
	for (int i=0; i<list.size(); i=i+1) {
		System.out.println(i+". "+list.get(i).getText());
		if (list.get(i).getText().contains("new york weather")){
			list.get(i).click();
			break;
		}
	}

	
	}
}
