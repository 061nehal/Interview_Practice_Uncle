3package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class HowToUseDifferentTypeXpath extends BaseClass {
	
	@Test
	public void UsingXpath() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		//Using Basic Absolute Xpath
		//driver.findElement(By.xpath("html/body/input[3]")).sendKeys("Hasnain");
		
		//Using Basic Relative Xpath
		driver.findElement(By.xpath("//*[@id='LN']")).sendKeys("Hasnain");
		
		//Using Contains Function
		driver.findElement(By.xpath("//*[contains(@class, 'Email')]")).sendKeys("abc@gmail.com");
		
		//Using Starts With Function
		driver.findElement(By.xpath("//*[starts-with(@name,'Again')]")).sendKeys("abc@gmail.com");
		
		//Using Contains Text Function
				WebElement text1=driver.findElement(By.xpath("//*[contains(text(),'Websi')]"));
				System.out.println("Text is "+text1.getText() );
		
		//Using starts-with Text Function
		WebElement text2=driver.findElement(By.xpath("//*[starts-with(text(),'dev')]"));
		System.out.println("Text is "+text2.getText() );
	}

}
