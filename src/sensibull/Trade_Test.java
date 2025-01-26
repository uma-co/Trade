package sensibull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import abstractComponents.Components;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.FutPage;
import pageObjects.LoginPage;
import pageObjects.StrategyPage;
import pageObjects.atTheMoney;
import utility.baseClass;

public class Trade_Test {

//	StrategyPage sp = new StrategyPage(driver);
//	Components Components = new Components(driver);
//	atTheMoney atTheMoney ;
//	String centralAmount;
//
//	public void strategyBuilder() throws IOException, InterruptedException {
//		
//		LoginPage lp = launchapp();
//	Thread.sleep(2000);
//	lp.clickLogin();
//	sp = lp.userLogin("XH5750", "Denise@94");
//	Thread.sleep(15000);
//	sp.section_Button();
//	
//	System.out.println("Total Size"+sp.buysize());
//	Thread.sleep(2000);
//	sp.addTrade("2", "3"); 
//	}
	public static void main(String[] args) throws IOException {
	
//		FileInputStream fis = new FileInputStream(new File("C:\\Users\\umara\\Downloads\\TestStock.xls"));  
//		//creating workbook instance that refers to .xls file  
//		HSSFWorkbook wb=new HSSFWorkbook(fis); 
//		
//		HSSFSheet sheet=wb.getSheetAt(0);
//		Iterator<Row> s = sheet.iterator();
//		
//		Row firstrow =	s.next();
//	Iterator<Cell> cc = 	firstrow.cellIterator();
//	
//	int column1 =0;
//	
//	int d =0;
//	while(cc.hasNext()) {
//		if(cc.next().getStringCellValue().equalsIgnoreCase(("strike"))) {
//			 column1 = d;
//		
//	}
//	}
//	System.out.println(column1);
//
		getColumnNumber();
		getRowNumber();
}
	private static void getRowNumber( ) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\umara\\Downloads\\Stocktest.xlsx");  
		//creating workbook instance that refers to .xls file  
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		
		XSSFSheet sheet=wb.getSheetAt(0);// TODO Auto-generated method stub		ArrayList<String> a=new ArrayList<String>();				FileInputStream fis=new FileInputStream(fileName);		XSSFWorkbook workbook=new XSSFWorkbook(fis);		XSSFSheet sheet=workbook.getSheet("Sheet1");		//Identify Testcases coloum by scanning the entire 1st row
	
		for(int s = 1 ; s < sheet.getLastRowNum(); s++) {
		int row =	sheet.getPhysicalNumberOfRows();
	//	System.out.println(row);
	XSSFRow create =	sheet.getRow(s);
	XSSFCell cd =create.getCell(getColumnNumber());
	cd.setCellValue("7896");
	
	
    try (FileOutputStream fos = new FileOutputStream("C:\\Users\\umara\\Downloads\\Stocktest.xlsx")) {
        wb.write(fos);
        fos.close();
    }
    
    // Close the workbook
    wb.close();
    System.out.println("Value written successfully!");

 
	
//	XSSFCell co =create.createCell(getColumnNumber(), CellType.NUMERIC);
//	co.setCellValue("890");
//	FileOutputStream fos = new FileOutputStream("C:\\Users\\umara\\Downloads\\Stocktest.xlsx");
//	wb.write(fos);
//	fos.flush();
//	fos.close();
		}
//		 Iterator<Row> r =  sheet.iterator();
//		 int k =1;		int rowIndex= -1;	
//		while(r.hasNext() ) {
//		Row nextrow =	r.next();
//		Iterator<Cell> c = nextrow.cellIterator();
//		while(c.hasNext()) {
//		Cell cr =	c.next();
//		if(cr == null && cr.getCellType() == CellType.BLANK) {
//			rowIndex =k;
//		}
//		}
//		}
//		
//		k++;
//		System.out.println(rowIndex);
//		}
		
//		Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows	
//		int k =1;		int rowIndex= -1;		
//		while(rows.hasNext()) {		
//			Row row = rows.next();			
//			Iterator<Cell> cells=row.cellIterator();			
//			while(cells.hasNext())			{							
//				Cell cell = cells.next();			
//				if(cell == null && cell.getCellType() == CellType.BLANK )				{
//					rowIndex=k;
//				}
//							}		
//			k++;
//			System.out.println(rowIndex);
//			}			
			
		
		}
	private static int getColumnNumber() throws IOException {		// TODO Auto-generated method stub		ArrayList<String> a=new ArrayList<String>();				FileInputStream fis=new FileInputStream(fileName);		XSSFWorkbook workbook=new XSSFWorkbook(fis);		XSSFSheet sheet=workbook.getSheet("Sheet1");		//Identify Testcases coloum by scanning the entire 1st row
		FileInputStream fis = new FileInputStream("C:\\Users\\umara\\Downloads\\Stocktest.xlsx");  
		//creating workbook instance that refers to .xls file  
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		
		XSSFSheet sheet=wb.getSheetAt(0);
		Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows		
		Row firstrow= rows.next();		
		Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
		int k=0;	
		int coloumn = 0;	
		while(ce.hasNext())		{	
			Cell value=ce.next();
			System.out.println(value.getStringCellValue());
		if(value.getStringCellValue().equalsIgnoreCase("strike"))		{	
			coloumn=k;
		}
		k++;	
		}		
		System.out.println(coloumn);
		return coloumn;
		}

	
