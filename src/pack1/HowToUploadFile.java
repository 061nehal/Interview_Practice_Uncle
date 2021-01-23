package pack1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowToUploadFile extends BaseClass {
	
	@Test 
	public void FileUpload () throws InterruptedException {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		//driver.findElement(By.xpath("/html/body/input[8]")).click();
		driver.findElement(By.xpath("/html/body/input[8]")).sendKeys("D:\\ITTraining\\Java (BASIC).docx");
		Thread.sleep(3000);
		
	}

}
