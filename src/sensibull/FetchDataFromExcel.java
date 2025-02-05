package sensibull;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import abstractComponents.Components;
import pageObjects.FutPage;
import pageObjects.LoginPage;
import pageObjects.StrategyPage;
import pageObjects.atTheMoney;
import utility.baseClass;

	
	import java.io.File;  
	import java.io.FileInputStream;  
	import java.io.FileOutputStream; 
	import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;

import org.apache.poi.hssf.usermodel.HSSFSheet;  
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
	import org.apache.poi.ss.usermodel.Cell;  
	import org.apache.poi.ss.usermodel.FormulaEvaluator;  
	import org.apache.poi.ss.usermodel.Row;  


	class Stock  {
	  //  public String stock;
	    public double roundoff;
	    public double strike;
	    public double atm;
	    public String atmoption;
	    public String ls1;
	    public String ls2;
	    public String ls3;
	    public String ls4;
	    public String ls5;
	    public String ls6;
	    public String ls7;
	    public String ls8;
	    public String ls9;
	    public String ls10;
	    public String us1;
	    public String us2;
	    public String us3;
	    public String us4;
	    public String us5;
	    public String us6;
	    public String us7;
	    public String us8;
	    public String us9;
	    public String us10;
	    public String cmf;
	    public String nmf;
	    public double margin;
	    public double profit;
	    public double loss;
	    public double breakeven;
	    
	   
	    
	 public  Stock(
	    	    String stock,
	    	    double roundoff,
	    	    
	    	    String atmoption,
	    	    String ls1,
	    	    String ls2,
	    	    String ls3,
	    	    String ls4,
	    	    String ls5,
	    	    String ls6,
	    	    String ls7,
	    	    String ls8,
	    	    String ls9,
	    	    String ls10,
	    	    String us1,
	    	    String us2,
	    	    String us3,
	    	    String us4,
	    	    String us5,
	    	    String us6,
	    	    String us7,
	    	    String us8,
	    	    String us9,
	    	    String us10,
	    	    String cmf,
	    	    String nmf,
	    	    double strike,
	    	    double atm,
	    	    double margin,
	    	    double profit,
	    	    double loss,
	    	    double breakeven
	    		)
	    {
	       // this.stock = stock;
		    this.roundoff = roundoff;
		    this.strike = strike;
		    this.atm = atm;
		    this.atmoption = atmoption;
		    this.ls1 = ls1;
		    this.ls2 = ls2;
		    this.ls3 = ls3;
		    this.ls4 = ls4;
		    		this.ls5 = ls5;
		    				this.ls6 = ls6;
		    				this.ls7 = ls7;
		    				this.ls8 = ls8;
		    				this.ls9 = ls9;
		    				this.ls10 = ls10;
		    				this.us1 = us1;
		    				this.us2 = us2;
		    				this.us3 = us3;
		    				this.us4 = us4;
		    				this.us5 = us5;
		    				this.us6 = us6;
		    				this.us7 = us7;
		    				this.us8 = us8;
		    				this.us9 = us9;
		    				this.us10 = us10;
		    				this.cmf = cmf;
		    				this.nmf = nmf;
		    				this.margin = margin;
		    				this.profit = profit;
		    				this.loss = loss;
		    				this.breakeven = breakeven;
	    }
	}


	public class FetchDataFromExcel extends baseClass {
		
//		public  static void payoffTableLoadingSheet() throws IOException, InterruptedException {
//			rightSide rightSide = new rightSide(driver);
//			 
//			FileInputStream fis = new FileInputStream(new File("C:\\Users\\umara\\Downloads\\Stocktest.xlsx"));  
////			//creating workbook instance that refers to .xls file  
//		HSSFWorkbook wb1 =new HSSFWorkbook(fis);  
////			HSSFSheet sheet=wb.getSheetAt(0);
//			HSSFSheet sheet2 =	wb1.createSheet("newsheet");
//			for(int t = 1 ; t < sheet2.getLastRowNum() ; t++) {
//			Row roww =	sheet2.getRow(t);
//				if(roww == null) {
//				Row row1 =	sheet2.createRow(t);
//				row1.createCell(t).setCellValue(rightSide.tableCode());
//				 fis.close();
//
//		         FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\umara\\Downloads\\Stocktest.xlsx"));
//		         wb1.write(outFile);
//		         outFile.close();
//				}
//			}
//		}
		
//		public static int getprofitcolumn() throws IOException {
//			FileInputStream fis = new FileInputStream(new File("C:\\Users\\umara\\Downloads\\Stocktest.xlsx"));  
//			//creating workbook instance that refers to .xls file  
//			HSSFWorkbook wb=new HSSFWorkbook(fis);  
//			HSSFSheet sheet=wb.getSheetAt(0);
//			Iterator<Row> s = sheet.iterator();
//			
//			Row firstrow =	s.next();
//		Iterator<Cell> cc = 	firstrow.cellIterator();
//		
//		
//		int column2 =0;
//		int column3 =0;
//		int column4 =0;
//		int column5 =0;
//		int column6 =0;
//		int d =0;
//		while(cc.hasNext()) {
//			if(cc.next().getStringCellValue().equalsIgnoreCase(("profit"))) {
//				 column2 = d;
//			
//		}
//		}
//		
//			return column2;
//		}

		 public static boolean settflag = true;
		public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {

			String stock = null;
		    double roundoff = 0;
		    double strike = 0;
		    double atm = 0;
		    String atmoption = null;
		    String ls1 = null;
		    String ls2 = null;
		    String ls3 = null;
		    String ls4 = null;
		    String ls5 = null;
		    String ls6 = null;
		    String ls7 = null;
		    String ls8 = null;
		    String ls9 = null;
		    String ls10 = null;
		    String us1 = null;
		    String us2 = null;
		    String us3 = null;
		    String us4 = null;
		    String us5 = null;
		    String us6 = null;
		    String us7 = null;
		    String us8 = null;
		    String us9 = null;
		    String us10 = null;
		    String cmf = null;
		    String nmf = null;
		    double margin = 0;
		    double profit = 0;
		    double loss = 0;
		    double breakeven = 0;
			int i = 0,n = 0;
			boolean firstline = false ;
			
			StrategyPage sp = new StrategyPage(driver);
			Components Components = new Components(driver);
			atTheMoney atTheMoney = new atTheMoney(driver);
			String centralAmount; 
			String fileName = "C:\\Users\\umara\\Videos\\Stocktest (2) (3).xls";
		       
	/// determine ATM by passing strike and round off

		       
		      
		       
		       Stock[] arr;
		       arr = new Stock[50];
		       
		       
		      // System.out.print(atm + "\t\t"); 
		       
			//obtaining input bytes from a file  
			FileInputStream fis = new FileInputStream(new File(fileName));  
			//creating workbook instance that refers to .xls file  
			HSSFWorkbook wb=new HSSFWorkbook(fis); 
			HSSFSheet sheet=wb.getSheetAt(0);
			//creating a Sheet object to retrieve the object  
		//	 sheet=wb.getSheetAt(0);	
			
			
			
			
	FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator(); 
			
			for(Row row: sheet)     //iteration over row using for each loop  
			{  
				if (firstline == false )
						{firstline = true;
						continue;
						}
				i = 0;
			for(Cell cell: row)    //iteration over cell using for each loop  
			{  
				i = i + 1;
//			switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
//			{  
//			case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
//			//getting the value of the cell as a number  
//			System.out.print(cell.getNumericCellValue()+ "\t\t");  
//			
//			 
//			case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
			//getting the value of the cell as a string  
			  
			switch(i)
			{
			case 1:
			stock = cell.getStringCellValue();
			break;
			case 2:
				roundoff =  (long) cell.getNumericCellValue();
				break;
			
		
			
			case 3:
			atmoption = cell.getStringCellValue();
			break;
			
			case 4:
			ls1 = cell.getStringCellValue();
			break;
			
			case 5:
			ls2 = cell.getStringCellValue();
			break;
			
			case 6:
			ls3 = cell.getStringCellValue();
			break;
			
			case 7:
			ls4 = cell.getStringCellValue();
			break;
			
			case 8:
			ls5 = cell.getStringCellValue();
			break;
			
			case 9:
			ls6 = cell.getStringCellValue();
			break;
			
			case 10:
			ls7 = cell.getStringCellValue();
			break;
			
			case 11:
			ls8 = cell.getStringCellValue();
			break;
			
			case 12:
			ls9 = cell.getStringCellValue();
			break;
			
			case 13:
			ls10 = cell.getStringCellValue();
			break;
			
			case 14:
			us1 = cell.getStringCellValue();
			break;
			
			case 15:
			us2 = cell.getStringCellValue();
			break;
			
			case 16:
			us3 = cell.getStringCellValue();
			break;
			
			case 17:
			us4 = cell.getStringCellValue();
			break;
			
			case 18:
			us5 = cell.getStringCellValue();
			break;
			
			case 19:
			us6 = cell.getStringCellValue();
			break;
			
			case 20:
			us7 = cell.getStringCellValue();
			break;
			
			case 21:
			us8 = cell.getStringCellValue();
			break;
			
			case 22:
			us9 = cell.getStringCellValue();
			break;
			
			case 23:
			us10 = cell.getStringCellValue();
			break;
			
			case 24:
			cmf = cell.getStringCellValue();
			break;
			
			case 25:
			nmf = cell.getStringCellValue();
			break;
			
//			case 26:
//			strike = Double.parseDouble(cell.getStringCellValue());
//			break;
			
			case 27:
			atm = Double.parseDouble(cell.getStringCellValue());
			break;
			
			case 28:
			margin = Double.parseDouble(cell.getStringCellValue());
			break;
			
			case 29:
			profit = Double.parseDouble(cell.getStringCellValue());
			break;
			
			case 30:
			loss = Double.parseDouble(cell.getStringCellValue());
			break;
			
			case 31:
			breakeven = Double.parseDouble(cell.getStringCellValue());
			break;
			
			}
			//System.out.print(cell.getStringCellValue()+ "\t\t");
			
			
			
			
			
			
			}  
			} 
			
			LoginPage lp = launchapp();
			Thread.sleep(2000);
			lp.clickLogin();
			sp = lp.userLogin("XH5750", "Tatsat@2303");
			Thread.sleep(15000);
			//sp.section_Button();
			Thread.sleep(3000);
			Iterator<Row> s = sheet.iterator();
			
				
			
			
		
			 
				
//			 if(cc.next().getStringCellValue().equalsIgnoreCase(("ATM"))) {
//					column2 = d;
//				}
//             if(cc.next().getStringCellValue().equalsIgnoreCase(("Margin required"))) {
//            	  column3 = d;
//				}
//               if(cc.next().getStringCellValue().equalsIgnoreCase(("Profit"))) {
//            	  column4 = d;
//				}
//               if(cc.next().getStringCellValue().equalsIgnoreCase(("loss"))) {
//            	  column5 = d;
//				}
//               if(cc.next().getStringCellValue().equalsIgnoreCase(("Breakeven"))) {
//            	  column6 = d;	
//				}
				boolean settingScreen = false;
			
			rightSide rightSide = new rightSide(driver);
			
			for (int k= 1 ;k <= sheet.getLastRowNum(); k++) { // Loop through each row in the sheet
			    // Assuming the stock name is in the first column (index 0)
			Row r =	sheet.getRow(k);
			
			    
           if(r != null) {
        	   
        	   Cell cell = r.getCell(0);
           
			    
			    if (cell != null && cell.getCellType() == CellType.STRING) {
			       
			        String stock1 = cell.getStringCellValue().trim(); 

			        
			        driver.navigate().to("https://web.sensibull.com/option-strategy-builder?instrument_symbol=" + stock1);

			       
			        System.out.println("Processing stock: " + stock1);

			        
			        Thread.sleep(5000); 
			        
//			    int rr=    r.getPhysicalNumberOfCells();
//			int columncount =    r.getLastCellNum();
			
			Cell ls9Cell = r.getCell(11); // Assuming ls9 is in column 1
		            Cell ls10Cell = r.getCell(12); // Assuming ls10 is in column 2
		            Cell roundoffcell = r.getCell(1);
		   //       Cell strikecell = r.getCell(26);
		   //     strikecell.setCellValue(strike);
		           
		      

		          ls9 = (ls9Cell != null && ls9Cell.getCellType() == CellType.STRING) 
		                ? ls9Cell.getStringCellValue().trim() 
		                : null;

		             ls10 = (ls10Cell != null && ls10Cell.getCellType() == CellType.STRING) 
		                ? ls10Cell.getStringCellValue().trim() 
		                : null;
		             roundoff = (roundoffcell != null && roundoffcell.getCellType() == CellType.NUMERIC)
		            		 ? roundoffcell.getNumericCellValue()
		            				 : null;
		             
		             
		           
		          
			      
			//for(int k =stock.length()-1 ; k >=0 ;) {
		//	driver.navigate().to("https://web.sensibull.com/option-strategy-builder?instrument_symbol="+stock+"");
			//lp.goTo();
			sp.section_Button();
			atTheMoney = new atTheMoney(driver);
			
			long strike1 = Math.round(atTheMoney.stockValue()); 
			 
		
			       
			
			
//			System.out.print("Strike :" + strike1);
//			
//			atm = fetchatm(strike1,roundoff);
//					//clickstrike()
//			atTheMoney.settingScreen();
	
//	String[] e1  = d1.split(".");
//	String part = e1[0];
//	System.out.println("mm"+part);
			
			
   

			// Now you can safely set the value in the cell
			//cb.setCellValue(strike1); // Setting the strike value

	
//    Cell cb =   r.getCell(getstrikecolumn());
//   // System.out.println(r.getCell(getprofitcolumn()));
//      System.out.println( "strikecolumnnum      :     " +r.getCell(getstrikecolumn()));
//   //   System.out.println(strikecol + "oo");
//      if (r.getCell(getstrikecolumn()) == null) {
//    	   r.createCell(getstrikecolumn(), CellType.NUMERIC); // Create cell if it doesn't exist
//      }
//    
//      cb.setCellValue(strike1);
			
		

			
//			FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\umara\\Downloads\\Stocktest.xlsx"));
//			XSSFWorkbook wb1 = new XSSFWorkbook();
//			wb.write(fos);
//			fos.close();
//		wb.close();
			System.out.print("Strike :" + strike1);
//			Cell roundoffcell = r.getCell(2);
//	          roundoff = (roundoffcell != null && roundoffcell.getCellType() == CellType.NUMERIC) 
//	                  ? (long) roundoffcell.getNumericCellValue() 
//	                  : 0L;
		atm = fetchatm(strike1,roundoff);
				//clickstrike()
		if(!settingScreen) {
		atTheMoney.settingScreen();
		settingScreen = true;
		
		}
		 
		
//		  if (strikecell == null) {
//      	    // If the cell does not exist, create it
//      	    strikecell = r.createCell(26, CellType.NUMERIC);
//      	}

      	// Set the value of the strike cell
		
      	//strikecell.setCellValue(column1);
      //	FileOutputStream fos = new FileOutputStream("C:\\Users\\umara\\Downloads\\Stocktest(1).xls");
		
		 


//		atTheMoney.clickStrike("260", null, null, "6" , "18");
//		atTheMoney.clickStrike("250", "50", null, null , "120");
//		atTheMoney.clickStrike("240", null, "20" , "30" , null);
//		  Cell roundoffcell = r.getCell(2);
//		  roundoff  = (roundoffcell != null && roundoffcell.getCellType() == CellType.NUMERIC) 
//	                ? roundoffcell.getNumericCellValue().trim()
//	                : null;
		Cell roundoffCell = r.getCell(2); // Column 1: Roundoff
	   
//	    if (roundoffCell != null) {
//	        if (roundoffCell.getCellType() == CellType.NUMERIC) {
//	            roundoff = roundoffCell.getNumericCellValue();
//	        } else if (roundoffCell.getCellType() == CellType.STRING) {
//	            try {
//	                roundoff = Double.parseDouble(roundoffCell.getStringCellValue().trim());
//	            } catch (NumberFormatException e) {
//	                roundoff = 0.0; // Default if conversion fails
//	            }
//	        }
//	    }

		if(ls10 != null)
		{
            //sheet.getRow(k).getCell(2);
			strike1 =  (long) (atm + ( 10 * roundoff));
			String str[] = ls10.split(",",-1);
	//	String str_strike = Double.toString(strike1);
	//	int newval = Integer.parseInt(str_strike.split(".")[0]);
		//String v_strike = Integer.toString(newval);
	//	String v_strike = str_strike.split(".")[0];
			String v_strike =	String.valueOf(strike1);
			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
			
		    
}
		
		
		if(ls9 != null)
		{
			//sheet.getRow(k).getCell(2);
			strike1 = (long) (atm + ( 9 * roundoff));
			String str[] = ls9.split("," , -1);
			String v_strike =	String.valueOf(strike1);
			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
		}
		
//		if(strike > 0) {
//			cell.setCellValue(strike1);
//			
//		}
//		
		
//		cell.setCellValue(strike1);
		
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\umara\\Downloads\\Stocktest.xlsx");
//	     
//		try {
//		    // Write the workbook to the output stream
//		    wb.write(fos);  // Write changes before closing the workbook
//		} catch (IOException e) {
//		    e.printStackTrace();
//		} finally {
//		    // Always close the output stream and workbook in the finally block
//		    if (fos != null) {
//		        fos.close();
//		    }
//		    if (wb != null) {
//		        wb.close();  // Close workbook after writing
//		    }
//		}
				     if(FetchDataFromExcel.settflag == true) {
		FutPage FutPage = new FutPage(driver);
		FutPage.done();
		  //right side..
		//  rightSide rightSide = new rightSide(driver);
//		  rightSide.maxprof();
//		  rightSide.maxlos();
//		 rightSide.breakEve();
		 rightSide.allRounder();
			//  rightSide.getAllFundValues();
			  Thread.sleep(2000);
			  rightSide.payoffButton();
			//  rightSide.gcode();
			//  rightSide.tHeader();
			//  rightSide.target();
			 
			  
			
			  
		
		 
		// rightSide.allRounder();
		 r.createCell(25).setCellValue(strike1);
		 r.createCell(26).setCellValue(atm);
		 r.createCell(27).setCellValue(rightSide.marginrequired());
		 r.createCell(28).setCellValue(rightSide.maxprof());
		 r.createCell(29).setCellValue(String.valueOf(rightSide.maxlos()));
	      r.createCell(30).setCellValue(rightSide.breakEve());
	    //  payoffTableLoadingSheet();
		 
		 fis.close();

         FileOutputStream outFile =new FileOutputStream(new File(fileName));
        
    
        	// HSSFWorkbook workbook1 = new HSSFWorkbook();
    HSSFSheet sh =    wb.createSheet(stock1); 
 		rightSide.tableCode(stock1 , wb , sh);
 			 wb.write(outFile);
 	         outFile.close();
        

     } 
           
		//  rightSide.getAllFundValues();
		 // Thread.sleep(2000);
		//  rightSide.payoffButton();
		 
	//	System.out.println("  payOff-Table");  
	//	rightSide.tableCode();
//		if(ls8 != null)
//		{
//			strike1 = (long) (atm + ( 8 * roundoff));
//			String str[] = ls8.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls7 != null)
//		{
//			strike1 = (long) (atm + ( 7 * roundoff));
//			String str[] = ls7.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls6 != null)
//		{
//			strike1 = (long) (atm + ( 6 * roundoff));
//			String str[] = ls6.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls5 != null)
//		{
//			strike1 = (long) (atm + ( 5 * roundoff));
//			String str[] = ls5.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls4 != null)
//		{
//			strike1 = (long) (atm + ( 4 * roundoff));
//			String str[] = ls4.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls3 != null)
//		{
//			strike1 = (long) (atm + ( 3 * roundoff));
//			String str[] = ls3.split(",");
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls2 != null)
//		{
//			strike1 = (long) (atm + ( 2 * roundoff));
//			String str[] = ls2.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls1 != null)
//		{
//			strike1 = (long) (atm + ( 1 * roundoff));
//			String str[] = ls1.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls2 != null)
//		{
//			strike1 = (long) (atm + ( 2 * roundoff));
//			String str[] = ls2.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(ls1 != null)
//		{
//			strike1 = (long) (atm + ( 2 * roundoff));
//			String str[] = ls1.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			atTheMoney.clickStrike_s(v_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us10 != null)
//		{
//			strike1 = atm + ( 10 * roundoff);
//			String str[] = us10.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us9 != null)
//		{
//			strike1 = atm + ( 9 * roundoff);
//			String str[] = us9.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us8 != null)
//		{
//			strike1 = atm + ( 8 * roundoff);
//			String str[] = us8.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us7 != null)
//		{
//			strike1 = atm + ( 7 * roundoff);
//			String str[] = us7.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us6 != null)
//		{
//			strike1 = atm + ( 6 * roundoff);
//			String str[] = us6.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us5 != null)
//		{
//			strike1 = atm + ( 5 * roundoff);
//			String str[] = us5.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us4 != null)
//		{
//			strike1 = atm + ( 4 * roundoff);
//			String str[] = us4.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us3 != null)
//		{
//			strike1 = atm + ( 3 * roundoff);
//			String str[] = us3.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us2 != null)
//		{
//			strike1 = atm + ( 2 * roundoff);
//			String str[] = us2.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		if(us1 != null)
//		{
//			strike1 = atm + ( 1 * roundoff);
//			String str[] = us1.split(",");
//			String	str_strike = Double.toString(strike1);
//			atTheMoney.clickStrike_s(str_strike,str[0], str[1],str[2],str[3]);
//		}
//		
	//	FutPage FutPage = new FutPage(driver);
//		if( cmf != null)
//		{
//			strike1 = (long) (atm + ( 1 * roundoff));
//			String str[] = ls9.split("," , -1);
//			String v_strike =	String.valueOf(strike1);
//			FutPage.FutClick(v_strike, str[0], str[1]);
//		}
//		if(nmf != null)
//		{
//			strike1 = atm + ( 9 * roundoff);
//			String str[] = nmf.split(",");
//			String	str_strike = Double.toString(strike1);
//			FutPage.FutClick(str_strike, str[0], str[1]);
//		}
		
//		FutPage.done();
//		  //right side..
		 // rightSide rightSide = new rightSide(driver);
	//	  rightSide.maxprof();
		//  rightSide.maxlos();
		// rightSide.breakEve();
		 
		 rightSide.allRounder();
		//  rightSide.getAllFundValues();
		  Thread.sleep(2000);
		//  rightSide.payoffButton();
	//	  rightSide.gcode();
//		  rightSide.tHeader();
//		  rightSide.target();
	//	  rightSide.tableCode(stock1);
		
//		if (atmoption != null)
//		{
//			String str[] = atmoption.split(",");
//			
//		}
		
		
			
			arr[n] = new Stock(stock,
					roundoff,
		    	    atmoption,
		    	    ls1,
		    	    ls2,
		    	    ls3,
		    	    ls4,
		    	    ls5,
		    	    ls6,
		    	    ls7,
		    	    ls8,
		    	    ls9,
		    	    ls10,
		    	     us1,
		    	    us2,
		    	    us3,
		    	    us4,
		    	    us5,
		    	    us6,
		    	     us7,
		    	    us8,
		    	    us9,
		    	    us10,
		    	    cmf,
		    	    nmf,
		    	    strike,
		    	    atm,
		    	    margin,
		    	    profit,
		    	    loss,
		    	    breakeven);
			n = n + 1;
			

			System.out.println();  
		
			    }
			}
			}    
           
           }
		
			

			
			
			
			
			
			
			
			
			
			
			
	

		 private static double fetchatm(double stockprice, double roundoff)
		{
			
			
			 double num,n = 0;
			 double x = 0, atm;
		  
		       
		       x = stockprice % roundoff;
		       if(x < (roundoff / 2))
		       {
		    	   num = (int)( stockprice / roundoff ) ;
		    	   atm = (num * roundoff);
		       }
		       else
		       {
		    	   num = (int)( stockprice / roundoff ) ;
		    	   atm = (num +1) * roundoff;
		       }
		       return atm;
		}	
		 
		 public void clickStrike(String atTheMoney , String CallBuy ,String PutSell , String CallSell , String PutBuy) throws InterruptedException {
				
				for(int i = 0 ; i < driver.findElements(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span")).size() ; i++) {
					WebElement recen =driver.findElement(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span[text()='"+atTheMoney+"']"));
					Actions act = new Actions(driver);
					act.scrollToElement(recen).perform();
					if(driver.findElements(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span")).get(i).getText().equals(atTheMoney)) {
						driver.findElements(By.xpath("//td[@class='sc-fYsVRl hWspoI strike']/span")).get(i).click();
					
						if(CallSell != null) {
							driver.findElements(By.xpath("//div[@class='sc-PfnZo hvZTFK']/following-sibling::div[1]/div/div[2]/button[2]/span")).get(i).click();
							//act.sendKeys(Keys.DOWN).build().perform();
						WebElement ReliChrocallLot = 	driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']/input"));
							act.scrollToElement(ReliChrocallLot).perform();
							ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
							driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallSell);
						}
//							if( PutBuy != null) {
//							secondBuy.get(i).click();
//							Thread.sleep(2000);
//							//ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
//							 putLot.sendKeys(Keys.BACK_SPACE);
//							 driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
//							}
						 if(CallBuy != null  ) {
							driver.findElements(By.xpath("//div[@class='sc-PfnZo hvZTFK']/following-sibling::div[1]/div/div[2]/button[1]/span")).get(i).click();
						//	act.sendKeys(Keys.DOWN).build().perform();
							WebElement ReliChrocallLot = 	driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']/input"));
							act.scrollToElement(ReliChrocallLot).perform();
							ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
							driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallBuy);
						 }
						 if( PutBuy != null) {
								driver.findElements(By.xpath("//div[@class='sc-PfnZo frkgVM']/following-sibling::div/div/div/following-sibling::div/button[1]/span")).get(i).click();
								Thread.sleep(2000);
								//ReliChrocallLot.sendKeys(Keys.BACK_SPACE);
								 driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input'])[3]")).sendKeys(Keys.BACK_SPACE);
								 driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutBuy);
								}
							if(PutSell!= null) {
						//	driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(CallLot);
							
							driver.findElements(By.xpath("//div[@class='sc-PfnZo frkgVM']/following-sibling::div/div/div/following-sibling::div/button[2]/span")).get(i).click();
							driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input'])[3]")).sendKeys(Keys.BACK_SPACE);
							driver.findElement(By.xpath("//tbody/tr['"+i+"']/td[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys(PutSell);
							
							}}
					
						}
				
					}
		 
					


	}
