package pack1;


import org.testng.annotations.Test;

public class HowToGetTitleAndUrlAndPageSource extends BaseClass {
	
	
	
	@Test
	public void getTitle() {
		
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		String titl=driver.getTitle();
		
		System.out.println("Title is : "+titl);
		
	}
	@Test
	public void getCurrentUrl() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
	
		String cUrl=driver.getCurrentUrl();
		
		System.out.println("Current Url is : "+cUrl);
	}
	@Test
	public void getPageSource() {
		driver.get("https://accounts.pch.com/register");
	
		String PSource=driver.getPageSource();
		
		System.out.println("Page Source is : "+PSource);
	}
	
	
	

}
