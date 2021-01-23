package Pack2;

import org.testng.Assert;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class TitleVerificationTestCasePractice extends BaseClass{
	
	@Test
	public void TitleVerification() {
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		System.out.println(driver.getTitle());
		String expectedTitle="Super Tech IT Solution";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
