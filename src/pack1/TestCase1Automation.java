package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1Automation extends BaseClass {
 
	
	
	@Test
	public void TestCase1() {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		String Expectedtitle="Super Tech IT Solution";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, Expectedtitle);
	}
}
