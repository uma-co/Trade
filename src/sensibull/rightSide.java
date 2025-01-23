package sensibull;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import abstractComponents.Components;

public class rightSide extends Components {
WebDriver driver;
	public rightSide(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this );
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@color='successText']")
	private WebElement maxProfit;
	@FindBy(xpath="//div[@color='errorText']")
	private WebElement maxLoss;
	////div[@class='sc-bHKNvF bAGSCD grid-item-breakeven']//p[@class='sc-kMOkjD eBLnkp']
	@FindBy(css="div[class='sc-gYhigD GRTfA grid-item-breakeven'] p[class='sc-kiYtDG dwWFOe']")
	private WebElement breakEven;
	@FindBy(xpath="//div//div[@class='sc-bHKNvF jAXKJE']//div[@class='sc-bHKNvF pjAYO']/p[@class='sc-kMOkjD fLfNCO']")
	 List<WebElement> sixElements;
	@FindBy(xpath="//button[text()='Payoff Table']")
	WebElement payOffTable;
	@FindBy(xpath="//div[@id='radix-219-content-payoffTable']")
	WebElement TableContent;
	@FindBy(xpath="//th")
	WebElement Theader;
	@FindBy(xpath="//tr")
   WebElement Trow;	
	@FindBy(xpath="//tr//div[@class='sc-bHKNvF bplych']/p")
	List<WebElement> Target;
	@FindBy(xpath="/div[@id='radix-564-content-payoffTable']//table//th//p")
	List<WebElement> header;
	@FindBy(xpath="//div[@id='radix-564-content-payoffTable']//table//tr//td//div//p")
	List<WebElement> TableCell;
	@FindBy(xpath="//div[@class='secondary-summary']//div[1]//div[2]//p[1]")
	WebElement FundsNeed;
	@FindBy(xpath="//div[@class='secondary-summary']//div[1]//div[2]//p[1]")
	WebElement marginNeeded;
	
	public void tHeader() {
		
		scroolingDown();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> elements = wait.until(
//		    ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/div[@id='radix-564-content-payoffTable']//table//th//p"))
//		);
		
		for(int i = 0 ; i < header.size() ; i++ ) {
			System.out.println(header.get(i).getText());
		}
	}
	
	public void tableCode() throws FileNotFoundException {
		 // Locate the table
        WebElement table = driver.findElement(By.xpath("//table[@class='sc-PfnZo ipbFpb']"));

        // Locate all rows in the table body
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        // Specify the column index (1-based index, e.g., 1 for the first column)
        int columnIndex = 1; // Replace with the desired column index (e.g., 2 for the second column)

        System.out.println("Data from column " + columnIndex + ":");
        int n=0;
       for(int i = 0 ; i < rows.size(); i++) {
    	   
    	String row =   rows.get(i).getText();
//    	XSSFWorkbook sheet = writeADataintoexcel();
//    	 XSSFSheet sheets =  sheet.createSheet();
//    	XSSFRow row1 = sheets.createRow(i);
    	 
    	
    	System.out.println("row :" + n++);
    	System.out.println(row);
//    	for(int j = 0 ; j < rows.size(); j++) {
//    	XSSFCell cell =	row1.createCell(j);
//    	cell.setCellValue(row[i][j]);
    		
    	}}
    //	WebElement cell= row.findElement(By.xpath("./td[" + columnIndex + "]"));
// System.out.println(cell.getText());
    
       
//        for (WebElement row : rows) {
//            // Extract the cell in the specified column
//        	row.findElements(By.xpath(null))
//            WebElement cell = row.findElement(By.xpath("./td[" + columnIndex + "]"));
//            String cellData = cell.getText();
//           
//            // Print the extracted data
//            System.out.println(cellData);
//        }
	
	
	public void predictionValues() {
	
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> elements = wait.until(
//		    ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='radix-564-content-payoffTable']//table//tr//td//div//p"))
//		);
		List<WebElement> targetcol = driver.findElements(By.xpath("//div[@id='radix-564-content-payoffTable']//table//tr//td//div[@class='sc-DJfgX enJvPd']"));
		for(int i = 0 ; i < targetcol.size() ; i++) {
		String col1 =	driver.findElements(By.cssSelector("tbody tr:nth-child("+i+") td:nth-child(1) div:nth-child(1) p:nth-child(1)")).get(i).getText();
		System.out.println(col1);
		}
//		for(int i = 0 ; i < TableCell.size() ; i++) {
//			TableCell.get(i).getText();
//		}
	}
	public void target() {
		System.out.println(Target.size());
		for (WebElement button : Target) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            // Perform actions like clicking the button
            jsExecutor.executeScript("arguments[0].click();", button);
            System.out.println("Clicked button: " + button.getText());
        }

		for(int i = 1 ; i < Target.size(); i++ ) {
		String t_value = Target.get(i).getText();
		System.out.println(t_value);
		}
	}
	
	public void maxprof() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to click the element
   System.out.println("Maximum_Profit : " +jsExecutor.executeScript("return arguments[0].innerText;", maxProfit));
		// System.out.println(maxProfit.getText());
   
	}
	public void fundsNeeded() {
	   System.out.println("FundsNeeded "+ FundsNeed.getText());
	}
	public void marginNeeded() {
	System.out.println("MarginNeeded " + marginNeeded.getText());	
	}
	public void allRounder() {
		for(int k=0 ; k < driver.findElements(By.xpath("(//div[@class='sc-gYhigD edTsfv'])[2]//div[@class='sc-gYhigD kFhtfF']//p[@class='sc-kiYtDG hvJrUG']")).size() ; k++ ) {
			String vales =  driver.findElements(By.xpath("(//div[@class='sc-gYhigD edTsfv'])[2]//div[@class='sc-gYhigD kFhtfF']//p[@class='sc-kiYtDG hvJrUG']")).get(k).getText();
		System.out.println("FundsNeeded , Margin Value , Margin Available:" +vales);
		}
		
	}
	public void maxlos() {
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to click the element
   System.out.println("Maximum_Loss : " + jsExecutor.executeScript("return arguments[0].innerText;", maxLoss));
		// System.out.println(maxProfit.getText());
//	System.out.println(maxLoss.getText());	
	}
	public void breakEve() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 System.out.println("BreakEven : " +jsExecutor.executeScript("return arguments[0].innerText;", breakEven));
//	System.out.println(breakEven.getText());
	}
	public void getAllFundValues() {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		}
		catch(Exception e) {
			
		}
	
		finally {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		for(int i = 0 ; i < sixElements.size(); i++ ) {
		WebElement val = 	driver.findElement(By.xpath("//p[contains(text(),'"+sixElements.get(i).getText()+"')]"));
//		 Object funds = 	jsExecutor.executeScript(
//	                "return arguments[0].querySelector('div[class='sc-bHKNvF jAXKJE'] div[class='sc-bHKNvF pjAYO'] p[class='sc-kMOkjD fLfNCO']').innerText;", sixElements.get(i).getText()
//	            );
//		
//					String fundval = sixElements.get(i).getText();
		System.out.println(val.getText());
		}
		}
	}
	public void payoffButton() {
		payOffTable.click();
	}
	public void TableContent() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		System.out.println( jsExecutor.executeScript("arguments[0].click();", TableContent));
		}
	
	
	

	

}
