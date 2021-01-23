package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class OurWebSiteTestBySingleData extends BaseClass{
	
	@Test
	public void OurWebSite() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		driver.findElement(By.id("FN")).sendKeys("Anik");
		driver.findElement(By.id("LN")).sendKeys("Hasnain");
		driver.findElement(By.id("EM")).sendKeys("Anik@yahoo.ca");
		driver.findElement(By.id("AEM")).sendKeys("Anik@yahoo.ca");
		driver.findElement(By.id("PW")).sendKeys("Anik123");
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText("June");
		
		Select daySelect=new Select(driver.findElement(By.id("day")));
		daySelect.selectByVisibleText("10");
		
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		
	}
	
	

}
