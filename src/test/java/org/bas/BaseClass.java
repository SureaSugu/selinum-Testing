package org.bas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

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
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();

	}
	public static void WindowMaximize() {
		driver.manage().window().maximize();

	}
	public static void launchUrl(String Url) { 
		driver.get(Url);

	}
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println("Title ; " + title);

	}
	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl ; " + currentUrl);

	}
	public static void passText(String txt ,WebElement f) {
	f.sendKeys(txt);	

	}
	public static void closeBrowser() {
		driver.quit();

	}
	public static void clickBtn(WebElement ele) {
			ele.click();

		}
	private void screenShot(String imgName) throws IOException {
	TakesScreenshot ts =  (TakesScreenshot)driver;
    File img = ts.getScreenshotAs(OutputType.FILE);
    File f = new File("location+ imagename.png");
    FileUtils.copyFile(img, f);
    
	}
	public static  Actions a;
	
	public static void moveTheCurrsor(WebElement targetWebElement) {
			a = new Actions (driver);
            a.moveToElement(targetWebElement).perform();
		}
	public static void dragDrop(WebElement dragWebElement, WebElement dropE1ement) {
		a = new Actions (driver);
		a.dragAndDrop(dragWebElement, dragWebElement).perform();

	}
	public static  JavascriptExecutor js;
		
		public static void scrollPage(WebElement tarWebele) {
		js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(true)",tarWebele);

	}
		public static void scroll(WebElement element) {
			js = (JavascriptExecutor)driver;
			js.executeAsyncScript("arguments[0].scrollIntoView(false)",element );
			
		}
		public static void excelRead(String sheetname, int rowNum,int cellNum) throws IOException {
			File f = new File("excelloctiojn");
            FileInputStream fis = new FileInputStream(f);
            Workbook wb = new XSSFWorkbook(fis);
            Sheet mysheet = wb.getSheet("data");
            Row r = mysheet.getRow(rowNum);
            Cell c = r.getCell(cellNum);
            int cellType = c.getCellType();
            
            String value = "";
            if (cellType==1) {
            	String value2 = c.getStringCellValue();
			}
            else if (DateUtil.isCellDateFormatted(c)) {
            	java.util.Date dd = c.getDateCellValue();
            	SimpleDateFormat sim = new SimpleDateFormat();
            	String value1 = sim.format(dd);
				
			}
            else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				String valueOf = String.valueOf(1);
            }
			}
    		public static void creatNewExcelFile( int rowNum,int cellNum,String WriteData) throws IOException {
    			File f = new File("excel location.xlsx");
                Workbook w = new XSSFWorkbook();
                Sheet newsheet = w.getSheet("data");
                Row newrow = newsheet.createRow(rowNum);
                Cell newcell = newrow.getCell(cellNum);
                newcell.setCellValue(WriteData);
                FileOutputStream fop = new FileOutputStream(f);
                w.write(fop);

	}
    		public static void creatCell(int getRow,int crtcell,String newData) throws IOException {
    			File f = new File("location");
    			FileInputStream fis = new FileInputStream(f);
    			Workbook wb = new XSSFWorkbook();
    			 Sheet newsheet = wb.getSheet("data");
    			    Row newr = newsheet.createRow(getRow);
    			    Cell newc = newr.createCell(crtcell);
    			    newc.setCellValue(newData);
    			    FileOutputStream fos = new FileOutputStream(f);
    			    wb.write(fos);
    		}
    		public static void creatRow(int getRow,int crtcell,String newData) throws IOException {
    			File f = new File("location");
    			FileInputStream fis = new FileInputStream(f);
    			Workbook wb = new XSSFWorkbook();
    			 Sheet newsheet = wb.getSheet("data");
    			    Row newr = newsheet.createRow(getRow);
    			    Cell newc = newr.createCell(crtcell);
    			    newc.setCellValue(newData);
    			    FileOutputStream fos = new FileOutputStream(f);
    			    wb.write(fos);


			}
    		public static void updateData(int getr,int getcell, String existingcell, String writeNewdata) throws IOException {
    			File f = new File("location");
    			FileInputStream fis = new FileInputStream(f);
    			Workbook wb = new XSSFWorkbook();
    			 Sheet newsheet = wb.getSheet("data");
 			    Row newr = newsheet.createRow(getr);
 			    Cell newc = newr.createCell(getcell);
 			    String str = newc.getStringCellValue();
 			    if (str.equals(existingcell)) {
					newc.setCellValue(writeNewdata);
				}
 			    FileOutputStream fos = new FileOutputStream(f);
                wb.write(fos);    			
    			
							}
    		public static void sleep(int value) throws InterruptedException { 
    			Thread.sleep(value);
    			
    		}
}

