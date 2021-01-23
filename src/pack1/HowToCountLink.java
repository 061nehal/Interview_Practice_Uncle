package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HowToCountLink extends BaseClass {
	@Test
	public void LinkCounting() {
		//driver.get("file:///D:/ITTraining/OurWebSite.html");
		//driver.get("https://www.dsebd.org/");
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement>link=driver.findElements(By.tagName("a"));
		
		int totalLink=link.size();
		
		System.out.println("Total Links are : "+totalLink);
		
		for(int i=0; i<totalLink; i=i+1) {
			System.out.println(i+". "+link.get(i).getText()+"------"+link.get(i).getAttribute("href"));
			
			
		}
		
	}

	private int getAttribute(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
