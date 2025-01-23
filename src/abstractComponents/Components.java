package abstractComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Components<XSSFWorkBook> {

	WebDriver driver;
	public Components(WebDriver driver){
		     
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public void jsScript() {
	 js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void scroolingDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
	}
	
	
	public void scrollTable() {
		 js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.sc-iOvDvc.fmGssh').scrollBy(0 , 700)");
	}
	public void webWait(WebElement finby) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(finby)).click();;
		
		
		
	}
	public  XSSFWorkbook writeADataintoexcel() throws FileNotFoundException  {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\umara\\Downloads\\writeStocktest.xls"));  
		//creating workbook instance that refers to .xls file  
		
			XSSFWorkbook wb = null;
			try {
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			wb.createSheet("writeData");
			return wb;
			
		
		 
		
	}
	
	// document.querySelector(".sc-iOvDvc.fmGssh").scrollDown = 2000
}
