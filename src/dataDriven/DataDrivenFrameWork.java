package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class DataDrivenFrameWork extends BaseClass{
	
	@Test(dataProvider = "OurwebsiteData")
	public static  void OurWebSite(String Fname, String Lname, String Email, String AEmail,String pass, 
			String Month, String Day, String Year , String Gender ) {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		driver.findElement(By.id("FN")).sendKeys(Fname);
		driver.findElement(By.id("LN")).sendKeys(Lname);
		driver.findElement(By.id("EM")).sendKeys(Email);
		driver.findElement(By.id("AEM")).sendKeys(AEmail);
		driver.findElement(By.id("PW")).sendKeys(pass);
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText(Month);
		
		Select daySelect=new Select(driver.findElement(By.id("day")));
		daySelect.selectByVisibleText(Day);
		
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText(Year);
		
		if(Gender.equalsIgnoreCase("Male")) {
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		}
		else if(Gender.equalsIgnoreCase("Female")) {
			driver.findElement(By.xpath("/html/body/input[7]")).click();
		}
		
	}
	
	@DataProvider(name="OurwebsiteData")
	public Object[][] getData(){
		
		return new Object[][] {
			{"Anik", "Hasnain","nehal@gmai.com", "nehal@gmail.com", "nehal123", "June", "10", "1991", "Male"},
			{"Shemonty", "Hasan", "hasan@gmail.com", "hasnain@gmail.com", "hasan123", "July", "12", "1992", "Female"},
			{"Anik", "Hasnain","nehal@gmai.com", "nehal@gmail.com", "nehal123", "June", "10", "1991", "Male"},
			{"Shemonty", "Hasan", "hasan@gmail.com", "hasnain@gmail.com", "hasan123", "July", "12", "1992", "Female"},
			{"Anik", "Hasnain","nehal@gmai.com", "nehal@gmail.com", "nehal123", "June", "10", "1991", "Male"},
			{"Shemonty", "Hasan", "hasan@gmail.com", "hasnain@gmail.com", "hasan123", "July", "12", "1992", "Female"},
			{"Anik", "Hasnain","nehal@gmai.com", "nehal@gmail.com", "nehal123", "June", "10", "1991", "Male"},
			{"Amit", "Hasnain", "amit@gmail.com", "amit@gmail.com", "hasan123", "July", "12", "1992", "Male"}
		};
		
	}

}
