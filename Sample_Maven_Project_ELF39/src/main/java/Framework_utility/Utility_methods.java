    package Framework_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_methods {
	public static void Enter_value_in_edit_field(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void Click_Element(WebElement element) {
		element.click();
	}
	public static void Select_Item_by_visible(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}
	public static void Select_Item_by_value(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void Select_Item_by_index(WebElement element,int value) {
		Select sel=new Select(element);
		sel.selectByIndex(value);
	}
	public static Actions Action(WebDriver driver) {
		Actions a=new Actions(driver);
		return a;
	}
	public static String Test_config() throws IOException {
	String filepath="./Test_configuration/TestConfiguration.properties";
	FileInputStream fis=new FileInputStream(filepath);
	
	Properties prop=new Properties();
	prop.load(fis);
	String url=prop.getProperty("URL");
	return url;
	}
	
	public static Object[][] getTestData(String Sheetname) throws IOException {
	String filepath="./TestData/TestData.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	
	Workbook book=new XSSFWorkbook(fis);
	
 Sheet sheet=book.getSheet(Sheetname);
 int row_count=sheet.getPhysicalNumberOfRows();
 int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
 System.out.println(row_count);
 System.out.println(col_count);

 Object[][] data=new Object[row_count-1][col_count];
 
  
	
		 
		for(int row=1;row<=row_count-1;row++) {	 
			 for(int col=0;col<=col_count-1;col++) {
				 data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
			
			 }
	
		 }
		book.close();
		return data;

	}
	}
