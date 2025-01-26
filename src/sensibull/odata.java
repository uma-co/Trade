package sensibull;

//Java program to write data in excel sheet using java code 


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
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
	import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.apache.poi.hssf.usermodel.HSSFSheet;  
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
	import org.apache.poi.ss.usermodel.Cell;  
	import org.apache.poi.ss.usermodel.FormulaEvaluator;  
	import org.apache.poi.ss.usermodel.Row; 

public class odata { 

 // any exceptions need to be caught 
 public static void main(String[] args) throws Exception 
 { 

     try {

         FileInputStream file = new FileInputStream(new File("C:\\Users\\umara\\Videos\\Stocktest (2).xls"));

         HSSFWorkbook workbook = new HSSFWorkbook(file);
         HSSFSheet sheet = workbook.getSheetAt(0);
         Cell cell = null;

         //Update the value of cell
//         cell = sheet.getRow(1).getCell(26);
//         cell.setCellValue(cell.getNumericCellValue() + 250000);
//         cell = sheet.getRow(1).getCell(27);
//         
//         //cell.setCellValue(cell.getNumericCellValue() * 2);
//         cell.setCellValue("1000(5%)");
         for(int g =1 ; g< sheet.getLastRowNum(); g++) {
         Row row = sheet.getRow(g);
         row.createCell(27).setCellValue("250000");
         
         row.createCell(28).setCellValue("5000(5%)");
         
        
         
  
         file.close();

         FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\umara\\Videos\\Stocktest (2).xls"));
         workbook.write(outFile);
         outFile.close();

     } 
     }catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }    	
 	
 	
     
}
}


