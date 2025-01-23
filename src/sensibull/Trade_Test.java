package sensibull;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

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

public class Trade_Test extends baseClass {

	StrategyPage sp = new StrategyPage(driver);
	Components Components = new Components(driver);
	atTheMoney atTheMoney ;
	String centralAmount;
//	@Test
	public void strategyBuilder() throws IOException, InterruptedException {
		
		LoginPage lp = launchapp();
	Thread.sleep(2000);
	lp.clickLogin();
	sp = lp.userLogin("XH5750", "Denise@94");
	Thread.sleep(15000);
	sp.section_Button();
	
	System.out.println("Total Size"+sp.buysize());
	Thread.sleep(2000);
	sp.addTrade("2", "3"); 
	}
	
@Test
  public void automate_atTheMoney() throws IOException, InterruptedException, TimeoutException {
	
	  LoginPage lp = launchapp();
		Thread.sleep(2000);
		lp.clickLogin();
		sp = lp.userLogin("XH5750", "Tatsat@2303");
		Thread.sleep(15000);
		//sp.section_Button();
		Thread.sleep(3000);
		try {
		driver.navigate().to("https://web.sensibull.com/option-strategy-builder?instrument_symbol=RELIANCE");
		}
		catch(Exception e) {
			System.out.println("exception");
		}
		//lp.goTo();
		finally {
		sp.section_Button();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		atTheMoney = new atTheMoney(driver);
		Thread.sleep(2000);
	atTheMoney.stockValue();
		Thread.sleep(2000);
//		System.out.println(stm);
 //  atTheMoney.newLocators();
	atTheMoney.settingScreen();
	
//		FutPage FutPage = new FutPage(driver);
//	//	FutPage.rowText();
//		FutPage.FutClick(null , "80");
//		FutPage.FutClick("70" , null);
	//	FutPage.FutClick(null , "90");
		
	//	atTheMoney.newLocators("1360");
		// atTheMoney.newLocators("1320");
//		 atTheMoney.newLocators("1300");
//		 atTheMoney.newLocators("1280");
//		 atTheMoney.newLocators("1260");
	//
	atTheMoney.clickStrike_s("1280", "500", null, "1000" , null);
		atTheMoney.clickStrike_s("1480", "50", null, "130" , null);
		atTheMoney.clickStrike_s("1460", "50", null, null , "120");
	//	atTheMoney.clickStrike_s("1450", "60", null , "30" , null);
		atTheMoney.clickStrike_s("1440", null, "55" , "35" , null);
		atTheMoney.clickStrike_s("1420", "60", null , "30" , null);
		atTheMoney.clickStrike_s("1410", "60", null , "30" , null);

   atTheMoney.clickStrike_s("1360", "50", null, null , "120");
   atTheMoney.clickStrike_s("1330", null, "55" , "35" , null);
	atTheMoney.clickStrike_s("1320", null, "55" , "35" , null);
	
	//atTheMoney.clickStrike_s("1280", null, "55" , "35" , null);
	atTheMoney.clickStrike_s("1260", null, "55" , "35" , null);
	//atTheMoney.settingScreen();
	FutPage FutPage = new FutPage(driver);
		FutPage.rowText();
		FutPage.FutClick("Jan", null ,"50");
		Thread.sleep(10000);
		FutPage.FutClick("Feb", null ,"70");
		Thread.sleep(10000);
		FutPage.FutClick("Mar", "10" ,null);
		//FutPage.FutClick(null , "Jan" , null , "45");
	
  FutPage.done();
  //right side..
  rightSide rightSide = new rightSide(driver);
  rightSide.maxprof();
  rightSide.maxlos();
 rightSide.breakEve();
 
 rightSide.allRounder();
//  rightSide.getAllFundValues();
  Thread.sleep(2000);
  rightSide.payoffButton();
  rightSide.tHeader();
  rightSide.target();
  rightSide.tableCode();
 // rightSide.predictionValues();
  
  
  
	
//	atTheMoney.clickStrike_s("1240", null, "55" , "35" , null);
//	atTheMoney.clickStrike_s("1230", "89", null , "35" , null);
//	atTheMoney.clickStrike_s("1220", null, "80" , null , "55");
//	atTheMoney.clickStrike_s("1210", null, "55" , "35" , null);
//	atTheMoney.clickStrike_s("1190", null, "55" , "35" , null);
//	atTheMoney.clickStrike_s("1180", null, "55" , "35" , null);
////	atTheMoney.clickStrike_s("1120", "55", null , "35" , null);
////	atTheMoney.clickStrike_s("1080", null, "55" , "35" , null);

       }

//	FutPage fut = new FutPage(driver);
//	fut.rowText();
	
	

	
		 
		 
		 

		 } 
	 
 }


//







