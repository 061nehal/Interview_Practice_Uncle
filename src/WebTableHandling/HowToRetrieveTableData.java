package WebTableHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pack1.BaseClass;

public class HowToRetrieveTableData extends BaseClass{
	
	@Test
	public void WebDataHandling() throws IOException {
		driver.get("file:///D:/ITTraining/WebSite/table1.html");
		
		List<WebElement>rows=driver.findElements(By.xpath("html/body/table/tbody/tr"));
		int RowCount=rows.size();
		System.out.println("Total Row "+RowCount);
		
		List<WebElement>columns=driver.findElements(By.xpath("html/body/table/tbody/tr[1]/th"));
		int ColumnCount=columns.size();
		System.out.println("Total Column "+ColumnCount);
		
		FileOutputStream fos=new FileOutputStream("D:\\ITTraining\\WebData\\TableData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sheet=wb.createSheet("Data1");
		
		for(int i=1; i<=RowCount; i=i+1){
			XSSFRow row=sheet.createRow(i);  //row create
			for (int j=1; j<=ColumnCount; j=j+1) {
				if(i==1) { // this is for the table header
					WebElement value=driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/th["+j+"]"));
					String a=value.getText();
					System.out.println(a);
					XSSFCell ExcelCell=row.createCell(j); // cell create
					ExcelCell.setCellValue(a);
				}
				else { // this is for the data inside the table
					WebElement value=driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]"));
					String a=value.getText();
					System.out.println(a);
					XSSFCell ExcelCell=row.createCell(j);
					ExcelCell.setCellValue(a);
				}
			}
		}
		
		wb.write(fos);
		fos.flush();
		fos.close();
		
		
	}

}
