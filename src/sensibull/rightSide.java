package sensibull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
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

import com.google.common.collect.Table.Cell;

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
	@FindBy(css="div[class='sc-gYhigD GRTfA grid-item-breakeven'] p[class='sc-kiYtDG fTPBtB']")
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
	private double multipliedValue;
	
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
//	public void gcode() {
//		
//try {
//		            // Locate the table
//		            WebElement table = driver.findElement(By.xpath("//table[@class='sc-fnMOsY knLpSq']"));
//
//		            // Get all rows (including <tr>)
//		            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
//
//		            // Create a new workbook and sheet
//		        //    FileInputStream fis = new FileInputStream(new File("C:\\Users\\umara\\Downloads\\images"));
//		            HSSFWorkbook workbook = new HSSFWorkbook();
//		            HSSFSheet sheet = workbook.createSheet("Table Data");
//
//		            // Loop through rows
//		            for (int i = 0; i < rows.size(); i++) {
//		                // Create a new row in the Excel sheet
//		                HSSFRow excelRow = sheet.createRow(i);
//
//		                // Get all columns (<td>) in the current row
//		                List<WebElement> columns = rows.get(i).findElements(By.xpath(".//td"));
//
//		                // Loop through columns and write data to Excel
//		                for (int j = 0; j < columns.size(); j++) {
//		                    String cellData = columns.get(j).getText();
//
//		                    // Create a new cell in the Excel sheet
//		                    HSSFCell cell = excelRow.createCell(j);
//		                    cell.setCellValue(cellData);
//		                }
//		            }
//
//		            // Write the data to an Excel file
//		            FileOutputStream fileOut = new FileOutputStream("TC:\\Users\\umara\\Downloads\\images\\tableData.xls");
//		            workbook.write(fileOut);
//		            fileOut.close();
//		            workbook.close();
//
//		            System.out.println("Table data has been written to 'TableData.xlsx' successfully!");
//
//		        } catch (Exception e) {
//		            e.printStackTrace();
//		        } finally {
//		            // Close the browser
//		            driver.quit();
//		        }
//		    }
		

	
	
	public void tableCode(String stock ,  HSSFWorkbook workbook , HSSFSheet HSSFSheet)  {
		 // Locate the table
		//table[@class="sc-imdvxF jMiBVC"]//tr
//		String row = null;
//		Thread.sleep(2000);
        WebElement table = driver.findElement(By.xpath("//table"));

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
       
       
       }
    	//   FileInputStream fis = new FileInputStream(new File("C:\\Users\\umara\\Downloads\\images\\tableData.xls"));
      // HSSFWorkbook workbook = new HSSFWorkbook();
      

       // Loop through rows
       for (int i= 0; i < rows.size(); i++) {
    	   //this line need to be modified , either give stock else do some modification in the parameter,
    	//   HSSFSheet sheet = workbook.createSheet("sheet1");
      
     
//    	   HSSFSheet sheet = workbook.createSheet(stock);
//           HSSFRow excelRow = sheet.createRow(k);
    	   HSSFRow excelRow = HSSFSheet.createRow(i);
    	 
    	//   List<WebElement> header =  driver.findElements(By.xpath(".//th"));
    	   
           List<WebElement> columns = rows.get(i).findElements(By.xpath(".//td"));
           
          
           for (int j = 0; j < columns.size(); j++) {
        	  
//        	   if (sheet == null) {
//        	        // If the sheet doesn't exist, create a new one
//        	        sheet = workbook.createSheet(stock);
//        	    } else {
//        	        // Handle duplicate sheet names by appending a unique suffix
//        	        int counter = 1;
//        	        while (workbook.getSheet(stock + "_" + counter) != null) {
//        	            counter++;
//        	        }
//        	        sheet = workbook.createSheet(stock + "_" + counter);
//        	    }
        	   
               String cellData = columns.get(j).getText();

             
               HSSFCell cell = excelRow.createCell(j);
            //   cell.setCellValue(header.get(i).getText());
               cell.setCellValue(cellData);
           
           }
           }
       }
     
     
//    	for(int j = 0 ; j < rows.size(); j++) {
//    	XSSFCell cell =	row1.createCell(j);
//    	cell.setCellValue(row[i][j]);
    	//	return row;
    	
//	return row;}
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
	
	public String maxprof() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
     Object prof = jsExecutor.executeScript("return arguments[0].innerText;", maxProfit);
        // Execute JavaScript to click the element
     
          String out = ((String) prof).replace("L", "00000"); 
          return out;
   //  System.out.println("MaximumProfit :" + out );
  // System.out.print("  Maximum_Profit : " +jsExecutor.executeScript("return arguments[0].innerText;", maxProfit));
		// System.out.println(maxProfit.getText());
