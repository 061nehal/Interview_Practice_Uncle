package pack1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowToGetText extends BaseClass{
	
	
	@Test
	public void GetText() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		String scrollText=driver.findElement(By.xpath("/html/body/marquee/font/h1")).getText();
		
		System.out.println("Scroll Text is : "+scrollText);
	}
	
	

}
