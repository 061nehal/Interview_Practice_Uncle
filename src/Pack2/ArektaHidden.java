package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArektaHidden {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.manage().window().maximize();
		
		List<WebElement> fn=driver.findElements(By.id("FN"));
		
		for(int i=0; i<fn.size(); i++) {
			
			int x=fn.get(i).getLocation().getX();
			
			if(x!=0) {
				fn.get(i).sendKeys("Nehal Hasnain Anik");
			}
		}
		
		List<WebElement>ml=driver.findElements(By.id("ml"));
		
		for(int i=0; i<ml.size(); i++) {
			
			int y=ml.get(i).getLocation().getX();
			
			if(y!=0) {
				ml.get(i).click();
			}
		}
		Thread.sleep(3000);
		driver.close();

	}

}