//   String out = vales.replace("L", "00000"); 
     
	}
	public void fundsNeeded() {
	   System.out.println("FundsNeeded "+ FundsNeed.getText());
	}
	public void marginNeeded() {
	System.out.println("MarginNeeded " + marginNeeded.getText());	
	}
	public double marginrequired() {
		   double multipliedValue = 0 ;
		  
		   String output = null;
		for(int k=0 ; k < driver.findElements(By.xpath("(//div[@class='sc-gYhigD edTsfv'])[2]//div[@class='sc-gYhigD kFhtfF']//p[@class='sc-kiYtDG hvJrUG']")).size() ; k++ ) {
			String vales =  driver.findElements(By.xpath("(//div[@class='sc-gYhigD edTsfv'])[2]//div[@class='sc-gYhigD kFhtfF']//p[@class='sc-kiYtDG hvJrUG']")).get(1).getText();
			// Margin_Required = vales.replace("L", "00000");
			 

			    // Check if the value contains numeric characters or "L" before performing operations
//			   if(vales.contains("L")) {
			 String numericPart = ((String) vales).replaceAll("[^0-9.-L]", ""); // Remove non-numeric characters except '-' and '.'
			   numericPart = numericPart.split("L")[0]; 
			   double value = Double.parseDouble(numericPart); // Convert to double

			   // Step 2: Multiply the numeric value by 100000
			    multipliedValue = value * 100000;

			   // Step 3: Replace "L" with the computed value
			   output = ((String) vales).replace("L", String.valueOf((int) multipliedValue)); 
			  
				
			//System.out.println(Margin_Required);
		
		return multipliedValue;
			   }
//			   else {
//				  System.out.println(vales);
//		          return Long.parseLong(String.valueOf(vales)); // Return the original value as a double			   }
//		
//		}
		
		
		return multipliedValue;
	}
		
	
	
	
		
		
	public void allRounder() {
		for(int k=0 ; k < driver.findElements(By.xpath("(//div[@class='sc-gYhigD edTsfv'])[2]//div[@class='sc-gYhigD kFhtfF']//p[@class='sc-kiYtDG hvJrUG']")).size() ; k++ ) {
			String vales =  driver.findElements(By.xpath("(//div[@class='sc-gYhigD edTsfv'])[2]//div[@class='sc-gYhigD kFhtfF']//p[@class='sc-kiYtDG hvJrUG']")).get(0).getText();
			// String numericPart = ((String) vales).replaceAll("[^0-9.]", ""); // Remove non-numeric characters except '-' and '.'
			String vales1 =  driver.findElements(By.xpath("(//div[@class='sc-gYhigD edTsfv'])[2]//div[@class='sc-gYhigD kFhtfF']//p[@class='sc-kiYtDG hvJrUG']")).get(1).getText();
			String vales2 =  driver.findElements(By.xpath("(//div[@class='sc-gYhigD edTsfv'])[2]//div[@class='sc-gYhigD kFhtfF']//p[@class='sc-kiYtDG hvJrUG']")).get(2).getText();
			String FundsNeeded = vales.replace("L", "00000"); 
			String Margin_Required = vales1.replace("L", "00000");
			String Margin_Available =  vales2.replace("L", "00000");
//			String numericPart =  vales.replaceAll("[^0-9.]", ""); // Remove non-numeric characters except '-' and '.'
//			 //  numericPart = numericPart.split("L")[0];
//			 System.out.print("n"+numericPart);
//			 double value = Double.parseDouble(numericPart); // Convert to double
//
//			   // Step 2: Multiply the numeric value by 100000
//			   double multipliedValue = value * 100000;
//
//			   // Step 3: Replace "L" with the computed value
//			   String output =  vales.replace("L", String.valueOf((int) multipliedValue)); 
System.out.println("FundsNeeded" + FundsNeeded);
System.out.println("Margin_Required" + Margin_Required);
System.out.println("Margin_Available" + Margin_Available);
		}
		
	}
	public Object maxlos() {
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to click the element
	 Object val =	jsExecutor.executeScript("return arguments[0].innerText;", maxLoss);
 //  System.out.print("   Maximum_Loss : " + jsExecutor.executeScript("return arguments[0].innerText;", maxLoss));
	//String maximumLoss =  (( String )val).replace("L", "00000");
  
	 String valString = (String) val;

	    // Check if the value contains numeric characters or "L" before performing operations
	    if (valString.matches(".*[0-9L].*")) {
	//System.out.print("massLos : " + (( String )val).replace("L", "00000") ); 
 
   String numericPart = ((String) val).replaceAll("[^0-9.\\-L]", ""); 
   // Remove non-numeric characters except '-' and '.'
   
  numericPart = numericPart.split("L")[0]; 
   double value = Double.parseDouble(numericPart); // Convert to double

   // Step 2: Multiply the numeric value by 100000
   double multipliedValue = value * 100000;

   // Step 3: Replace "L" with the computed value
  // String output = ((String)val ).replace("L", String.valueOf((int) multipliedValue)); 
   
	return 	multipliedValue;
	    }
	    else {
	    	  String out = ((String) val).replace("L", "00000"); 
	    	return out;
	    }
	
	
	}
	public  String breakEve() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		  Object br =  jsExecutor.executeScript("return arguments[0].innerText;", breakEven);
		  String out = ((String) br).replace("L", "00000");  
		return out;
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
