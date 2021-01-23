package WebTableHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWebTablePractice {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("file:///D:/ITTraining/WebSite/table1.html");
		
		int rowCount=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		
		int colCount=driver.findElements(By.xpath("html/body/tbale/tbody/tr[1]/th")).size();
		
		FileOutputStream fos=new FileOutputStream("D:\\ITTraining\\WebData\\TableData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.createSheet("PracticeSheet");
		
		for (int i=1; i<=rowCount; i++) {
			XSSFRow rows=ws.createRow(i);
			
			for(int j=1; j<= colCount; j++) {
				
				if(i==1) {
					
					String headerText=driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/th["+j+"]")).getText();
					XSSFCell cellValue=rows.createCell(j);
					cellValue.setCellValue(headerText);
				}
				else {
					String columnValue=driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					XSSFCell cellValue=rows.createCell(j);
					cellValue.setCellValue(columnValue);
				}
			}
			
		}
		
		wb.write(fos);
		fos.flush();
		fos.close();
		
		
		
		
		
		
		
	}

}