//  public void automate_atTheMoney() throws IOException, InterruptedException, TimeoutException {
//	
//	  LoginPage lp = launchapp();
//		Thread.sleep(2000);
//		lp.clickLogin();
//		sp = lp.userLogin("XH5750", "Tatsat@2303");
//		Thread.sleep(15000);
//		//sp.section_Button();
//		Thread.sleep(3000);
//		try {
//		driver.navigate().to("https://web.sensibull.com/option-strategy-builder?instrument_symbol=RELIANCE");
//		}
//		catch(Exception e) {
//			System.out.println("exception");
//		}
//		//lp.goTo();
//		finally {
//		sp.section_Button();
//		Thread.sleep(5000);
//		Actions act = new Actions(driver);
//		atTheMoney = new atTheMoney(driver);
//		Thread.sleep(2000);
//	atTheMoney.stockValue();
//		Thread.sleep(2000);
////		System.out.println(stm);
// //  atTheMoney.newLocators();
//	atTheMoney.settingScreen();
//	
////		FutPage FutPage = new FutPage(driver);
////	//	FutPage.rowText();
////		FutPage.FutClick(null , "80");
////		FutPage.FutClick("70" , null);
//	//	FutPage.FutClick(null , "90");
//		
//	//	atTheMoney.newLocators("1360");
//		// atTheMoney.newLocators("1320");
////		 atTheMoney.newLocators("1300");
////		 atTheMoney.newLocators("1280");
////		 atTheMoney.newLocators("1260");
//	//
//	atTheMoney.clickStrike_s("1280", "500", null, "1000" , null);
//		atTheMoney.clickStrike_s("1480", "50", null, "130" , null);
//		atTheMoney.clickStrike_s("1460", "50", null, null , "120");
//	//	atTheMoney.clickStrike_s("1450", "60", null , "30" , null);
//		atTheMoney.clickStrike_s("1440", null, "55" , "35" , null);
//		atTheMoney.clickStrike_s("1420", "60", null , "30" , null);
//		atTheMoney.clickStrike_s("1410", "60", null , "30" , null);
//
//   atTheMoney.clickStrike_s("1360", "50", null, null , "120");
//   atTheMoney.clickStrike_s("1330", null, "55" , "35" , null);
//	atTheMoney.clickStrike_s("1320", null, "55" , "35" , null);
//	
//	//atTheMoney.clickStrike_s("1280", null, "55" , "35" , null);
//	atTheMoney.clickStrike_s("1260", null, "55" , "35" , null);
//	//atTheMoney.settingScreen();
//	FutPage FutPage = new FutPage(driver);
//		FutPage.rowText();
//		FutPage.FutClick("Jan", null ,"50");
//		Thread.sleep(10000);
//		FutPage.FutClick("Feb", null ,"70");
//		Thread.sleep(10000);
//		FutPage.FutClick("Mar", "10" ,null);
//		//FutPage.FutClick(null , "Jan" , null , "45");
//	
//  FutPage.done();
//  //right side..
//  rightSide rightSide = new rightSide(driver);
//  rightSide.maxprof();
//  rightSide.maxlos();
// rightSide.breakEve();
// 
// rightSide.allRounder();
////  rightSide.getAllFundValues();
//  Thread.sleep(2000);
//  rightSide.payoffButton();
//  rightSide.tHeader();
//  rightSide.target();
//  rightSide.tableCode();
// // rightSide.predictionValues();
//  
//  
//  
//	
////	atTheMoney.clickStrike_s("1240", null, "55" , "35" , null);
////	atTheMoney.clickStrike_s("1230", "89", null , "35" , null);
////	atTheMoney.clickStrike_s("1220", null, "80" , null , "55");
////	atTheMoney.clickStrike_s("1210", null, "55" , "35" , null);
////	atTheMoney.clickStrike_s("1190", null, "55" , "35" , null);
////	atTheMoney.clickStrike_s("1180", null, "55" , "35" , null);
//////	atTheMoney.clickStrike_s("1120", "55", null , "35" , null);
//////	atTheMoney.clickStrike_s("1080", null, "55" , "35" , null);
//
//       }
//
////	FutPage fut = new FutPage(driver);
////	fut.rowText();
//	
	

	
		 
		 
		 

}
//}


//







