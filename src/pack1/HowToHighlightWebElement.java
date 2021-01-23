package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HowToHighlightWebElement extends BaseClass {
	
	@Test
	public void HighlightWebElement() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		WebElement fname=driver.findElement(By.id("FN"));
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", fname);
	}

}
