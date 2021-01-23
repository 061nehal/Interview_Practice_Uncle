package PacticePack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class GoogleSearchPractice extends BaseClass {
	
	@Test
	public void GoogleSearchPractrice() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Bangladesh");
		Thread.sleep(2000);
		
		List<WebElement>bd=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/ul"));
		System.out.println("total number of search lists are "+bd.size());
		
		Thread.sleep(2000);
		
		for (int i=0; i<bd.size(); i=i+1)
		{
			System.out.println(i+". "+bd.get(i).getText() );
			
			if(bd.get(i).getText().contains("news"))
			{
				bd.get(i).click();
				break;
			}
		}
		
	}

}
