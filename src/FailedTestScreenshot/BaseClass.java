package FailedTestScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	protected static WebDriver driver;
    @BeforeTest
    public void setUp() {

      // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
      // driver=new ChromeDriver();
        
       System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\Driver\\geckodriver.exe");
    	//WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");

    }

    @AfterTest
    public void teardown()  {

        driver.quit();

    }
    public void failed(String testName){
        File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir")+"\\ScreenShot\\"+testName+".png"));
        }catch (Exception e){
            e.printStackTrace();

        }
    }

}
