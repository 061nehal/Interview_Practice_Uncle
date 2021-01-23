package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class howToFindBrokenLink {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		driver.get("https://www.facebook.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are  "+links.size());
		
		for (int i=0; i<links.size(); i=i+1) {
			String url=links.get(i).getAttribute("href");
			verifyActiveLink(url);
		}
		Thread.sleep(7000);
		driver.close();
		
	}
	public static void verifyActiveLink(String linkurl) throws Exception {
		
		try {
			URL url=new URL(linkurl);
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();
			huc.setConnectTimeout(3000);
			huc.connect();
			
			if(huc.getResponseCode()==200) {
				System.out.println(linkurl+"-------" +huc.getResponseMessage());
			}
			else if(huc.getResponseCode()==404) {
				System.out.println(linkurl+"----"+huc.getResponseMessage());
			}
			else if(huc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkurl+"----"+huc.getResponseMessage()+HttpURLConnection.HTTP_NOT_FOUND);
			}
			
			
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}

}
