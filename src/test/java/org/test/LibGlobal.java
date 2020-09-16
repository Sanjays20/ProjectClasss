package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {

	public static WebDriver driver;
	

	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANJAY\\eclipse-workspace\\Pom10.30am\\drivers\\chromedriver.exe");

		driver=new ChromeDriver();
		
		return driver;
	}
	
	public static void loadUrl(String url) {
		
		driver.get(url);
	}
	public static void pageTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void pageUrl() {
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	
	public static void maxWindow() {
		
		driver.manage().window().maximize();

	}
	
	public static void window() {
		
		String pWid = driver.getWindowHandle();
		System.out.println(pWid);
	}
	
	public static void type(WebElement element,String data) {
		
		element.sendKeys(data);

	}
	
	public static void btnClick(WebElement element) {
		
		element.click();

	}
	
	public static void SelectIndex(WebElement element,Integer value) {
		
		Select s=new Select(element);
		s.selectByIndex(value);
	
	}
	
	public static void SelectValue(WebElement element,String data) {
		
		Select s=new Select(element);
		s.selectByValue(data);

	}
	
	public static void SelectText(WebElement element,String text) {
		
		Select s=new Select(element);
		s.selectByVisibleText(text);

	}
	
    public static String excelread(int rowNo,int cellNo) throws IOException {
		
    	File f=new File("C:\\Users\\SANJAY\\eclipse-workspace\\TestNG12.30\\XcelSheets\\Sample_datas.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Myinput");
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		int cellType = c.getCellType();
		
		String value="";
		
		if (cellType==1) {					
					 
			value = c.getStringCellValue();
			
					
		} else if (DateUtil.isCellDateFormatted(c)) {
					
			Date d = c.getDateCellValue();
					
			SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
					
			value = sim.format(d);
			
			
		} 
				
		else {
			
			double d = c.getNumericCellValue();
					
			long l=(long) d;
					
			value = String.valueOf(l);
	
			}
		
		return value;
		
		}
    
    public static void excelwrite(int rowNO,int cellNo,String data) throws IOException {
		
		File f=new File("C:\\Users\\SANJAY\\eclipse-workspace\\TestNG12.30\\XcelSheets\\Sample_datas.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Myinput");
		
		Row r = s.getRow(rowNO);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(data);
		
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);

    	}
    
    public static void excelupdate(int rowNo,int cellNo,String original,String data) throws IOException {
		// TODO Auto-generated method stub
    	
    	File f=new File("C:\\Users\\SANJAY\\eclipse-workspace\\TestNG12.30\\XcelSheets\\Sample_datas.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Myinput");
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		String value=c.getStringCellValue();
		
		if(value.equals(original)) {
			
			c.setCellValue(data);
		}
		
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
    }
    
    //public static void quitBrowser() {
		
		//driver.quit();

	//}
	
	public static void Scroll(WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("argumrnts[0].scrollIntoView(true)", element);
		
		js.executeScript("argumrnts[0].scrollIntoView(false)", element);

	}
	
	
	public static void text(WebElement element) {
		
		String text = element.getAttribute("value");
		System.out.println(text);

	}
	
	public static void Screenshot() throws IOException {
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		
		File ss = tk.getScreenshotAs(OutputType.FILE);

		File dd=new File("D:\\out.png");
		FileUtils.copyFile(ss, dd);
		
	}
}
