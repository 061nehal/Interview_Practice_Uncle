package practicePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class XpathPractice extends BaseClass {
	
	@Test
	public void VariousTypesofXpath() {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		//driver.get("https://www.google.com/webhp?source=search_app");
		driver.switchTo().frame(0);
		
		//Absolute  Xpath
		driver.findElement(By.xpath("html/body/center/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Nehal");
		  //driver.findElement(By.xpath("//table[@width='450px']/tbody/tr[1]/td[2]/input")).sendKeys("Nehal");
		//driver.findElement(By.xpath("//div[@id='gbw']/div/div/div[1]/div[2]/a")).click();
 		//Relative Xpath
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("Hasnain");
		
		//Contains Function
		driver.findElement(By.xpath("//*[contains(@name,'pass')]")).sendKeys("abcd1234");
		
		//Starts With Function
		driver.findElement(By.xpath("//*[starts-with(@name,'email')]")).sendKeys("abcd@gmail.com");
		
		//Contains Text Function
		WebElement text1=driver.findElement(By.xpath("//*[contains(text(),'Form')]"));
		System.out.println("The text is  "+text1.getText());
		System.out.println(driver.findElement(By.xpath("")));
		
		//Starts With Text Function
		WebElement text2=driver.findElement(By.xpath("//*[starts-with(text(),'Comments')]"));
		System.out.println("The word is  "+text2.getText());
	}

}
