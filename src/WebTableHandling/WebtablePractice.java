package WebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class WebtablePractice extends BaseClass {
	
	@Test
	public void WebTable() {
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		List<WebElement>column=driver.findElements(By.xpath("//*[contains(@id,'header-text')]"));
		int columnCount=column.size();
		System.out.println("Total row is "+columnCount); 
		
		List<WebElement>row=driver.findElements(By.xpath("//*[contains(@id,'cell')]"));
		System.out.println(row.size());
		
		/*System.out.println(driver.findElement(By.xpath("//*[contains(@id,'uiGrid-0005-cel')]/div")).getText());
		System.out.println(driver.findElement(By.xpath("//*[contains(@id,'uiGrid-0005-header-text')]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[contains(@id,'uiGrid-0006-header-text')]")).getText());
		*/
	}

}
